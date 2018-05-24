package data;

import java.util.ArrayList;

public class ResultData {
    private ArrayList<City> way;
    private ArrayList<Vehicle> vehicles;

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public ArrayList<City> getWay() {

        return way;
    }

    public void setWay(ArrayList<City> way) {
        this.way = way;
    }
}
