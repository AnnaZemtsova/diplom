package dbInsteadBooking.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Document
public class Train {

    @Id
    public String id;

    public String cityFrom;

    public String cityTo;
    public Date dataFrom;
    public Date dataTo;
    public int amountOfPlace;
    public int price;


    public Train(String cityFrom, String cityTo,
                 Date dataFrom,Date dataTo,int amountOfPlace,int price){
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
        this.dataFrom = dataFrom;
        this.dataTo = dataTo;
        this.amountOfPlace = amountOfPlace;
        this.price = price;
    }


    @Override
    public String toString() {
        return "Train{" +
                "id='" + id + '\'' +
                ", cityFrom='" + cityFrom + '\'' +
                ", cityTo='" + cityTo + '\'' +
                ", dataFrom=" + dataFrom +
                ", dataTo=" + dataTo +
                ", amountOfPlace=" + amountOfPlace +
                ", price=" + price +
                '}';
    }




    public String getCityFrom() {
        return cityFrom;
    }

    public void setCityFrom(String cityFrom) {
        this.cityFrom = cityFrom;
    }

    public String getCityTo() {
        return cityTo;
    }

    public void setCityTo(String cityTo) {
        this.cityTo = cityTo;
    }

    public Date getDataFrom() {
        return dataFrom;
    }

    public void setDataFrom(Date dataFrom) {
        this.dataFrom = dataFrom;
    }

    public Date getDataTo() {
        return dataTo;
    }

    public void setDataTo(Date dataTo) {
        this.dataTo = dataTo;
    }

    public int getAmountOfPlace() {
        return amountOfPlace;
    }

    public void setAmountOfPlace(int amountOfPlace) {
        this.amountOfPlace = amountOfPlace;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
