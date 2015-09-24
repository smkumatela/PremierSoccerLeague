package za.ac.PremierSoccerLeague.repository;

import org.springframework.data.repository.CrudRepository;
import za.ac.PremierSoccerLeague.domain.Player;

/**
 * Created by Songezo on 2015-05-17.
 */
public interface PlayerRepository extends CrudRepository<Player, Long> {
}
