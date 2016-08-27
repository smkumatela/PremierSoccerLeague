package za.ac.PremierSoccerLeague.services;

import za.ac.PremierSoccerLeague.domain.Player;
import za.ac.PremierSoccerLeague.domain.Team;

import java.util.List;

/**
 * Created by Songezo on 2015-07-26.
 */
public interface TeamService {
    List<Team> getTeams();
    List<Player> getPlayers(Long id);
}
