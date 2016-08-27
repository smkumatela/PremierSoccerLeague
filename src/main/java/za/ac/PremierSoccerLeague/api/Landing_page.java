package za.ac.PremierSoccerLeague.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.ac.PremierSoccerLeague.domain.PremierSoccerLeague;
import za.ac.PremierSoccerLeague.services.PremierSoccerLeagueService;

import java.util.List;

/**
 * Created by Songezo on 2015-09-24.
 */
@RestController
@RequestMapping(value = "/")
public class Landing_page{
    @Autowired
    PremierSoccerLeagueService service ;
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public List<PremierSoccerLeague> getPremierSoccerLeague(){

        List<PremierSoccerLeague> newPremierSoccerLeague = service.getPremierSoccerLeagues();
        return newPremierSoccerLeague;
    }

}
