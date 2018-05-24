package myBooking;

import data.City;
import data.Vehicle;
import inputData.InputVehicle;

import java.util.ArrayList;
import java.util.Date;

public class GetVehicleFromDB implements InputVehicle {


    @Override
    public ArrayList<Vehicle> getAllTrains(Date dateFrom, Date dateTo, ArrayList<City> cities) {
        return null;
    }

    @Override
    public ArrayList<Vehicle> getAllPlanes(Date dateFrom, Date dateTo, ArrayList<City> cities) {
        return null;
    }

    @Override
    public ArrayList<Vehicle> getAllBuses(Date dateFrom, Date dateTo, ArrayList<City> cities) {
        return null;
    }
}
