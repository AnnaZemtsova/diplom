package dbInsteadBooking.repositories;

import dbInsteadBooking.data.Train;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;


@Repository
public interface TrainRepository extends MongoRepository<Train,String> {

 //   public Train findByCityFromAndCityTo(String cityFrom, String cityTo);
 //   public int findPrice(Train train);
  //  public Train findByDateFromAndDateTo(Date dateFrom,Date dateTo);
  //  public Train findByCityFromAndCityToAndDateFromAndDateTo(String cityFrom, String cityTo,
              //                                               Date dateFrom,Date dateTo );
}

