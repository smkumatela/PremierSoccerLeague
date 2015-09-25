package za.ac.PremierSoccerLeague.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.PremierSoccerLeague.domain.PremierSoccerLeague;

/**
 * Created by Songezo on 2015-09-24.
 */
@RestController
@RequestMapping(value = "/")
public class Landing_page {
    @RequestMapping(value = "/")
    public PremierSoccerLeague getPremierSoccerLeague(){

        PremierSoccerLeague newPremierSoccerLeague = new PremierSoccerLeague
                .Builder("BPL").Leaguename("Berclays Premiership").build();

        return newPremierSoccerLeague;
    }
}
