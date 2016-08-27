package za.ac.PremierSoccerLeague.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import za.ac.PremierSoccerLeague.domain.PremierSoccerLeague;

/**
 * Created by student on 2015/05/02.
 */
@Repository
public interface PremierSoccerLeagueRepository extends CrudRepository<PremierSoccerLeague, Long> {

}
