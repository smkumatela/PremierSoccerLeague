package za.ac.PremierSoccerLeague.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import za.ac.PremierSoccerLeague.domain.Player;

/**
 * Created by Songezo on 2015-05-17.
 */
@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {
}
