package za.ac.PremierSoccerLeague.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.PremierSoccerLeague.domain.Player;
import za.ac.PremierSoccerLeague.repository.PlayerRepository;
import za.ac.PremierSoccerLeague.services.PlayerService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Songezo on 2016-08-10.
 */
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerRepository repository;

    @Override
    public List<Player> getPlayers() {
        List<Player> allPlayers = new ArrayList<>();

        Iterable<Player> players = repository.findAll();
        for (Player player : players)
            {
                allPlayers.add(player);
            }
        return allPlayers;
    }
}
