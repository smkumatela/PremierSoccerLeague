package za.ac.PremierSoccerLeague.services;

import za.ac.PremierSoccerLeague.domain.PremierSoccerLeague;
import za.ac.PremierSoccerLeague.domain.Stadium;

import java.util.List;

/**
 * Created by Songezo on 2015-05-20.
 */
public interface PremierSoccerLeagueService {
    List<PremierSoccerLeague> getPremierSoccerLeagues();
    List<Stadium> getStadiums(Long id);
}
