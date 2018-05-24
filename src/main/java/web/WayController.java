package web;

import data.City;
import data.ResultData;
import dto.ResultDataDTO;
import inputData.InputUserData;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

@RestController
@RequestMapping("/findWay")
public class WayController implements InputUserData,ShowData {

    @RequestMapping(value = "/getAllData/{cities}/{preferredTransport}/{money}/{currency}/{time}/{dayFrom}/{monthFrom}/{yearFrom}/{dayTo}/{monthTo}/{yearTo}")
    public ResultDataDTO getData(@PathVariable("cities") ArrayList<String> cities,@PathVariable("preferredTransport")int preferredTransport,
                                 @PathVariable("money") double money, @PathVariable("currency") String currency,
                                 @PathVariable("time") double time, @PathVariable("dayFrom") int dayFrom, @PathVariable("monthFrom") int monthFrom,
                                 @PathVariable("yearFrom") int yearFrom,
                                 @PathVariable("dayTo") int dayTo, @PathVariable("monthTo") int monthTo,
                                 @PathVariable("yearTo") int yearTo) {
        /*
        Тут вызов всех алгоритмов, формирование результата и записывание его в ResultData
         */
        return new ResultDataDTO(new ResultData());
  }

    @Override
    public ArrayList<City> getWantedCities() {
        return null;
    }

    @Override
    public double getMoney() {
        return 0;
    }

    @Override
    public Time getTime() {
        return null;
    }

    @Override
    public Date getDateFrom() {
        return null;
    }

    @Override
    public Date getDateTo() {
        return null;
    }

    @Override
    public int getPreferredTransport() {
        return 0;
    }

    @Override
    public int getDisplacementDatesType() {
        return 0;
    }

    @Override
    public ArrayList<Date> getDisplacementDates() {
        return null;
    }

    @Override
    public void showData(ResultData resultData) {

    }

  /*  @RequestMapping(value = "/getTime/{time}")
    public DoubleResponseDTO getTime(@PathVariable("time") double time) {
        System.out.println(time);
        return new DoubleResponseDTO(time);
    }

    @RequestMapping(value = "/getDateFrom/{dayFrom}/{monthFrom}/{yearFrom}")
    public DateResponseDTO getDateFrom(@PathVariable("dayFrom") int day,@PathVariable("monthFrom") int month,@PathVariable("yearFrom") int year) {
        System.out.println(day+" "+month+" "+year);
        return new DateResponseDTO(new Date(year,month,day));
    }

    @RequestMapping(value = "/getDateTo/{dayTo}/{monthTo}/{yearTo}")
    public DateResponseDTO getDateTo(@PathVariable("dayTo") int day,@PathVariable("monthTo") int month,@PathVariable("yearTo") int year) {
        System.out.println(day+" "+month+" "+year);
        return new DateResponseDTO(new Date(year,month,day));
    }*/

}
