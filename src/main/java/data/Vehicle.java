package data;

import java.util.Date;

public class Vehicle {
    private City from;
    private City to;
    private Date dateFrom;
    private Date dateTo;
    private int comfortLevel;
    private double price;
    private double timeInWay;

    public Vehicle() {

    }

    public double getTimeInWay() {
        return timeInWay;
    }

    public void setTimeInWay(double timeInWay) {
        this.timeInWay = timeInWay;
    }




    public Vehicle(City from, City to, Date dFrom, Date dto, int comfortLevel, double price,double timeInWay){
        this.from=from;
        this.to = to;
        this.dateFrom = dFrom;
        this.dateTo=dto;
        this.comfortLevel = comfortLevel;
        this.price = price;
        this.timeInWay = timeInWay;
    }

    public Vehicle(City from, City to, Date dFrom, Date dto, int comfortLevel, double price){
        this.from=from;
        this.to = to;
        this.dateFrom = dFrom;
        this.dateTo=dto;
        this.comfortLevel = comfortLevel;
        this.price = price;
    }

    public int getComfortLevel() {
        return comfortLevel;
    }

    public void setComfortLevel(int comfortLevel) {
        this.comfortLevel = comfortLevel;
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

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date datefrom) {
        this.dateFrom = datefrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
