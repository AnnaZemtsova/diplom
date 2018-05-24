package algorithm;

import data.City;
import data.Vehicle;
import dataForAlgorithm.Cell;

import java.util.ArrayList;
import java.util.Date;

public class CorrelationWayAndVehicles implements CorrelationTime {
    public CorrelationWayAndVehicles(CorrelationTransport correlationTransport,
                                     CorrelationData correlationData,
                                     TravelingSalesmanProblem travelingSalesmanProblem,
                                     GraphCreator graphCreator,
                                     ArrayList<Vehicle> trains, ArrayList<Vehicle> planes, ArrayList<Vehicle> buses,
                                     ArrayList<City> wantedCities,
                                     int preferredTransport,
                                     double availableMoney, double availableTime,ArrayList<Date> allDates){

    }

    @Override
    public ArrayList<Cell> getWay() {
        return null;
    }

    @Override
    public ArrayList<Vehicle> getVehicles() {
        return null;
    }
}
