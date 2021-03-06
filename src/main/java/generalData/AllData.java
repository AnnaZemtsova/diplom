package generalData;

import data.City;
import data.Train;
import data.Vehicle;

import java.util.ArrayList;
import java.util.Date;

public class AllData{
    /*
    все эти allCities allTrains тут лучше не хранить, а передавать непосредственно в методах.
    Пока пусть будут тут
    но в дальшейшем удалить (кроме как из каких-то мэйнов они нигде не вызываются)
    оставив только константы типов транспорта
    и переименовав в класс AllTransportTypes (ну или что-то такое)
     */
    //------------------------------------------------
    public static ArrayList<City> cities;

    public static ArrayList<Vehicle> trains;

    public static ArrayList<Vehicle> generalTrains;

    public static ArrayList<Vehicle> planes;

    public static ArrayList<Vehicle> generalPlanes;

    public static ArrayList<Vehicle> buses;

    public static ArrayList<Vehicle> generalBuses;
    //------------------------------------------------

    public static  int SittingPlace = 10;

    public static  int ReservedPlace =11;

    public static  int Compartment = 12;

    public static  int Intercity = 13;

    public static int PlanePlace  =4;

    public static int BusPlace  = 5;

    public static int TrainPlace  = 6;

    public static int Plane = 0;

    public static int Train  =1;

    public static int Bus  =2;

}
