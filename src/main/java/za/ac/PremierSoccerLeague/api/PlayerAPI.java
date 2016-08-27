package za.ac.PremierSoccerLeague.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.ac.PremierSoccerLeague.domain.Player;
import za.ac.PremierSoccerLeague.services.PlayerService;

import java.util.List;

/**
 * Created by Songezo on 2016-08-11.
 */
@RestController
@RequestMapping(value = "/")
public class PlayerAPI {
    @Autowired
    PlayerService service;
    @RequestMapping(value = "/player", method = RequestMethod.GET)

    private List<Player> getPlayers(){
        return service.getPlayers();
    }
}
