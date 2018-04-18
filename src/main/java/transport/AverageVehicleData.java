package transport;

import com.sun.istack.internal.NotNull;
import data.City;
import data.Train;
import data.Vehicle;
import exception.NoneVehicleToCity;
import generalData.AllData;
import inputData.InputCities;
import inputData.InputUserData;
import inputData.InputVehicle;
import java.util.ArrayList;
import java.util.Date;

public class AverageVehicleData implements GeneralVehicles{
    private InputCities inputCities;
    private InputVehicle inputVehicle;
    private InputUserData inputUserData;

    //________________________________________________________________________________________________________________________

    public AverageVehicleData(InputVehicle inputVehicle,InputCities inputCities,InputUserData inputUserData){
        this.inputVehicle = inputVehicle;
        this.inputCities = inputCities;
        this.inputUserData = inputUserData;
    }

    //________________________________________________________________________________________________________________________

    @Override
    public ArrayList<Vehicle> getGeneralTrains() {
        ArrayList<Vehicle> trains = inputVehicle.getAllTrains();
        ArrayList<City> cities = inputUserData.getWantedCities();
        return getVehiclesWithAverageDataForAllCities(trains,cities,AllData.TrainPlace);
    }



    //________________________________________________________________________________________________________________________

    @Override
    public ArrayList<Vehicle> getGeneralPlanes() {
        ArrayList<Vehicle> trains = inputVehicle.getAllPlanes();
        ArrayList<City> cities = inputUserData.getWantedCities();
        return getVehiclesWithAverageDataForAllCities(trains,cities,AllData.PlanePlace);
    }

    //________________________________________________________________________________________________________________________

    @Override
    public ArrayList<Vehicle> getGeneralBuses() {
        ArrayList<Vehicle> trains = inputVehicle.getAllBuses();
        ArrayList<City> cities = inputUserData.getWantedCities();
        return getVehiclesWithAverageDataForAllCities(trains,cities,AllData.BusPlace);
    }

    //________________________________________________________________________________________________________________________

    /*
     Ищем все машины из города cityFrom в город cityTo с уровнем кофорта comfortLevel
     */
    private ArrayList<Vehicle> searchAllVehiclesByComfortLevelForCity(@NotNull ArrayList<Vehicle> vehicles,int comfortLevel,
                                                                      City cityFrom,City cityTo){
        ArrayList<Vehicle> resultVehicles= new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if ((vehicle.getComfortLevel() == comfortLevel) && vehicle.getFrom().getName().equals(cityFrom.getName()) &&
                    vehicle.getTo().getName().equals(cityTo.getName())) {
                resultVehicles.add(vehicle);
            }
        }
        return resultVehicles;
    }

