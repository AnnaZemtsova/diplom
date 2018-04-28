package algorithm;

import data.City;
import data.Vehicle;
import generalData.AllData;
import inputData.InputCities;
import inputData.InputUserData;
import inputData.InputVehicle;
import testingData.CitiesFromCode;
import testingData.UserDataFromCode;
import testingData.VehiclesFromCode;
import transport.AverageVehicleData;
import transport.GeneralVehicles;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class CorrelationTrainPlaneBus implements CorrelationTransport {
    private CorrelationData correlationData;
    private GraphCreator graphCreator;
    private final double eps = 0.000000001;
    private ArrayList<Vehicle> trains;
    private ArrayList<Vehicle> planes;
    private ArrayList<Vehicle> buses;
    private  ArrayList<City> wantedCities;
    private int preferredTransport;
    private Date dateFrom;
    private Date dateTo;
    private double availableMoney;
    private double availableTime;
    private int displacementDatesType;
    private TravelingSalesmanProblem travelingSalesmanProblem;


    /*
    Эти две константы значат
    MoneyTimeDeviationsPercentage - на сколько могут отличаться найденные
    цена поездки и времени от заданных пользователем
    (было бы глупо отвергать путь, если он стоит 3010, а пользователь указал верхнюю границу 3000)

    DataDeviationsPercentage - на сколько может отличаться кол-во дней проведенное
    в определенном город
    Если пользователю без разницы, но примерно одинаково везде
    и получилось что по 8 дней в каждом городе,
    но именно на 8 день  нет никакого транспорта, а на 7,9 или 10 есть например

    Эти проценты лучше при тестировании посмотреть какое сюда значение поставить
     */
    private static double MoneyTimeDeviationsPercentage = 10;
    private static double DataDeviationsPercentage = 20;


    /*
    особо ничего не значат. просто чтобы в коде не было не понятных 0 и 1
     */
    private static int MoneyDeviation = 0;
    private static int TimeDeviation = 1;

    private static int Money = 2;
    private static int Time = 3;


    //__________________________________________________________________________________________________________________

    public CorrelationTrainPlaneBus(CorrelationData correlationData,
                                    TravelingSalesmanProblem travelingSalesmanProblem,
                                    GraphCreator graphCreator,
                                    ArrayList<Vehicle> trains, ArrayList<Vehicle> planes,ArrayList<Vehicle> buses,
                                    ArrayList<City> wantedCities,
                                    int preferredTransport,Date dateFrom,Date dateTo,
                                     double availableMoney, double availableTime, int displacementDatesType
                                    ){
        this.travelingSalesmanProblem = travelingSalesmanProblem;
        this.correlationData = correlationData;
        this.trains = trains;
        this.planes = planes;
        this.buses = buses;
        this.preferredTransport = preferredTransport;
        this.wantedCities = wantedCities;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.graphCreator = graphCreator;
        this.availableMoney = availableMoney;
        this.availableTime = availableTime;
        this.displacementDatesType = displacementDatesType;
    }

    //__________________________________________________________________________________________________________________

    /*
        кол-во времени/денег насколько могут отличаться от допустимых
     */
    private double getMoneyTimeDeviationsPercentage(double data){
        return data*MoneyTimeDeviationsPercentage/100;
    }

    //__________________________________________________________________________________________________________________

    /*
    отклонение в том на какую дату брать транспорт
    может нужен не в этом классе
     */
    private int getDataDeviationsPercentage(int step){
        return Double.valueOf(step*DataDeviationsPercentage/100).intValue();
    }


    //__________________________________________________________________________________________________________________
    /*
        заполняем граф предпочитаемым транспортом и ищем путь.
        если путь есть и результат не сильно отклоняется от заданных цени и времени возвращаем его
        если сильно отклоняется от чего либо ищем другой путь коррелируя виды транспорта
     */
    @Override
    public ArrayList<City> getWay() {
        if(preferredTransport==AllData.Plane) graphCreator.setVehicles(planes);
        if(preferredTransport==AllData.Train)  graphCreator.setVehicles(trains);
        if(preferredTransport==AllData.Bus)  graphCreator.setVehicles(buses);
        ArrayList<City> bestWay = correlationData.getWay(availableMoney,availableTime);
        double wayPrice = correlationData.getWayPrice();
        double wayTime = correlationData.getWayTime();

        double priceDeviations = getMoneyTimeDeviationsPercentage(wayPrice);
        double timeDeviations = getMoneyTimeDeviationsPercentage(wayTime);
        if((wayPrice+priceDeviations<=availableMoney)&&(wayTime+timeDeviations<=availableTime)){
            return bestWay;
        }else{
            bestWay = correlationTrainPlaneBus(bestWay,preferredTransport,wayPrice,wayTime,availableMoney,availableTime);
        }
        return bestWay;
    }

    //__________________________________________________________________________________________________________________
     /*
        отклонение в процентах в том насколько цена/время отличаются от нужных
     */
    private double getDegreeOfDeviation(double availableData,double wayData){
        if(wayData - availableData<=0) return 0;
        return (wayData - availableData)*100/availableData;
    }
    //__________________________________________________________________________________________________________________

    /*
     ищем лучший путь из всех видов транспорта
     */
    private ArrayList<City> correlationTrainPlaneBus(ArrayList<City> way, int preferredTransport,
                                                        double wayPrice,double wayTime,
                                                        double availableMoney,double availableTime){
        double priceDeviations = getDegreeOfDeviation(availableMoney,wayPrice);
        double timeDeviations = getDegreeOfDeviation(availableTime,wayTime);

        /*
        если мы искали самолеты , и поместились в цену но не поместились во время
        ну что мы найдем быстрее самолетов?) ну ничего
        искать другой путь просто нет смысла
        любой будет медленнее
         */
        if(priceDeviations==0&&timeDeviations>0&&preferredTransport==AllData.Plane) return way;

        ArrayList<Vehicle> preferredVehicles = graphCreator.getVehicles();
        ArrayList<Vehicle> cheaperVehicles;
        ArrayList<Vehicle> fasterVehicles;
        /*
        если отклонение по цене больше чем по времени ищем более дешевый транспорт
        иначе - более быстрый
         */
        if(priceDeviations>=timeDeviations){
            fasterVehicles = preferredVehicles;
            cheaperVehicles = sortByData(getNotPreferredVehicles(preferredTransport,MoneyDeviation),Money);
        }else{
            fasterVehicles = sortByData(getNotPreferredVehicles(preferredTransport,TimeDeviation),Time);
            cheaperVehicles = preferredVehicles;
        }
        way = findBestTwoTypeTransportCorrelation(fasterVehicles,cheaperVehicles,availableMoney,availableTime,
                0.5,0.5,eps);
        wayPrice = correlationData.getWayPrice();
        wayTime = correlationData.getWayTime();
        priceDeviations = getDegreeOfDeviation(availableMoney,wayPrice);
        timeDeviations = getDegreeOfDeviation(availableTime,wayTime);
        if((wayPrice+priceDeviations>availableMoney)&&(wayTime+timeDeviations>availableTime)){
            way = findBestThreeTypeTransportCorrelation(buses,trains,planes,availableMoney,availableTime,
                    1/3,1/3,1/3,eps);
        }
        /*
         тут я возвращаю последний найденный путь. теоретически как бы, если лучшим все же был путь из
         одного вида транспорта оно должно до этого дойти. но кто знает. надо потестить хорошо
         и если что не безусловно возвращать найденный путь а выбрать лучший из полученных и вернуть его
         */
        return way;
    }
    //__________________________________________________________________________________________________________________

    /*
    сортируем по возрастанию по цене или по времени в зависимости от параметра moneyTime
     */
    private ArrayList<Vehicle> sortByData(ArrayList<Vehicle> vehicles,int moneyTime){
        if(moneyTime==Money)

        vehicles.sort(Comparator.comparingDouble(Vehicle::getPrice));

        else
            vehicles.sort(Comparator.comparingDouble(Vehicle::getTimeInWay));
        return vehicles;
    }

    //__________________________________________________________________________________________________________________

    /*
     Ищем путь объединив 2 вида транспорта.
     ищем по такому принципу.
    сначала заполняем граф, в котором вес обоих видов транспорта одинаковый.
    дальше смотрим что больше отклоняется от нормы: цена или время
    какое значение больше, к тому мы прибалвяем e/2 (e изначально равно 0.5)
    из-за того что е все время уменьшается в 2 раза, точность наших вычислений увеличивается
    прекращаем в двух случаях:
     1.  найден путь, в котором мы вмещаемся в заданные границы
     2. достигнута заданная точность
     */

    private ArrayList<City> findBestTwoTypeTransportCorrelation(ArrayList<Vehicle> fasterVehicles,
                                                         ArrayList<Vehicle> cheaperVehicles,
                                                         double availableMoney,double availableTime,
                                                         double fasterCoefficient,double cheaperCoefficient,
                                                         double e){
            ArrayList<Vehicle> mergedVehicles = mergeTwoVehicles(fasterVehicles,cheaperVehicles,
                    fasterCoefficient,cheaperCoefficient);
            graphCreator.setVehicles(mergedVehicles);
            correlationData.setGraphCreator(graphCreator);
            ArrayList<City> way = correlationData.getWay(availableMoney,availableTime);
            double wayPrice = correlationData.getWayPrice();
            double wayTime = correlationData.getWayTime();
            double availablePriceDeviations = getMoneyTimeDeviationsPercentage(wayPrice);
            double availableTimeDeviations = getMoneyTimeDeviationsPercentage(wayTime);
            if((wayPrice+availablePriceDeviations<=availableMoney)&&
                    (wayTime+availableTimeDeviations<=availableTime)||
                    e<eps){
            return way;
            }else {
                double priceDeviations = getDegreeOfDeviation(availableMoney,wayPrice);
                double timeDeviations = getDegreeOfDeviation(availableTime,wayTime);
                if(priceDeviations>=timeDeviations)
                    findBestTwoTypeTransportCorrelation(fasterVehicles,cheaperVehicles,availableMoney,availableTime,
                  fasterCoefficient-e/2,cheaperCoefficient+e/2,e/2);
                else
                    findBestTwoTypeTransportCorrelation(fasterVehicles,cheaperVehicles,availableMoney,availableTime,
                            fasterCoefficient+e/2,cheaperCoefficient-e/2,e/2);
            }
            return null;
    }
    //__________________________________________________________________________________________________________________


    /*
      Проводим слияние трех матриц и ищем лучший путь.
      Все коэфициенты вначали должны быть равны 1/3
      Дальше рекурсивно продолжаем искать путь и сливать матрицы по следующему принципу:
      1. если отклонение по цене больше чем по времени:
             если больше чем в два раза, выбрасываем половину самолетов, берем 2/6 автобусов и 1/6 поездов
             если больше, но не слишком ( 1<отклонение<2) то убираем треть самолетов, а автобусов и поездов поровну
      2. если по времени больше чем по цене:
             если больше чем в два раза, выбрасываем половину автобусов, берем 2/6 самолетов и 1/6 поездов
             если больше, но не слишком ( 1<отклонение<2) то убираем треть автобусов, а поездов и самолетов поровну
        почему сравниваем именно в 2 раза больше или нет?
          просто я так решила.
          нужно потестить и мб поставить сюда другое значение.
     */
    private ArrayList<City> findBestThreeTypeTransportCorrelation(ArrayList<Vehicle> buses,
                                                                ArrayList<Vehicle> trains,ArrayList<Vehicle> planes,
                                                                double availableMoney,double availableTime,
                                                                  double coefficientOfBuses,
                                                                  double coefficientOfTrains,
                                                                  double coefficientOfPlanes, double e){
        ArrayList<Vehicle> mergedVehicles = mergeThreeVehicles(buses,trains,planes,coefficientOfBuses,coefficientOfTrains,
                coefficientOfPlanes);
        graphCreator.setVehicles(mergedVehicles);
        correlationData.setGraphCreator(graphCreator);
        ArrayList<City> way = correlationData.getWay(availableMoney,availableTime);
        double wayPrice = correlationData.getWayPrice();
        double wayTime = correlationData.getWayTime();
        double availablePriceDeviations = getMoneyTimeDeviationsPercentage(wayPrice);
        double availableTimeDeviations = getMoneyTimeDeviationsPercentage(wayTime);
        if((wayPrice+availablePriceDeviations<=availableMoney)&&
                (wayTime+availableTimeDeviations<=availableTime)||
                e<eps){
            return way;
        }else {
            double priceDeviations = getDegreeOfDeviation(availableMoney,wayPrice);
            double timeDeviations = getDegreeOfDeviation(availableTime,wayTime);
            double ratioPrice=0;
            double ratioTime=0;
            if(priceDeviations>timeDeviations){
                ratioPrice = priceDeviations/timeDeviations;
            }
            if(priceDeviations<timeDeviations){
                ratioTime = timeDeviations/priceDeviations;
            }
            if(ratioPrice>=2){
                findBestThreeTypeTransportCorrelation(buses,trains,planes,availableMoney,availableTime,
                        coefficientOfBuses+(2*e)/6,coefficientOfTrains+e/6,
                        coefficientOfPlanes-e/2,e/3);
            }
            if(ratioPrice>0&&ratioPrice<2){
                findBestThreeTypeTransportCorrelation(buses,trains,planes,availableMoney,availableTime,
                    coefficientOfBuses+e/6,coefficientOfTrains+e/6,
                        coefficientOfPlanes-e/3,e/3);
            }
            if(ratioTime>=2){
                findBestThreeTypeTransportCorrelation(buses,trains,planes,availableMoney,availableTime,
                        coefficientOfBuses-e/2,coefficientOfTrains+e/6,
                        coefficientOfPlanes+(2*e)/6,e/3);
            }
            if(ratioTime>0&&ratioTime<2){
                findBestThreeTypeTransportCorrelation(buses,trains,planes,availableMoney,availableTime,
                        coefficientOfBuses-e/3,coefficientOfTrains+e/6,
                        coefficientOfPlanes+e/6,e/3);
            }

        }
        return null;
    }
    //__________________________________________________________________________________________________________________

    /*
    сливаем два массива машин.
    в сумме их количество не изменится, но
    приоритетных машин будет coefficientOfPreferredVehicles процентов,
    а неприоритетных coefficientOfNonPreferredVehicles
     */
    private ArrayList<Vehicle> mergeTwoVehicles(ArrayList<Vehicle> preferredVehicles,
                                             ArrayList<Vehicle> nonPreferredVehicles,
                                             double coefficientOfPreferredVehicles,
                                             double coefficientOfNonPreferredVehicles){
        int [] amountOfVehicles = getReformedAmountOfTwoTypeVehicle(preferredVehicles,nonPreferredVehicles,
                coefficientOfPreferredVehicles,coefficientOfNonPreferredVehicles);
        int amountOfPreferred = amountOfVehicles[0];
        int amountOfNonPreferred = amountOfVehicles[1];
        ArrayList<Vehicle> resultVehicles = (ArrayList<Vehicle>) nonPreferredVehicles.subList(0,amountOfNonPreferred);
        resultVehicles = getDisplacementNotContainInResultVehicles(resultVehicles,preferredVehicles,amountOfPreferred);
        return resultVehicles;
    }
//__________________________________________________________________________________________________________________

    /*
       сливаем три массива машин.
       в сумме их количество не изменится, но
       автобусов будет coefficientOfBuses процентов,
       поездов coefficientOfTrains,coefficientOfPlanes
       самолетов
        */
    private ArrayList<Vehicle> mergeThreeVehicles(ArrayList<Vehicle> buses,
                                             ArrayList<Vehicle> trains,ArrayList<Vehicle> planes,
                                             double coefficientOfBuses, double coefficientOfTrains, double coefficientOfPlanes){
        int [] amountOfVehicles = getReformedAmountOfTreeTypeVehicle(buses,trains,planes,coefficientOfBuses,coefficientOfTrains,
                coefficientOfPlanes);
        int amountOfBuses = amountOfVehicles[0];
        int amountOfTrains = amountOfVehicles[1];
        int amountOfPlanes = amountOfVehicles[2];
        ArrayList<Vehicle> resultVehicles = (ArrayList<Vehicle>) buses.subList(0,amountOfBuses);
        resultVehicles = getDisplacementNotContainInResultVehicles(resultVehicles,trains,amountOfTrains);
        resultVehicles = getDisplacementNotContainInResultVehicles(resultVehicles,planes,amountOfPlanes);
       return resultVehicles;
    }
    //__________________________________________________________________________________________________________________

    /*
    считаем сколько нам нужно каждого типа машин.
    могло быть все просто если бы мы посчитали сколько всего и процент от этого
    но по факту машин разного типа может быть разное кол-во.
    и например нам надо по проентному соотношению 10 штук, а в наличии всего 5.
    ну откуда мы возьмем больше.
    делаем всякие проверки и возвращаем максимально близкое к необходимому кол-во машин
     */
    private int[] getReformedAmountOfTreeTypeVehicle(ArrayList<Vehicle> buses,
                                             ArrayList<Vehicle> trains,ArrayList<Vehicle> planes,
                                             double coefficientOfBuses, double coefficientOfTrains, double coefficientOfPlanes) {
        int amountOfBuses = getAmountOfVehicle(buses, coefficientOfBuses);
        int amountOfTrains = getAmountOfVehicle(trains, coefficientOfTrains);
        int amountOfPlanes = getAmountOfVehicle(planes, coefficientOfPlanes);
        int notEnoughTransport = (wantedCities.size() * wantedCities.size() - wantedCities.size()) -
                (amountOfBuses + amountOfTrains + amountOfPlanes);
        if (notEnoughTransport > 0) {
            int amountToAdd = getAmountToAddNotEnoughTransport(amountOfTrains, notEnoughTransport, trains.size());
            amountOfTrains += amountToAdd;
            notEnoughTransport -= amountToAdd;
            if (notEnoughTransport > 0) {
                amountToAdd = getAmountToAddNotEnoughTransport(amountOfPlanes, notEnoughTransport, planes.size());
                amountOfPlanes += amountToAdd;
                notEnoughTransport -= amountToAdd;
                if (notEnoughTransport > 0) {
                    amountToAdd = getAmountToAddNotEnoughTransport(amountOfBuses, notEnoughTransport, buses.size());
                    amountOfBuses += amountToAdd;
                }
            }
        }
        int[]res = new int[3];
        res[0]=amountOfBuses;
        res[1]=amountOfTrains;
        res[2]=amountOfPlanes;
        return res;
    }
//__________________________________________________________________________________________________________________
     /*
     тут тоже самое что и в предыдущем методе, только всего для 2 типов машин
     */
    private int[] getReformedAmountOfTwoTypeVehicle(ArrayList<Vehicle> preferredVehicles, ArrayList<Vehicle> nonPreferredVehicles,
                                                     double coefficientOfPreferredVehicles, double coefficientOfNonPreferredVehicles) {
        int amountOfPreferred = getAmountOfVehicle(preferredVehicles,coefficientOfPreferredVehicles);
        int amountOfNonPreferred = getAmountOfVehicle(nonPreferredVehicles,coefficientOfNonPreferredVehicles);
        int notEnoughTransport =(wantedCities.size()*wantedCities.size()-wantedCities.size())-
                (amountOfNonPreferred+amountOfPreferred);
        if (notEnoughTransport > 0) {
            int amountToAdd = getAmountToAddNotEnoughTransport(amountOfPreferred, notEnoughTransport, nonPreferredVehicles.size());
            amountOfNonPreferred += amountToAdd;
            notEnoughTransport -= amountOfNonPreferred;
            if (notEnoughTransport > 0) {
                amountToAdd = getAmountToAddNotEnoughTransport(amountOfPreferred, notEnoughTransport, preferredVehicles.size());
                amountOfPreferred += amountToAdd;
            }
        }
        int[]res = new int[2];
        res[0]=amountOfPreferred;
        res[1]=amountOfNonPreferred;
        return res;
    }
    //__________________________________________________________________________________________________________________

    /*
     смотрим сколько транспорта мы можем добавить.
     Если мы посчитали кол-во транспорта для каждого типа, но всего нужно больше (скорее всего при делении
     по модулю где-то единичка потерялась), то нам надо взять недостающее кол-во других машин
     ну и тут смотрим откуда мы их можем взять (где они есть)
     */
    private int getAmountToAddNotEnoughTransport(int amountOfVehicle,int notEnoughTransport,
                                                 int vehicleSize){
        int result=0;
        if (amountOfVehicle < vehicleSize) {
            if(amountOfVehicle+notEnoughTransport<=vehicleSize){
                result=notEnoughTransport;
            }else{
               result = vehicleSize-amountOfVehicle;
            }
        }
        return result;
    }

    //__________________________________________________________________________________________________________________

    /*
    ищем количество машин
    coefficient процентов от размера vehicle
     */
    private int getAmountOfVehicle(ArrayList<Vehicle> vehicle,
                                   double coefficient){
        int amountOfVehicle = Double.valueOf(vehicle.size()*coefficient).intValue();
        if(vehicle.size()<amountOfVehicle) {
            amountOfVehicle = vehicle.size();
        }
        return amountOfVehicle;
    }

    //__________________________________________________________________________________________________________________

    /*
        мы должны получить результирующий массив в котором были бы все переезды (из всех городов во все)
        часть мы уже заполнини неприоритетным самым выгодным транспортом. остальные переезды нужно взять
        из приоритетного.
        Мы смотрим, есть ли такой переезд на неприоритетном транспорте, если нет
        берем приоритетный
     */
    private ArrayList<Vehicle> getDisplacementNotContainInResultVehicles(ArrayList<Vehicle> resultVehicles,
                                                                         ArrayList<Vehicle> otherVehicles,
                                                                         int needAmount){
        int count=0;
        for (Vehicle preferredVehicle : otherVehicles) {
            if (!isVehiclePresent(resultVehicles, preferredVehicle)) {
                resultVehicles.add(preferredVehicle);
                count++;
                if(count==needAmount)break;
            }
        }
        return resultVehicles;
    }
    //__________________________________________________________________________________________________________________

    /*
    проверяем есть ли в массиве vehicles машина vehicle (проверяем только по городам откуда куда она едет,
    в остальном они могут быть разные,
    нам важно получить по одной любой машине из from в to.
     */
    private boolean isVehiclePresent(ArrayList<Vehicle> vehicles, Vehicle vehicle){
        for (Vehicle vehicle1 : vehicles) {
            if (vehicle1.getFrom().getName().equals(vehicle.getFrom().getName()) &&
                    vehicle1.getTo().getName().equals(vehicle.getTo().getName())) return true;
        }
        return false;
    }
    //__________________________________________________________________________________________________________________

    /*
    возвращаем средний транспорт, если не вместились в нужные данные с preferredTransport с учетом того
    куда мы не поместились
    Если в стоимость ищем более дешевый,
    если во время - более быстрый
     */
    private ArrayList<Vehicle> getNotPreferredVehicles(int preferredTransport,int typeDeviations){
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        if(preferredTransport== AllData.Train){
            if(typeDeviations==MoneyDeviation)
                vehicles = buses;
            else
                vehicles = planes;
        }
        if(preferredTransport == AllData.Bus){
            vehicles = trains;
        }
        if(preferredTransport == AllData.Plane){
            vehicles = trains;
        }
        return vehicles;
    }

    //__________________________________________________________________________________________________________________

    public static void main(String[] args) {

        InputCities inputCities = new CitiesFromCode();
        ArrayList<City> cities = inputCities.getCities();

        InputVehicle inputVehicle = new VehiclesFromCode();
        ArrayList<Vehicle> vehicles = inputVehicle.getAllTrains();

        AllData.cities = cities;
        AllData.trains = vehicles;

        TravelingSalesmanProblem travelingSalesmanProblem = new BranchBoundaryMethod();
        GraphCreator graphCreator = new Graph(AllData.generalTrains);
        InputUserData inputUserData = new UserDataFromCode(AllData.cities);
        CorrelationData correlationData = new CorrelationMoneyTime
                (travelingSalesmanProblem,graphCreator,inputUserData.getWantedCities());
        GeneralVehicles generalVehicles = new AverageVehicleData(AllData.trains,AllData.planes,AllData.buses,inputUserData.getWantedCities(),
                inputUserData.getPreferredTransport(),inputUserData.getDateFrom(),inputUserData.getDateTo());
        //CorrelationTrainPlaneBus correlationTrainPlaneBus = new CorrelationTrainPlaneBus(correlationData,inputVehicle,inputUserData,
          //      graphCreator,generalVehicles);
        ArrayList<Vehicle> arrayList = new ArrayList<>();
        ArrayList<Vehicle> arrayList1 = new ArrayList<>();
        arrayList.add(new Vehicle(new City(""),new City(""),new Date(),new Date(),0,3,3));
        arrayList.add(new Vehicle(new City(""),new City(""),new Date(),new Date(),0,4,4));
        arrayList.add(new Vehicle(new City(""),new City(""),new Date(),new Date(),0,5,5));
        arrayList.add(new Vehicle(new City(""),new City(""),new Date(),new Date(),0,2,2));
        arrayList.add(new Vehicle(new City(""),new City(""),new Date(),new Date(),0,1,1));



        arrayList1.add(new Vehicle());
        arrayList1.add(new Vehicle());
        // arrayList1.add(new Vehicle());
        arrayList1.add(new Vehicle());
        // arrayList1.add(new Vehicle());
        arrayList1.add(new Vehicle());
        arrayList1.add(new Vehicle());
        arrayList1.add(new Vehicle());
        //   arrayList1.add(new Vehicle());
        arrayList1.add(new Vehicle());
        arrayList1.add(new Vehicle());
        arrayList1.add(new Vehicle());
        arrayList1.add(new Vehicle());
        arrayList1.add(new Vehicle());
        arrayList1.add(new Vehicle());
        arrayList1.add(new Vehicle());
        arrayList1.add(new Vehicle());
        arrayList1.add(new Vehicle());
        arrayList1.add(new Vehicle());
        arrayList1.add(new Vehicle());

      //  correlationTrainPlaneBus.mergeVehicles(arrayList,arrayList1,0.03125,0.97);
    }

}
