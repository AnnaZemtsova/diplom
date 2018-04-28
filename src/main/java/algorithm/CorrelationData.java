package algorithm;

import data.City;

import java.util.ArrayList;

public interface CorrelationData {
    ArrayList<City> getWay(double money, double time);
    double getWayPrice();
    double getWayTime();
    void setGraphCreator(GraphCreator graphCreator);
}