//________________________________________________________________________________________________________________________

    //ЖЕЛАТЕЛЬНО УПРОСТИТЬ МЕТОД!!!!
     /*
     А тут происходит следующая фишка:
     пользователь например хотел изначально поезда. Мы и пытаемся сначала найти поезда из каждой точки в каждую.
     Но если в какой-то город мы вообще ниотткуда на поезде доехать не можем, надо бы заполнить матрицу,
     так как путь в таком случае однозначно не получится. Тогда берем автобусы и самолеты и ищем хотя бы что-то.
     Так не только для поездов а для каждого вида транспорта.
     Ищем с неким приоритетом. То есть если пользователь хотел автобусы, явно ему надо подешевле. Смотри сначала
     поезда, и если уже и их нету то самолеты. Или если хотел самолеты , то сначала смотрим поезда а потом автобусы.
     */

    private ArrayList<Vehicle> getOtherVehicleToCity(int comfortLevel,City cityTo,ArrayList<City>cities) throws NoneVehicleToCity {
        int preferredTransport = inputUserData.getPreferredTransport();
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        if(comfortLevel==AllData.TrainPlace){
            if(preferredTransport== AllData.Train||preferredTransport==AllData.PlanePlace){
                for (City city : cities) {
                    if (!city.getName().equals(cityTo.getName())) {
                        vehicles = searchAllVehiclesByComfortLevelForCity(inputVehicle.getAllPlanes(), AllData.PlanePlace,
                                city, cityTo);
                    }
                }
                if(vehicles.size()==0){
                    for (City city : cities) {
                        if (!city.getName().equals(cityTo.getName())) {
                            vehicles = searchAllVehiclesByComfortLevelForCity(inputVehicle.getAllBuses(), AllData.BusPlace,
                                    city, cityTo);
                        }
                    }
                }
            }
            if(preferredTransport==AllData.Bus){
                for (City city : cities) {
                    if (!city.getName().equals(cityTo.getName())) {
                        vehicles = searchAllVehiclesByComfortLevelForCity(inputVehicle.getAllBuses(), AllData.BusPlace,
                                city, cityTo);
                    }
                }
                if(vehicles.size()==0){
                    for (City city : cities) {
                        if (!city.getName().equals(cityTo.getName())) {
                            vehicles = searchAllVehiclesByComfortLevelForCity(inputVehicle.getAllPlanes(), AllData.PlanePlace,
                                    city, cityTo);
                        }
                    }
                }
            }
        }
        if(comfortLevel==AllData.PlanePlace){
            if(preferredTransport== AllData.Train||preferredTransport==AllData.PlanePlace){
                for (City city : cities) {
                    if (!city.getName().equals(cityTo.getName())) {
                        vehicles = getTrainsByOneDirection(city, cityTo, inputVehicle.getAllTrains());
                    }
                }
                if(vehicles.size()==0){
                    for (City city : cities) {
                        if (!city.getName().equals(cityTo.getName())) {
                            vehicles = searchAllVehiclesByComfortLevelForCity(inputVehicle.getAllBuses(), AllData.BusPlace,
                                    city, cityTo);
                        }
                    }
                }

            }
            if(preferredTransport==AllData.Bus){
                for (City city : cities) {
                    if (!city.getName().equals(cityTo.getName())) {
                        vehicles = searchAllVehiclesByComfortLevelForCity(inputVehicle.getAllBuses(), AllData.BusPlace,
                                city, cityTo);
                    }
                }
                if(vehicles.size()==0){
                    for (City city : cities) {
                        if (!city.getName().equals(cityTo.getName())) {
                            vehicles = getTrainsByOneDirection(city, cityTo, inputVehicle.getAllTrains());
                        }
                    }
                }
            }
        }
        if(comfortLevel==AllData.BusPlace){
            if(preferredTransport==AllData.Bus||preferredTransport== AllData.Train){
                for (City city : cities) {
                    if (!city.getName().equals(cityTo.getName())) {
                        vehicles = getTrainsByOneDirection(city, cityTo, inputVehicle.getAllTrains());
                    }
                }
                if(vehicles.size()==0) {
                    for (City city : cities) {
                        if (!city.getName().equals(cityTo.getName())) {
                            vehicles = searchAllVehiclesByComfortLevelForCity(inputVehicle.getAllPlanes(), AllData.PlanePlace,
                                    city, cityTo);
                        }
                    }
                }
            }
            if(preferredTransport==AllData.PlanePlace){
                for (City city : cities) {
                    if (!city.getName().equals(cityTo.getName())) {
                        vehicles = searchAllVehiclesByComfortLevelForCity(inputVehicle.getAllPlanes(), AllData.PlanePlace,
                                city, cityTo);
                    }
                }
                if(vehicles.size()==0){
                    for (City city : cities) {
                        if (!city.getName().equals(cityTo.getName())) {
                            vehicles = getTrainsByOneDirection(city, cityTo, inputVehicle.getAllTrains());
                        }
                    }
                }
            }
        }
        if(vehicles.size()==0) throw  new NoneVehicleToCity();
        return vehicles;
    }

    //________________________________________________________________________________________________________________________

    /*
          ищем все города в который не едет ни одна машина желаемого вида транспорта
     */
    private ArrayList<City> getCitiesWithoutVehicle(City to,ArrayList<Vehicle> vehicles,ArrayList<City> cities){
        ArrayList<City> citiesWithoutVehicle = new ArrayList<>();
        for (City city : cities) {
            boolean isExist = false;
            for (Vehicle vehicle : vehicles) {
                if (vehicle.getTo().getName().equals(city.getName())) {
                    isExist = true;
                }
            }
            if (!isExist) {
                citiesWithoutVehicle.add(city);
            }
        }
        return citiesWithoutVehicle;
    }


    //________________________________________________________________________________________________________________________

    /*
    тут мы ищем среднюю цену на весь транспорт(в кругу одного транспорта - или
     поезда или автобусы или самолеты) по напрвавлению, так как запихнуть все сразу в матрицу не можем!
    но возможно имеет смысл искать не среднюю а минимальную!!!
     */
    private double getAverageCost(@NotNull ArrayList<Vehicle> vehicles){
        double sum=0;
        for (Vehicle vehicle : vehicles) {
            sum += vehicle.getPrice();
        }
        return sum/vehicles.size();
    }


    //________________________________________________________________________________________________________________________

    /*
    тут мы ищем среднее время  на весь транспорт(в кругу одного транспорта - или
     поезда или автобусы или самолеты) по напрвавлению, так как запихнуть все сразу в матрицу не можем!
    но возможно имеет смысл искать не среднее а минимальное!!!
     */
    private double getAverageTime(@NotNull ArrayList<Vehicle> vehicles){
        double sum = 0;
        for (Vehicle vehicle : vehicles) {
            sum += (vehicle.getDateTo().getTime() - vehicle.getDateFrom().getTime())/(1000*60*60);
        }
        return sum/vehicles.size();
    }

    //________________________________________________________________________________________________________________________

    /*
      У нас есть поезда. Куча поездов в одном направлении в один день. Ищем их все по уровню комфорта
      Сначала пытаемся найти все плацкарты - самый распространенный вид , где и цена дешевая, и время нормальное
      Если их слишком мало (меньше coefficient), ищем все купе. (сидеть когда долго в дороге не очень)
      Но если и купе мало ищем интерсити (они хотя бы быстрые)
      Ну а если всего мало, то хотя бы сидячие.
     */
    private  ArrayList<Vehicle> getTrainsByOneDirection(City from ,City to,ArrayList<Vehicle> allTrains) {
        double amountOfDay = (inputUserData.getDateTo().getTime() - inputUserData.getDateFrom().getTime()) / (1000 * 60 * 60 * 24);
        double coefficient = (amountOfDay * 25) / 100;
        ArrayList<Vehicle> generalTrainsByOneDirection;
        generalTrainsByOneDirection = searchAllVehiclesByComfortLevelForCity(allTrains, AllData.ReservedPlace,
                from, to);
        if (generalTrainsByOneDirection.size() < coefficient) {
            generalTrainsByOneDirection.addAll(searchAllVehiclesByComfortLevelForCity(allTrains, AllData.Compartment,
                    from, to));
            if (generalTrainsByOneDirection.size() < coefficient * 2) {
                generalTrainsByOneDirection.addAll(searchAllVehiclesByComfortLevelForCity(allTrains, AllData.Intercity,
                        from, to));
                if (generalTrainsByOneDirection.size() < coefficient * 3) {
                    generalTrainsByOneDirection.addAll(searchAllVehiclesByComfortLevelForCity(allTrains, AllData.SittingPlace,
                            from, to));
                }
            }
        }
        return generalTrainsByOneDirection;
    }


    //________________________________________________________________________________________________________________________

