package za.ac.PremierSoccerLeague.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.ac.PremierSoccerLeague.domain.Team;
import za.ac.PremierSoccerLeague.services.TeamService;

import java.util.List;

/**
 * Created by Songezo on 2016-08-09.
 */
@RestController
@RequestMapping(value = "/")
public class TeamApi {
    @Autowired
    TeamService service ;
    @RequestMapping(value = "/teams",method = RequestMethod.GET)
    public List<Team> getTeams(){
        return service.getTeams();
    }
}
