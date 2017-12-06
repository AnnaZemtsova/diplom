package inputData;

import com.mongodb.MongoClient;
import dbInsteadBooking.data.Train;
import dbInsteadBooking.repositories.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.ArrayList;
import java.util.Date;


@SpringBootApplication
@EnableMongoRepositories(basePackages = "../dbInsteadBooking/repositories")

public class GetDataFromMongoDB implements TrainData {
    @Autowired
    TrainRepository trainRepository;

    @Override
    public ArrayList<Train> getAllFreeTrainsByDateAndCity(Date from, Date to, String cityFrom, String cityTo) {
/*
        MongoOperations mongoOps = new MongoTemplate(new MongoClient(), "testDB");

        for(Train train: mongoOps.findAll(Train.class)){
            System.out.println(train);
        };*/

        for (Train customer : trainRepository.findAll()) {
          System.out.println(customer);
       }

       // Train train = trainRepository.findByCityFromAndCityTo("Kyiv","Kharkiv");
       // System.out.println(train.amountOfPlace);
        return null;
    }

    public static void main(String[] args) {
        GetDataFromMongoDB getDataFromMongoDB = new GetDataFromMongoDB();
        Date dateFrom = new Date();
        Date dateTo = new Date();
        dateFrom.setYear(2017);
        dateFrom.setMonth(12);
        dateFrom.setDate(23);

        dateTo.setYear(2017);
        dateTo.setMonth(12);
        dateTo.setDate(25);

        getDataFromMongoDB.getAllFreeTrainsByDateAndCity(dateFrom,dateTo,"Kyiv","Kharkiv");
    }
}
