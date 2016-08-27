package za.ac.PremierSoccerLeague.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.ac.PremierSoccerLeague.domain.Tournament;
import za.ac.PremierSoccerLeague.services.TournamentService;

import java.util.List;

/**
 * Created by Songezo on 2016-08-11.
 */
@RestController
@RequestMapping(value = "/")
public class TournamentAPI {
    @Autowired
    TournamentService service;
    @RequestMapping(value = "/tournament", method = RequestMethod.GET)

    public List<Tournament> getTournaments(){
        return service.getTournaments();
    }
}
