package inputData;

import data.City;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public interface InputUserData {
     int SAME_NUMBER_OF_DAYS = 0 ;
     int DEFINE_DATES_OF_DISPLACEMENT = 1 ;

     ArrayList<City> getWantedCities();
     double getMoney();
     Time getTime();
     Date getDateFrom();
     Date getDateTo();
     int getPreferredTransport();
     int getDisplacementDatesType();
     ArrayList<Date> getDisplacementDates();
}
