package testingData;

import data.City;
import data.Vehicle;
import generalData.AllData;
import inputData.InputVehicle;

import java.util.ArrayList;
import java.util.Date;

public class VehiclesFromCode implements InputVehicle {
    ArrayList<Vehicle> trains;
    ArrayList<Vehicle> buses;
    ArrayList<Vehicle> planes;
    ArrayList<City> cities;

    public VehiclesFromCode(){
        trains = new ArrayList<>();
        buses = new ArrayList<>();
        planes = new ArrayList<>();
    }

    @Override
    public ArrayList<Vehicle> getAllTrains(Date from,Date to,ArrayList<City> cities) {
        fullTrains();
        return trains;
    }

    @Override
    public ArrayList<Vehicle> getAllPlanes(Date from,Date to,ArrayList<City> cities) {
        fullPlanes();
        return planes;
    }

    @Override
    public ArrayList<Vehicle> getAllBuses(Date from,Date to,ArrayList<City> cities) {
        fullBuses();
        return buses;
    }

    public void fullPlanes() {
        buses = new ArrayList<>();
        cities = new ArrayList<>();
        City cityK = new City("Kyiv");
        City cityL = new City("Lviv");
        City cityO = new City("Odessa");


        Date date11_10 = new Date(2018, 4, 11, 10, 15);
        Date date11_11 = new Date(2018, 4, 11, 11, 15);
        Date date11_8 = new Date(2018, 4, 11, 8, 15);
        Date date11_6 = new Date(2018, 4, 11, 6, 15);
        Date date11_15 = new Date(2018, 4, 11, 15, 15);
        Date date11_18 = new Date(2018, 4, 11, 18, 15);
        Date date11_20 = new Date(2018, 4, 11, 20, 15);
        Date date11_22 = new Date(2018, 4, 11, 22, 15);
        Date date11_23 = new Date(2018, 4, 11, 23, 15);


        Date date12_10 = new Date(2018, 4, 12, 10, 15);
        Date date12_11 = new Date(2018, 4, 12, 11, 15);
        Date date12_8 = new Date(2018, 4, 12, 8, 15);
        Date date12_6 = new Date(2018, 4, 12, 6, 15);
        Date date12_15 = new Date(2018, 4, 12, 15, 15);
        Date date12_18 = new Date(2018, 4, 12, 18, 15);
        Date date12_20 = new Date(2018, 4, 12, 20, 15);
        Date date12_22 = new Date(2018, 4, 12, 22, 15);
        Date date12_23 = new Date(2018, 4, 12, 23, 15);


        Date date13_10 = new Date(2018, 4, 13, 10, 15);
        Date date13_11 = new Date(2018, 4, 13, 11, 15);
        Date date13_8 = new Date(2018, 4, 13, 8, 15);
        Date date13_6 = new Date(2018, 4, 13, 6, 15);
        Date date13_15 = new Date(2018, 4, 13, 15, 15);
        Date date13_18 = new Date(2018, 4, 13, 18, 15);
        Date date13_20 = new Date(2018, 4, 13, 20, 15);
        Date date13_22 = new Date(2018, 4, 13, 22, 15);
        Date date13_23 = new Date(2018, 4, 13, 23, 15);


        Date date14_10 = new Date(2018, 4, 14, 10, 15);
        Date date14_11 = new Date(2018, 4, 14, 11, 15);
        Date date14_8 = new Date(2018, 4, 14, 8, 15);
        Date date14_6 = new Date(2018, 4, 14, 6, 15);
        Date date14_15 = new Date(2018, 4, 14, 15, 15);
        Date date14_18 = new Date(2018, 4, 14, 18, 15);
        Date date14_20 = new Date(2018, 4, 14, 20, 15);
        Date date14_22 = new Date(2018, 4, 14, 22, 15);
        Date date14_23 = new Date(2018, 4, 14, 23, 15);


        Date date15_10 = new Date(2018, 4, 15, 10, 15);
        Date date15_11 = new Date(2018, 4, 15, 11, 15);
        Date date15_8 = new Date(2018, 4, 15, 8, 15);
        Date date15_6 = new Date(2018, 4, 15, 6, 15);
        Date date15_15 = new Date(2018, 4, 15, 15, 15);
        Date date15_18 = new Date(2018, 4, 15, 18, 15);
        Date date15_20 = new Date(2018, 4, 15, 20, 15);
        Date date15_22 = new Date(2018, 4, 15, 22, 15);
        Date date15_23 = new Date(2018, 4, 15, 23, 15);


        Date date16_10 = new Date(2018, 4, 16, 10, 15);
        Date date16_11 = new Date(2018, 4, 16, 11, 15);
        Date date16_8 = new Date(2018, 4, 16, 8, 15);
        Date date16_6 = new Date(2018, 4, 16, 6, 15);
        Date date16_15 = new Date(2018, 4, 16, 15, 15);
        Date date16_18 = new Date(2018, 4, 16, 18, 15);
        Date date16_20 = new Date(2018, 4, 16, 20, 15);
        Date date16_22 = new Date(2018, 4, 16, 22, 15);
        Date date16_23 = new Date(2018, 4, 16, 23, 15);

        Date date17_10 = new Date(2018, 4, 17, 10, 15);
        Date date17_11 = new Date(2018, 4, 17, 11, 15);
        Date date17_8 = new Date(2018, 4, 17, 8, 15);
        Date date17_6 = new Date(2018, 4, 17, 6, 15);
        Date date17_15 = new Date(2018, 4, 17, 15, 15);
        Date date17_18 = new Date(2018, 4, 17, 18, 15);
        Date date17_20 = new Date(2018, 4, 17, 20, 15);
        Date date17_22 = new Date(2018, 4, 17, 22, 15);
        Date date17_23 = new Date(2018, 4, 17, 23, 15);


        Date date18_10 = new Date(2018, 4, 18, 10, 15);
        Date date18_11 = new Date(2018, 4, 18, 11, 15);
        Date date18_8 = new Date(2018, 4, 18, 8, 15);
        Date date18_6 = new Date(2018, 4, 18, 6, 15);
        Date date18_15 = new Date(2018, 4, 18, 15, 15);
        Date date18_18 = new Date(2018, 4, 18, 18, 15);
        Date date18_20 = new Date(2018, 4, 18, 20, 15);
        Date date18_22 = new Date(2018, 4, 18, 22, 15);
        Date date18_23 = new Date(2018, 4, 18, 23, 15);

        Date date19_10 = new Date(2018, 4, 19, 10, 15);
        Date date19_11 = new Date(2018, 4, 19, 11, 15);
        Date date19_8 = new Date(2018, 4, 19, 8, 15);
        Date date19_6 = new Date(2018, 4, 19, 6, 15);
        Date date19_15 = new Date(2018, 4, 19, 15, 15);
        Date date19_18 = new Date(2018, 4, 19, 18, 15);
        Date date19_20 = new Date(2018, 4, 19, 20, 15);
        Date date19_22 = new Date(2018, 4, 19, 22, 15);
        Date date19_23 = new Date(2018, 4, 19, 23, 15);

        Date date20_10 = new Date(2018, 4, 20, 10, 15);
        Date date20_11 = new Date(2018, 4, 20, 11, 15);
        Date date20_8 = new Date(2018, 4, 20, 8, 15);
        Date date20_6 = new Date(2018, 4, 20, 6, 15);
        Date date20_15 = new Date(2018, 4, 20, 15, 15);
        Date date20_18 = new Date(2018, 4, 20, 18, 15);
        Date date20_20 = new Date(2018, 4, 20, 20, 15);
        Date date20_22 = new Date(2018, 4, 20, 22, 15);
        Date date20_23 = new Date(2018, 4, 20, 23, 15);
        Date date21_6 = new Date(2018, 4, 21, 6, 15);


        cities.add(cityK);
        cities.add(cityL);
        cities.add(cityO);
        //cities.add( cityH );
        // cities.add( cityD );


        Vehicle VehicleKL1_11 = new Vehicle(cityK, cityL, date11_6, date11_8, AllData.PlanePlace, 200);
        Vehicle VehicleKO1_11 = new Vehicle(cityK, cityO, date11_15, date11_18, AllData.PlanePlace, 700);
        Vehicle VehicleLK1_11 = new Vehicle(cityL, cityK, date11_6, date11_8, AllData.PlanePlace, 800);
        Vehicle VehicleOK1_11 = new Vehicle(cityO, cityK, date11_20, date11_22, AllData.PlanePlace, 250);
        Vehicle VehicleOK3_11 = new Vehicle(cityO, cityK, date11_10, date11_11, AllData.PlanePlace, 150);


        //____________________________________________________________________________________________________________

        Vehicle VehicleKL1_12 = new Vehicle(cityK, cityL, date12_6, date12_8, AllData.PlanePlace, 200);
        Vehicle VehicleKO1_12 = new Vehicle(cityK, cityO, date12_15, date12_18, AllData.PlanePlace, 700);
        Vehicle VehicleLK1_12 = new Vehicle(cityL, cityK, date12_6, date12_8, AllData.PlanePlace, 800);
        Vehicle VehicleOK1_12 = new Vehicle(cityO, cityK, date12_20, date12_22, AllData.PlanePlace, 250);
        Vehicle VehicleOK3_12 = new Vehicle(cityO, cityK, date12_10, date12_11, AllData.PlanePlace, 150);


        //____________________________________________________________________________________________________________

        Vehicle VehicleKL1_13 = new Vehicle(cityK, cityL, date13_6, date13_8, AllData.PlanePlace, 200);
        Vehicle VehicleKO1_13 = new Vehicle(cityK, cityO, date13_15, date13_18, AllData.PlanePlace, 700);
        Vehicle VehicleLK1_13 = new Vehicle(cityL, cityK, date13_6, date13_8, AllData.PlanePlace, 800);
        Vehicle VehicleOK1_13 = new Vehicle(cityO, cityK, date13_20, date13_22, AllData.PlanePlace, 250);
        Vehicle VehicleOK3_13 = new Vehicle(cityO, cityK, date13_10, date13_11, AllData.PlanePlace, 150);


        //____________________________________________________________________________________________________________

        Vehicle VehicleKL1_14 = new Vehicle(cityK, cityL, date14_6, date14_8, AllData.PlanePlace, 200);
        Vehicle VehicleKO1_14 = new Vehicle(cityK, cityO, date14_15, date14_18, AllData.PlanePlace, 700);
        Vehicle VehicleLK1_14 = new Vehicle(cityL, cityK, date14_6, date14_8, AllData.PlanePlace, 800);
        Vehicle VehicleOK1_14 = new Vehicle(cityO, cityK, date14_20, date14_22, AllData.PlanePlace, 250);
        Vehicle VehicleOK3_14 = new Vehicle(cityO, cityK, date14_10, date14_11, AllData.PlanePlace, 150);


        //____________________________________________________________________________________________________________

        Vehicle VehicleKL1_15 = new Vehicle(cityK, cityL, date15_6, date15_8, AllData.PlanePlace, 200);
        Vehicle VehicleKO1_15 = new Vehicle(cityK, cityO, date15_15, date15_18, AllData.PlanePlace, 700);
        Vehicle VehicleLK1_15 = new Vehicle(cityL, cityK, date15_6, date15_8, AllData.PlanePlace, 800);
        Vehicle VehicleOK1_15 = new Vehicle(cityO, cityK, date15_20, date15_22, AllData.PlanePlace, 250);
        Vehicle VehicleOK3_15 = new Vehicle(cityO, cityK, date15_10, date15_11, AllData.PlanePlace, 150);


        //____________________________________________________________________________________________________________


        Vehicle VehicleKL1_16 = new Vehicle(cityK, cityL, date16_6, date16_8, AllData.PlanePlace, 200);
        Vehicle VehicleKO1_16 = new Vehicle(cityK, cityO, date16_15, date16_18, AllData.PlanePlace, 700);
        Vehicle VehicleLK1_16 = new Vehicle(cityL, cityK, date16_6, date16_8, AllData.PlanePlace, 800);
        Vehicle VehicleOK1_16 = new Vehicle(cityO, cityK, date16_20, date16_22, AllData.PlanePlace, 250);
        Vehicle VehicleOK3_16 = new Vehicle(cityO, cityK, date16_10, date16_11, AllData.PlanePlace, 150);


        //____________________________________________________________________________________________________________

        Vehicle VehicleKL1_17 = new Vehicle(cityK, cityL, date17_6, date17_8, AllData.PlanePlace, 200);
        Vehicle VehicleKO1_17 = new Vehicle(cityK, cityO, date17_15, date17_18, AllData.PlanePlace, 700);
        Vehicle VehicleLK1_17 = new Vehicle(cityL, cityK, date17_6, date17_8, AllData.PlanePlace, 800);
        Vehicle VehicleOK1_17 = new Vehicle(cityO, cityK, date17_20, date17_22, AllData.PlanePlace, 250);
        Vehicle VehicleOK3_17 = new Vehicle(cityO, cityK, date17_10, date17_11, AllData.PlanePlace, 150);


        //____________________________________________________________________________________________________________

        Vehicle VehicleKL1_18 = new Vehicle(cityK, cityL, date18_6, date18_8, AllData.PlanePlace, 200);
        Vehicle VehicleKO1_18 = new Vehicle(cityK, cityO, date18_15, date18_18, AllData.PlanePlace, 700);
        Vehicle VehicleLK1_18 = new Vehicle(cityL, cityK, date18_6, date18_8, AllData.PlanePlace, 800);
        Vehicle VehicleOK1_18 = new Vehicle(cityO, cityK, date18_20, date18_22, AllData.PlanePlace, 250);
        Vehicle VehicleOK3_18 = new Vehicle(cityO, cityK, date18_10, date18_11, AllData.PlanePlace, 150);


        //____________________________________________________________________________________________________________



        Vehicle VehicleKL1_19 = new Vehicle(cityK, cityL, date19_6, date19_8, AllData.PlanePlace, 200);
        Vehicle VehicleKO1_19 = new Vehicle(cityK, cityO, date19_15, date19_18, AllData.PlanePlace, 700);
        Vehicle VehicleLK1_19 = new Vehicle(cityL, cityK, date19_6, date19_8, AllData.PlanePlace, 800);
        Vehicle VehicleOK1_19 = new Vehicle(cityO, cityK, date19_20, date19_22, AllData.PlanePlace, 250);
        Vehicle VehicleOK3_19 = new Vehicle(cityO, cityK, date19_10, date19_11, AllData.PlanePlace, 150);


        //____________________________________________________________________________________________________________


        Vehicle VehicleKL1_20 = new Vehicle(cityK, cityL, date20_6, date20_8, AllData.PlanePlace, 200);
        Vehicle VehicleKO1_20 = new Vehicle(cityK, cityO, date20_15, date20_18, AllData.PlanePlace, 700);
        Vehicle VehicleLK1_20 = new Vehicle(cityL, cityK, date20_6, date20_8, AllData.PlanePlace, 800);
        Vehicle VehicleOK1_20 = new Vehicle(cityO, cityK, date20_20, date20_22, AllData.PlanePlace, 250);
        Vehicle VehicleOK3_20 = new Vehicle(cityO, cityK, date20_10, date20_11, AllData.PlanePlace, 150);


        //____________________________________________________________________________________________________________






        planes.add(VehicleKL1_11);
        planes.add(VehicleKO1_11);
        planes.add(VehicleLK1_11);
        planes.add(VehicleOK1_11);
        planes.add(VehicleOK3_11);


        //____________________________________________________________________________________________________________


        planes.add(VehicleKL1_12);
        planes.add(VehicleKO1_12);
        planes.add(VehicleLK1_12);
        planes.add(VehicleOK1_12);
        planes.add(VehicleOK3_12);

        //____________________________________________________________________________________________________________

        planes.add(VehicleKL1_13);
        planes.add(VehicleKO1_13);
        planes.add(VehicleLK1_13);
        planes.add(VehicleOK1_13);
        planes.add(VehicleOK3_13);
        //____________________________________________________________________________________________________________

        planes.add(VehicleKL1_14);
        planes.add(VehicleKO1_14);
        planes.add(VehicleLK1_14);
        planes.add(VehicleOK1_14);
        planes.add(VehicleOK3_14);
        //____________________________________________________________________________________________________________
        planes.add(VehicleKL1_15);
        planes.add(VehicleKO1_15);
        planes.add(VehicleLK1_15);
        planes.add(VehicleOK1_15);
        planes.add(VehicleOK3_15);
        //____________________________________________________________________________________________________________

        planes.add(VehicleKL1_16);
        planes.add(VehicleKO1_16);
         planes.add(VehicleLK1_16);
        planes.add(VehicleOK1_16);
        planes.add(VehicleOK3_16);

        //____________________________________________________________________________________________________________

        planes.add(VehicleKL1_17);
        planes.add(VehicleKO1_17);
        planes.add(VehicleLK1_17);
        planes.add(VehicleOK1_17);
        planes.add(VehicleOK3_17);

        //____________________________________________________________________________________________________________

        planes.add(VehicleKL1_18);
        planes.add(VehicleKO1_18);
        planes.add(VehicleLK1_18);
        planes.add(VehicleOK1_18);
        planes.add(VehicleOK3_18);
        //____________________________________________________________________________________________________________

        planes.add(VehicleKL1_19);
        planes.add(VehicleKO1_19);
        planes.add(VehicleLK1_19);
        planes.add(VehicleOK1_19);
        planes.add(VehicleOK3_19);
        //____________________________________________________________________________________________________________

        planes.add(VehicleKL1_20);
        planes.add(VehicleKO1_20);
        planes.add(VehicleLK1_20);
        planes.add(VehicleOK1_20);
        planes.add(VehicleOK3_20);
    }

