package inputData;

import dbInsteadBooking.data.Train;
import java.util.ArrayList;
import java.util.Date;

public interface TrainData {

    ArrayList<Train> getAllFreeTrainsByDateAndCity(Date from, Date to, String cityFrom, String cityTo);

}
