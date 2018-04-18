package inputData;

import data.City;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public interface InputUserData {

     ArrayList<City> getWantedCities();
     double getMoney();
     Time getTime();
     Date getDateFrom();
     Date getDateTo();
     int getPreferredTransport();
}