    public void fullBuses() {
        buses = new ArrayList<>();
        cities = new ArrayList<>();
        City cityK = new City("Kyiv");
        City cityL = new City("Lviv");
        City cityO = new City("Odessa");


        Date date11_10 = new Date(2018, 4, 11, 10, 15);
        Date date11_8 = new Date(2018, 4, 11, 8, 15);
        Date date11_6 = new Date(2018, 4, 11, 6, 15);
        Date date11_15 = new Date(2018, 4, 11, 15, 15);
        Date date11_18 = new Date(2018, 4, 11, 18, 15);
        Date date11_20 = new Date(2018, 4, 11, 20, 15);
        Date date11_22 = new Date(2018, 4, 11, 22, 15);
        Date date11_23 = new Date(2018, 4, 11, 23, 15);


        Date date12_10 = new Date(2018, 4, 12, 10, 15);
        Date date12_8 = new Date(2018, 4, 12, 8, 15);
        Date date12_6 = new Date(2018, 4, 12, 6, 15);
        Date date12_15 = new Date(2018, 4, 12, 15, 15);
        Date date12_18 = new Date(2018, 4, 12, 18, 15);
        Date date12_20 = new Date(2018, 4, 12, 20, 15);
        Date date12_22 = new Date(2018, 4, 12, 22, 15);
        Date date12_23 = new Date(2018, 4, 12, 23, 15);


        Date date13_10 = new Date(2018, 4, 13, 10, 15);
        Date date13_8 = new Date(2018, 4, 13, 8, 15);
        Date date13_6 = new Date(2018, 4, 13, 6, 15);
        Date date13_15 = new Date(2018, 4, 13, 15, 15);
        Date date13_18 = new Date(2018, 4, 13, 18, 15);
        Date date13_20 = new Date(2018, 4, 13, 20, 15);
        Date date13_22 = new Date(2018, 4, 13, 22, 15);
        Date date13_23 = new Date(2018, 4, 13, 23, 15);


        Date date14_10 = new Date(2018, 4, 14, 10, 15);
        Date date14_8 = new Date(2018, 4, 14, 8, 15);
        Date date14_6 = new Date(2018, 4, 14, 6, 15);
        Date date14_15 = new Date(2018, 4, 14, 15, 15);
        Date date14_18 = new Date(2018, 4, 14, 18, 15);
        Date date14_20 = new Date(2018, 4, 14, 20, 15);
        Date date14_22 = new Date(2018, 4, 14, 22, 15);
        Date date14_23 = new Date(2018, 4, 14, 23, 15);


        Date date15_10 = new Date(2018, 4, 15, 10, 15);
        Date date15_8 = new Date(2018, 4, 15, 8, 15);
        Date date15_6 = new Date(2018, 4, 15, 6, 15);
        Date date15_15 = new Date(2018, 4, 15, 15, 15);
        Date date15_18 = new Date(2018, 4, 15, 18, 15);
        Date date15_20 = new Date(2018, 4, 15, 20, 15);
        Date date15_22 = new Date(2018, 4, 15, 22, 15);
        Date date15_23 = new Date(2018, 4, 15, 23, 15);


        Date date16_10 = new Date(2018, 4, 16, 10, 15);
        Date date16_8 = new Date(2018, 4, 16, 8, 15);
        Date date16_6 = new Date(2018, 4, 16, 6, 15);
        Date date16_15 = new Date(2018, 4, 16, 15, 15);
        Date date16_18 = new Date(2018, 4, 16, 18, 15);
        Date date16_20 = new Date(2018, 4, 16, 20, 15);
        Date date16_22 = new Date(2018, 4, 16, 22, 15);
        Date date16_23 = new Date(2018, 4, 16, 23, 15);

        Date date17_10 = new Date(2018, 4, 17, 10, 15);
        Date date17_8 = new Date(2018, 4, 17, 8, 15);
        Date date17_6 = new Date(2018, 4, 17, 6, 15);
        Date date17_15 = new Date(2018, 4, 17, 15, 15);
        Date date17_18 = new Date(2018, 4, 17, 18, 15);
        Date date17_20 = new Date(2018, 4, 17, 20, 15);
        Date date17_22 = new Date(2018, 4, 17, 22, 15);
        Date date17_23 = new Date(2018, 4, 17, 23, 15);


        Date date18_10 = new Date(2018, 4, 18, 10, 15);
        Date date18_8 = new Date(2018, 4, 18, 8, 15);
        Date date18_6 = new Date(2018, 4, 18, 6, 15);
        Date date18_15 = new Date(2018, 4, 18, 15, 15);
        Date date18_18 = new Date(2018, 4, 18, 18, 15);
        Date date18_20 = new Date(2018, 4, 18, 20, 15);
        Date date18_22 = new Date(2018, 4, 18, 22, 15);
        Date date18_23 = new Date(2018, 4, 18, 23, 15);

        Date date19_10 = new Date(2018, 4, 19, 10, 15);
        Date date19_8 = new Date(2018, 4, 19, 8, 15);
        Date date19_6 = new Date(2018, 4, 19, 6, 15);
        Date date19_15 = new Date(2018, 4, 19, 15, 15);
        Date date19_18 = new Date(2018, 4, 19, 18, 15);
        Date date19_20 = new Date(2018, 4, 19, 20, 15);
        Date date19_22 = new Date(2018, 4, 19, 22, 15);
        Date date19_23 = new Date(2018, 4, 19, 23, 15);

        Date date20_10 = new Date(2018, 4, 20, 10, 15);
        Date date20_8 = new Date(2018, 4, 20, 8, 15);
        Date date20_6 = new Date(2018, 4, 20, 6, 15);
        Date date20_15 = new Date(2018, 4, 20, 15, 15);
        Date date20_18 = new Date(2018, 4, 20, 18, 15);
        Date date20_20 = new Date(2018, 4, 20, 20, 15);
        Date date20_22 = new Date(2018, 4, 20, 22, 15);
        Date date20_23 = new Date(2018, 4, 20, 23, 15);
        Date date21_6 = new Date(2018, 4, 21, 6, 15);


        cities.add(cityK);
        cities.add(cityL);
        cities.add(cityO);
        //cities.add( cityH );
        // cities.add( cityD );


        Vehicle VehicleKL1_11 = new Vehicle(cityK, cityL, date11_6, date12_22, AllData.BusPlace, 20);

        Vehicle VehicleKL2_11 = new Vehicle(cityK, cityL, date11_15, date12_23, AllData.BusPlace, 10);

        Vehicle VehicleKO1_11 = new Vehicle(cityK, cityO, date11_10, date12_23, AllData.BusPlace, 70);

        Vehicle VehicleLK1_11 = new Vehicle(cityL, cityK, date11_6, date12_15, AllData.BusPlace, 80);

        Vehicle VehicleOK1_11 = new Vehicle(cityO, cityK, date11_6, date12_22, AllData.BusPlace, 25);

        Vehicle VehicleOK3_11 = new Vehicle(cityO, cityK, date11_20, date13_6, AllData.BusPlace, 15);

        Vehicle VehicleOL2_11 = new Vehicle(cityO, cityL, date11_15, date12_18, AllData.BusPlace, 40);


        //____________________________________________________________________________________________________________

        Vehicle VehicleKL1_12 = new Vehicle(cityK, cityL, date12_6, date13_22, AllData.BusPlace, 20);
        Vehicle VehicleKL2_12 = new Vehicle(cityK, cityL, date12_15, date13_23, AllData.BusPlace, 10);
        Vehicle VehicleKO1_12 = new Vehicle(cityK, cityO, date12_10, date13_23, AllData.BusPlace, 70);
        Vehicle VehicleLK1_12 = new Vehicle(cityL, cityK, date12_6, date13_15, AllData.BusPlace, 80);
        Vehicle VehicleOK1_12 = new Vehicle(cityO, cityK, date12_6, date13_22, AllData.BusPlace, 25);
        Vehicle VehicleOK3_12 = new Vehicle(cityO, cityK, date12_20, date14_6, AllData.BusPlace, 15);
        Vehicle VehicleOL2_12 = new Vehicle(cityO, cityL, date12_15, date13_18, AllData.BusPlace, 40);


        //____________________________________________________________________________________________________________


        //____________________________________________________________________________________________________________

        Vehicle VehicleKL1_13 = new Vehicle(cityK, cityL, date13_6, date14_22, AllData.BusPlace, 20);
        Vehicle VehicleKL2_13 = new Vehicle(cityK, cityL, date13_15, date14_23, AllData.BusPlace, 10);
        Vehicle VehicleKO1_13 = new Vehicle(cityK, cityO, date13_10, date14_23, AllData.BusPlace, 70);
        Vehicle VehicleLK1_13 = new Vehicle(cityL, cityK, date13_6, date14_15, AllData.BusPlace, 80);
        Vehicle VehicleOK1_13 = new Vehicle(cityO, cityK, date13_6, date14_22, AllData.BusPlace, 25);
        Vehicle VehicleOK3_13 = new Vehicle(cityO, cityK, date13_20, date15_6, AllData.BusPlace, 15);
        Vehicle VehicleOL2_13 = new Vehicle(cityO, cityL, date13_15, date14_18, AllData.BusPlace, 40);

        //____________________________________________________________________________________________________________

        Vehicle VehicleKL1_14 = new Vehicle(cityK, cityL, date14_6, date15_22, AllData.BusPlace, 20);
        Vehicle VehicleKL2_14 = new Vehicle(cityK, cityL, date14_15, date15_23, AllData.BusPlace, 10);
        Vehicle VehicleKO1_14 = new Vehicle(cityK, cityO, date14_10, date15_23, AllData.BusPlace, 70);
        Vehicle VehicleLK1_14 = new Vehicle(cityL, cityK, date14_6, date15_15, AllData.BusPlace, 80);
        Vehicle VehicleOK1_14 = new Vehicle(cityO, cityK, date14_6, date15_22, AllData.BusPlace, 25);
        Vehicle VehicleOK3_14 = new Vehicle(cityO, cityK, date14_20, date16_6, AllData.BusPlace, 15);
        Vehicle VehicleOL2_14 = new Vehicle(cityO, cityL, date14_15, date15_18, AllData.BusPlace, 40);
        //____________________________________________________________________________________________________________

        Vehicle VehicleKL1_15 = new Vehicle(cityK, cityL, date15_6, date16_22, AllData.BusPlace, 20);
        Vehicle VehicleKL2_15 = new Vehicle(cityK, cityL, date15_15, date16_23, AllData.BusPlace, 10);
        Vehicle VehicleKO1_15 = new Vehicle(cityK, cityO, date15_10, date16_23, AllData.BusPlace, 70);
        Vehicle VehicleLK1_15 = new Vehicle(cityL, cityK, date15_6, date16_15, AllData.BusPlace, 80);
        Vehicle VehicleOK1_15 = new Vehicle(cityO, cityK, date15_6, date16_22, AllData.BusPlace, 25);
        Vehicle VehicleOK3_15 = new Vehicle(cityO, cityK, date15_20, date17_6, AllData.BusPlace, 15);
        Vehicle VehicleOL2_15 = new Vehicle(cityO, cityL, date15_15, date17_18, AllData.BusPlace, 40);

        //____________________________________________________________________________________________________________

        Vehicle VehicleKL1_16 = new Vehicle(cityK, cityL, date16_6, date17_22, AllData.BusPlace, 20);
        Vehicle VehicleKL2_16 = new Vehicle(cityK, cityL, date16_15, date17_23, AllData.BusPlace, 10);
        Vehicle VehicleKO1_16 = new Vehicle(cityK, cityO, date16_10, date17_23, AllData.BusPlace, 70);
        Vehicle VehicleLK1_16 = new Vehicle(cityL, cityK, date16_6, date17_15, AllData.BusPlace, 80);
        Vehicle VehicleOK1_16= new Vehicle(cityO, cityK, date16_6, date17_22, AllData.BusPlace, 25);
        Vehicle VehicleOK3_16 = new Vehicle(cityO, cityK, date16_20, date18_6, AllData.BusPlace, 15);
        Vehicle VehicleOL2_16 = new Vehicle(cityO, cityL, date16_15, date18_18, AllData.BusPlace, 40);
        //____________________________________________________________________________________________________________

        Vehicle VehicleKL1_17 = new Vehicle(cityK, cityL, date17_6, date18_22, AllData.BusPlace, 20);
        Vehicle VehicleKL2_17 = new Vehicle(cityK, cityL, date17_15, date18_23, AllData.BusPlace, 10);
        Vehicle VehicleKO1_17 = new Vehicle(cityK, cityO, date17_10, date18_23, AllData.BusPlace, 70);
        Vehicle VehicleLK1_17 = new Vehicle(cityL, cityK, date17_6, date18_15, AllData.BusPlace, 80);
        Vehicle VehicleOK1_17 = new Vehicle(cityO, cityK, date17_6, date18_22, AllData.BusPlace, 25);
        Vehicle VehicleOK3_17 = new Vehicle(cityO, cityK, date17_20, date19_6, AllData.BusPlace, 15);
        Vehicle VehicleOL2_17 = new Vehicle(cityO, cityL, date17_15, date18_18, AllData.BusPlace, 40);

        //____________________________________________________________________________________________________________

        Vehicle VehicleKL1_18 = new Vehicle(cityK, cityL, date18_6, date19_22, AllData.BusPlace, 20);
        Vehicle VehicleKL2_18 = new Vehicle(cityK, cityL, date18_15, date19_23, AllData.BusPlace, 10);
        Vehicle VehicleKO1_18 = new Vehicle(cityK, cityO, date18_10, date19_23, AllData.BusPlace, 70);
        Vehicle VehicleLK1_18 = new Vehicle(cityL, cityK, date18_6, date19_15, AllData.BusPlace, 80);
        Vehicle VehicleOK1_18 = new Vehicle(cityO, cityK, date18_6, date19_22, AllData.BusPlace, 25);
        Vehicle VehicleOK3_18 = new Vehicle(cityO, cityK, date18_20, date20_6, AllData.BusPlace, 15);
        Vehicle VehicleOL2_18 = new Vehicle(cityO, cityL, date18_15, date19_18, AllData.BusPlace, 40);

        //____________________________________________________________________________________________________________

        Vehicle VehicleKL1_19 = new Vehicle(cityK, cityL, date19_6, date20_22, AllData.BusPlace, 20);
        Vehicle VehicleKL2_19 = new Vehicle(cityK, cityL, date19_15, date20_23, AllData.BusPlace, 10);
        Vehicle VehicleKO1_19 = new Vehicle(cityK, cityO, date19_10, date20_23, AllData.BusPlace, 70);
        Vehicle VehicleLK1_19= new Vehicle(cityL, cityK, date19_6, date20_15, AllData.BusPlace, 80);
        Vehicle VehicleOK1_19= new Vehicle(cityO, cityK, date19_6, date20_22, AllData.BusPlace, 25);
        Vehicle VehicleOK3_19= new Vehicle(cityO, cityK, date19_20, date21_6, AllData.BusPlace, 15);
        Vehicle VehicleOL2_19 = new Vehicle(cityO, cityL, date19_15, date20_18, AllData.BusPlace, 40);

        buses.add(VehicleKL1_11);
        buses.add(VehicleKL2_11);

        buses.add(VehicleKO1_11);


        buses.add(VehicleLK1_11);




        buses.add(VehicleOK1_11);
        buses.add(VehicleOK3_11);


        buses.add(VehicleOL2_11);
        //____________________________________________________________________________________________________________


        buses.add(VehicleKL1_12);
        buses.add(VehicleKL2_12);

        buses.add(VehicleKO1_12);

        buses.add(VehicleLK1_12);



        buses.add(VehicleOK1_12);
        buses.add(VehicleOK3_12);


        buses.add(VehicleOL2_12);
        //____________________________________________________________________________________________________________

        buses.add(VehicleKL1_13);
        buses.add(VehicleKL2_13);

        buses.add(VehicleKO1_13);

        buses.add(VehicleLK1_13);
        buses.add(VehicleOK1_13);
        buses.add(VehicleOK3_13);
        buses.add(VehicleOL2_13);
        //____________________________________________________________________________________________________________

        buses.add(VehicleKL1_14);
        buses.add(VehicleKL2_14);

        buses.add(VehicleKO1_14);

        buses.add(VehicleLK1_14);

        buses.add(VehicleOK1_14);
        buses.add(VehicleOK3_14);
        buses.add(VehicleOL2_14);
        //____________________________________________________________________________________________________________
        buses.add(VehicleKL1_15);
        buses.add(VehicleKL2_15);

        buses.add(VehicleKO1_15);

        buses.add(VehicleLK1_15);

        buses.add(VehicleOK1_15);
        buses.add(VehicleOK3_15);
        buses.add(VehicleOL2_15);
        //____________________________________________________________________________________________________________

        buses.add(VehicleKL1_16);
        buses.add(VehicleKL2_16);

        buses.add(VehicleKO1_16);

        buses.add(VehicleLK1_16);
        buses.add(VehicleOK1_16);
        buses.add(VehicleOK3_16);

        buses.add(VehicleOL2_16);
        //____________________________________________________________________________________________________________

        buses.add(VehicleKL1_17);
        buses.add(VehicleKL2_17);

        buses.add(VehicleKO1_17);

        buses.add(VehicleLK1_17);

        buses.add(VehicleOK1_17);
        buses.add(VehicleOK3_17);

        buses.add(VehicleOL2_17);
        //____________________________________________________________________________________________________________

        buses.add(VehicleKL1_18);
        buses.add(VehicleKL2_18);

        buses.add(VehicleKO1_18);

        buses.add(VehicleLK1_18);

        buses.add(VehicleOK1_18);
        buses.add(VehicleOK3_18);

        buses.add(VehicleOL2_18);
        //____________________________________________________________________________________________________________

        buses.add(VehicleKL1_19);
        buses.add(VehicleKL2_19);

        buses.add(VehicleKO1_19);

        buses.add(VehicleLK1_19);
        buses.add(VehicleOK1_19);
        buses.add(VehicleOK3_19);

        buses.add(VehicleOL2_19);
    }

