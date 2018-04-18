package transport;

import data.Vehicle;
import exception.NoneVehicleToCity;

import java.util.ArrayList;

public interface GeneralVehicles {

    ArrayList<Vehicle> getGeneralTrains() throws NoneVehicleToCity;
    ArrayList<Vehicle> getGeneralPlanes() throws NoneVehicleToCity;
    ArrayList<Vehicle> getGeneralBuses() throws NoneVehicleToCity;

}
