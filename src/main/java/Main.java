import algorithm.BranchBoundaryMethod;

import algorithm.Graph;
import algorithm.TravelingSalesmanProblem;
import data.City;
import data.Vehicle;
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

        InputUserData inputUserData = new UserDataFromCode();
        double money = inputUserData.getMoney();
        double time = (double)(inputUserData.getTime()).getTime();
        ArrayList<City> wantedCity = inputUserData.getWantedCities();
        GraphCreator graphCreator = new Graph(AllData.trains);
        TravelingSalesmanProblem travelingSalesmanProblem = new BranchBoundaryMethod();
        Algorithm algorithm = new CorrelationMoneyTime(travelingSalesmanProblem,graphCreator,wantedCity );
        GeneralVehicles vehicles1 = new AverageVehicleData(inputVehicle,inputCities,inputUserData);
        ArrayList<Vehicle> genneralTrains = vehicles1.getGeneralTrains();
        for(int i=0;i<genneralTrains.size();i++){
            System.out.println(genneralTrains.get(i).getFrom().getName()+" "+
                    genneralTrains.get(i).getTo().getName()+" "+genneralTrains.get(i).getPrice()+" "+genneralTrains.get(i).getTimeInWay());
        }
        // algorithm.getWay(money, time);
    }

}
