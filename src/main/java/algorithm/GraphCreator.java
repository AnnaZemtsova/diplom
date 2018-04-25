package algorithm;

import data.City;
import data.Vehicle;
import java.util.ArrayList;

public interface GraphCreator {
     double[][] createGraphByMoney(ArrayList<City> wantedCities);
     double [][] createGraphByTime(ArrayList<City> wantedCities);
     double[][] createGraphByTimeMoney(ArrayList<City> wantedCities,double m,double t);
     void printGraph(double[][] graph);
}