    public void fullTrains() {
        trains = new ArrayList<>();
        cities = new ArrayList<>();
        City cityK = new City( "Kyiv" );
        City cityL = new City( "Lviv" );
        City cityH = new City( "Kharkiv" );
        City cityO = new City( "Odessa" );
        City cityD = new City( "Donetsk" );
        City cityZh = new City( "Zhitomir" );
        City cityCh = new City( "Chernigov" );
        City cityKr = new City( "Krakow" );
        City cityM = new City( "Moskva" );
        City cityU = new City( "Uzhgorod" );
        City cityY = new City( "Yalta" );
        City cityMe = new City( "Melitopol" );
        City cityP = new City( "Poltava" );
        City cityS = new City( "Sumi" );
        City cityKrim = new City( "Krim" );

        City cityV = new City( "Volgograd" );
        City cityCarpati = new City( "Carpati" );
        City cityChernovtsi = new City( "Chernovtsi" );
        City cityBerlin = new City( "Berlin" );
        City cityBudapesht = new City( "Budapesht" );




        Date date11_10 = new Date( 2018, 4, 11, 10, 15 );
        Date date11_8 = new Date( 2018, 4, 11, 8, 15 );
        Date date11_6 = new Date( 2018, 4, 11, 6, 15 );
        Date date11_15 = new Date( 2018, 4, 11, 15, 15 );
        Date date11_18 = new Date( 2018, 4, 11, 18, 15 );
        Date date11_20 = new Date( 2018, 4, 11, 20, 15 );
        Date date11_22 = new Date( 2018, 4, 11, 22, 15 );
        Date date11_23 = new Date( 2018, 4, 11, 23, 15 );



        Date date12_10 = new Date( 2018, 4, 12, 10, 15 );
        Date date12_8 = new Date( 2018, 4, 12, 8, 15 );
        Date date12_6 = new Date( 2018, 4, 12, 6, 15 );
        Date date12_15 = new Date( 2018, 4, 12, 15, 15 );
        Date date12_18 = new Date( 2018, 4, 12, 18, 15 );
        Date date12_20 = new Date( 2018, 4, 12, 20, 15 );
        Date date12_22 = new Date( 2018, 4, 12, 22, 15 );
        Date date12_23 = new Date( 2018, 4, 12, 23, 15 );


        Date date13_10 = new Date( 2018, 4, 13, 10, 15 );
        Date date13_8 = new Date( 2018, 4, 13, 8, 15 );
        Date date13_6 = new Date( 2018, 4, 13, 6, 15 );
        Date date13_15 = new Date( 2018, 4, 13, 15, 15 );
        Date date13_18 = new Date( 2018, 4, 13, 18, 15 );
        Date date13_20 = new Date( 2018, 4, 13, 20, 15 );
        Date date13_22 = new Date( 2018, 4, 13, 22, 15 );
        Date date13_23 = new Date( 2018, 4, 13, 23, 15 );


        Date date14_10 = new Date( 2018, 4, 14, 10, 15 );
        Date date14_8 = new Date( 2018, 4, 14, 8, 15 );
        Date date14_6 = new Date( 2018, 4, 14, 6, 15 );
        Date date14_15 = new Date( 2018, 4, 14, 15, 15 );
        Date date14_18 = new Date( 2018, 4, 14, 18, 15 );
        Date date14_20 = new Date( 2018, 4, 14, 20, 15 );
        Date date14_22 = new Date( 2018, 4, 14, 22, 15 );
        Date date14_23 = new Date( 2018, 4, 14, 23, 15 );


        Date date15_10 = new Date( 2018, 4, 15, 10, 15 );
        Date date15_8 = new Date( 2018, 4, 15, 8, 15 );
        Date date15_6 = new Date( 2018, 4, 15, 6, 15 );
        Date date15_15 = new Date( 2018, 4, 15, 15, 15 );
        Date date15_18 = new Date( 2018, 4, 15, 18, 15 );
        Date date15_20 = new Date( 2018, 4, 15, 20, 15 );
        Date date15_22 = new Date( 2018, 4, 15, 22, 15 );
        Date date15_23 = new Date( 2018, 4, 15, 23, 15 );


        Date date16_10 = new Date( 2018, 4, 16, 10, 15 );
        Date date16_8 = new Date( 2018, 4, 16, 8, 15 );
        Date date16_6 = new Date( 2018, 4, 16, 6, 15 );
        Date date16_15 = new Date( 2018, 4, 16, 15, 15 );
        Date date16_18 = new Date( 2018, 4, 16, 18, 15 );
        Date date16_20 = new Date( 2018, 4, 16, 20, 15 );
        Date date16_22 = new Date( 2018, 4, 16, 22, 15 );
        Date date16_23 = new Date( 2018, 4, 16, 23, 15 );

        Date date17_10 = new Date( 2018, 4, 17, 10, 15 );
        Date date17_8 = new Date( 2018, 4, 17, 8, 15 );
        Date date17_6 = new Date( 2018, 4, 17, 6, 15 );
        Date date17_15 = new Date( 2018, 4, 17, 15, 15 );
        Date date17_18 = new Date( 2018, 4, 17, 18, 15 );
        Date date17_20 = new Date( 2018, 4, 17, 20, 15 );
        Date date17_22 = new Date( 2018, 4, 17, 22, 15 );
        Date date17_23 = new Date( 2018, 4, 17, 23, 15 );


        Date date18_10 = new Date( 2018, 4, 18, 10, 15 );
        Date date18_8 = new Date( 2018, 4, 18, 8, 15 );
        Date date18_6 = new Date( 2018, 4, 18, 6, 15 );
        Date date18_15 = new Date( 2018, 4, 18, 15, 15 );
        Date date18_18 = new Date( 2018, 4, 18, 18, 15 );
        Date date18_20 = new Date( 2018, 4, 18, 20, 15 );
        Date date18_22 = new Date( 2018, 4, 18, 22, 15 );
        Date date18_23 = new Date( 2018, 4, 18, 23, 15 );

        Date date19_10 = new Date( 2018, 4, 19, 10, 15 );
        Date date19_8 = new Date( 2018, 4, 19, 8, 15 );
        Date date19_6 = new Date( 2018, 4, 19, 6, 15 );
        Date date19_15 = new Date( 2018, 4, 19, 15, 15 );
        Date date19_18 = new Date( 2018, 4, 19, 18, 15 );
        Date date19_20 = new Date( 2018, 4, 19, 20, 15 );
        Date date19_22 = new Date( 2018, 4, 19, 22, 15 );
        Date date19_23 = new Date( 2018, 4, 19, 23, 15 );

        Date date20_10 = new Date( 2018, 4, 20, 10, 15 );
        Date date20_8 = new Date( 2018, 4, 20, 8, 15 );
        Date date20_6 = new Date( 2018, 4, 20, 6, 15 );
        Date date20_15 = new Date( 2018, 4, 20, 15, 15 );
        Date date20_18 = new Date( 2018, 4, 20, 18, 15 );
        Date date20_20 = new Date( 2018, 4, 20, 20, 15 );
        Date date20_22 = new Date( 2018, 4, 20, 22, 15 );
        Date date20_23 = new Date( 2018, 4, 20, 23, 15 );



        cities.add( cityK );
        cities.add( cityL );
        cities.add( cityO );
        //cities.add( cityH );
        // cities.add( cityD );




        Vehicle VehicleKL1_11 = new Vehicle( cityK, cityL, date11_6, date12_6, AllData.ReservedPlace, 50 );

        Vehicle VehicleKL2_11 = new Vehicle( cityK, cityL, date11_15, date12_18, AllData.ReservedPlace, 30 );

        Vehicle VehicleKL3_11 = new Vehicle( cityK, cityL, date11_20, date12_22, AllData.SittingPlace, 25 );

        Vehicle VehicleKL4_11 = new Vehicle( cityK, cityL, date11_15, date11_22, AllData.Intercity, 200 );



        Vehicle VehicleKO1_11 = new Vehicle( cityK, cityO, date11_10, date11_23, AllData.Compartment, 70 );

        Vehicle VehicleKO3_11 = new Vehicle( cityK, cityO, date11_20, date12_22, AllData.ReservedPlace, 125 );

        Vehicle VehicleKO4_11 = new Vehicle( cityK, cityO, date11_23, date12_6, AllData.Compartment, 300 );




        Vehicle VehicleLK1_11 = new Vehicle(  cityL,cityK, date11_6, date12_6, AllData.ReservedPlace, 50 );

        Vehicle VehicleLK2_11 = new Vehicle( cityL,cityK,  date11_15, date12_18, AllData.ReservedPlace, 30 );

        Vehicle VehicleLK3_11 = new Vehicle( cityL,cityK,  date11_20, date12_22, AllData.SittingPlace, 25 );

        Vehicle VehicleLK4_11 = new Vehicle(  cityL,cityK, date11_15, date11_22, AllData.Compartment, 200 );

        Vehicle VehicleLK5_11 = new Vehicle(  cityL,cityK, date11_20, date12_6, AllData.Compartment, 200 );



        Vehicle VehicleLO1_11 = new Vehicle( cityL, cityO, date11_8, date11_23, AllData.ReservedPlace, 110 );

        Vehicle VehicleLO2_11 = new Vehicle( cityL, cityO, date11_10, date12_10, AllData.ReservedPlace, 90 );

        Vehicle VehicleLO3_11 = new Vehicle( cityL, cityO, date11_18, date12_22, AllData.ReservedPlace, 80 );

        Vehicle VehicleLO4_11 = new Vehicle( cityL, cityO, date11_23, date12_23, AllData.ReservedPlace, 90 );



        Vehicle VehicleOK1_11 = new Vehicle(  cityO,cityK, date11_6, date12_6, AllData.ReservedPlace, 50 );

        Vehicle VehicleOK3_11 = new Vehicle( cityO,cityK,  date11_20, date12_22, AllData.ReservedPlace, 70 );

        Vehicle VehicleOK4_11 = new Vehicle( cityO, cityK, date11_23, date12_23, AllData.ReservedPlace, 90 );



        Vehicle VehicleOL1_11 = new Vehicle( cityO, cityL, date11_10, date11_23, AllData.ReservedPlace, 110 );

        Vehicle VehicleOL2_11 = new Vehicle( cityO, cityL, date11_15, date12_6, AllData.Compartment, 200 );


        //____________________________________________________________________________________________________________



        Vehicle VehicleKL1_12 = new Vehicle( cityK, cityL, date12_6, date13_6, AllData.ReservedPlace, 50 );
        Vehicle VehicleKL2_12 = new Vehicle( cityK, cityL, date12_15, date13_18, AllData.ReservedPlace, 30 );
        Vehicle VehicleKL3_12 = new Vehicle( cityK, cityL, date12_20, date13_22, AllData.SittingPlace, 25 );
        Vehicle VehicleKL4_12 = new Vehicle( cityK, cityL, date12_15, date13_22, AllData.Compartment, 200 );



        Vehicle VehicleKO1_12 = new Vehicle( cityK, cityO, date12_10, date13_23, AllData.Compartment, 70 );
        Vehicle VehicleKO3_12 = new Vehicle( cityK, cityO, date12_20, date13_22, AllData.ReservedPlace, 125 );
        Vehicle VehicleKO4_12 = new Vehicle( cityK, cityO, date12_23, date13_6, AllData.Compartment, 300 );




        Vehicle VehicleLK1_12 = new Vehicle(  cityL,cityK, date12_6, date13_6, AllData.ReservedPlace, 50 );
        Vehicle VehicleLK2_12 = new Vehicle( cityL,cityK,  date12_15, date13_18, AllData.ReservedPlace, 30 );
        Vehicle VehicleLK3_12 = new Vehicle( cityL,cityK,  date12_20, date13_22, AllData.SittingPlace, 25 );
        Vehicle VehicleLK4_12 = new Vehicle(  cityL,cityK, date12_15, date13_22, AllData.Compartment, 200 );
        Vehicle VehicleLK5_12 = new Vehicle(  cityL,cityK, date12_20, date13_6, AllData.Compartment, 200 );



        Vehicle VehicleLO1_12 = new Vehicle( cityL, cityO, date12_8, date13_23, AllData.ReservedPlace, 110 );
        Vehicle VehicleLO2_12 = new Vehicle( cityL, cityO, date12_10, date13_10, AllData.ReservedPlace, 90 );
        Vehicle VehicleLO3_12 = new Vehicle( cityL, cityO, date12_18, date13_22, AllData.ReservedPlace, 80 );
        Vehicle VehicleLO4_12 = new Vehicle( cityL, cityO, date12_23, date13_23, AllData.ReservedPlace, 90 );



        Vehicle VehicleOK1_12 = new Vehicle(  cityO,cityK, date12_6, date13_6, AllData.ReservedPlace, 50 );
        Vehicle VehicleOK3_12 = new Vehicle( cityO,cityK,  date12_20, date13_22, AllData.ReservedPlace, 70 );
        Vehicle VehicleOK4_12 = new Vehicle( cityO, cityK, date12_23, date13_23, AllData.ReservedPlace, 90 );



        Vehicle VehicleOL1_12 = new Vehicle( cityO, cityL, date12_10, date13_23, AllData.ReservedPlace, 110 );
        Vehicle VehicleOL2_12 = new Vehicle( cityO, cityL, date12_15, date13_6, AllData.Compartment, 200 );


        //____________________________________________________________________________________________________________



        Vehicle VehicleKL1_13 = new Vehicle( cityK, cityL, date13_6, date14_6, AllData.ReservedPlace, 50 );
        Vehicle VehicleKL2_13 = new Vehicle( cityK, cityL, date13_15, date14_18, AllData.ReservedPlace, 30 );
        Vehicle VehicleKL3_13 = new Vehicle( cityK, cityL, date13_20, date14_22, AllData.SittingPlace, 25 );
        Vehicle VehicleKL4_13 = new Vehicle( cityK, cityL, date13_15, date14_22, AllData.Compartment, 200 );



        Vehicle VehicleKO1_13 = new Vehicle( cityK, cityO, date13_10, date14_23, AllData.Compartment, 70 );
        Vehicle VehicleKO3_13 = new Vehicle( cityK, cityO, date13_20, date14_22, AllData.ReservedPlace, 125 );
        Vehicle VehicleKO4_13 = new Vehicle( cityK, cityO, date13_23, date14_6, AllData.Compartment, 300 );



        Vehicle VehicleLK1_13 = new Vehicle(  cityL,cityK, date13_6, date14_6, AllData.ReservedPlace, 50 );
        Vehicle VehicleLK2_13 = new Vehicle( cityL,cityK,  date13_15, date14_18, AllData.ReservedPlace, 30 );
        Vehicle VehicleLK3_13 = new Vehicle( cityL,cityK,  date13_20, date14_22, AllData.SittingPlace, 25 );
        Vehicle VehicleLK4_13 = new Vehicle(  cityL,cityK, date13_15, date14_22, AllData.Compartment, 200 );
        Vehicle VehicleLK5_13 = new Vehicle(  cityL,cityK, date13_20, date14_6, AllData.Compartment, 200 );



        Vehicle VehicleLO1_13 = new Vehicle( cityL, cityO, date13_8, date14_23, AllData.ReservedPlace, 110 );
        Vehicle VehicleLO2_13 = new Vehicle( cityL, cityO, date13_10, date14_10, AllData.ReservedPlace, 90 );
        Vehicle VehicleLO3_13 = new Vehicle( cityL, cityO, date13_18, date14_22, AllData.ReservedPlace, 80 );
        Vehicle VehicleLO4_13 = new Vehicle( cityL, cityO, date13_23, date14_23, AllData.ReservedPlace, 90 );


        Vehicle VehicleOK1_13 = new Vehicle(  cityO,cityK, date13_6, date14_6, AllData.ReservedPlace, 50 );
        Vehicle VehicleOK3_13 = new Vehicle( cityO,cityK,  date13_20, date14_22, AllData.ReservedPlace, 70 );
        Vehicle VehicleOK4_13 = new Vehicle( cityO, cityK, date13_23, date14_23, AllData.ReservedPlace, 90 );



        Vehicle VehicleOL1_13 = new Vehicle( cityO, cityL, date13_10, date14_23, AllData.ReservedPlace, 110 );
        Vehicle VehicleOL2_13 = new Vehicle( cityO, cityL, date13_15, date14_6, AllData.Compartment, 200 );

        //____________________________________________________________________________________________________________



        Vehicle VehicleKL1_14 = new Vehicle( cityK, cityL, date14_6, date15_6, AllData.ReservedPlace, 50 );
        Vehicle VehicleKL2_14 = new Vehicle( cityK, cityL, date14_15, date15_18, AllData.ReservedPlace, 30 );
        Vehicle VehicleKL3_14 = new Vehicle( cityK, cityL, date14_20, date15_22, AllData.SittingPlace, 25 );
        Vehicle VehicleKL4_14 = new Vehicle( cityK, cityL, date14_15, date15_22, AllData.Compartment, 200 );



        Vehicle VehicleKO1_14 = new Vehicle( cityK, cityO, date14_10, date15_23, AllData.Compartment, 70 );
        Vehicle VehicleKO3_14 = new Vehicle( cityK, cityO, date14_20, date15_22, AllData.ReservedPlace, 125 );
        Vehicle VehicleKO4_14 = new Vehicle( cityK, cityO, date14_23, date15_6, AllData.Compartment, 300 );



        Vehicle VehicleLK1_14 = new Vehicle(  cityL,cityK, date14_6, date15_6, AllData.ReservedPlace, 50 );
        Vehicle VehicleLK2_14 = new Vehicle( cityL,cityK,  date14_15, date15_18, AllData.ReservedPlace, 30 );
        Vehicle VehicleLK3_14 = new Vehicle( cityL,cityK,  date14_20, date15_22, AllData.SittingPlace, 25 );
        Vehicle VehicleLK4_14 = new Vehicle(  cityL,cityK, date14_15, date15_22, AllData.Compartment, 200 );
        Vehicle VehicleLK5_14 = new Vehicle(  cityL,cityK, date14_20, date15_6, AllData.Compartment, 200 );



        Vehicle VehicleLO1_14 = new Vehicle( cityL, cityO, date14_8, date15_23, AllData.ReservedPlace, 110 );
        Vehicle VehicleLO2_14 = new Vehicle( cityL, cityO, date14_10, date15_10, AllData.ReservedPlace, 90 );
        Vehicle VehicleLO3_14 = new Vehicle( cityL, cityO, date14_18, date15_22, AllData.ReservedPlace, 80 );
        Vehicle VehicleLO4_14 = new Vehicle( cityL, cityO, date14_23, date15_23, AllData.ReservedPlace, 90 );


        Vehicle VehicleOK1_14 = new Vehicle(  cityO,cityK, date14_6, date15_6, AllData.ReservedPlace, 50 );
        Vehicle VehicleOK3_14 = new Vehicle( cityO,cityK,  date14_20, date15_22, AllData.ReservedPlace, 70 );
        Vehicle VehicleOK4_14 = new Vehicle( cityO, cityK, date14_23, date15_23, AllData.ReservedPlace, 90 );



        Vehicle VehicleOL1_14 = new Vehicle( cityO, cityL, date14_10, date15_23, AllData.ReservedPlace, 110 );
        Vehicle VehicleOL2_14 = new Vehicle( cityO, cityL, date14_15, date15_6, AllData.Compartment, 200 );


        //____________________________________________________________________________________________________________



        Vehicle VehicleKL1_15 = new Vehicle( cityK, cityL, date15_6, date16_6, AllData.ReservedPlace, 50 );
        Vehicle VehicleKL2_15 = new Vehicle( cityK, cityL, date15_15, date16_18, AllData.ReservedPlace, 30 );
        Vehicle VehicleKL3_15 = new Vehicle( cityK, cityL, date15_20, date16_22, AllData.SittingPlace, 25 );
        Vehicle VehicleKL4_15 = new Vehicle( cityK, cityL, date15_15, date16_22, AllData.Compartment, 200 );

        Vehicle VehicleKO1_15 = new Vehicle( cityK, cityO, date15_10, date16_23, AllData.Compartment, 70 );
        Vehicle VehicleKO3_15 = new Vehicle( cityK, cityO, date15_20, date16_22, AllData.ReservedPlace, 125 );
        Vehicle VehicleKO4_15 = new Vehicle( cityK, cityO, date15_23, date16_6, AllData.Compartment, 300 );

        Vehicle VehicleLK1_15 = new Vehicle(  cityL,cityK, date15_6, date16_6, AllData.ReservedPlace, 50 );
        Vehicle VehicleLK2_15 = new Vehicle( cityL,cityK,  date15_15, date16_18, AllData.ReservedPlace, 30 );
        Vehicle VehicleLK3_15 = new Vehicle( cityL,cityK,  date15_20, date16_22, AllData.SittingPlace, 25 );
        Vehicle VehicleLK4_15 = new Vehicle(  cityL,cityK, date15_15, date16_22, AllData.Compartment, 200 );
        Vehicle VehicleLK5_15 = new Vehicle(  cityL,cityK, date15_20, date16_6, AllData.Compartment, 200 );

        Vehicle VehicleLO1_15 = new Vehicle( cityL, cityO, date15_8, date16_23, AllData.ReservedPlace, 110 );
        Vehicle VehicleLO2_15 = new Vehicle( cityL, cityO, date15_10, date16_10, AllData.ReservedPlace, 90 );
        Vehicle VehicleLO3_15 = new Vehicle( cityL, cityO, date15_18, date16_22, AllData.ReservedPlace, 80 );
        Vehicle VehicleLO4_15 = new Vehicle( cityL, cityO, date15_23, date16_23, AllData.ReservedPlace, 90 );

        Vehicle VehicleOK1_15 = new Vehicle(  cityO,cityK, date15_6, date16_6, AllData.ReservedPlace, 50 );
        Vehicle VehicleOK3_15 = new Vehicle( cityO,cityK,  date15_20, date16_22, AllData.ReservedPlace, 70 );
        Vehicle VehicleOK4_15 = new Vehicle( cityO, cityK, date15_23, date16_23, AllData.ReservedPlace, 90 );

        Vehicle VehicleOL1_15  = new Vehicle( cityO, cityL, date15_10, date16_23, AllData.ReservedPlace, 110 );
        Vehicle VehicleOL2_15 = new Vehicle( cityO, cityL, date15_15, date16_6, AllData.Compartment, 200 );


        //____________________________________________________________________________________________________________



        Vehicle VehicleKL1_16 = new Vehicle( cityK, cityL, date16_6, date17_6, AllData.ReservedPlace, 50 );
        Vehicle VehicleKL2_16 = new Vehicle( cityK, cityL, date16_15, date17_18, AllData.ReservedPlace, 30 );
        Vehicle VehicleKL3_16 = new Vehicle( cityK, cityL, date16_20, date17_22, AllData.ReservedPlace, 25 );
        Vehicle VehicleKL4_16 = new Vehicle( cityK, cityL, date16_15, date17_22, AllData.Compartment, 200 );

        Vehicle VehicleKO1_16 = new Vehicle( cityK, cityO, date16_10, date17_23, AllData.Compartment, 70 );
        Vehicle VehicleKO3_16 = new Vehicle( cityK, cityO, date16_20, date17_22, AllData.ReservedPlace, 125 );
        Vehicle VehicleKO4_16 = new Vehicle( cityK, cityO, date16_23, date17_6, AllData.Compartment, 300 );

        Vehicle VehicleLK1_16 = new Vehicle(  cityL,cityK, date16_6, date17_6, AllData.ReservedPlace, 50 );
        Vehicle VehicleLK2_16 = new Vehicle( cityL,cityK,  date16_15, date17_18, AllData.ReservedPlace, 30 );
        Vehicle VehicleLK3_16 = new Vehicle( cityL,cityK,  date16_20, date17_22, AllData.SittingPlace, 25 );
        Vehicle VehicleLK4_16 = new Vehicle(  cityL,cityK, date16_15, date17_22, AllData.Compartment, 200 );
        Vehicle VehicleLK5_16 = new Vehicle(  cityL,cityK, date16_20, date17_6, AllData.Compartment, 200 );

        Vehicle VehicleLO1_16 = new Vehicle( cityL, cityO, date16_8, date17_23, AllData.ReservedPlace, 110 );
        Vehicle VehicleLO2_16 = new Vehicle( cityL, cityO, date16_10, date17_10, AllData.ReservedPlace, 90 );
        Vehicle VehicleLO3_16 = new Vehicle( cityL, cityO, date16_18, date17_22, AllData.ReservedPlace, 80 );
        Vehicle VehicleLO4_16 = new Vehicle( cityL, cityO, date16_23, date17_23, AllData.ReservedPlace, 90 );

        Vehicle VehicleOK1_16 = new Vehicle(  cityO,cityK, date16_6, date17_6, AllData.ReservedPlace, 50 );
        Vehicle VehicleOK3_16 = new Vehicle( cityO,cityK,  date16_20, date17_22, AllData.ReservedPlace, 70 );
        Vehicle VehicleOK4_16 = new Vehicle( cityO, cityK, date16_23, date17_23, AllData.ReservedPlace, 90 );

        Vehicle VehicleOL1_16  = new Vehicle( cityO, cityL, date16_10, date17_23, AllData.ReservedPlace, 110 );
        Vehicle VehicleOL2_16 = new Vehicle( cityO, cityL, date16_15, date17_6, AllData.Compartment, 200 );


        //____________________________________________________________________________________________________________



        Vehicle VehicleKL1_17 = new Vehicle( cityK, cityL, date17_6, date18_6, AllData.ReservedPlace, 50 );
        Vehicle VehicleKL2_17 = new Vehicle( cityK, cityL, date17_15, date18_18, AllData.ReservedPlace, 30 );
        Vehicle VehicleKL3_17 = new Vehicle( cityK, cityL, date17_20, date18_22, AllData.ReservedPlace, 25 );
        Vehicle VehicleKL4_17 = new Vehicle( cityK, cityL, date17_15, date18_22, AllData.Compartment, 200 );

        Vehicle VehicleKO1_17 = new Vehicle( cityK, cityO, date17_10, date18_23, AllData.Compartment, 70 );
        Vehicle VehicleKO3_17 = new Vehicle( cityK, cityO, date17_20, date18_22, AllData.ReservedPlace, 125 );
        Vehicle VehicleKO4_17 = new Vehicle( cityK, cityO, date17_23, date18_6, AllData.Intercity, 300 );

        Vehicle VehicleLK1_17 = new Vehicle(  cityL,cityK, date17_6, date18_6, AllData.ReservedPlace, 50 );
        Vehicle VehicleLK2_17 = new Vehicle( cityL,cityK,  date17_15, date18_18, AllData.ReservedPlace, 30 );
        Vehicle VehicleLK3_17 = new Vehicle( cityL,cityK,  date17_20, date18_22, AllData.SittingPlace, 25 );
        Vehicle VehicleLK4_17 = new Vehicle(  cityL,cityK, date17_15, date18_22, AllData.Compartment, 200 );
        Vehicle VehicleLK5_17 = new Vehicle(  cityL,cityK, date17_20, date18_6, AllData.Compartment, 200 );

        Vehicle VehicleLO1_17 = new Vehicle( cityL, cityO, date17_8, date18_23, AllData.ReservedPlace, 110 );
        Vehicle VehicleLO2_17 = new Vehicle( cityL, cityO, date17_10, date18_10, AllData.ReservedPlace, 90 );
        Vehicle VehicleLO3_17 = new Vehicle( cityL, cityO, date17_18, date18_22, AllData.ReservedPlace, 80 );
        Vehicle VehicleLO4_17 = new Vehicle( cityL, cityO, date17_23, date18_23, AllData.ReservedPlace, 90 );

        Vehicle VehicleOK1_17 = new Vehicle(  cityO,cityK, date17_6, date18_6, AllData.ReservedPlace, 50 );
        Vehicle VehicleOK3_17 = new Vehicle( cityO,cityK,  date17_20, date18_22, AllData.ReservedPlace, 70 );
        Vehicle VehicleOK4_17 = new Vehicle( cityO, cityK, date17_23, date18_23, AllData.ReservedPlace, 90 );

        Vehicle VehicleOL1_17  = new Vehicle( cityO, cityL, date17_10, date18_23, AllData.ReservedPlace, 110 );
        Vehicle VehicleOL2_17 = new Vehicle( cityO, cityL, date17_15, date18_6, AllData.Intercity, 200 );


        //____________________________________________________________________________________________________________



        Vehicle VehicleKL1_18 = new Vehicle( cityK, cityL, date18_6, date19_6, AllData.ReservedPlace, 50 );
        Vehicle VehicleKL2_18 = new Vehicle( cityK, cityL, date18_15, date19_18, AllData.ReservedPlace, 30 );
        Vehicle VehicleKL3_18 = new Vehicle( cityK, cityL, date18_20, date19_22, AllData.SittingPlace, 25 );
        Vehicle VehicleKL4_18 = new Vehicle( cityK, cityL, date18_15, date19_22, AllData.Compartment, 200 );

        Vehicle VehicleKO1_18 = new Vehicle( cityK, cityO, date18_10, date19_23, AllData.Compartment, 70 );
        Vehicle VehicleKO3_18 = new Vehicle( cityK, cityO, date18_20, date19_22, AllData.ReservedPlace, 125 );
        Vehicle VehicleKO4_18 = new Vehicle( cityK, cityO, date18_23, date19_6, AllData.Compartment, 300 );

        Vehicle VehicleLK1_18 = new Vehicle(  cityL,cityK, date18_6, date19_6, AllData.ReservedPlace, 50 );
        Vehicle VehicleLK2_18 = new Vehicle( cityL,cityK,  date18_15, date19_18, AllData.ReservedPlace, 30 );
        Vehicle VehicleLK3_18 = new Vehicle( cityL,cityK,  date18_20, date19_22, AllData.ReservedPlace, 25 );
        Vehicle VehicleLK4_18 = new Vehicle(  cityL,cityK, date18_15, date19_22, AllData.Compartment, 200 );
        Vehicle VehicleLK5_18 = new Vehicle(  cityL,cityK, date18_20, date19_6, AllData.Intercity, 200 );

        Vehicle VehicleLO1_18 = new Vehicle( cityL, cityO, date18_8, date19_23, AllData.ReservedPlace, 110 );
        Vehicle VehicleLO2_18 = new Vehicle( cityL, cityO, date18_10, date19_10, AllData.ReservedPlace, 90 );
        Vehicle VehicleLO3_18 = new Vehicle( cityL, cityO, date18_18, date19_22, AllData.SittingPlace, 80 );
        Vehicle VehicleLO4_18 = new Vehicle( cityL, cityO, date18_23, date19_23, AllData.ReservedPlace, 90 );

        Vehicle VehicleOK1_18 = new Vehicle(  cityO,cityK, date18_6, date19_6, AllData.ReservedPlace, 50 );
        Vehicle VehicleOK3_18 = new Vehicle( cityO,cityK,  date18_20, date19_22, AllData.ReservedPlace, 70 );
        Vehicle VehicleOK4_18 = new Vehicle( cityO, cityK, date18_23, date19_23, AllData.ReservedPlace, 90 );

        Vehicle VehicleOL1_18  = new Vehicle( cityO, cityL, date18_10, date19_23, AllData.ReservedPlace, 110 );
        Vehicle VehicleOL2_18 = new Vehicle( cityO, cityL, date18_15, date19_6, AllData.Intercity, 200 );


        //____________________________________________________________________________________________________________



        Vehicle VehicleKL1_19 = new Vehicle( cityK, cityL, date19_6, date20_6, AllData.ReservedPlace, 50 );
        Vehicle VehicleKL2_19= new Vehicle( cityK, cityL, date19_15, date20_18, AllData.ReservedPlace, 30 );
        Vehicle VehicleKL3_19 = new Vehicle( cityK, cityL, date19_20, date20_22, AllData.SittingPlace, 25 );
        Vehicle VehicleKL4_19 = new Vehicle( cityK, cityL, date19_15, date20_22, AllData.Compartment, 200 );

        Vehicle VehicleKO1_19 = new Vehicle( cityK, cityO, date19_10, date20_23, AllData.Compartment, 70 );
        Vehicle VehicleKO3_19 = new Vehicle( cityK, cityO, date19_20, date20_22, AllData.ReservedPlace, 125 );
        Vehicle VehicleKO4_19 = new Vehicle( cityK, cityO, date19_23, date20_6, AllData.Compartment, 300 );

        Vehicle VehicleLK1_19 = new Vehicle(  cityL,cityK, date19_6, date20_6, AllData.ReservedPlace, 50 );
        Vehicle VehicleLK2_19 = new Vehicle( cityL,cityK,  date19_15, date20_18, AllData.ReservedPlace, 30 );
        Vehicle VehicleLK3_19 = new Vehicle( cityL,cityK,  date19_20, date20_22, AllData.SittingPlace, 25 );
        Vehicle VehicleLK4_19 = new Vehicle(  cityL,cityK, date19_15, date20_22, AllData.Compartment, 200 );
        Vehicle VehicleLK5_19 = new Vehicle(  cityL,cityK, date19_20, date20_6, AllData.Intercity, 200 );

        Vehicle VehicleLO1_19 = new Vehicle( cityL, cityO, date19_8, date20_23, AllData.ReservedPlace, 110 );
        Vehicle VehicleLO2_19 = new Vehicle( cityL, cityO, date19_10, date20_10, AllData.ReservedPlace, 90 );
        Vehicle VehicleLO3_19 = new Vehicle( cityL, cityO, date19_18, date20_22, AllData.ReservedPlace, 80 );
        Vehicle VehicleLO4_19 = new Vehicle( cityL, cityO, date19_23, date20_23, AllData.ReservedPlace, 90 );

        Vehicle VehicleOK1_19 = new Vehicle(  cityO,cityK, date19_6, date20_6, AllData.ReservedPlace, 50 );
        Vehicle VehicleOK3_19 = new Vehicle( cityO,cityK,  date19_20, date20_22, AllData.ReservedPlace, 70 );
        Vehicle VehicleOK4_19= new Vehicle( cityO, cityK, date19_23, date20_23, AllData.ReservedPlace, 90 );

        Vehicle VehicleOL1_19  = new Vehicle( cityO, cityL, date19_10, date20_23, AllData.ReservedPlace, 110 );
        Vehicle VehicleOL2_19 = new Vehicle( cityO, cityL, date19_15, date20_6, AllData.Intercity, 200 );

        //____________________________________________________________________________________________________________

       /* trains.add(VehicleKL1_11);
        trains.add(VehicleKL2_11);
        trains.add(VehicleKL3_11);
        trains.add(VehicleKL4_11);

        trains.add(VehicleKO1_11);
        trains.add(VehicleKO3_11);
        trains.add(VehicleKO4_11);


        trains.add(VehicleLK1_11);
        trains.add(VehicleLK2_11);
        trains.add(VehicleLK3_11);
        trains.add(VehicleLK4_11);
        trains.add(VehicleLK5_11);


        trains.add(VehicleLO1_11);
        trains.add(VehicleLO2_11);
        trains.add(VehicleLO3_11);
        trains.add(VehicleLO4_11);



        trains.add(VehicleOK1_11);
        trains.add(VehicleOK3_11);
        trains.add(VehicleOK4_11);


        trains.add(VehicleOL1_11);
        trains.add(VehicleOL2_11);
        //____________________________________________________________________________________________________________


        trains.add(VehicleKL1_12);
        trains.add(VehicleKL2_12);
        trains.add(VehicleKL3_12);
        trains.add(VehicleKL4_12);

        trains.add(VehicleKO1_12);
        trains.add(VehicleKO3_12);
        trains.add(VehicleKO4_12);

        trains.add(VehicleLK1_12);
        trains.add(VehicleLK2_12);
        trains.add(VehicleLK3_12);
        trains.add(VehicleLK4_12);
        trains.add(VehicleLK5_12);


        trains.add(VehicleLO1_12);
        trains.add(VehicleLO2_12);
        trains.add(VehicleLO3_12);
        trains.add(VehicleLO4_12);



        trains.add(VehicleOK1_12);
        trains.add(VehicleOK3_12);
        trains.add(VehicleOK4_12);


        trains.add(VehicleOL1_12);
        trains.add(VehicleOL2_12);
        //____________________________________________________________________________________________________________

        trains.add(VehicleKL1_13);
        trains.add(VehicleKL2_13);
        trains.add(VehicleKL3_13);
        trains.add(VehicleKL4_13);

        trains.add(VehicleKO1_13);
        trains.add(VehicleKO3_13);
        trains.add(VehicleKO4_13);

        trains.add(VehicleLK1_13);
        trains.add(VehicleLK2_13);
        trains.add(VehicleLK3_13);
        trains.add(VehicleLK4_13);
        trains.add(VehicleLK5_13);

        trains.add(VehicleLO1_13);
        trains.add(VehicleLO2_13);
        trains.add(VehicleLO3_13);
        trains.add(VehicleLO4_13);

        trains.add(VehicleOK1_13);
        trains.add(VehicleOK3_13);
        trains.add(VehicleOK4_13);

        trains.add(VehicleOL1_13);
        trains.add(VehicleOL2_13);
        //____________________________________________________________________________________________________________

        trains.add(VehicleKL1_14);
        trains.add(VehicleKL2_14);
        trains.add(VehicleKL3_14);
        trains.add(VehicleKL4_14);

        trains.add(VehicleKO1_14);
        trains.add(VehicleKO3_14);
        trains.add(VehicleKO4_14);

        trains.add(VehicleLK1_14);
        trains.add(VehicleLK2_14);
        trains.add(VehicleLK3_14);
        trains.add(VehicleLK4_14);
        trains.add(VehicleLK5_14);

        trains.add(VehicleLO1_14);
        trains.add(VehicleLO2_14);
        trains.add(VehicleLO3_14);
        trains.add(VehicleLO4_14);

        trains.add(VehicleOK1_14);
        trains.add(VehicleOK3_14);
        trains.add(VehicleOK4_14);

        trains.add(VehicleOL1_14);
        trains.add(VehicleOL2_14);
        //____________________________________________________________________________________________________________
        trains.add(VehicleKL1_15);
        trains.add(VehicleKL2_15);
        trains.add(VehicleKL3_15);
        trains.add(VehicleKL4_15);

        trains.add(VehicleKO1_15);
        trains.add(VehicleKO3_15);
        trains.add(VehicleKO4_15);

        trains.add(VehicleLK1_15);
        trains.add(VehicleLK2_15);
        trains.add(VehicleLK3_15);
        trains.add(VehicleLK4_15);
        trains.add(VehicleLK5_15);

        trains.add(VehicleLO1_15);
        trains.add(VehicleLO2_15);
        trains.add(VehicleLO3_15);
        trains.add(VehicleLO4_15);

        trains.add(VehicleOK1_15);
        trains.add(VehicleOK3_15);
        trains.add(VehicleOK4_15);

        trains.add(VehicleOL1_15);
        trains.add(VehicleOL2_15);
        //____________________________________________________________________________________________________________

        trains.add(VehicleKL1_16);
        trains.add(VehicleKL2_16);
        trains.add(VehicleKL3_16);
        trains.add(VehicleKL4_16);

        trains.add(VehicleKO1_16);
        trains.add(VehicleKO3_16);
        trains.add(VehicleKO4_16);

        trains.add(VehicleLK1_16);
        trains.add(VehicleLK2_16);
        trains.add(VehicleLK3_16);
        trains.add(VehicleLK4_16);
        trains.add(VehicleLK5_16);

        trains.add(VehicleLO1_16);
        trains.add(VehicleLO2_16);
        trains.add(VehicleLO3_16);
        trains.add(VehicleLO4_16);

        trains.add(VehicleOK1_16);
        trains.add(VehicleOK3_16);
        trains.add(VehicleOK4_16);

        trains.add(VehicleOL1_16);
        trains.add(VehicleOL2_16);
        //____________________________________________________________________________________________________________

        trains.add(VehicleKL1_17);
        trains.add(VehicleKL2_17);
        trains.add(VehicleKL3_17);
        trains.add(VehicleKL4_17);

        trains.add(VehicleKO1_17);
        trains.add(VehicleKO3_17);
        trains.add(VehicleKO4_17);

        trains.add(VehicleLK1_17);
        trains.add(VehicleLK2_17);
        trains.add(VehicleLK3_17);
        trains.add(VehicleLK4_17);
        trains.add(VehicleLK5_17);

        trains.add(VehicleLO1_17);
        trains.add(VehicleLO2_17);
        trains.add(VehicleLO3_17);
        trains.add(VehicleLO4_17);

        trains.add(VehicleOK1_17);
        trains.add(VehicleOK3_17);
        trains.add(VehicleOK4_17);

        trains.add(VehicleOL1_17);
        trains.add(VehicleOL2_17);
        //____________________________________________________________________________________________________________

        trains.add(VehicleKL1_18);
        trains.add(VehicleKL2_18);
        trains.add(VehicleKL3_18);
        trains.add(VehicleKL4_18);

        trains.add(VehicleKO1_18);
        trains.add(VehicleKO3_18);
        trains.add(VehicleKO4_18);

        trains.add(VehicleLK1_18);
        trains.add(VehicleLK2_18);
        trains.add(VehicleLK3_18);
        trains.add(VehicleLK4_18);
        trains.add(VehicleLK5_18);

        trains.add(VehicleLO1_18);
        trains.add(VehicleLO2_18);
        trains.add(VehicleLO3_18);
        trains.add(VehicleLO4_18);

        trains.add(VehicleOK1_18);
        trains.add(VehicleOK3_18);
        trains.add(VehicleOK4_18);

        trains.add(VehicleOL1_18);
        trains.add(VehicleOL2_18);
        //____________________________________________________________________________________________________________

        trains.add(VehicleKL1_19);
        trains.add(VehicleKL2_19);
        trains.add(VehicleKL3_19);
        trains.add(VehicleKL4_19);

        trains.add(VehicleKO1_19);
        trains.add(VehicleKO3_19);
        trains.add(VehicleKO4_19);

        trains.add(VehicleLK1_19);
        trains.add(VehicleLK2_19);
        trains.add(VehicleLK3_19);
        trains.add(VehicleLK4_19);
        trains.add(VehicleLK5_19);

        trains.add(VehicleLO1_19);
        trains.add(VehicleLO2_19);
        trains.add(VehicleLO3_19);
        trains.add(VehicleLO4_19);

        trains.add(VehicleOK1_19);
        trains.add(VehicleOK3_19);
        trains.add(VehicleOK4_19);

        trains.add(VehicleOL1_19);
        trains.add(VehicleOL2_19);*/
        //____________________________________________________________________________________________________________
      /* cities.add( cityZh );
        cities.add( cityCh );
        cities.add( cityKr );
        cities.add( cityM );
        cities.add( cityU );
        cities.add( cityY );
        cities.add( cityMe );
        cities.add( cityP );
        cities.add( cityS );
        cities.add( cityBerlin );
        cities.add( cityBudapesht );
        cities.add( cityCarpati );
        cities.add( cityChernovtsi );
        cities.add( cityKrim );
        cities.add( cityV );

        Date dateFrom10 = new Date( 2017, 10, 12, 10, 15 );
        Date dateTo10 = new Date( 2017, 10, 13, 6, 15 );


        Date dateFrom1 = new Date( 2017, 10, 12, 10, 15 );
        Date dateTo1 = new Date( 2017, 10, 13, 3, 15 );


        Date dateFrom2 = new Date( 2017, 10, 12, 10, 15 );
        Date dateTo2 = new Date( 2017, 10, 13, 12, 15 );


        Date dateFrom3 = new Date( 2017, 10, 12, 10, 15 );
        Date dateTo3 = new Date( 2017, 10, 13, 15, 15 );


        Date dateFrom4 = new Date( 2017, 10, 12, 10, 15 );
        Date dateTo4 = new Date( 2017, 10, 13, 2, 15 );

        Date dateTo5 = new Date( 2017, 10, 13, 0, 15 );

        Date dateFrom7 = new Date( 2017, 10, 12, 10, 15 );
        Date dateTo7 = new Date( 2017, 10, 14, 6, 15 );


        Date dateFrom8 = new Date( 2017, 10, 12, 10, 15 );
        Date dateTo8 = new Date( 2017, 10, 15, 0, 15 );


        Date dateFrom9 = new Date( 2017, 10, 12, 10, 15 );
        Date dateTo9 = new Date( 2017, 10, 12, 17, 15 );



        Date dateFrom5 = new Date( 2017, 4, 11, 20, 15 );
        Date dateTo6 = new Date( 2017, 4, 12, 11, 15 );

        Vehicle VehicleOK = new Vehicle( cityO, cityK, dateFrom5, dateTo6, 14, 20 );
        dateFrom5 = new Date( 2017, 4, 11, 10, 15 );
        dateTo6 = new Date( 2017, 4, 12, 16, 15 );
        Vehicle VehicleOD = new Vehicle( cityO, cityD, dateFrom5, dateTo6, 15, 1600 );

        dateFrom5 = new Date( 2017, 10, 12, 10, 15 );
        dateTo6 = new Date( 2017, 10, 12, 16, 15 );
        Vehicle VehicleOH = new Vehicle( cityO, cityH, dateFrom5, dateTo6, 24, 60 );

        dateFrom5 = new Date( 2017, 10, 12, 12, 15 );
        dateTo6 = new Date( 2017, 10, 12, 16, 15 );
        Vehicle VehicleOL = new Vehicle( cityO, cityL, dateFrom5, dateTo6, 10, 40 );

        Vehicle VehicleOV = new Vehicle( cityO, cityV, dateFrom5, dateTo6, 15, 30 );

        dateFrom5 = new Date( 2017, 10, 10, 10, 15 );
        dateTo6 = new Date( 2017, 10, 12, 11, 15 );
        Vehicle VehicleOKrim = new Vehicle( cityO, cityKrim, dateFrom5, dateTo6, 4, 612 );

        dateFrom5 = new Date( 2017, 10, 12, 8, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 15 );
        Vehicle VehicleOCarpati = new Vehicle( cityO, cityCarpati, dateFrom5, dateTo6, 10, 120 );
        dateFrom5 = new Date( 2017, 10, 12, 20, 15 );
        dateTo6 = new Date( 2017, 10, 14, 16, 15 );
        Vehicle VehicleOBerlin = new Vehicle( cityO, cityBerlin, dateFrom5, dateTo6, 15, 300 );
        dateFrom5 = new Date( 2017, 10, 12, 6, 15 );
        dateTo6 = new Date( 2017, 10, 12, 7, 15 );
        Vehicle VehicleOBudapesht = new Vehicle( cityO, cityBudapesht, dateFrom5, dateTo6, 24, 800 );
        dateFrom5 = new Date( 2017, 10, 12, 1, 15 );
        dateTo6 = new Date( 2017, 10, 12, 6, 15 );
        Vehicle VehicleOCh = new Vehicle( cityO, cityCh, dateFrom5, dateTo6, 30, 15 );
        dateFrom5 = new Date( 2017, 10, 12, 5, 15 );
        dateTo6 = new Date( 2017, 10, 12, 21, 15 );
        Vehicle VehicleOChernovtsi = new Vehicle( cityO, cityChernovtsi, dateFrom5, dateTo6, 15, 10 );
        dateFrom5 = new Date( 2017, 10, 12, 10, 15 );
        dateTo6 = new Date( 2017, 10, 12, 16, 15 );
        Vehicle VehicleOMe = new Vehicle( cityO, cityMe, dateFrom5, dateTo6, 24, 1222 );
        dateFrom5 = new Date( 2017, 10, 12, 16, 15 );
        dateTo6 = new Date( 2017, 10, 12, 16, 50 );
        Vehicle VehicleOKr = new Vehicle( cityO, cityKr, dateFrom5, dateTo6, 45, 123 );
        dateFrom5 = new Date( 2017, 10, 12, 13, 15 );
        dateTo6 = new Date( 2017, 10, 12, 16, 15 );
        Vehicle VehicleOU = new Vehicle( cityO, cityU, dateFrom5, dateTo6, 45, 6788 );
        dateFrom5 = new Date( 2017, 10, 12, 10, 15 );
        dateTo6 = new Date( 2017, 10, 12, 18, 15 );
        Vehicle VehicleOZh = new Vehicle( cityO, cityZh, dateFrom5, dateTo6, 27, 6 );
        dateFrom5 = new Date( 2017, 10, 12, 4, 15 );
        dateTo6 = new Date( 2017, 10, 12, 16, 15 );
        Vehicle VehicleOY = new Vehicle( cityO, cityY, dateFrom5, dateTo6, 1, 60 );
        dateFrom5 = new Date( 2017, 10, 12, 10, 15 );
        dateTo6 = new Date( 2017, 10, 12, 19, 15 );
        Vehicle VehicleOP = new Vehicle( cityO, cityP, dateFrom5, dateTo6, 5, 100 );
        dateFrom5 = new Date( 2017, 10, 10, 10, 15 );
        dateTo6 = new Date( 2017, 10, 13, 17, 15 );
        Vehicle VehicleOS = new Vehicle( cityO, cityS, dateFrom5, dateTo6, 24, 6200 );
        dateFrom5 = new Date( 2017, 10, 12, 12, 15 );
        dateTo6 = new Date( 2017, 10, 12, 16, 15 );
        Vehicle VehicleOM = new Vehicle( cityO, cityM, dateFrom5, dateTo6, 11, 200 );

        ArrayList<Vehicle> Vehicles = new ArrayList<>();

        Vehicles.add( VehicleOL );
        Vehicles.add( VehicleOD );
        Vehicles.add( VehicleOH );
        Vehicles.add( VehicleOK );
        Vehicles.add( VehicleOV );
        Vehicles.add( VehicleOKrim );
        Vehicles.add( VehicleOCarpati );
        Vehicles.add( VehicleOBerlin );
        Vehicles.add( VehicleOBudapesht );
        Vehicles.add( VehicleOCh );
        Vehicles.add( VehicleOChernovtsi );
        Vehicles.add( VehicleOMe );
        Vehicles.add( VehicleOKr );
        Vehicles.add( VehicleOU );
        Vehicles.add( VehicleOZh );
        Vehicles.add( VehicleOY );
        Vehicles.add( VehicleOP );
        Vehicles.add( VehicleOS );
        Vehicles.add( VehicleOM );

        Vehicle VehicleKD = new Vehicle( cityK, cityD, dateFrom5, dateTo6, 10, 1600 );
        Vehicle VehicleKL = new Vehicle( cityK, cityL, dateFrom7, dateTo7, 10, 300 );
        Vehicle VehicleKH = new Vehicle( cityK, cityH, dateFrom5, dateTo5, 25, 200 );
        Vehicle VehicleKO = new Vehicle( cityK, cityO, dateFrom4, dateTo4, 25, 850 );
        dateFrom5 = new Date( 2017, 10, 12, 20, 15 );
        dateTo6 = new Date( 2017, 10, 13, 5, 15 );
        Vehicle VehicleKV = new Vehicle( cityK, cityV, dateFrom5, dateTo6, 15, 600 );
        dateFrom5 = new Date( 2017, 10, 12, 7, 15 );
        dateTo6 = new Date( 2017, 10, 12, 8, 15 );
        Vehicle VehicleKKrim = new Vehicle( cityK, cityKrim, dateFrom5, dateTo6, 28, 12);
        dateFrom5 = new Date( 2017, 10, 12, 10, 15 );
        dateTo6 = new Date( 2017, 10, 13, 16, 15 );
        Vehicle VehicleKCarpati = new Vehicle( cityK, cityCarpati, dateFrom5, dateTo6, 10, 80 );
        dateFrom5 = new Date( 2017, 10, 12, 1, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 15 );
        Vehicle VehicleKBerlin = new Vehicle( cityK, cityBerlin, dateFrom5, dateTo6, 1, 230);
        dateFrom5 = new Date( 2017, 10, 12, 14, 15 );
        dateTo6 = new Date( 2017, 10, 12, 16, 15 );
        Vehicle VehicleKBudapesht = new Vehicle( cityK, cityBudapesht, dateFrom5, dateTo6, 4, 400 );
        dateFrom5 = new Date( 2017, 10, 12, 14, 15 );
        dateTo6 = new Date( 2017, 10, 12, 16, 15 );
        Vehicle VehicleKCh = new Vehicle( cityK, cityCh, dateFrom5, dateTo6, 1, 200 );
        dateFrom5 = new Date( 2017, 10, 12, 2, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 15 );
        Vehicle VehicleKChernovtsi = new Vehicle( cityK, cityChernovtsi, dateFrom5, dateTo6, 16, 10 );
        dateFrom5 = new Date( 2017, 10, 11, 1, 15 );
        dateTo6 = new Date( 2017, 10, 12, 16, 15 );
        Vehicle VehicleKMe = new Vehicle( cityK, cityMe, dateFrom5, dateTo6, 8, 45 );
        dateFrom5 = new Date( 2017, 10, 12, 11, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 15 );
        Vehicle VehicleKKr = new Vehicle( cityK, cityKr, dateFrom5, dateTo6, 10, 21 );
        dateFrom5 = new Date( 2017, 10, 12, 10, 15 );
        dateTo6 = new Date( 2017, 10, 12, 16, 15 );
        Vehicle VehicleKU = new Vehicle( cityK, cityU, dateFrom5, dateTo6, 15, 800 );
        dateFrom5 = new Date( 2017, 10, 12, 10, 15 );
        dateTo6 = new Date( 2017, 10, 12, 16, 15 );
        Vehicle VehicleKZh = new Vehicle( cityK, cityZh, dateFrom5, dateTo6, 90, 950 );
        dateFrom5 = new Date( 2017, 10, 12, 10, 15 );
        dateTo6 = new Date( 2017, 10, 12, 19, 15 );
        Vehicle VehicleKY = new Vehicle( cityK, cityY, dateFrom5, dateTo6, 60, 430 );
        dateFrom5 = new Date( 2017, 10, 12, 10, 15 );
        dateTo6 = new Date( 2017, 10, 12, 23, 15 );
        Vehicle VehicleKP = new Vehicle( cityK, cityP, dateFrom5, dateTo6, 5, 150 );
        dateFrom5 = new Date( 2017, 10, 12, 5, 15 );
        dateTo6 = new Date( 2017, 10, 12, 16, 15 );
        Vehicle VehicleKS = new Vehicle( cityK, cityS, dateFrom5, dateTo6, 24, 200 );
        dateFrom5 = new Date( 2017, 10, 11, 3, 15 );
        dateTo6 = new Date( 2017, 10, 12, 16, 15 );
        Vehicle VehicleKM = new Vehicle( cityK, cityM, dateFrom5, dateTo6, 17, 100 );

        Vehicles.add( VehicleKL );
        Vehicles.add( VehicleKD );
        Vehicles.add( VehicleKH );
        Vehicles.add( VehicleKO );
        Vehicles.add( VehicleKV );
        Vehicles.add( VehicleKKrim );
        Vehicles.add( VehicleKCarpati );
        Vehicles.add( VehicleKBerlin );
        Vehicles.add( VehicleKBudapesht );
        Vehicles.add( VehicleKCh );
        Vehicles.add( VehicleKChernovtsi );
        Vehicles.add( VehicleKMe );
        Vehicles.add( VehicleKKr );
        Vehicles.add( VehicleKU );
        Vehicles.add( VehicleKZh );
        Vehicles.add( VehicleKY );
        Vehicles.add( VehicleKP );
        Vehicles.add( VehicleKS );
        Vehicles.add( VehicleKM );

        dateFrom5 = new Date( 2017, 10, 12, 14, 15 );
        dateTo6 = new Date( 2017, 10, 12, 23, 15 );
        Vehicle VehicleHD = new Vehicle( cityH, cityD, dateFrom5, dateTo6, 10, 400 );
        Vehicle VehicleHL = new Vehicle( cityH, cityL, dateFrom7, dateTo7, 9, 100 );
        Vehicle VehicleHK = new Vehicle( cityH, cityK, dateFrom5, dateTo5, 8, 2000 );
        Vehicle VehicleHO = new Vehicle( cityH, cityO, dateFrom4, dateTo4, 20, 8500 );
        dateFrom5 = new Date( 2017, 10, 12, 15, 15 );
        dateTo6 = new Date( 2017, 10, 13, 6, 15 );
        Vehicle VehicleHV = new Vehicle( cityH, cityV, dateFrom5, dateTo6, 15, 1600 );
        dateFrom5 = new Date( 2017, 10, 12, 10, 15 );
        dateTo6 = new Date( 2017, 10, 12, 14, 15 );
        Vehicle VehicleHKrim = new Vehicle( cityH, cityKrim, dateFrom5, dateTo6, 24, 1600 );
        dateFrom5 = new Date( 2017, 10, 12, 12, 15 );
        dateTo6 = new Date( 2017, 10, 12, 16, 15 );
        Vehicle VehicleHCarpati = new Vehicle( cityH, cityCarpati, dateFrom5, dateTo6, 15, 200 );
        dateFrom5 = new Date( 2017, 10, 12, 10, 15 );
        dateTo6 = new Date( 2017, 10, 12, 17, 15 );
        Vehicle VehicleHBerlin = new Vehicle( cityH, cityBerlin, dateFrom5, dateTo6, 17, 60 );
        dateFrom5 = new Date( 2017, 10, 11, 10, 15 );
        dateTo6 = new Date( 2017, 10, 12, 5, 15 );
        Vehicle VehicleHBudapesht = new Vehicle( cityH, cityBudapesht, dateFrom5, dateTo6, 22, 50 );
        dateFrom5 = new Date( 2017, 10, 12, 1, 15 );
        dateTo6 = new Date( 2017, 10, 12, 4, 15 );
        Vehicle VehicleHCh = new Vehicle( cityH, cityCh, dateFrom5, dateTo6, 3, 30 );
        dateFrom5 = new Date( 2017, 10, 12, 5, 15 );
        dateTo6 = new Date( 2017, 10, 12, 6, 15 );
        Vehicle VehicleHChernovtsi = new Vehicle( cityH, cityChernovtsi, dateFrom5, dateTo6, 18, 200 );
        dateFrom5 = new Date( 2017, 10, 10, 9, 15 );
        dateTo6 = new Date( 2017, 10, 12, 16, 15 );
        Vehicle VehicleHMe = new Vehicle( cityH, cityMe, dateFrom5, dateTo6, 21, 130 );
        dateFrom5 = new Date( 2017, 10, 12, 14, 15 );
        dateTo6 = new Date( 2017, 10, 12, 18, 15 );
        Vehicle VehicleHKr = new Vehicle( cityH, cityKr, dateFrom5, dateTo6, 13, 45 );
        dateFrom5 = new Date( 2017, 10, 12, 12, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 15 );
        Vehicle VehicleHU = new Vehicle( cityH, cityU, dateFrom5, dateTo6, 25, 30 );
        dateFrom5 = new Date( 2017, 10, 12, 12, 15 );
        dateTo6 = new Date( 2017, 10, 12, 14, 15 );
        Vehicle VehicleHZh = new Vehicle( cityH, cityZh, dateFrom5, dateTo6, 2, 6300 );
        dateFrom5 = new Date( 2017, 10, 12, 5, 15 );
        dateTo6 = new Date( 2017, 10, 12, 21, 15 );
        Vehicle VehicleHY = new Vehicle( cityH, cityY, dateFrom5, dateTo6, 11, 3600 );
        dateFrom5 = new Date( 2017, 10, 12, 21, 15 );
        dateTo6 = new Date( 2017, 10, 13, 4, 15 );
        Vehicle VehicleHP = new Vehicle( cityH, cityP, dateFrom5, dateTo6, 18, 2300 );
        dateFrom5 = new Date( 2017, 10, 12, 10, 15 );
        dateTo6 = new Date( 2017, 10, 12, 16, 15 );
        Vehicle VehicleHS = new Vehicle( cityH, cityS, dateFrom5, dateTo6, 26, 30 );
        dateFrom5 = new Date( 2017, 10, 12, 10, 15 );
        dateTo6 = new Date( 2017, 10, 12, 16, 15 );
        Vehicle VehicleHM = new Vehicle( cityH, cityM, dateFrom5, dateTo6, 45, 15 );

        Vehicles.add( VehicleHL );
        Vehicles.add( VehicleHD );
        Vehicles.add( VehicleHK );
        Vehicles.add( VehicleHO );
        Vehicles.add( VehicleHV );
        Vehicles.add( VehicleHKrim );
        Vehicles.add( VehicleHCarpati );
        Vehicles.add( VehicleHBerlin );
        Vehicles.add( VehicleHBudapesht );
        Vehicles.add( VehicleHCh );
        Vehicles.add( VehicleHChernovtsi );
        Vehicles.add( VehicleHMe );
        Vehicles.add( VehicleHKr );
        Vehicles.add( VehicleHU );
        Vehicles.add( VehicleHZh );
        Vehicles.add( VehicleHY );
        Vehicles.add( VehicleHP );
        Vehicles.add( VehicleHS );
        Vehicles.add( VehicleHM );


        dateFrom5 = new Date( 2017, 10, 12, 10, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 15 );
        Vehicle VehicleLD = new Vehicle( cityL, cityD, dateFrom5, dateTo6, 2, 640 );
        Vehicle VehicleLH = new Vehicle( cityL, cityH, dateFrom7, dateTo7, 10, 360 );
        Vehicle VehicleLK = new Vehicle( cityL, cityK, dateFrom5, dateTo5, 1, 200 );
        Vehicle VehicleLO = new Vehicle( cityL, cityO, dateFrom4, dateTo4, 15, 344 );
        dateFrom5 = new Date( 2017, 10, 12, 11, 15 );
        dateTo6 = new Date( 2017, 10, 12, 22, 15 );
        Vehicle VehicleLV = new Vehicle( cityL, cityV, dateFrom5, dateTo6, 15, 608 );
        dateFrom5 = new Date( 2017, 10, 12, 12, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 15 );
        Vehicle VehicleLKrim = new Vehicle( cityL, cityKrim, dateFrom5, dateTo6, 24, 690 );
        dateFrom5 = new Date( 2017, 10, 9, 10, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 15 );
        Vehicle VehicleLCarpati = new Vehicle( cityL, cityCarpati, dateFrom5, dateTo6, 12, 670 );
        dateFrom5 = new Date( 2017, 10, 12, 10, 15 );
        dateTo6 = new Date( 2017, 10, 13, 18, 15 );
        Vehicle VehicleLBerlin = new Vehicle( cityL, cityBerlin, dateFrom5, dateTo6, 15, 560 );
        dateFrom5 = new Date( 2017, 10, 12, 17, 15 );
        dateTo6 = new Date( 2017, 10, 12, 22, 15 );
        Vehicle VehicleLBudapesht = new Vehicle( cityL, cityBudapesht, dateFrom5, dateTo6, 24, 6234 );
        dateFrom5 = new Date( 2017, 10, 12, 11, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 15 );
        Vehicle VehicleLCh = new Vehicle( cityL, cityCh, dateFrom5, dateTo6, 10, 700 );
        dateFrom5 = new Date( 2017, 10, 12, 10, 15 );
        dateTo6 = new Date( 2017, 11, 12, 2, 15 );
        Vehicle VehicleLChernovtsi = new Vehicle( cityL, cityChernovtsi, dateFrom5, dateTo6, 15, 670 );
        dateFrom5 = new Date( 2017, 10, 12, 10, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 45 );
        Vehicle VehicleLMe = new Vehicle( cityL, cityMe, dateFrom5, dateTo6, 27, 990 );
        dateFrom5 = new Date( 2017, 10, 12, 10, 15 );
        dateTo6 = new Date( 2017, 10, 13, 15, 34 );
        Vehicle VehicleLKr = new Vehicle( cityL, cityKr, dateFrom5, dateTo6, 13, 45 );
        dateFrom5 = new Date( 2017, 10, 12, 10, 15 );
        dateTo6 = new Date( 2017, 10, 13, 17, 17 );
        Vehicle VehicleLU = new Vehicle( cityL, cityU, dateFrom5, dateTo6, 15, 15 );
        Vehicle VehicleLZh = new Vehicle( cityL, cityZh, dateFrom5, dateTo6, 27, 56 );
        Vehicle VehicleLY = new Vehicle( cityL, cityY, dateFrom5, dateTo6, 9, 234 );
        Vehicle VehicleLP = new Vehicle( cityL, cityP, dateFrom5, dateTo6, 15, 6010 );
        dateFrom5 = new Date( 2017, 10, 12, 10, 15 );
        dateTo6 = new Date( 2017, 10, 12, 18, 15 );
        Vehicle VehicleLS = new Vehicle( cityL, cityS, dateFrom5, dateTo6, 29, 10 );
        dateFrom5 = new Date( 2017, 10, 12, 10, 15 );
        dateTo6 = new Date( 2017, 10, 13, 15, 15 );
        Vehicle VehicleLM = new Vehicle( cityL, cityM, dateFrom5, dateTo6, 10, 19 );

        Vehicles.add( VehicleLH );
        Vehicles.add( VehicleLD );
        Vehicles.add( VehicleLK );
        Vehicles.add( VehicleLO );
        Vehicles.add( VehicleLV );
        Vehicles.add( VehicleLKrim );
        Vehicles.add( VehicleLCarpati );
        Vehicles.add( VehicleLBerlin );
        Vehicles.add( VehicleLBudapesht );
        Vehicles.add( VehicleLCh );
        Vehicles.add( VehicleLChernovtsi );
        Vehicles.add( VehicleLMe );
        Vehicles.add( VehicleLKr );
        Vehicles.add( VehicleLU );
        Vehicles.add( VehicleLZh );
        Vehicles.add( VehicleLY );
        Vehicles.add( VehicleLP );
        Vehicles.add( VehicleLS );
        Vehicles.add( VehicleLM );

        Vehicle VehicleDL = new Vehicle( cityD, cityL, dateFrom5, dateTo6, 8, 123 );
        Vehicle VehicleDH = new Vehicle( cityD, cityH, dateFrom7, dateTo7, 25, 300 );
        Vehicle VehicleDK = new Vehicle( cityD, cityK, dateFrom5, dateTo5, 10, 200 );
        Vehicle VehicleDO = new Vehicle( cityD, cityO, dateFrom4, dateTo4, 27, 100 );
        dateFrom5 = new Date( 2017, 10, 7, 10, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 15 );
        Vehicle VehicleDV = new Vehicle( cityD, cityV, dateFrom5, dateTo6, 15, 1 );
        dateFrom5 = new Date( 2017, 10, 12, 10, 15 );
        dateTo6 = new Date( 2017, 10, 12, 19, 15 );
        Vehicle VehicleDKrim = new Vehicle( cityD, cityKrim, dateFrom5, dateTo6, 26, 20 );
        dateFrom5 = new Date( 2017, 10, 12, 10, 15 );
        dateTo6 = new Date( 2017, 10, 13, 15, 15 );
        Vehicle VehicleDCarpati = new Vehicle( cityD, cityCarpati, dateFrom5, dateTo6, 17, 230 );
        dateFrom5 = new Date( 2017, 10, 12, 5, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 15 );
        Vehicle VehicleDBerlin = new Vehicle( cityD, cityBerlin, dateFrom5, dateTo6, 13, 115 );
        dateFrom5 = new Date( 2017, 10, 12, 7, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 15 );
        Vehicle VehicleDBudapesht = new Vehicle( cityD, cityBudapesht, dateFrom5, dateTo6, 24, 234 );
        dateFrom5 = new Date( 2017, 10, 2, 10, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 15 );
        Vehicle VehicleDCh = new Vehicle( cityD, cityCh, dateFrom5, dateTo6, 30, 560 );
        dateFrom5 = new Date( 2017, 10, 12, 10, 15 );
        dateTo6 = new Date( 2017, 10, 12, 14, 15 );
        Vehicle VehicleDChernovtsi = new Vehicle( cityD, cityChernovtsi, dateFrom5, dateTo6, 15, 1200 );
        dateFrom5 = new Date( 2017, 10, 12, 10, 15 );
        dateTo6 = new Date( 2017, 10, 12, 10, 24 );
        Vehicle VehicleDMe = new Vehicle( cityD, cityMe, dateFrom5, dateTo6, 44, 8790 );
        dateFrom5 = new Date( 2017, 10, 12, 4, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 15 );
        Vehicle VehicleDKr = new Vehicle( cityD, cityKr, dateFrom5, dateTo6, 1, 120 );
        dateFrom5 = new Date( 2017, 10, 11, 9, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleDU = new Vehicle( cityD, cityU, dateFrom5, dateTo6, 7, 30 );
        dateFrom5 = new Date( 2017, 10, 11, 9, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleDZh = new Vehicle( cityD, cityZh, dateFrom5, dateTo6, 284, 304 );
        dateFrom5 = new Date( 2017, 10, 11, 9, 15 );
        dateTo6 = new Date( 2017, 10, 12, 17, 30 );
        Vehicle VehicleDY = new Vehicle( cityD, cityY, dateFrom5, dateTo6, 10, 60 );
        dateFrom5 = new Date( 2017, 10, 11, 9, 15 );
        dateTo6 = new Date( 2017, 10, 12, 18, 30 );
        Vehicle VehicleDP = new Vehicle( cityD, cityP, dateFrom5, dateTo6, 15, 400 );
        dateFrom5 = new Date( 2017, 10, 11, 7, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleDS = new Vehicle( cityD, cityS, dateFrom5, dateTo6, 29, 30 );
        dateFrom5 = new Date( 2017, 10, 11, 21, 15 );
        dateTo6 = new Date( 2017, 10, 12, 6, 30 );
        Vehicle VehicleDM = new Vehicle( cityD, cityM, dateFrom5, dateTo6, 10, 120 );

        Vehicles.add( VehicleDH );
        Vehicles.add( VehicleDL );
        Vehicles.add( VehicleDK );
        Vehicles.add( VehicleDO );
        Vehicles.add( VehicleDV );
        Vehicles.add( VehicleDKrim );
        Vehicles.add( VehicleDCarpati );
        Vehicles.add( VehicleDBerlin );
        Vehicles.add( VehicleDBudapesht );
        Vehicles.add( VehicleDCh );
        Vehicles.add( VehicleDChernovtsi );
        Vehicles.add( VehicleDMe );
        Vehicles.add( VehicleDKr );
        Vehicles.add( VehicleDU );
        Vehicles.add( VehicleDZh );
        Vehicles.add( VehicleDY );
        Vehicles.add( VehicleDP );
        Vehicles.add( VehicleDS );
        Vehicles.add( VehicleDM );

        dateFrom5 = new Date( 2017, 10, 11, 21, 15 );
        dateTo6 = new Date( 2017, 10, 12, 6, 30 );
        Vehicle VehicleVL = new Vehicle( cityV, cityL, dateFrom5, dateTo6, 8, 640 );
        Vehicle VehicleVH = new Vehicle( cityV, cityH, dateFrom7, dateTo7, 25, 390 );
        Vehicle VehicleVK = new Vehicle( cityV, cityK, dateFrom5, dateTo5, 10, 210 );
        Vehicle VehicleVO = new Vehicle( cityV, cityO, dateFrom4, dateTo4, 27, 750 );
        dateFrom5 = new Date( 2017, 10, 11, 21, 15 );
        dateTo6 = new Date( 2017, 10, 12, 4, 30 );
        Vehicle VehicleVD = new Vehicle( cityV, cityD, dateFrom5, dateTo6, 18, 700 );
        dateFrom5 = new Date( 2017, 10, 11, 23, 15 );
        dateTo6 = new Date( 2017, 10, 12, 4, 30 );
        Vehicle VehicleVKrim = new Vehicle( cityV, cityKrim, dateFrom5, dateTo6, 12, 800 );
        dateFrom5 = new Date( 2017, 10, 11, 21, 15 );
        dateTo6 = new Date( 2017, 10, 12, 7, 30 );
        Vehicle VehicleVCarpati = new Vehicle( cityV, cityCarpati, dateFrom5, dateTo6, 10, 1600 );
        dateFrom5 = new Date( 2017, 10, 11, 21, 15 );
        dateTo6 = new Date( 2017, 10, 13, 4, 30 );
        Vehicle VehicleVBerlin = new Vehicle( cityV, cityBerlin, dateFrom5, dateTo6, 17, 2100 );
        dateFrom5 = new Date( 2017, 10, 11, 21, 15 );
        dateTo6 = new Date( 2017, 10, 12, 5, 30 );
        Vehicle VehicleVBudapesht = new Vehicle( cityV, cityBudapesht, dateFrom5, dateTo6, 24, 65 );
        dateFrom5 = new Date( 2017, 10, 11, 22, 15 );
        dateTo6 = new Date( 2017, 10, 12, 4, 30 );
        Vehicle VehicleVCh = new Vehicle( cityV, cityCh, dateFrom5, dateTo6, 20, 34 );
        dateFrom5 = new Date( 2017, 10, 10, 21, 15 );
        dateTo6 = new Date( 2017, 10, 12, 6, 30 );
        Vehicle VehicleVChernovtsi = new Vehicle( cityV, cityChernovtsi, dateFrom5, dateTo6, 19, 98 );
        dateFrom5 = new Date( 2017, 10, 11, 21, 15 );
        dateTo6 = new Date( 2017, 10, 12, 7, 30 );
        Vehicle VehicleVMe = new Vehicle( cityV, cityMe, dateFrom5, dateTo6, 27, 123 );
        dateFrom5 = new Date( 2017, 10, 11, 21, 15 );
        dateTo6 = new Date( 2017, 10, 12, 10, 30 );
        Vehicle VehicleVKr = new Vehicle( cityV, cityKr, dateFrom5, dateTo6, 13, 132 );
        dateFrom5 = new Date( 2017, 10, 11, 21, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleVU = new Vehicle( cityV, cityU, dateFrom5, dateTo6, 15, 144 );
        dateFrom5 = new Date( 2017, 10, 11, 21, 15 );
        dateTo6 = new Date( 2017, 10, 12, 17, 30 );
        Vehicle VehicleVZh = new Vehicle( cityV, cityZh, dateFrom5, dateTo6, 11, 6050 );
        dateFrom5 = new Date( 2017, 10, 11, 21, 15 );
        dateTo6 = new Date( 2017, 10, 12, 2, 30 );
        Vehicle VehicleVY = new Vehicle( cityV, cityY, dateFrom5, dateTo6, 6, 309 );
        dateFrom5 = new Date( 2017, 10, 11, 21, 15 );
        dateTo6 = new Date( 2017, 10, 12, 21, 30 );
        Vehicle VehicleVP = new Vehicle( cityV, cityP, dateFrom5, dateTo6, 15, 345 );
        dateFrom5 = new Date( 2017, 10, 11, 21, 15 );
        dateTo6 = new Date( 2017, 10, 12, 3, 30 );
        Vehicle VehicleVS = new Vehicle( cityV, cityS, dateFrom5, dateTo6, 4, 19 );
        dateFrom5 = new Date( 2017, 10, 11, 21, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleVM = new Vehicle( cityV, cityM, dateFrom5, dateTo6, 18, 144 );


        Vehicles.add( VehicleVH );
        Vehicles.add( VehicleVL );
        Vehicles.add( VehicleVK );
        Vehicles.add( VehicleVO );
        Vehicles.add( VehicleVD );
        Vehicles.add( VehicleVKrim );
        Vehicles.add( VehicleVCarpati );
        Vehicles.add( VehicleVBerlin );
        Vehicles.add( VehicleVBudapesht );
        Vehicles.add( VehicleVCh );
        Vehicles.add( VehicleVChernovtsi );
        Vehicles.add( VehicleVMe );
        Vehicles.add( VehicleVKr );
        Vehicles.add( VehicleVU );
        Vehicles.add( VehicleVZh );
        Vehicles.add( VehicleVY );
        Vehicles.add( VehicleVP );
        Vehicles.add( VehicleVS );
        Vehicles.add( VehicleVM );

        dateFrom5 = new Date( 2017, 10, 11, 21, 15 );
        dateTo6 = new Date( 2017, 10, 12, 7, 30 );
        Vehicle VehicleUL = new Vehicle( cityU, cityL, dateFrom5, dateTo6, 8, 620 );
        Vehicle VehicleUH = new Vehicle( cityU, cityH, dateFrom5, dateTo6, 25, 350 );
        dateFrom5 = new Date( 2017, 10, 11, 21, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleUK = new Vehicle( cityU, cityK, dateFrom5, dateTo6, 10, 40 );
        Vehicle VehicleUO = new Vehicle( cityU, cityO, dateFrom4, dateTo4, 27, 85 );
        dateFrom5 = new Date( 2017, 10, 11, 21, 15 );
        dateTo6 = new Date( 2017, 10, 12, 4, 30 );
        Vehicle VehicleUD = new Vehicle( cityU, cityD, dateFrom5, dateTo6, 15, 34 );
        dateFrom5 = new Date( 2017, 10, 11, 18, 15 );
        dateTo6 = new Date( 2017, 10, 12, 4, 30 );
        Vehicle VehicleUKrim = new Vehicle( cityU, cityKrim, dateFrom5, dateTo6, 24, 1299 );
        dateFrom5 = new Date( 2017, 10, 11, 17, 15 );
        dateTo6 = new Date( 2017, 10, 12, 4, 30 );
        Vehicle VehicleUCarpati = new Vehicle( cityU, cityCarpati, dateFrom5, dateTo6, 10, 20 );
        Vehicle VehicleUBerlin = new Vehicle( cityU, cityBerlin, dateFrom5, dateTo6, 18, 220 );
        Vehicle VehicleUBudapesht = new Vehicle( cityU, cityBudapesht, dateFrom5, dateTo6, 34, 450 );
        Vehicle VehicleUCh = new Vehicle( cityU, cityCh, dateFrom5, dateTo6, 10, 114 );
        dateFrom5 = new Date( 2017, 10, 11, 21, 15 );
        dateTo6 = new Date( 2017, 10, 12, 8, 30 );
        Vehicle VehicleUChernovtsi = new Vehicle( cityU, cityChernovtsi, dateFrom5, dateTo6, 15, 123 );
        dateFrom5 = new Date( 2017, 10, 11, 22, 15 );
        dateTo6 = new Date( 2017, 10, 12, 4, 30 );
        Vehicle VehicleUMe = new Vehicle( cityU, cityMe, dateFrom5, dateTo6, 29, 100 );
        dateFrom5 = new Date( 2017, 10, 11, 21, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleUKr = new Vehicle( cityU, cityKr, dateFrom5, dateTo6, 10, 5600 );
        dateFrom5 = new Date( 2017, 10, 11, 22, 15 );
        dateTo6 = new Date( 2017, 10, 12, 4, 30 );
        Vehicle VehicleUV = new Vehicle( cityU, cityV, dateFrom5, dateTo6, 15, 700 );
        dateFrom5 = new Date( 2017, 10, 11, 21, 15 );
        dateTo6 = new Date( 2017, 10, 12, 14, 30 );
        Vehicle VehicleUZh = new Vehicle( cityU, cityZh, dateFrom5, dateTo6, 24, 600 );
        dateFrom5 = new Date( 2017, 10, 11, 21, 15 );
        dateTo6 = new Date( 2017, 10, 12, 13, 30 );
        Vehicle VehicleUY = new Vehicle( cityU, cityY, dateFrom5, dateTo6, 15, 600 );
        dateFrom5 = new Date( 2017, 10, 11, 23, 15 );
        dateTo6 = new Date( 2017, 10, 12, 4, 30 );
        Vehicle VehicleUP = new Vehicle( cityU, cityP, dateFrom5, dateTo6, 15, 700);
        dateFrom5 = new Date( 2017, 10, 11, 21, 15 );
        dateTo6 = new Date( 2017, 10, 12, 5, 30 );
        Vehicle VehicleUS = new Vehicle( cityU, cityS, dateFrom5, dateTo6, 29, 90 );
        dateFrom5 = new Date( 2017, 10, 11, 21, 15 );
        dateTo6 = new Date( 2017, 10, 12, 7, 30 );
        Vehicle VehicleUM = new Vehicle( cityU, cityM, dateFrom5, dateTo6, 31, 232 );

        Vehicles.add( VehicleUH );
        Vehicles.add( VehicleUL );
        Vehicles.add( VehicleUK );
        Vehicles.add( VehicleUO );
        Vehicles.add( VehicleUD );
        Vehicles.add( VehicleUKrim );
        Vehicles.add( VehicleUCarpati );
        Vehicles.add( VehicleUBerlin );
        Vehicles.add( VehicleUBudapesht );
        Vehicles.add( VehicleUCh );
        Vehicles.add( VehicleUChernovtsi );
        Vehicles.add( VehicleUMe );
        Vehicles.add( VehicleUKr );
        Vehicles.add( VehicleUV );
        Vehicles.add( VehicleUZh );
        Vehicles.add( VehicleUY );
        Vehicles.add( VehicleUP );
        Vehicles.add( VehicleUS );
        Vehicles.add( VehicleUM );

        dateFrom5 = new Date( 2017, 10, 11, 21, 15 );
        dateTo6 = new Date( 2017, 10, 12, 8, 30 );
        Vehicle VehicleZhL = new Vehicle( cityZh, cityL, dateFrom5, dateTo6, 5, 10 );
        dateFrom5 = new Date( 2017, 10, 11, 21, 15 );
        dateTo6 = new Date( 2017, 10, 12, 7, 30 );
        Vehicle VehicleZhH = new Vehicle( cityZh, cityH, dateFrom5, dateTo6, 5, 30 );
        Vehicle VehicleZhK = new Vehicle( cityZh, cityK, dateFrom5, dateTo5, 40, 2009 );
        dateFrom5 = new Date( 2017, 10, 11, 23, 15 );
        dateTo6 = new Date( 2017, 10, 12, 7, 30 );
        Vehicle VehicleZhO = new Vehicle( cityZh, cityO, dateFrom5, dateTo6, 27, 8560 );
        dateFrom5 = new Date( 2017, 10, 11, 21, 15 );
        dateTo6 = new Date( 2017, 10, 12, 9, 30 );
        Vehicle VehicleZhD = new Vehicle( cityZh, cityD, dateFrom5, dateTo6, 15, 90 );
        dateFrom5 = new Date( 2017, 10, 11, 21, 15 );
        dateTo6 = new Date( 2017, 10, 12, 7, 30 );
        Vehicle VehicleZhKrim = new Vehicle( cityZh, cityKrim, dateFrom5, dateTo6, 24, 17 );
        dateFrom5 = new Date( 2017, 10, 12, 1, 15 );
        dateTo6 = new Date( 2017, 10, 12, 7, 30 );
        Vehicle VehicleZhCarpati = new Vehicle( cityZh, cityCarpati, dateFrom5, dateTo6, 12, 60 );
        dateFrom5 = new Date( 2017, 10, 11, 21, 15 );
        dateTo6 = new Date( 2017, 10, 12, 23, 30 );
        Vehicle VehicleZhBerlin = new Vehicle( cityZh, cityBerlin, dateFrom5, dateTo6, 45, 300 );
        dateFrom5 = new Date( 2017, 10, 12, 2, 15 );
        dateTo6 = new Date( 2017, 10, 12, 7, 30 );
        Vehicle VehicleZhBudapesht = new Vehicle( cityZh, cityBudapesht, dateFrom5, dateTo6, 24, 400 );
        dateFrom5 = new Date( 2017, 10, 12, 1, 15 );
        dateTo6 = new Date( 2017, 10, 12, 7, 30 );
        Vehicle VehicleZhCh = new Vehicle( cityZh, cityCh, dateFrom5, dateTo6, 38, 210 );
        dateFrom5 = new Date( 2017, 10, 12, 21, 15 );
        dateTo6 = new Date( 2017, 10, 12, 23, 30 );
        Vehicle VehicleZhChernovtsi = new Vehicle( cityZh, cityChernovtsi, dateFrom5, dateTo6, 12, 700 );
        dateFrom5 = new Date( 2017, 10, 12, 21, 15 );
        dateTo6 = new Date( 2017, 10, 14, 23, 30 );
        Vehicle VehicleZhMe = new Vehicle( cityZh, cityMe, dateFrom5, dateTo6, 65, 900 );
        dateFrom5 = new Date( 2017, 10, 12, 21, 15 );
        dateTo6 = new Date( 2017, 10, 13, 12, 30 );
        Vehicle VehicleZhKr = new Vehicle( cityZh, cityKr, dateFrom5, dateTo6, 21, 102 );
        dateFrom5 = new Date( 2017, 10, 12, 21, 15 );
        dateTo6 = new Date( 2017, 10, 13, 1, 30 );
        Vehicle VehicleZhV = new Vehicle( cityZh, cityV, dateFrom5, dateTo6, 11, 2443 );
        dateFrom5 = new Date( 2017, 10, 12, 21, 15 );
        dateTo6 = new Date( 2017, 10, 13, 11, 30 );
        Vehicle VehicleZhU = new Vehicle( cityZh, cityU, dateFrom5, dateTo6, 23, 235 );
        dateFrom5 = new Date( 2017, 10, 12, 22, 15 );
        dateTo6 = new Date( 2017, 10, 13, 12, 30 );
        Vehicle VehicleZhY = new Vehicle( cityZh, cityY, dateFrom5, dateTo6, 44, 150 );
        dateFrom5 = new Date( 2017, 10, 12, 1, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleZhP = new Vehicle( cityZh, cityP, dateFrom5, dateTo6, 5, 170 );
        dateFrom5 = new Date( 2017, 10, 12, 21, 15 );
        dateTo6 = new Date( 2017, 10, 13, 22, 30 );
        Vehicle VehicleZhS = new Vehicle( cityZh, cityS, dateFrom5, dateTo6, 8, 300 );
        dateFrom5 = new Date( 2017, 10, 12, 5, 15 );
        dateTo6 = new Date( 2017, 10, 13, 12, 30 );
        Vehicle VehicleZhM = new Vehicle( cityZh, cityM, dateFrom5, dateTo6, 11, 600 );

        Vehicles.add( VehicleZhH );
        Vehicles.add( VehicleZhL );
        Vehicles.add( VehicleZhK );
        Vehicles.add( VehicleZhO );
        Vehicles.add( VehicleZhD );
        Vehicles.add( VehicleZhKrim );
        Vehicles.add( VehicleZhCarpati );
        Vehicles.add( VehicleZhBerlin );
        Vehicles.add( VehicleZhBudapesht );
        Vehicles.add( VehicleZhCh );
        Vehicles.add( VehicleZhChernovtsi );
        Vehicles.add( VehicleZhMe );
        Vehicles.add( VehicleZhKr );
        Vehicles.add( VehicleZhV );
        Vehicles.add( VehicleZhU );
        Vehicles.add( VehicleZhY );
        Vehicles.add( VehicleZhP );
        Vehicles.add( VehicleZhS );
        Vehicles.add( VehicleZhM );

        dateFrom5 = new Date( 2017, 10, 12, 4, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleBudapeshtL = new Vehicle( cityBudapesht, cityL, dateFrom5, dateTo6, 18, 120 );
        dateFrom5 = new Date( 2017, 10, 12, 7, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleBudapeshtH = new Vehicle( cityBudapesht, cityH, dateFrom5, dateTo6, 5, 500 );
        dateFrom5 = new Date( 2017, 10, 12, 4, 15 );
        dateTo6 = new Date( 2017, 10, 12, 13, 30 );
        Vehicle VehicleBudapeshtK = new Vehicle( cityBudapesht, cityK, dateFrom5, dateTo6, 1, 2077 );
        dateFrom5 = new Date( 2017, 10, 12, 10, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleBudapeshtO = new Vehicle( cityBudapesht, cityO, dateFrom5, dateTo6, 29, 820 );
        dateFrom5 = new Date( 2017, 10, 12, 10, 15 );
        dateTo6 = new Date( 2017, 10, 13, 12, 30 );
        Vehicle VehicleBudapeshtD = new Vehicle( cityBudapesht, cityD, dateFrom5, dateTo6, 25, 601 );
        dateFrom5 = new Date( 2017, 10, 12, 8, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleBudapeshtKrim = new Vehicle( cityBudapesht, cityKrim, dateFrom5, dateTo6, 28, 1600 );
        dateFrom5 = new Date( 2017, 10, 12, 10, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleBudapeshtCarpati = new Vehicle( cityBudapesht, cityCarpati, dateFrom5, dateTo6, 18, 300 );
        dateFrom5 = new Date( 2017, 10, 12, 4, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleBudapeshtBerlin = new Vehicle( cityBudapesht, cityBerlin, dateFrom5, dateTo6, 19, 500 );
        dateFrom5 = new Date( 2017, 10, 11, 4, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleBudapeshtZh = new Vehicle( cityBudapesht, cityZh, dateFrom5, dateTo6, 27, 450 );
        dateFrom5 = new Date( 2017, 10, 12, 4, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleBudapeshtCh = new Vehicle( cityBudapesht, cityCh, dateFrom5, dateTo6, 40, 60 );
        dateFrom5 = new Date( 2017, 10, 12, 4, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleBudapeshtChernovtsi = new Vehicle( cityBudapesht, cityChernovtsi, dateFrom5, dateTo6, 25, 200 );
        Vehicle VehicleBudapeshtMe = new Vehicle( cityBudapesht, cityMe, dateFrom5, dateTo6, 28, 20 );
        Vehicle VehicleBudapeshtKr = new Vehicle( cityBudapesht, cityKr, dateFrom5, dateTo6, 19, 80 );
        Vehicle VehicleBudapeshtV = new Vehicle( cityBudapesht, cityV, dateFrom5, dateTo6, 5, 903 );
        Vehicle VehicleBudapeshtU = new Vehicle( cityBudapesht, cityU, dateFrom5, dateTo6, 4, 134 );
        dateFrom5 = new Date( 2017, 10, 12, 11, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleBudapeshtY = new Vehicle( cityBudapesht, cityY, dateFrom5, dateTo6, 14, 150 );
        Vehicle VehicleBudapeshtP = new Vehicle( cityBudapesht, cityP, dateFrom5, dateTo6, 15, 230 );
        dateFrom5 = new Date( 2017, 10, 12, 6, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleBudapeshtS = new Vehicle( cityBudapesht, cityS, dateFrom5, dateTo6, 24, 1200 );
        dateFrom5 = new Date( 2017, 10, 12, 9, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleBudapeshtM = new Vehicle( cityBudapesht, cityM, dateFrom5, dateTo6, 11, 239 );

        Vehicles.add( VehicleBudapeshtH );
        Vehicles.add( VehicleBudapeshtL );
        Vehicles.add( VehicleBudapeshtK );
        Vehicles.add( VehicleBudapeshtO );
        Vehicles.add( VehicleBudapeshtD );
        Vehicles.add( VehicleBudapeshtKrim );
        Vehicles.add( VehicleBudapeshtCarpati );
        Vehicles.add( VehicleBudapeshtBerlin );
        Vehicles.add( VehicleBudapeshtU );
        Vehicles.add( VehicleBudapeshtCh );
        Vehicles.add( VehicleBudapeshtChernovtsi );
        Vehicles.add( VehicleBudapeshtMe );
        Vehicles.add( VehicleBudapeshtKr );
        Vehicles.add( VehicleBudapeshtV );
        Vehicles.add( VehicleBudapeshtZh );
        Vehicles.add( VehicleBudapeshtY );
        Vehicles.add( VehicleBudapeshtP );
        Vehicles.add( VehicleBudapeshtS );
        Vehicles.add( VehicleBudapeshtM );

        dateFrom5 = new Date( 2017, 10, 11, 10, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleSL = new Vehicle( cityS, cityL, dateFrom5, dateTo6, 10, 122 );
        dateFrom5 = new Date( 2017, 10, 11, 10, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleSH = new Vehicle( cityS, cityH, dateFrom5, dateTo6, 15, 3000 );
        Vehicle VehicleSK = new Vehicle( cityS, cityK, dateFrom5, dateTo6, 12, 124 );
        dateFrom5 = new Date( 2017, 10, 10, 10, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleSO = new Vehicle( cityS, cityO, dateFrom5, dateTo6, 31, 350 );
        dateFrom5 = new Date( 2017, 10, 11, 10, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleSD = new Vehicle( cityS, cityD, dateFrom5, dateTo6, 24, 660 );
        dateFrom5 = new Date( 2017, 10, 11, 4, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleSKrim = new Vehicle( cityS, cityKrim, dateFrom5, dateTo6, 24, 780 );
        dateFrom5 = new Date( 2017, 10, 11, 23, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleSCarpati = new Vehicle( cityS, cityCarpati, dateFrom5, dateTo6, 56, 100 );
        dateFrom5 = new Date( 2017, 10, 11, 22, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleSBerlin = new Vehicle( cityS, cityBerlin, dateFrom5, dateTo6, 45, 60 );
        dateFrom5 = new Date( 2017, 10, 11, 10, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleSBudapesht = new Vehicle( cityS, cityBudapesht, dateFrom5, dateTo6, 13, 400 );
        Vehicle VehicleSCh = new Vehicle( cityS, cityCh, dateFrom5, dateTo6, 89, 600 );
        dateFrom5 = new Date( 2017, 10, 11, 6, 15 );
        dateTo6 = new Date( 2017, 10, 12, 22, 30 );
        Vehicle VehicleSChernovtsi = new Vehicle( cityS, cityChernovtsi, dateFrom5, dateTo6, 23, 200 );
        dateFrom5 = new Date( 2017, 10, 10, 10, 15 );
        dateTo6 = new Date( 2017, 10, 12, 13, 30 );
        Vehicle VehicleSMe = new Vehicle( cityS, cityMe, dateFrom5, dateTo6, 12, 80 );
        dateFrom5 = new Date( 2017, 10, 11, 8, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleSKr = new Vehicle( cityS, cityKr, dateFrom5, dateTo6, 8, 60 );
        dateFrom5 = new Date( 2017, 10, 11, 10, 15 );
        dateTo6 = new Date( 2017, 10, 12, 11, 30 );
        Vehicle VehicleSV = new Vehicle( cityS, cityV, dateFrom5, dateTo6, 7, 120 );
        Vehicle VehicleSZh = new Vehicle( cityS, cityZh, dateFrom5, dateTo6, 1, 60 );
        dateFrom5 = new Date( 2017, 10, 11, 10, 15 );
        dateTo6 = new Date( 2017, 10, 12, 18, 30 );
        Vehicle VehicleSY = new Vehicle( cityS, cityY, dateFrom5, dateTo6, 34, 90 );
        dateFrom5 = new Date( 2017, 10, 11, 8, 15 );
        dateTo6 = new Date( 2017, 10, 12, 19, 30 );
        Vehicle VehicleSP = new Vehicle( cityS, cityP, dateFrom5, dateTo6, 15, 12 );
        dateFrom5 = new Date( 2017, 10, 12, 5, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleSU = new Vehicle( cityS, cityU, dateFrom5, dateTo6, 48, 1230 );
        Vehicle VehicleSM = new Vehicle( cityS, cityM, dateFrom5, dateTo6, 12, 6200 );


        Vehicles.add( VehicleSH );
        Vehicles.add( VehicleSL );
        Vehicles.add( VehicleSK );
        Vehicles.add( VehicleSO );
        Vehicles.add( VehicleSD );
        Vehicles.add( VehicleSKrim );
        Vehicles.add( VehicleSCarpati );
        Vehicles.add( VehicleSBerlin );
        Vehicles.add( VehicleSBudapesht );
        Vehicles.add( VehicleSCh );
        Vehicles.add( VehicleSChernovtsi );
        Vehicles.add( VehicleSMe );
        Vehicles.add( VehicleSKr );
        Vehicles.add( VehicleSV );
        Vehicles.add( VehicleSU );
        Vehicles.add( VehicleSY );
        Vehicles.add( VehicleSP );
        Vehicles.add( VehicleSZh );
        Vehicles.add( VehicleSM );

        dateFrom5 = new Date( 2017, 10, 12, 5, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleML = new Vehicle( cityM, cityL, dateFrom5, dateTo6, 23, 200 );
        dateFrom5 = new Date( 2017, 10, 12, 8, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleMH = new Vehicle( cityM, cityH, dateFrom5, dateTo6, 34, 330 );
        dateFrom5 = new Date( 2017, 10, 12, 5, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleMK = new Vehicle( cityM, cityK, dateFrom5, dateTo6, 34, 20 );
        dateFrom5 = new Date( 2017, 10, 12, 5, 15 );
        dateTo6 = new Date( 2017, 10, 13, 12, 30 );
        Vehicle VehicleMO = new Vehicle( cityM, cityO, dateFrom5, dateTo6, 2, 83 );
        dateFrom5 = new Date( 2017, 10, 12, 11, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleMD = new Vehicle( cityM, cityD, dateFrom5, dateTo6, 21, 64 );
        dateFrom5 = new Date( 2017, 10, 12, 5, 15 );
        dateTo6 = new Date( 2017, 10, 12, 21, 30 );
        Vehicle VehicleMKrim = new Vehicle( cityM, cityKrim, dateFrom5, dateTo6, 31, 6040 );
        dateFrom5 = new Date( 2017, 10, 12, 6, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleMCarpati = new Vehicle( cityM, cityCarpati, dateFrom5, dateTo6, 11, 1200 );
        dateFrom5 = new Date( 2017, 10, 12, 5, 15 );
        dateTo6 = new Date( 2017, 10, 12, 11, 58 );
        Vehicle VehicleMBerlin = new Vehicle( cityM, cityBerlin, dateFrom5, dateTo6, 19, 1300 );
        dateFrom5 = new Date( 2017, 10, 12, 5, 15 );
        dateTo6 = new Date( 2017, 10, 12, 16, 30 );
        Vehicle VehicleMBudapesht = new Vehicle( cityM, cityBudapesht, dateFrom5, dateTo6, 48, 660 );
        dateFrom5 = new Date( 2017, 10, 12, 5, 15 );
        dateTo6 = new Date( 2017, 10, 12, 11, 30 );
        Vehicle VehicleMCh = new Vehicle( cityM, cityCh, dateFrom5, dateTo6, 1, 760 );
        dateFrom5 = new Date( 2017, 10, 12, 9, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleMChernovtsi = new Vehicle( cityM, cityChernovtsi, dateFrom5, dateTo6, 1, 7800 );
        dateFrom5 = new Date( 2017, 10, 12, 2, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleMMe = new Vehicle( cityM, cityMe, dateFrom5, dateTo6, 2, 650 );
        dateFrom5 = new Date( 2017, 10, 10, 5, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleMKr = new Vehicle( cityM, cityKr, dateFrom5, dateTo6, 11, 120 );
        dateFrom5 = new Date( 2017, 10, 11, 5, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleMV = new Vehicle( cityM, cityV, dateFrom5, dateTo6, 10, 90 );
        dateFrom5 = new Date( 2017, 10, 11, 8, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleMZh = new Vehicle( cityM, cityZh, dateFrom5, dateTo6, 14, 70 );
        dateFrom5 = new Date( 2017, 10, 11, 21, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleMY = new Vehicle( cityM, cityY, dateFrom5, dateTo6, 16, 23 );
        Vehicle VehicleMP = new Vehicle( cityM, cityP, dateFrom5, dateTo6, 17, 5 );
        dateFrom5 = new Date( 2017, 10, 11, 21, 15 );
        dateTo6 = new Date( 2017, 10, 12, 3, 30 );
        Vehicle VehicleMU = new Vehicle( cityM, cityU, dateFrom5, dateTo6, 28, 12 );
        dateFrom5 = new Date( 2017, 10, 11, 21, 15 );
        dateTo6 = new Date( 2017, 10, 12, 5, 30 );
        Vehicle VehicleMS = new Vehicle( cityM, cityS, dateFrom5, dateTo6, 19, 322 );


        Vehicles.add( VehicleMH );
        Vehicles.add( VehicleML );
        Vehicles.add( VehicleMK );
        Vehicles.add( VehicleMO );
        Vehicles.add( VehicleMD );
        Vehicles.add( VehicleMKrim );
        Vehicles.add( VehicleMCarpati );
        Vehicles.add( VehicleMBerlin );
        Vehicles.add( VehicleMBudapesht );
        Vehicles.add( VehicleMCh );
        Vehicles.add( VehicleMChernovtsi );
        Vehicles.add( VehicleMMe );
        Vehicles.add( VehicleMKr );
        Vehicles.add( VehicleMV );
        Vehicles.add( VehicleMU );
        Vehicles.add( VehicleMY );
        Vehicles.add( VehicleMP );
        Vehicles.add( VehicleMZh );
        Vehicles.add( VehicleMS );

        dateFrom5 = new Date( 2017, 10, 11, 10, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleYL = new Vehicle( cityY, cityL, dateFrom5, dateTo6, 28, 2123 );
        dateFrom5 = new Date( 2017, 10, 11, 5, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleYH = new Vehicle( cityY, cityH, dateFrom5, dateTo6, 21, 34 );
        dateFrom5 = new Date( 2017, 10, 11, 10, 15 );
        dateTo6 = new Date( 2017, 10, 12, 19, 30 );
        Vehicle VehicleYK = new Vehicle( cityY, cityK, dateFrom5, dateTo6, 20, 467 );
        dateFrom5 = new Date( 2017, 10, 12, 7, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleYO = new Vehicle( cityY, cityO, dateFrom5, dateTo6, 26, 45 );
        dateFrom5 = new Date( 2017, 10, 11, 10, 15 );
        dateTo6 = new Date( 2017, 10, 12, 14, 30 );
        Vehicle VehicleYD = new Vehicle( cityY, cityD, dateFrom5, dateTo6, 5, 234 );
        dateFrom5 = new Date( 2017, 10, 12, 21, 15 );
        dateTo6 = new Date( 2017, 10, 12, 24, 30 );
        Vehicle VehicleYKrim = new Vehicle( cityY, cityKrim, dateFrom5, dateTo6, 2, 13 );
        dateFrom5 = new Date( 2017, 10, 12, 4, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleYCarpati = new Vehicle( cityY, cityCarpati, dateFrom5, dateTo6, 14, 67 );
        dateFrom5 = new Date( 2017, 10, 12, 4, 15 );
        dateTo6 = new Date( 2017, 10, 12, 22, 30 );
        Vehicle VehicleYBerlin = new Vehicle( cityY, cityBerlin, dateFrom5, dateTo6, 17, 565 );
        dateFrom5 = new Date( 2017, 10, 12, 4, 15 );
        dateTo6 = new Date( 2017, 10, 12, 23, 30 );
        Vehicle VehicleYBudapesht = new Vehicle( cityY, cityBudapesht, dateFrom5, dateTo6, 22, 2435 );
        dateFrom5 = new Date( 2017, 10, 12, 4, 15 );
        dateTo6 = new Date( 2017, 10, 12, 10, 30 );
        Vehicle VehicleYCh = new Vehicle( cityY, cityCh, dateFrom5, dateTo6, 12, 243 );
        dateFrom5 = new Date( 2017, 10, 12, 4, 15 );
        dateTo6 = new Date( 2017, 10, 12, 18, 30 );
        Vehicle VehicleYChernovtsi = new Vehicle( cityY, cityChernovtsi, dateFrom5, dateTo6, 27, 6 );
        dateFrom5 = new Date( 2017, 10, 12, 4, 15 );
        dateTo6 = new Date( 2017, 10, 12, 20, 30 );
        Vehicle VehicleYMe = new Vehicle( cityY, cityMe, dateFrom5, dateTo6, 12, 125 );
        dateFrom5 = new Date( 2017, 10, 12, 8, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleYKr = new Vehicle( cityY, cityKr, dateFrom5, dateTo6, 17, 7 );

        dateFrom5 = new Date( 2017, 10, 12, 10, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleYV = new Vehicle( cityY, cityV, dateFrom5, dateTo6, 45, 1425 );
        dateFrom5 = new Date( 2017, 10, 11, 4, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleYZh = new Vehicle( cityY, cityZh, dateFrom5, dateTo6, 78, 2435 );
        dateFrom5 = new Date( 2017, 10, 11, 4, 15 );
        dateTo6 = new Date( 2017, 10, 12, 22, 30 );
        Vehicle VehicleYM = new Vehicle( cityY, cityM, dateFrom5, dateTo6, 14, 13 );
        dateFrom5 = new Date( 2017, 10, 11, 4, 15 );
        dateTo6 = new Date( 2017, 10, 12, 2, 30 );
        Vehicle VehicleYP = new Vehicle( cityY, cityP, dateFrom5, dateTo6, 5, 346 );
        dateFrom5 = new Date( 2017, 10, 12, 4, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleYU = new Vehicle( cityY, cityU, dateFrom5, dateTo6, 34, 46 );
        dateFrom5 = new Date( 2017, 10, 12, 4, 15 );
        dateTo6 = new Date( 2017, 10, 12, 5, 30 );
        Vehicle VehicleYS = new Vehicle( cityY, cityS, dateFrom5, dateTo6, 14, 234 );


        Vehicles.add( VehicleYH );
        Vehicles.add( VehicleYL );
        Vehicles.add( VehicleYK );
        Vehicles.add( VehicleYO );
        Vehicles.add( VehicleYD );
        Vehicles.add( VehicleYKrim );
        Vehicles.add( VehicleYCarpati );
        Vehicles.add( VehicleYBerlin );
        Vehicles.add( VehicleYBudapesht );
        Vehicles.add( VehicleYCh );
        Vehicles.add( VehicleYChernovtsi );
        Vehicles.add( VehicleYMe );
        Vehicles.add( VehicleYKr );
        Vehicles.add( VehicleYV );
        Vehicles.add( VehicleYU );
        Vehicles.add( VehicleYM );
        Vehicles.add( VehicleYP );
        Vehicles.add( VehicleYZh );
        Vehicles.add( VehicleYS );

        dateFrom5 = new Date( 2017, 10, 12, 8, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehiclePL = new Vehicle( cityP, cityL, dateFrom5, dateTo6, 21, 15 );
        dateFrom5 = new Date( 2017, 10, 12, 4, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehiclePH = new Vehicle( cityP, cityH, dateFrom5, dateTo6, 13, 3245 );
        dateFrom5 = new Date( 2017, 10, 12, 9, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehiclePK = new Vehicle( cityP, cityK, dateFrom5, dateTo6, 3, 200 );
        dateFrom5 = new Date( 2017, 10, 12, 8, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehiclePO = new Vehicle( cityP, cityO, dateFrom5, dateTo6, 45, 67 );
        dateFrom5 = new Date( 2017, 10, 12, 4, 15 );
        dateTo6 = new Date( 2017, 10, 12, 22, 30 );
        Vehicle VehiclePD = new Vehicle( cityP, cityD, dateFrom5, dateTo6, 12, 235 );
        dateFrom5 = new Date( 2017, 10, 11, 4, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehiclePKrim = new Vehicle( cityP, cityKrim, dateFrom5, dateTo6, 23, 600 );
        dateFrom5 = new Date( 2017, 10, 12, 4, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 44 );
        Vehicle VehiclePCarpati = new Vehicle( cityP, cityCarpati, dateFrom5, dateTo6, 10, 34 );
        dateFrom5 = new Date( 2017, 10, 12, 11, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehiclePBerlin = new Vehicle( cityP, cityBerlin, dateFrom5, dateTo6, 15, 678 );
        dateFrom5 = new Date( 2017, 10, 12, 4, 15 );
        dateTo6 = new Date( 2017, 10, 12, 14, 30 );
        Vehicle VehiclePBudapesht = new Vehicle( cityP, cityBudapesht, dateFrom5, dateTo6, 44, 46 );
        dateFrom5 = new Date( 2017, 10, 11, 21, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehiclePCh = new Vehicle( cityP, cityCh, dateFrom5, dateTo6, 67, 876 );
        dateFrom5 = new Date( 2017, 10, 11, 22, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehiclePChernovtsi = new Vehicle( cityP, cityChernovtsi, dateFrom5, dateTo6, 5, 134 );
        dateFrom5 = new Date( 2017, 10, 11, 4, 15 );
        dateTo6 = new Date( 2017, 10, 12, 4, 30 );
        Vehicle VehiclePMe = new Vehicle( cityP, cityMe, dateFrom5, dateTo6, 8, 85 );
        dateFrom5 = new Date( 2017, 10, 12, 4, 15 );
        dateTo6 = new Date( 2017, 10, 12, 23, 30 );
        Vehicle VehiclePKr = new Vehicle( cityP, cityKr, dateFrom5, dateTo6, 12, 34 );
        dateFrom5 = new Date( 2017, 10, 12, 4, 15 );
        dateTo6 = new Date( 2017, 10, 12, 8, 30 );
        Vehicle VehiclePV = new Vehicle( cityP, cityV, dateFrom5, dateTo6, 7, 875 );
        dateFrom5 = new Date( 2017, 10, 12, 4, 15 );
        dateTo6 = new Date( 2017, 10, 12, 7, 30 );
        Vehicle VehiclePZh = new Vehicle( cityP, cityZh, dateFrom5, dateTo6, 24, 234 );
        dateFrom5 = new Date( 2017, 10, 12, 4, 15 );
        dateTo6 = new Date( 2017, 10, 12, 5, 30 );
        Vehicle VehiclePM = new Vehicle( cityP, cityM, dateFrom5, dateTo6, 10, 875 );
        dateFrom5 = new Date( 2017, 10, 12, 4, 15 );
        dateTo6 = new Date( 2017, 10, 12, 4, 30 );
        Vehicle VehiclePY = new Vehicle( cityP, cityY, dateFrom5, dateTo6, 14, 523 );
        dateFrom5 = new Date( 2017, 10, 12, 4, 15 );
        dateTo6 = new Date( 2017, 10, 12, 11, 30 );
        Vehicle VehiclePU = new Vehicle( cityP, cityU, dateFrom5, dateTo6, 24, 23 );
        dateFrom5 = new Date( 2017, 10, 12, 4, 15 );
        dateTo6 = new Date( 2017, 10, 12, 13, 30 );
        Vehicle VehiclePS = new Vehicle( cityP, cityS, dateFrom5, dateTo6, 45, 665 );


        Vehicles.add( VehiclePH );
        Vehicles.add( VehiclePL );
        Vehicles.add( VehiclePK );
        Vehicles.add( VehiclePO );
        Vehicles.add( VehiclePD );
        Vehicles.add( VehiclePKrim );
        Vehicles.add( VehiclePCarpati );
        Vehicles.add( VehiclePBerlin );
        Vehicles.add( VehiclePBudapesht );
        Vehicles.add( VehiclePCh );
        Vehicles.add( VehiclePChernovtsi );
        Vehicles.add( VehiclePMe );
        Vehicles.add( VehiclePKr );
        Vehicles.add( VehiclePV );
        Vehicles.add( VehiclePU );
        Vehicles.add( VehiclePM );
        Vehicles.add( VehiclePY );
        Vehicles.add( VehiclePZh );
        Vehicles.add( VehiclePS );

        dateFrom5 = new Date( 2017, 10, 11, 14, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleChernovtsiL = new Vehicle( cityChernovtsi, cityL, dateFrom5, dateTo6, 41, 24 );
        dateFrom5 = new Date( 2017, 10, 11, 14, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleChernovtsiH = new Vehicle( cityChernovtsi, cityH, dateFrom5, dateTo6, 14, 23 );
        dateFrom5 = new Date( 2017, 10, 11, 23, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleChernovtsiK = new Vehicle( cityChernovtsi, cityK, dateFrom5, dateTo6, 6, 2453 );
        dateFrom5 = new Date( 2017, 10, 11, 21, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleChernovtsiO = new Vehicle( cityChernovtsi, cityO, dateFrom5, dateTo6, 4, 850 );
        dateFrom5 = new Date( 2017, 10, 11, 20, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleChernovtsiD = new Vehicle( cityChernovtsi, cityD, dateFrom5, dateTo6, 13, 2354 );
        dateFrom5 = new Date( 2017, 10, 11, 14, 15 );
        dateTo6 = new Date( 2017, 10, 12, 1, 30 );
        Vehicle VehicleChernovtsiKrim = new Vehicle( cityChernovtsi, cityKrim, dateFrom5, dateTo6, 45, 123 );
        dateFrom5 = new Date( 2017, 10, 11, 14, 15 );
        dateTo6 = new Date( 2017, 10, 12, 5, 30 );
        Vehicle VehicleChernovtsiCarpati = new Vehicle( cityChernovtsi, cityCarpati, dateFrom5, dateTo6, 18, 135 );
        dateFrom5 = new Date( 2017, 10, 11, 14, 15 );
        dateTo6 = new Date( 2017, 10, 12, 17, 30 );
        Vehicle VehicleChernovtsiBerlin = new Vehicle( cityChernovtsi, cityBerlin, dateFrom5, dateTo6, 19, 198 );
        dateFrom5 = new Date( 2017, 10, 12, 14, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleChernovtsiBudapesht = new Vehicle( cityChernovtsi, cityBudapesht, dateFrom5, dateTo6, 24, 187 );
        Vehicle VehicleChernovtsiCh = new Vehicle( cityChernovtsi, cityCh, dateFrom5, dateTo6, 4, 1234 );
        Vehicle VehicleChernovtsiP = new Vehicle( cityChernovtsi, cityP, dateFrom5, dateTo6, 3, 76 );
        dateFrom5 = new Date( 2017, 10, 12, 14, 15 );
        dateTo6 = new Date( 2017, 10, 12, 18, 30 );
        Vehicle VehicleChernovtsiMe = new Vehicle( cityChernovtsi, cityMe, dateFrom5, dateTo6, 24, 455 );
        dateFrom5 = new Date( 2017, 10, 12, 14, 15 );
        dateTo6 = new Date( 2017, 10, 12, 21, 30 );
        Vehicle VehicleChernovtsiKr = new Vehicle( cityChernovtsi, cityKr, dateFrom5, dateTo6, 10, 787 );
        Vehicle VehicleChernovtsiV = new Vehicle( cityChernovtsi, cityV, dateFrom5, dateTo6, 7, 456 );
        dateFrom5 = new Date( 2017, 10, 12, 10, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleChernovtsiZh = new Vehicle( cityChernovtsi, cityZh, dateFrom5, dateTo6, 24, 876 );
        dateFrom5 = new Date( 2017, 10, 11, 14, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleChernovtsiM = new Vehicle( cityChernovtsi, cityM, dateFrom5, dateTo6, 34, 250 );
        dateFrom5 = new Date( 2017, 10, 11, 10, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleChernovtsiY = new Vehicle( cityChernovtsi, cityY, dateFrom5, dateTo6, 78, 234 );
        dateFrom5 = new Date( 2017, 10, 12, 4, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleChernovtsiU = new Vehicle( cityChernovtsi, cityU, dateFrom5, dateTo6, 4, 394 );
        dateFrom5 = new Date( 2017, 10, 11, 3, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleChernovtsiS = new Vehicle( cityChernovtsi, cityS, dateFrom5, dateTo6, 15, 495 );

        Vehicles.add( VehicleChernovtsiH );
        Vehicles.add( VehicleChernovtsiL );
        Vehicles.add( VehicleChernovtsiK );
        Vehicles.add( VehicleChernovtsiO );
        Vehicles.add( VehicleChernovtsiD );
        Vehicles.add( VehicleChernovtsiKrim );
        Vehicles.add( VehicleChernovtsiCarpati );
        Vehicles.add( VehicleChernovtsiBerlin );
        Vehicles.add( VehicleChernovtsiBudapesht );
        Vehicles.add( VehicleChernovtsiCh );
        Vehicles.add( VehicleChernovtsiP );
        Vehicles.add( VehicleChernovtsiMe );
        Vehicles.add( VehicleChernovtsiKr );
        Vehicles.add( VehicleChernovtsiV );
        Vehicles.add( VehicleChernovtsiU );
        Vehicles.add( VehicleChernovtsiM );
        Vehicles.add( VehicleChernovtsiY );
        Vehicles.add( VehicleChernovtsiZh );
        Vehicles.add( VehicleChernovtsiS );

        dateFrom5 = new Date( 2017, 10, 12, 14, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleChL = new Vehicle( cityCh, cityL, dateFrom5, dateTo6, 31, 109 );
        dateFrom5 = new Date( 2017, 10, 12, 10, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleChH = new Vehicle( cityCh, cityH, dateFrom5, dateTo6, 25, 100 );
        dateFrom5 = new Date( 2017, 10, 12, 14, 15 );
        dateTo6 = new Date( 2017, 10, 12, 21, 30 );
        Vehicle VehicleChK = new Vehicle( cityCh, cityK, dateFrom5, dateTo6, 8, 200 );
        dateFrom5 = new Date( 2017, 10, 12, 14, 15 );
        dateTo6 = new Date( 2017, 10, 12, 22, 30 );
        Vehicle VehicleChO = new Vehicle( cityCh, cityO, dateFrom5, dateTo6, 27, 234 );
        Vehicle VehicleChD = new Vehicle( cityCh, cityD, dateFrom5, dateTo6, 9, 678 );
        dateFrom5 = new Date( 2017, 10, 12, 14, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleChKrim = new Vehicle( cityCh, cityKrim, dateFrom5, dateTo6, 24, 610 );
        Vehicle VehicleChCarpati = new Vehicle( cityCh, cityCarpati, dateFrom5, dateTo6, 10, 6200 );
        Vehicle VehicleChBerlin = new Vehicle( cityCh, cityBerlin, dateFrom5, dateTo6, 43, 670 );
        dateFrom5 = new Date( 2017, 10, 12, 7, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleChBudapesht = new Vehicle( cityCh, cityBudapesht, dateFrom5, dateTo6, 24, 607 );
        dateFrom5 = new Date( 2017, 10, 12, 8, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleChY = new Vehicle( cityCh, cityY, dateFrom5, dateTo6, 56, 500 );
        Vehicle VehicleChChernovtsi = new Vehicle( cityCh, cityChernovtsi, dateFrom5, dateTo6, 15, 6010 );
        Vehicle VehicleChMe = new Vehicle( cityCh, cityMe, dateFrom5, dateTo6, 28, 145 );
        dateFrom5 = new Date( 2017, 10, 11, 21, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleChKr = new Vehicle( cityCh, cityKr, dateFrom5, dateTo6, 10, 12 );
        Vehicle VehicleChV = new Vehicle( cityCh, cityV, dateFrom5, dateTo6, 17, 987 );
        dateFrom5 = new Date( 2017, 10, 11, 23, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleChZh = new Vehicle( cityCh, cityZh, dateFrom5, dateTo6, 24, 34 );
        Vehicle VehicleChM = new Vehicle( cityCh, cityM, dateFrom5, dateTo6, 12, 757 );
        dateFrom5 = new Date( 2017, 10, 11, 22, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleChP = new Vehicle( cityCh, cityP, dateFrom5, dateTo6, 15, 2345 );
        dateFrom5 = new Date( 2017, 10, 11, 23, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleChU = new Vehicle( cityCh, cityU, dateFrom5, dateTo6, 15, 23 );
        dateFrom5 = new Date( 2017, 10, 10, 21, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleChS = new Vehicle( cityCh, cityS, dateFrom5, dateTo6, 18, 75 );

        Vehicles.add( VehicleChH );
        Vehicles.add( VehicleChL );
        Vehicles.add( VehicleChK );
        Vehicles.add( VehicleChO );
        Vehicles.add( VehicleChD );
        Vehicles.add( VehicleChKrim );
        Vehicles.add( VehicleChCarpati );
        Vehicles.add( VehicleChBerlin );
        Vehicles.add( VehicleChBudapesht );
        Vehicles.add( VehicleChP );
        Vehicles.add( VehicleChChernovtsi );
        Vehicles.add( VehicleChMe );
        Vehicles.add( VehicleChKr );
        Vehicles.add( VehicleChV );
        Vehicles.add( VehicleChU );
        Vehicles.add( VehicleChM );
        Vehicles.add( VehicleChY );
        Vehicles.add( VehicleChZh );
        Vehicles.add( VehicleChS );

        dateFrom5 = new Date( 2017, 10, 12, 6, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleMeL = new Vehicle( cityMe, cityL, dateFrom5, dateTo6, 8, 124 );
        dateFrom5 = new Date( 2017, 10, 12, 13, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleMeH = new Vehicle( cityMe, cityH, dateFrom5, dateTo6, 25, 765 );
        dateFrom5 = new Date( 2017, 10, 12, 8, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleMeK = new Vehicle( cityMe, cityK, dateFrom5, dateTo6, 10, 200 );
        dateFrom5 = new Date( 2017, 10, 12, 14, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleMeO = new Vehicle( cityMe, cityO, dateFrom5, dateTo6, 13, 453 );
        Vehicle VehicleMeD = new Vehicle( cityMe, cityD, dateFrom5, dateTo6, 15, 3450 );
        Vehicle VehicleMeKrim = new Vehicle( cityMe, cityKrim, dateFrom5, dateTo6, 15, 560 );
        dateFrom5 = new Date( 2017, 10, 12, 14, 15 );
        dateTo6 = new Date( 2017, 10, 12, 22, 30 );
        Vehicle VehicleMeCarpati = new Vehicle( cityMe, cityCarpati, dateFrom5, dateTo6, 16, 235 );
        Vehicle VehicleMeBerlin = new Vehicle( cityMe, cityBerlin, dateFrom5, dateTo6, 18, 876 );
        dateFrom5 = new Date( 2017, 10, 12, 1, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleMeBudapesht = new Vehicle( cityMe, cityBudapesht, dateFrom5, dateTo6, 44, 23 );
        dateFrom5 = new Date( 2017, 10, 12, 14, 15 );
        dateTo6 = new Date( 2017, 10, 12, 14, 30 );
        Vehicle VehicleMeCh = new Vehicle( cityMe, cityCh, dateFrom5, dateTo6, 98, 7690 );
        dateFrom5 = new Date( 2017, 10, 12, 14, 15 );
        dateTo6 = new Date( 2017, 10, 12, 19, 30 );
        Vehicle VehicleMeChernovtsi = new Vehicle( cityMe, cityChernovtsi, dateFrom5, dateTo6, 11, 400 );
        dateFrom5 = new Date( 2017, 10, 11, 14, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleMeY = new Vehicle( cityMe, cityY, dateFrom5, dateTo6, 11, 560 );
        dateFrom5 = new Date( 2017, 10, 11, 20, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleMeKr = new Vehicle( cityMe, cityKr, dateFrom5, dateTo6, 45, 680 );
        Vehicle VehicleMeV = new Vehicle( cityMe, cityV, dateFrom5, dateTo6, 54, 700 );
        Vehicle VehicleMeZh = new Vehicle( cityMe, cityZh, dateFrom5, dateTo6, 87, 300 );
        Vehicle VehicleMeM = new Vehicle( cityMe, cityM, dateFrom5, dateTo6, 1, 60 );
        dateFrom5 = new Date( 2017, 10, 11, 23, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleMeP = new Vehicle( cityMe, cityP, dateFrom5, dateTo6, 15, 500 );
        dateFrom5 = new Date( 2017, 10, 11, 21, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleMeU = new Vehicle( cityMe, cityU, dateFrom5, dateTo6, 4, 400 );
        dateFrom5 = new Date( 2017, 10, 11, 22, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleMeS = new Vehicle( cityMe, cityS, dateFrom5, dateTo6, 14, 600 );


        Vehicles.add( VehicleMeH );
        Vehicles.add( VehicleMeL );
        Vehicles.add( VehicleMeK );
        Vehicles.add( VehicleMeO );
        Vehicles.add( VehicleMeD );
        Vehicles.add( VehicleMeKrim );
        Vehicles.add( VehicleMeCarpati );
        Vehicles.add( VehicleMeBerlin );
        Vehicles.add( VehicleMeBudapesht );
        Vehicles.add( VehicleMeCh );
        Vehicles.add( VehicleMeChernovtsi );
        Vehicles.add( VehicleMeP );
        Vehicles.add( VehicleMeKr );
        Vehicles.add( VehicleMeV );
        Vehicles.add( VehicleMeU );
        Vehicles.add( VehicleMeM );
        Vehicles.add( VehicleMeY );
        Vehicles.add( VehicleMeZh );
        Vehicles.add( VehicleMeS );


        dateFrom5 = new Date( 2017, 10, 11, 22, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleKrimL = new Vehicle( cityKrim, cityL, dateFrom5, dateTo6, 15, 670 );
        dateFrom5 = new Date( 2017, 10, 12, 2, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleKrimH = new Vehicle( cityKrim, cityH, dateFrom5, dateTo6, 56, 340 );
        dateFrom5 = new Date( 2017, 10, 11, 23, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleKrimK = new Vehicle( cityKrim, cityK, dateFrom5, dateTo5, 34, 1240 );
        dateFrom5 = new Date( 2017, 10, 12, 1, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleKrimO = new Vehicle( cityKrim, cityO, dateFrom5, dateTo6, 7, 8350 );
        dateFrom5 = new Date( 2017, 10, 12, 1, 15 );
        dateTo6 = new Date( 2017, 10, 12, 19, 30 );
        Vehicle VehicleKrimD = new Vehicle( cityKrim, cityD, dateFrom5, dateTo6, 4, 60 );
        dateFrom5 = new Date( 2017, 10, 12, 15, 15 );
        dateTo6 = new Date( 2017, 10, 12, 23, 30 );
        Vehicle VehicleKrimY = new Vehicle( cityKrim, cityY, dateFrom5, dateTo6, 1, 400 );
        dateFrom5 = new Date( 2017, 10, 12, 1, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleKrimCarpati = new Vehicle( cityKrim, cityCarpati, dateFrom5, dateTo6, 23, 600 );
        dateFrom5 = new Date( 2017, 10, 12, 12, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleKrimBerlin = new Vehicle( cityKrim, cityBerlin, dateFrom5, dateTo6, 56, 280 );
        Vehicle VehicleKrimBudapesht = new Vehicle( cityKrim, cityBudapesht, dateFrom5, dateTo6, 21, 60 );
        Vehicle VehicleKrimCh = new Vehicle( cityKrim, cityCh, dateFrom5, dateTo6, 89, 640 );
        dateFrom5 = new Date( 2017, 10, 12, 10, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleKrimChernovtsi = new Vehicle( cityKrim, cityChernovtsi, dateFrom5, dateTo6, 11, 120 );
        dateFrom5 = new Date( 2017, 10, 12, 7, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleKrimMe = new Vehicle( cityKrim, cityMe, dateFrom5, dateTo6, 1, 120 );
        dateFrom5 = new Date( 2017, 10, 10, 1, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleKrimKr = new Vehicle( cityKrim, cityKr, dateFrom5, dateTo6, 6, 170 );
        Vehicle VehicleKrimV = new Vehicle( cityKrim, cityV, dateFrom5, dateTo6, 9, 180);
        dateFrom5 = new Date( 2017, 10, 11, 1, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleKrimZh = new Vehicle( cityKrim, cityZh, dateFrom5, dateTo6, 23, 149 );
        dateFrom5 = new Date( 2017, 10, 12, 12, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleKrimM = new Vehicle( cityKrim, cityM, dateFrom5, dateTo6, 16, 125 );
        dateFrom5 = new Date( 2017, 10, 12, 14, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleKrimP = new Vehicle( cityKrim, cityP, dateFrom5, dateTo6, 6, 187 );
        dateFrom5 = new Date( 2017, 10, 11, 1, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleKrimU = new Vehicle( cityKrim, cityU, dateFrom5, dateTo6, 16, 268 );
        dateFrom5 = new Date( 2017, 10, 11, 13, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleKrimS = new Vehicle( cityKrim, cityS, dateFrom5, dateTo6, 78, 594 );


        Vehicles.add( VehicleKrimH );
        Vehicles.add( VehicleKrimL );
        Vehicles.add( VehicleKrimK );
        Vehicles.add( VehicleKrimO );
        Vehicles.add( VehicleKrimD );
        Vehicles.add( VehicleKrimP );
        Vehicles.add( VehicleKrimCarpati );
        Vehicles.add( VehicleKrimBerlin );
        Vehicles.add( VehicleKrimBudapesht );
        Vehicles.add( VehicleKrimCh );
        Vehicles.add( VehicleKrimChernovtsi );
        Vehicles.add( VehicleKrimMe );
        Vehicles.add( VehicleKrimKr );
        Vehicles.add( VehicleKrimV );
        Vehicles.add( VehicleKrimU );
        Vehicles.add( VehicleKrimM );
        Vehicles.add( VehicleKrimY );
        Vehicles.add( VehicleKrimZh );
        Vehicles.add( VehicleKrimS );


        dateFrom5 = new Date( 2017, 10, 11, 1, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleBerlinL = new Vehicle( cityBerlin, cityL, dateFrom5, dateTo6, 11, 494 );
        dateFrom5 = new Date( 2017, 10, 11, 12, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleBerlinH = new Vehicle( cityBerlin, cityH, dateFrom5, dateTo6, 13, 496 );
        dateFrom5 = new Date( 2017, 10, 11, 8, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleBerlinK = new Vehicle( cityBerlin, cityK, dateFrom5, dateTo6, 15, 145 );
        dateFrom5 = new Date( 2017, 10, 12, 3, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleBerlinO = new Vehicle( cityBerlin, cityO, dateFrom5, dateTo6, 17, 147 );
        dateFrom5 = new Date( 2017, 10, 12, 9, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleBerlinD = new Vehicle( cityBerlin, cityD, dateFrom5, dateTo6, 29, 157 );
        dateFrom5 = new Date( 2017, 10, 11, 1, 15 );
        dateTo6 = new Date( 2017, 10, 12, 21, 30 );
        Vehicle VehicleBerlinKrim = new Vehicle( cityBerlin, cityKrim, dateFrom5, dateTo6, 10, 1000 );
        dateFrom5 = new Date( 2017, 10, 11, 21, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleBerlinCarpati = new Vehicle( cityBerlin, cityCarpati, dateFrom5, dateTo6, 43, 600 );
        dateFrom5 = new Date( 2017, 10, 11, 22, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleBerlinY = new Vehicle( cityBerlin, cityY, dateFrom5, dateTo6, 18, 600 );
        Vehicle VehicleBerlinBudapesht = new Vehicle( cityBerlin, cityBudapesht, dateFrom5, dateTo6, 17, 1245 );
        Vehicle VehicleBerlinCh = new Vehicle( cityBerlin, cityCh, dateFrom5, dateTo6, 65, 987 );
        dateFrom5 = new Date( 2017, 10, 11, 22, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleBerlinChernovtsi = new Vehicle( cityBerlin, cityChernovtsi, dateFrom5, dateTo6, 53, 56 );
        dateFrom5 = new Date( 2017, 10, 12, 8, 15 );
        dateTo6 = new Date( 2017, 10, 12, 15, 30 );
        Vehicle VehicleBerlinMe = new Vehicle( cityBerlin, cityMe, dateFrom5, dateTo6, 6, 600 );
        Vehicle VehicleBerlinKr = new Vehicle( cityBerlin, cityKr, dateFrom5, dateTo6, 3, 600 );
        Vehicle VehicleBerlinV = new Vehicle( cityBerlin, cityV, dateFrom5, dateTo6, 15, 604 );
        dateFrom5 = new Date( 2017, 10, 12, 8, 15 );
        dateTo6 = new Date( 2017, 10, 12, 18, 30 );
        Vehicle VehicleBerlinZh = new Vehicle( cityBerlin, cityZh, dateFrom5, dateTo6, 23, 640 );
        Vehicle VehicleBerlinM = new Vehicle( cityBerlin, cityM, dateFrom5, dateTo6, 65, 300 );
        dateFrom5 = new Date( 2017, 10, 12, 8, 15 );
        dateTo6 = new Date( 2017, 10, 12, 12, 30 );
        Vehicle VehicleBerlinP = new Vehicle( cityBerlin, cityP, dateFrom5, dateTo6, 15, 120 );
        dateFrom5 = new Date( 2017, 10, 12, 8, 15 );
        dateTo6 = new Date( 2017, 10, 12, 22, 30 );
        Vehicle VehicleBerlinU = new Vehicle( cityBerlin, cityU, dateFrom5, dateTo6, 24, 160 );
        dateFrom5 = new Date( 2017, 10, 12, 8, 15 );
        dateTo6 = new Date( 2017, 10, 12, 23, 30 );
        Vehicle VehicleBerlinS = new Vehicle( cityBerlin, cityS, dateFrom5, dateTo6, 27, 780 );

        Vehicles.add( VehicleBerlinH );
        Vehicles.add( VehicleBerlinL );
        Vehicles.add( VehicleBerlinK );
        Vehicles.add( VehicleBerlinO );
        Vehicles.add( VehicleBerlinD );
        Vehicles.add( VehicleBerlinP );
        Vehicles.add( VehicleBerlinCarpati );
        Vehicles.add( VehicleBerlinKrim );
        Vehicles.add( VehicleBerlinBudapesht );
        Vehicles.add( VehicleBerlinCh );
        Vehicles.add( VehicleBerlinChernovtsi );
        Vehicles.add( VehicleBerlinMe );
        Vehicles.add( VehicleBerlinKr );
        Vehicles.add( VehicleBerlinV );
        Vehicles.add( VehicleBerlinU );
        Vehicles.add( VehicleBerlinM );
        Vehicles.add( VehicleBerlinY );
        Vehicles.add( VehicleBerlinZh );
        Vehicles.add( VehicleBerlinS );


        dateFrom5 = new Date( 2017, 10, 12, 8, 15 );
        dateTo6 = new Date( 2017, 10, 12, 9, 30 );
        Vehicle VehicleKrL = new Vehicle( cityKr, cityL, dateFrom5, dateTo6, 4, 234 );
        Vehicle VehicleKrH = new Vehicle( cityKr, cityH, dateFrom5, dateTo6, 42, 236 );
        dateFrom5 = new Date( 2017, 10, 12, 8, 15 );
        dateTo6 = new Date( 2017, 10, 12, 10, 30 );
        Vehicle VehicleKrK = new Vehicle( cityKr, cityK, dateFrom5, dateTo6, 54, 200 );
        dateFrom5 = new Date( 2017, 10, 12, 8, 15 );
        dateTo6 = new Date( 2017, 10, 12, 23, 30 );
        Vehicle VehicleKrO = new Vehicle( cityKr, cityO, dateFrom5, dateTo6, 52, 25 );
        dateFrom5 = new Date( 2017, 10, 12, 8, 15 );
        dateTo6 = new Date( 2017, 10, 12, 21, 30 );
        Vehicle VehicleKrD = new Vehicle( cityKr, cityD, dateFrom5, dateTo6, 12, 256 );
        dateFrom5 = new Date( 2017, 10, 12, 8, 15 );
        dateTo6 = new Date( 2017, 10, 12, 20, 30 );
        Vehicle VehicleKrKrim = new Vehicle( cityKr, cityKrim, dateFrom5, dateTo6, 5, 236 );
        dateFrom5 = new Date( 2017, 10, 12, 8, 15 );
        dateTo6 = new Date( 2017, 10, 12, 9, 30 );
        Vehicle VehicleKrCarpati = new Vehicle( cityKr, cityCarpati, dateFrom5, dateTo6, 6, 600 );
        Vehicle VehicleKrBerlin = new Vehicle( cityKr, cityBerlin, dateFrom5, dateTo6, 35, 5646);
        dateFrom5 = new Date( 2017, 10, 11, 8, 15 );
        dateTo6 = new Date( 2017, 10, 12, 9, 30 );
        Vehicle VehicleKrBudapesht = new Vehicle( cityKr, cityBudapesht, dateFrom5, dateTo6, 33, 14 );
        Vehicle VehicleKrCh = new Vehicle( cityKr, cityCh, dateFrom5, dateTo6, 66, 23 );
        dateFrom5 = new Date( 2017, 10, 12, 1, 15 );
        dateTo6 = new Date( 2017, 10, 12, 9, 30 );
        Vehicle VehicleKrChernovtsi = new Vehicle( cityKr, cityChernovtsi, dateFrom5, dateTo6, 10, 6 );
        dateFrom5 = new Date( 2017, 10, 12, 5, 15 );
        dateTo6 = new Date( 2017, 10, 12, 9, 30 );
        Vehicle VehicleKrMe = new Vehicle( cityKr, cityMe, dateFrom5, dateTo6, 12, 4567 );
        dateFrom5 = new Date( 2017, 10, 12, 7, 15 );
        dateTo6 = new Date( 2017, 10, 12, 9, 30 );
        Vehicle VehicleKrM = new Vehicle( cityKr, cityM, dateFrom5, dateTo6, 16, 124 );
        dateFrom5 = new Date( 2017, 10, 10, 8, 15 );
        dateTo6 = new Date( 2017, 10, 12, 9, 30 );
        Vehicle VehicleKrV = new Vehicle( cityKr, cityV, dateFrom5, dateTo6, 17, 124 );
        Vehicle VehicleKrZh = new Vehicle( cityKr, cityZh, dateFrom5, dateTo6, 66, 467 );
        dateFrom5 = new Date( 2017, 10, 12, 3, 15 );
        dateTo6 = new Date( 2017, 10, 12, 9, 30 );
        Vehicle VehicleKrY = new Vehicle( cityKr, cityY, dateFrom5, dateTo6, 53, 145 );
        Vehicle VehicleKrP = new Vehicle( cityKr, cityP, dateFrom5, dateTo6, 3, 567 );
        dateFrom5 = new Date( 2017, 10, 11, 8, 15 );
        dateTo6 = new Date( 2017, 10, 12, 22, 30 );
        Vehicle VehicleKrU = new Vehicle( cityKr, cityU, dateFrom5, dateTo6, 32, 34 );
        dateFrom5 = new Date( 2017, 10, 12, 8, 15 );
        dateTo6 = new Date( 2017, 10, 12, 23, 30 );
        Vehicle VehicleKrS = new Vehicle( cityKr, cityS, dateFrom5, dateTo6, 4, 235 );

        Vehicles.add( VehicleKrH );
        Vehicles.add( VehicleKrL );
        Vehicles.add( VehicleKrK );
        Vehicles.add( VehicleKrO );
        Vehicles.add( VehicleKrD );
        Vehicles.add( VehicleKrKrim );
        Vehicles.add( VehicleKrCarpati );
        Vehicles.add( VehicleKrBerlin );
        Vehicles.add( VehicleKrBudapesht );
        Vehicles.add( VehicleKrCh );
        Vehicles.add( VehicleKrChernovtsi );
        Vehicles.add( VehicleKrMe );
        Vehicles.add( VehicleKrP );
        Vehicles.add( VehicleKrV );
        Vehicles.add( VehicleKrU );
        Vehicles.add( VehicleKrM );
        Vehicles.add( VehicleKrY );
        Vehicles.add( VehicleKrZh );
        Vehicles.add( VehicleKrS );

        dateFrom5 = new Date( 2017, 10, 12, 8, 15 );
        dateTo6 = new Date( 2017, 10, 12, 20, 30 );
        Vehicle VehicleCarpatiL = new Vehicle( cityCarpati, cityL, dateFrom5, dateTo6, 23, 1234 );
        dateFrom5 = new Date( 2017, 10, 11, 8, 15 );
        dateTo6 = new Date( 2017, 10, 12, 2, 30 );
        Vehicle VehicleCarpatiH = new Vehicle( cityCarpati, cityH, dateFrom5, dateTo6, 3, 2134 );
        dateFrom5 = new Date( 2017, 10, 11, 8, 15 );
        dateTo6 = new Date( 2017, 10, 12, 23, 30 );
        Vehicle VehicleCarpatiK = new Vehicle( cityCarpati, cityK, dateFrom5, dateTo6, 5, 35 );
        dateFrom5 = new Date( 2017, 10, 11, 8, 15 );
        dateTo6 = new Date( 2017, 10, 12, 1, 30 );
        Vehicle VehicleCarpatiO = new Vehicle( cityCarpati, cityO, dateFrom5, dateTo6, 45, 456 );
        Vehicle VehicleCarpatiD = new Vehicle( cityCarpati, cityD, dateFrom5, dateTo6, 34, 600 );
        Vehicle VehicleCarpatiKrim = new Vehicle( cityCarpati, cityKrim, dateFrom5, dateTo6, 75, 600 );
        dateFrom5 = new Date( 2017, 10, 12, 3, 15 );
        dateTo6 = new Date( 2017, 10, 12, 20, 30 );
        Vehicle VehicleCarpatiY = new Vehicle( cityCarpati, cityY, dateFrom5, dateTo6, 75, 78 );
        dateFrom5 = new Date( 2017, 10, 12, 8, 15 );
        dateTo6 = new Date( 2017, 10, 12, 16, 30 );
        Vehicle VehicleCarpatiBerlin = new Vehicle( cityCarpati, cityBerlin, dateFrom5, dateTo6, 33, 600 );
        Vehicle VehicleCarpatiBudapesht = new Vehicle( cityCarpati, cityBudapesht, dateFrom5, dateTo6, 23, 876 );
        Vehicle VehicleCarpatiCh = new Vehicle( cityCarpati, cityCh, dateFrom5, dateTo6, 12, 234 );
        dateFrom5 = new Date( 2017, 10, 12, 19, 15 );
        dateTo6 = new Date( 2017, 10, 12, 20, 30 );
        Vehicle VehicleCarpatiChernovtsi = new Vehicle( cityCarpati, cityChernovtsi, dateFrom5, dateTo6, 75, 54 );
        Vehicle VehicleCarpatiMe = new Vehicle( cityCarpati, cityMe, dateFrom5, dateTo6, 3, 346 );
        dateFrom5 = new Date( 2017, 10, 11, 18, 15 );
        dateTo6 = new Date( 2017, 10, 12, 20, 30 );
        Vehicle VehicleCarpatiKr = new Vehicle( cityCarpati, cityKr, dateFrom5, dateTo6, 7, 87 );
        Vehicle VehicleCarpatiV = new Vehicle( cityCarpati, cityV, dateFrom5, dateTo6, 7, 23 );
        dateFrom5 = new Date( 2017, 10, 10, 7, 15 );
        dateTo6 = new Date( 2017, 10, 12, 20, 30 );
        Vehicle VehicleCarpatiZh = new Vehicle( cityCarpati, cityZh, dateFrom5, dateTo6, 24, 265 );
        dateFrom5 = new Date( 2017, 10, 11, 18, 15 );
        dateTo6 = new Date( 2017, 10, 12, 20, 30 );
        Vehicle VehicleCarpatiM = new Vehicle( cityCarpati, cityM, dateFrom5, dateTo6, 22, 236 );
        dateFrom5 = new Date( 2017, 10, 12, 8, 15 );
        dateTo6 = new Date( 2017, 10, 12, 23, 30 );
        Vehicle VehicleCarpatiP = new Vehicle( cityCarpati, cityP, dateFrom5, dateTo6, 77, 3457 );
        dateFrom5 = new Date( 2017, 10, 12, 8, 15 );
        dateTo6 = new Date( 2017, 10, 12, 10, 30 );
        Vehicle VehicleCarpatiU = new Vehicle( cityCarpati, cityU, dateFrom5, dateTo6, 43, 2435 );
        dateFrom5 = new Date( 2017, 10, 10, 9, 15 );
        dateTo6 = new Date( 2017, 10, 12, 20, 30 );
        Vehicle VehicleCarpatiS = new Vehicle( cityCarpati, cityS, dateFrom5, dateTo6, 6, 23 );


        Vehicles.add( VehicleCarpatiH );
        Vehicles.add( VehicleCarpatiL );
        Vehicles.add( VehicleCarpatiK );
        Vehicles.add( VehicleCarpatiO );
        Vehicles.add( VehicleCarpatiD );
        Vehicles.add( VehicleCarpatiKrim );
        Vehicles.add( VehicleCarpatiP );
        Vehicles.add( VehicleCarpatiBerlin );
        Vehicles.add( VehicleCarpatiBudapesht );
        Vehicles.add( VehicleCarpatiCh );
        Vehicles.add( VehicleCarpatiChernovtsi );
        Vehicles.add( VehicleCarpatiMe );
        Vehicles.add( VehicleCarpatiKr );
        Vehicles.add( VehicleCarpatiV );
        Vehicles.add( VehicleCarpatiU );
        Vehicles.add( VehicleCarpatiM );
        Vehicles.add( VehicleCarpatiY );
        Vehicles.add( VehicleCarpatiZh );
        Vehicles.add( VehicleCarpatiS );
        trains = Vehicles;*/
    }


}
