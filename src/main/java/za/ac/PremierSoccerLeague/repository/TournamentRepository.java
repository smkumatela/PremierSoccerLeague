package za.ac.PremierSoccerLeague.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import za.ac.PremierSoccerLeague.domain.Tournament;

/**
 * Created by Songezo on 2015-08-09.
 */
@Repository
public interface TournamentRepository extends CrudRepository<Tournament, Long> {
}
