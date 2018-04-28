package transport;

import data.Vehicle;
import exception.NoneVehicleToCity;

import java.util.ArrayList;

public interface GeneralVehicles {

    ArrayList<Vehicle> getGeneralTrains();
    ArrayList<Vehicle> getGeneralPlanes();
    ArrayList<Vehicle> getGeneralBuses();

}
