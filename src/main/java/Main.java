import algorithm.BranchBoundaryMethod;

import algorithm.Graph;
import algorithm.TravelingSalesmanProblem;
import data.City;
import data.Vehicle;
import exception.NoneVehicleToCity;
import generalData.AllData;
import inputData.InputCities;
import inputData.InputUserData;
import inputData.InputVehicle;
import testingData.CitiesFromCode;
import testingData.UserDataFromCode;
import testingData.VehiclesFromCode;
import java.util.ArrayList;
import algorithm.*;
import transport.AverageVehicleData;
import transport.GeneralVehicles;

public class Main {
    public static void main(String[] args) {
        InputCities inputCities = new CitiesFromCode();
        ArrayList<City> cities = inputCities.getCities();

        InputVehicle inputVehicle = new VehiclesFromCode();
        ArrayList<Vehicle> vehicles = inputVehicle.getAllTrains();

        AllData.cities = cities;
        AllData.trains = vehicles;

        InputUserData inputUserData = new UserDataFromCode(cities);
        double money = inputUserData.getMoney();
        double time = (double)(inputUserData.getTime()).getTime();
        ArrayList<City> wantedCity = inputUserData.getWantedCities();
        TravelingSalesmanProblem travelingSalesmanProblem = new BranchBoundaryMethod();

        GeneralVehicles vehicles1 = new AverageVehicleData(inputVehicle,inputUserData);
        ArrayList<Vehicle> generalTrains = null;
      //  try {
            generalTrains = vehicles1.getGeneralTrains();
        //} catch (NoneVehicleToCity noneVehicleToCity) {
          //  noneVehicleToCity.printStackTrace();
       // }
        AllData.generalTrains = generalTrains;

        GraphCreator graphCreator = new Graph(AllData.generalTrains);
        CorrelationData algorithm = new CorrelationMoneyTime(travelingSalesmanProblem,graphCreator,wantedCity );
         graphCreator = new Graph(AllData.generalTrains);
        // graphCreator.printGraph(graphCreator.createGraphByMoney(inputUserData.getWantedCities()));
        for(int i=0;i<generalTrains.size();i++){
            System.out.println(generalTrains.get(i).getFrom().getName()+" "+
                    generalTrains.get(i).getTo().getName()+" "+generalTrains.get(i).getPrice()+" "+generalTrains.get(i).getTimeInWay()+
            " "+generalTrains.get(i).getComfortLevel());
        }
         ArrayList<City> cities1 = algorithm.getWay(money, time);
        System.out.println(cities1.size());
        for (int i=0;i<cities1.size();i++) {
          //  System.out.println( cities1.get(i).getName() );
        }

    }

}
