package data;
import data.City;

import java.util.Date;

public class Train {
   private City from;
   private City to;
   private Date datefrom;
   private Date dateTo;
   private double destination;
    double price;

    public double getDestination() {
        return destination;
    }

    public void setDestination(double destination) {
        this.destination = destination;
    }

    public Train(City from, City to, Date dfrom, Date dto, double destination,double price){
        this.from=from;
        this.to = to;
        this.datefrom = dfrom;
        this.dateTo=dto;
        this.destination = destination;
        this.price = price;

    }
    public City getFrom() {
        return from;
    }

    public void setFrom(City from) {
        this.from = from;
    }

    public City getTo() {
        return to;
    }

    public void setTo(City to) {
        this.to = to;
    }

    public Date getDatefrom() {
        return datefrom;
    }

    public void setDatefrom(Date datefrom) {
        this.datefrom = datefrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }
}
