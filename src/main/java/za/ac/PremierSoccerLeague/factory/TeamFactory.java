package za.ac.PremierSoccerLeague.factory;

import za.ac.PremierSoccerLeague.domain.Broadcaster;
import za.ac.PremierSoccerLeague.domain.Player;
import za.ac.PremierSoccerLeague.domain.Team;
import za.ac.PremierSoccerLeague.domain.TechnicalTeam;

import java.util.List;
import java.util.Map;

/**
 * Created by student on 2015/04/25.
 */

public class TeamFactory {
    public static Team createTeam(Map<String, String> values, Broadcaster brdcsts, TechnicalTeam coach,
                                  List<Player> players){
        return new Team
                .Builder(values.get("teamName"))
                .location(values.get("location"))
                .coach(coach)
                .players(players).build();
    }
}
