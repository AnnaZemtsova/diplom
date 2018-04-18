package testingData;

import data.City;
import generalData.AllData;
import inputData.InputUserData;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class UserDataFromCode implements InputUserData {
    ArrayList<City> cities;

    public UserDataFromCode(){
        cities = AllData.cities;
    }
    @Override
    public ArrayList<City> getWantedCities() {
        ArrayList<City> wanted = new ArrayList<>(  );
        wanted.add( cities.get( 0 ) );
        wanted.add( cities.get( 1 ) );
        wanted.add( cities.get( 2 ) );
     //   wanted.add( cities.get( 3 ) );
      //  wanted.add( cities.get( 4 ) );
       // wanted.add( cities.get( 5 ) );

       /* wanted.add( cities.get( 6 ) );
       /* wanted.add( cities.get( 7 ) );
      /*  wanted.add( cities.get( 8 ) );
       /* wanted.add( cities.get( 9 ) );

       /* wanted.add( cities.get( 10 ) );
        /*wanted.add( cities.get( 11) );
        wanted.add( cities.get( 12 ) );
       /* wanted.add( cities.get( 13 ) );
       /* wanted.add( cities.get( 14 ) );

       /* wanted.add( cities.get( 15 ) );
        /*wanted.add( cities.get( 16) );
        wanted.add( cities.get( 17 ) );
        wanted.add( cities.get( 18 ) );
        wanted.add( cities.get( 19 ) );*/

        return wanted;
    }

    @Override
    public double getMoney() {
        return 900;
    }

    @Override
    public Time getTime() {
        return new Time(60*60*60/3600);
    }

    @Override
    public Date getDateFrom() {
        return new Date(2018, 4, 11, 0, 15);
    }

    @Override
    public Date getDateTo() {
        return new Date(2018, 4, 21, 0, 15);
    }

    @Override
    public int getPreferredTransport() {
        return 2;
    }
}
