package web;

import com.tourism.dto.DateResponseDTO;
import com.tourism.dto.DoubleResponseDTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/findWay")
public class WayController {

    @RequestMapping(value = "/getAllData/{money}/{currency}/{time}/{dayFrom}/{monthFrom}/{yearFrom}/{dayTo}/{monthTo}/{yearTo}")
    public DoubleResponseDTO getAmountMoney(@PathVariable("money") double money,@PathVariable("currency") String currency,
                                            @PathVariable("time") double time,@PathVariable("dayFrom") int dayFrom,@PathVariable("monthFrom") int monthFrom,
                                            @PathVariable("yearFrom") int yearFrom,
                                            @PathVariable("dayTo") int dayTo,@PathVariable("monthTo") int monthTo,
                                            @PathVariable("yearTo") int yearTo) {
        System.out.println(money+" "+currency+" "+time+" "+dayFrom+" "+monthFrom+" "+yearFrom+" "+dayTo+" "+monthTo+" "+yearTo);
        return new DoubleResponseDTO(money);
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
