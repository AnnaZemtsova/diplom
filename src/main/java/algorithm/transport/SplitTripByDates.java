package algorithm.transport;

import inputData.InputUserData;

import java.util.ArrayList;
import java.util.Date;

public class SplitTripByDates implements DatesDisplacement {

    private static int DATE = 0;
    private static int MONTH = 1;
    private static int YEAR = 2;

    //________________________________________________________________________________________________________________________

    /*
    ищем массив дат в которые мы должны перемещаться в каждый следующий город , если пользователю
    непринципиальны даты и он хочет быть в каждом городе примерно одинаковое количество времени
     */
    @Override
    public ArrayList<Date> getDatesForDisplacement(InputUserData inputUserData) {
        return datesForDisplacement(inputUserData.getDateFrom(),inputUserData.getDateTo(),inputUserData.getWantedCities().size());
    }
    //________________________________________________________________________________________________________________________

    /*
     ищем массив дат в которые мы должны перемещаться в каждый следующий город , если пользователю
    непринципиальны даты и он хочет быть в каждом городе примерно одинаковое количество времени

     */
    private ArrayList<Date> datesForDisplacement(Date dateFrom,Date dateTo,int amountOfCities) {
        ArrayList<Date> dates = new ArrayList<>();
        int amountOfDays = Double.valueOf((dateTo.getTime() - dateFrom.getTime())/(1000*60*60*24)).intValue();
        int  step = Double.valueOf(amountOfDays/(amountOfCities-1)).intValue();
        dates.add(dateFrom);
        int nextDate = getDayMonthYear(dateFrom.getDate(),dateFrom.getMonth(),dateFrom.getYear(),step,DATE);
        int nextMonth = getDayMonthYear(dateFrom.getDate(),dateFrom.getMonth(),dateFrom.getYear(),step,MONTH);
        int nextYear = getDayMonthYear(dateFrom.getDate(),dateFrom.getMonth(),dateFrom.getYear(),step,YEAR);
        Date date = new Date(nextYear,nextMonth,nextDate);
        dates.add(date);
        int nowDate = nextDate;
        int nowMonth = nextMonth;
        int nowYear = nextYear;
        for(int i=2;i<amountOfCities-1;i++){
             nextDate = getDayMonthYear(nowDate,nowMonth,nowYear,step,DATE);
             nextMonth = getDayMonthYear(nowDate,nowMonth,nowYear,step,MONTH);
             nextYear = getDayMonthYear(nowDate,nowMonth,nowYear,step,YEAR);
             date = new Date(nextYear,nextMonth,nextDate);
             dates.add(date);
            nowDate = nextDate;
            nowMonth = nextMonth;
             nowYear = nextYear;
        }
        dates.add(dateTo);
        return dates;
    }

    //________________________________________________________________________________________________________________________

    /*
    ищем дату  следующего переезда из А в В , если в А мы прибыли в день date, месяц month, год year
    и должны пробыть в А городе step дней.
    needRes это то что нам нужно от метода (день, месяц или год)
     */
    private int getDayMonthYear(int date,int month,int year,int step,int needRes){
        int dateRes=date;
        int monthRes = month;
        int yearRes = year;
        int bareStep=0;
        if(month==1) {
            if((date+step)<=28){
                dateRes=date+step;
                monthRes=month;
                yearRes=year;
            }else{
                bareStep = step-(28 - date);
                monthRes++;
            }
        }else {
            if (month == 0 || month == 2 || month == 4 || month == 6 || month == 7 || month == 9 || month == 11) {
                if((date+step)<=31){
                    dateRes=date+step;
                    monthRes=month;
                    yearRes=year;
                }else{
                    bareStep = step-(31 - date);
                    monthRes++;
                }
            }else {
                if((date+step)<=30){
                    dateRes=date+step;
                    monthRes=month;
                    yearRes=year;
                }else{
                    bareStep = step - (30 - date);
                    monthRes++;
                }
            }
        }
        while (bareStep!=0){
            if(monthRes==1) {
                if(bareStep<=28){
                    dateRes=bareStep;
                    bareStep=0;
                }
                else{
                    monthRes++;
                    bareStep-=28;
                }
            }else {
                if (monthRes == 0 || monthRes == 2 || monthRes == 4 || monthRes == 6 || monthRes == 7 || monthRes == 9 || monthRes == 11) {
                    if(bareStep<=31){
                        dateRes=bareStep;
                        bareStep=0;
                    }
                    else{
                        monthRes++;
                        bareStep-=31;
                    }
                }else{
                    if(bareStep<=30){
                        dateRes=bareStep;
                        bareStep=0;
                    }
                    else{
                        monthRes++;
                        bareStep-=30;
                    }
                }
            }
            if(monthRes==12){
                monthRes=0;
                yearRes++;
            }
        }
        if(needRes==DATE) return dateRes;
        if(needRes==MONTH)return  monthRes;
        return yearRes;
    }
    //________________________________________________________________________________________________________________________



    /*public static void main(String[] args) {
        InputCities inputCities= new CitiesFromCode();
        ArrayList<City> cities = inputCities.getCities();

        AllData.cities = cities;
        SplitTripByDates splitTripByDates = new SplitTripByDates();
        ArrayList<Date> dates = splitTripByDates.getDatesForDisplacement(new UserDataFromCode());
        int nextDate = splitTripByDates.getDayMonthYear(8,5,2018,13,DATE);
        int nextMonth = splitTripByDates.getDayMonthYear(8,5,2018,13,MONTH);
        int nextYear = splitTripByDates.getDayMonthYear(8,5,2018,13,YEAR);
       // System.out.println(nextDate+" "+nextMonth+" "+nextYear+" TRTY");
        for(int i=0;i<dates.size();i++){
            System.out.println(dates.get(i).getDate()+" "+dates.get(i).getMonth()+" "+dates.get(i).getYear());
        }
    }*/
}
