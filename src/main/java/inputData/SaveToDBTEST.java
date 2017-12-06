package inputData;

import com.mongodb.MongoClient;
import dbInsteadBooking.data.Train;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.Date;

public class SaveToDBTEST {


    public void saveTestData() {
        Date dateFrom = new Date();
        Date dateTo = new Date();
        dateFrom.setYear(2017);
        dateFrom.setMonth(12);
        dateFrom.setDate(23);

        dateTo.setYear(2017);
        dateTo.setMonth(12);
        dateTo.setDate(25);

        MongoOperations mongoOps = new MongoTemplate(new MongoClient(), "testDB");
        mongoOps.insert(new Train("Kyiv1","Kharkiv",dateFrom,dateTo,10,120));
    }


    public static void main(String[] args) {
        SaveToDBTEST saveToDBTEST = new SaveToDBTEST();
        saveToDBTEST.saveTestData();
    }
}
