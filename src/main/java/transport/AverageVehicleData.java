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
    private ArrayList<Vehicle> trains;
    private ArrayList<Vehicle> planes;
    private ArrayList<Vehicle> buses;
    private  ArrayList<City> wantedCities;
    private int preferredTransport;
    private Date dateFrom;
    private Date dateTo;

    //________________________________________________________________________________________________________________________

    public AverageVehicleData(ArrayList<Vehicle> trains,
                              ArrayList<Vehicle> planes,ArrayList<Vehicle> buses,ArrayList<City> wantedCities,
                              int preferredTransport,Date dateFrom,Date dateTo){
        this.trains = trains;
        this.planes = planes;
        this.buses = buses;
        this.preferredTransport = preferredTransport;
        this.wantedCities = wantedCities;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }

    //________________________________________________________________________________________________________________________

    @Override
    public ArrayList<Vehicle> getGeneralTrains() {
        //ArrayList<Vehicle> trains = trains;// inputVehicle.getAllTrains();
       // ArrayList<City> cities = inputUserData.getWantedCities();
        return searchAllVehiclesByComfortLevel(AllData.TrainPlace,trains,wantedCities);

    }



    //________________________________________________________________________________________________________________________

    @Override
    public ArrayList<Vehicle> getGeneralPlanes()  {
       // ArrayList<Vehicle> planes = inputVehicle.getAllPlanes();
      //  ArrayList<City> cities = inputUserData.getWantedCities();
        return   searchAllVehiclesByComfortLevel(AllData.PlanePlace,planes,wantedCities);

    }

    //________________________________________________________________________________________________________________________

    @Override
    public ArrayList<Vehicle> getGeneralBuses() {
       // ArrayList<Vehicle> buses = inputVehicle.getAllBuses();
        //ArrayList<City> cities = inputUserData.getWantedCities();
        return    searchAllVehiclesByComfortLevel(AllData.BusPlace,buses,wantedCities);

    }
    //________________________________________________________________________________________________________________________

    /*
        Ищем транпорт для каждого города.
        Сначала ищем тот который хочет пользователь, если его нет - другой.
     */
    private ArrayList<Vehicle> searchAllVehiclesByComfortLevel(int comfortLevel,ArrayList<Vehicle> vehicles,
                                                               ArrayList<City> cities) {
        ArrayList<Vehicle> resultVehicles = getVehiclesWithAverageDataForAllCities(vehicles,cities,comfortLevel);
       /* ArrayList<City> citiesWithoutVehicle = getCitiesWithoutVehicle(resultVehicles,cities);
        if(citiesWithoutVehicle.size()!=0){
            ArrayList<Vehicle> otherVehiclesToCity;
            for (City aCitiesWithoutVehicle : citiesWithoutVehicle) {
                otherVehiclesToCity = getOtherAverageVehiclesToCity(
                        getOtherVehicleToCity(comfortLevel, aCitiesWithoutVehicle, cities));
                if(otherVehiclesToCity.size()!=0){
                    resultVehicles.addAll(otherVehiclesToCity);
                }
            }
        }*/
        return resultVehicles;
    }

    //________________________________________________________________________________________________________________________


    /*
    Получаем одну машину для каждого направления с неприоритетным транспортом.
     */
    /*private ArrayList<Vehicle> getOtherAverageVehiclesToCity(ArrayList<Vehicle> vehicles){
        ArrayList<ArrayList<Vehicle>> listArrayList = new ArrayList<>();
        ArrayList<Vehicle> tmp = new ArrayList<>();
        tmp.add(vehicles.get(0));
        for(int i=1;i<vehicles.size();i++){
            if(!(vehicles.get(i).getFrom().getName().equals(vehicles.get(i-1).getFrom().getName()))){
                listArrayList.add(tmp);
                tmp=new ArrayList<>();
            }
            tmp.add(vehicles.get(i));
        }
        listArrayList.add(tmp);
        ArrayList<Vehicle> result = new ArrayList<>();
        for (ArrayList<Vehicle> aListArrayList : listArrayList) {
            result.add(getVehicleWithAverageData(aListArrayList.get(0).getFrom(), aListArrayList.get(0).getTo(),
                    aListArrayList));
        }
        return result;
    }*/
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

    private ArrayList<Vehicle> getOtherVehicleToCity(int comfortLevel,City cityTo,ArrayList<City>cities){

        //int preferredTransport = inputUserData.getPreferredTransport();
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        if(comfortLevel==AllData.TrainPlace){
            if(preferredTransport== AllData.Train||preferredTransport==AllData.Plane){
                for (City city : cities) {
                    if (!city.getName().equals(cityTo.getName())) {
                        vehicles.addAll(searchAllVehiclesByComfortLevelForCity(planes, AllData.PlanePlace,
                                city, cityTo));
                    }
                }
                if(vehicles.size()==0){
                    for (City city : cities) {
                        if (!city.getName().equals(cityTo.getName())) {
                            vehicles.addAll(searchAllVehiclesByComfortLevelForCity(buses, AllData.BusPlace,
                                    city, cityTo));
                        }
                    }
                }
            }
            if(preferredTransport==AllData.Bus){
                for (City city : cities) {
                    if (!city.getName().equals(cityTo.getName())) {
                        vehicles.addAll(searchAllVehiclesByComfortLevelForCity(buses, AllData.BusPlace,
                                city, cityTo));
                    }
                }
                if(vehicles.size()==0){
                    for (City city : cities) {
                        if (!city.getName().equals(cityTo.getName())) {
                            vehicles.addAll(searchAllVehiclesByComfortLevelForCity(planes, AllData.PlanePlace,
                                    city, cityTo));
                        }
                    }
                }
            }
        }
        if(comfortLevel==AllData.PlanePlace){
            if(preferredTransport== AllData.Train||preferredTransport==AllData.Plane){
                for (City city : cities) {
                    if (!city.getName().equals(cityTo.getName())) {
                        vehicles.addAll(getTrainsByOneDirection(city, cityTo, trains));
                    }
                }
                if(vehicles.size()==0){
                    for (City city : cities) {
                        if (!city.getName().equals(cityTo.getName())) {
                            vehicles.addAll(searchAllVehiclesByComfortLevelForCity(buses, AllData.BusPlace,
                                    city, cityTo));
                        }
                    }
                }

            }
            if(preferredTransport==AllData.Bus){
                for (City city : cities) {
                    if (!city.getName().equals(cityTo.getName())) {
                        vehicles.addAll(searchAllVehiclesByComfortLevelForCity(buses, AllData.BusPlace,
                                city, cityTo));
                    }
                }
                if(vehicles.size()==0){
                    for (City city : cities) {
                        if (!city.getName().equals(cityTo.getName())) {
                            vehicles.addAll(getTrainsByOneDirection(city, cityTo, trains));
                        }
                    }
                }
            }
        }
        if(comfortLevel==AllData.BusPlace){
            if(preferredTransport==AllData.Bus||preferredTransport== AllData.Train){
                for (City city : cities) {
                    if (!city.getName().equals(cityTo.getName())) {
                        vehicles.addAll(getTrainsByOneDirection(city, cityTo, trains));
                    }
                }
                if(vehicles.size()==0) {
                    for (City city : cities) {
                        if (!city.getName().equals(cityTo.getName())) {
                            vehicles.addAll(searchAllVehiclesByComfortLevelForCity(planes, AllData.PlanePlace,
                                    city, cityTo));
                        }
                    }
                }
            }
            if(preferredTransport==AllData.Plane){
                for (City city : cities) {
                    if (!city.getName().equals(cityTo.getName())) {
                        vehicles.addAll(searchAllVehiclesByComfortLevelForCity(planes, AllData.PlanePlace,
                                city, cityTo));
                    }
                }
                if(vehicles.size()==0){
                    for (City city : cities) {
                        if (!city.getName().equals(cityTo.getName())) {
                            vehicles.addAll(getTrainsByOneDirection(city, cityTo, trains));
                        }
                    }
                }
            }
        }
        /*
        пока убираю этот эксепшен из размышлений что если ничего нет на направелние А -> В, мы уже
        ничего туда и не найдем
        путь при этом может существовать а может и нет
        но чего бы не попытаться.
        а если он не получается то можно проанализировать это позже.
        возможно стоит вернуть этот эксепшен
         */
       // if(vehicles.size()==0)
         //   throw  new NoneVehicleToCity();

        return vehicles;
    }

    //________________________________________________________________________________________________________________________

    /*
          ищем все города в который не едет ни одна машина желаемого вида транспорта
     */
    private ArrayList<City> getCitiesWithoutVehicle(ArrayList<Vehicle> vehicles,ArrayList<City> cities){
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
            Это пока вообще не надо и нигде не используется. оставила на случай если решим искать не все возможные направления
            а только чтобы хоть откудато можно было доехать в каждый город
     */
    private ArrayList<Vehicle> getVehicleWithOtherType(int comfortLevel, City cityFrom,City cityTo){
        ArrayList<Vehicle> resultVehicles = new ArrayList<>();
       // int preferredTransport = inputUserData.getPreferredTransport();
        if(comfortLevel==AllData.TrainPlace){
            if(preferredTransport==AllData.Bus){
                resultVehicles = searchAllVehiclesByComfortLevelForCity(buses,AllData.BusPlace,
                        cityFrom,cityTo);
                if(resultVehicles.size()==0){
                    resultVehicles = searchAllVehiclesByComfortLevelForCity(planes,AllData.PlanePlace,
                            cityFrom,cityTo);
                }
            }
            if(preferredTransport==AllData.Plane||preferredTransport==AllData.TrainPlace){
                resultVehicles = searchAllVehiclesByComfortLevelForCity(planes,AllData.PlanePlace,
                        cityFrom,cityTo);
                if(resultVehicles.size()==0){
                    resultVehicles = searchAllVehiclesByComfortLevelForCity(buses,AllData.BusPlace,
                            cityFrom,cityTo);
                }
            }
        }

        if(comfortLevel==AllData.BusPlace) {
            if (preferredTransport == AllData.TrainPlace || preferredTransport == AllData.BusPlace) {
                resultVehicles = getTrainsByOneDirection(cityFrom,cityTo,trains);
                if (resultVehicles.size() == 0) {
                    resultVehicles = searchAllVehiclesByComfortLevelForCity(planes,
                            AllData.PlanePlace, cityFrom, cityTo);
                }
            }
            if (preferredTransport == AllData.PlanePlace) {
                resultVehicles = searchAllVehiclesByComfortLevelForCity(planes, AllData.PlanePlace,
                        cityFrom, cityTo);
                if (resultVehicles.size() == 0) {
                    resultVehicles = getTrainsByOneDirection(cityFrom,cityTo,trains);
                }
            }
        }


        if(comfortLevel==AllData.PlanePlace) {
            if (preferredTransport == AllData.TrainPlace||preferredTransport==AllData.PlanePlace) {
                resultVehicles = getTrainsByOneDirection(cityFrom,cityTo,trains);
                if (resultVehicles.size() == 0) {
                    resultVehicles = searchAllVehiclesByComfortLevelForCity(buses, AllData.BusPlace,
                            cityFrom, cityTo);
                }
            }
            if (preferredTransport == AllData.BusPlace) {
                resultVehicles = searchAllVehiclesByComfortLevelForCity(buses, AllData.BusPlace,
                        cityFrom, cityTo);
                if (resultVehicles.size() == 0) {
                    resultVehicles = getTrainsByOneDirection(cityFrom,cityTo,trains);
                }
            }
        }
        return resultVehicles;
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
        double amountOfDay = (dateTo.getTime() - dateFrom.getTime()) / (1000 * 60 * 60 * 24);
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
      Тут анализируем весь транспорт что есть и оцениваем сколько в среднем обойдется дорога  из каждой точки в каждую,
      и добавляем новые Vehicle, которые будут нужны только для алгоритма
      Пытаемся найти транспорт так, чтобы хотя бы как-то в любой город можно было доехать.

     */
    private ArrayList<Vehicle> getVehiclesWithAverageDataForAllCities(@NotNull ArrayList<Vehicle> allVehicles,
                                                                      @NotNull ArrayList<City> cities,int comfortLevel) {
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
                        generalTrains.add(getVehicleWithAverageData(cities.get(i), cities.get(j),
                                generalVehiclesWithOneDirection,comfortLevel));
                    }else {
                        generalVehiclesWithOneDirection = getOtherVehicleToCity(comfortLevel,cities.get(j),cities);
                        if(generalVehiclesWithOneDirection.size()!=0) {
                            generalTrains.add(getVehicleWithAverageData(cities.get(i), cities.get(j),
                                    generalVehiclesWithOneDirection,generalVehiclesWithOneDirection.get(0).getComfortLevel()));
                        }
                    }
                }
            }
        }
        return generalTrains;
    }

    //________________________________________________________________________________________________________________________
    /*
      Ищем среднюю стоимость и среднее время в дороге для определенного вида транспорта
     */
    private Vehicle getVehicleWithAverageData(City from, City to,ArrayList<Vehicle> generalVehicles,int comfortLevel){
        double averagePrice = getAverageCost(generalVehicles);
        double averageTime = getAverageTime(generalVehicles);
        return new Vehicle(from,to,new Date(),new Date(),
                comfortLevel,averagePrice,averageTime);
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