/*
ХРЕНЬ
СМотрю чтобы обязательно были ВСЕ ПЕРЕЕЗДЫ!
ВОЗМОЖНО НУЖНО СДЕЛАТЬ ПРОВЕРКИ ВО ВНЕШНЕМ ЦИКЛЕ!
 */
    /*
      Тут анализируем весь транспорт что есть и оцениваем сколько в среднем обойдется дорога  из каждой точки в каждую,
      и добавляем новые Vehicle, которые будут нужны только для алгоритма
      Пытаемся найти транспорт так, чтобы хотя бы как-то в любой город можно было доехать.
      Если невозможно надо бы вернуть какой-то еррор!!
     */
    private ArrayList<Vehicle> getVehiclesWithAverageDataForAllCities(@NotNull ArrayList<Vehicle> allVehicles,
                                                               @NotNull ArrayList<City> cities,int comfortLevel){
        ArrayList<Vehicle> generalTrains=new ArrayList<>();
        for(int i=0;i<cities.size();i++) {
            for(int j=0;j<cities.size();j++) {
                ArrayList<Vehicle> generalVehiclesWithOneDirection;
                if(i!=j) {
                    if(comfortLevel==AllData.TrainPlace){
                        generalVehiclesWithOneDirection = getTrainsByOneDirection(cities.get(i), cities.get(j), allVehicles);
                    }else {
                        generalVehiclesWithOneDirection = searchAllVehiclesByComfortLevelForCity(allVehicles, comfortLevel,
                                cities.get(i), cities.get(j));
                    }
                    if(generalVehiclesWithOneDirection.size()!=0) {
                        generalTrains.add(getVehicleWithAverageData(cities.get(i), cities.get(j), generalVehiclesWithOneDirection));
                    }/*else{
                        ArrayList<Vehicle> generalVehiclesByOneDirection = getVehicleWithOtherType(comfortLevel,cities.get(i),
                                cities.get(j));
                        if(generalVehiclesByOneDirection.size()!=0){
                            generalTrains.add(getVehicleWithAverageData(cities.get(i), cities.get(j), generalVehiclesByOneDirection));
                        }else{
                            System.out.println("LBXM");
                            //ТУТ МОЖНО ВЕРНУТЬ КАКОЙ_ТО ЭРРОР!!!!!!! в одну точку добраться невозможно!!!!!
                        }
                    }*/
                }
            }
        }
        return generalTrains;
    }

    //________________________________________________________________________________________________________________________
    /*
      Ищем среднюю стоимость и среднее время в дороге для определенного вида транспорта
     */
    private Vehicle getVehicleWithAverageData(City from, City to,ArrayList<Vehicle> generalVehicles){
        double averagePrice = getAverageCost(generalVehicles);
        double averageTime = getAverageTime(generalVehicles);
        return new Vehicle(from,to,new Date(),new Date(),
                AllData.ReservedPlace,averagePrice,averageTime);
    }






    //________________________________________________________________________________________________________________________

    public void printTrains(ArrayList<Vehicle> generalTrains){
        for(int i=0;i<generalTrains.size();i++){
            System.out.println(generalTrains.get(i).getFrom().getName()+" "+
                    generalTrains.get(i).getTo().getName()+" "+generalTrains.get(i).getComfortLevel()+" "+
                    generalTrains.get(i).getPrice()+" "+generalTrains.get(i).getTimeInWay());
        }
        System.out.println("________________________________________________________________________________________");
    }
}
