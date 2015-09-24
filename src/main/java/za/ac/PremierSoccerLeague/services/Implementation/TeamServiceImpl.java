package za.ac.PremierSoccerLeague.services.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.PremierSoccerLeague.domain.Player;
import za.ac.PremierSoccerLeague.domain.Team;
import za.ac.PremierSoccerLeague.repository.TeamRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Songezo on 2015-07-26.
 */
public class TeamServiceImpl implements TeamService {
    @Autowired
    TeamRepository repository;

    public List<Team> getTeams() {
        List<Team> allTeams = new ArrayList<Team>();

        Iterable<Team> Teams = repository.findAll();
        for (Team team: Teams){
            allTeams.add(team);
        }

        return allTeams;
    }

    @Override
    public List<Player> getPlayers(Long id) {
        return repository.findOne(id).getPlayers();
    }
}
