package za.ac.PremierSoccerLeague.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import za.ac.PremierSoccerLeague.domain.Stadium;

/**
 * Created by Songezo on 2015-05-17.
 */
@Repository
public interface StadiumRepository extends CrudRepository<Stadium, Long> {
}
