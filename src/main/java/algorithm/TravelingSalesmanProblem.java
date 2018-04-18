package algorithm;

import dataForAlgorithm.Cell;

import java.util.ArrayList;

public interface TravelingSalesmanProblem {

     ArrayList<Cell> getMinimumWay(int amountOfCity,double[][] graph);
     double getMinValue();
}