package inputData;

import data.City;
import data.Train;
import data.Vehicle;

import java.util.ArrayList;
import java.util.Date;

public interface InputVehicle {


   ArrayList<Vehicle> getAllTrains(Date dateFrom, Date dateTo, ArrayList<City> cities);

   ArrayList<Vehicle> getAllPlanes(Date dateFrom, Date dateTo, ArrayList<City> cities);

   ArrayList<Vehicle> getAllBuses(Date dateFrom, Date dateTo, ArrayList<City> cities);
}
