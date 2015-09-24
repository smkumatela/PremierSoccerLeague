package za.ac.PremierSoccerLeague.repository;

import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import za.ac.PremierSoccerLeague.App;
import za.ac.PremierSoccerLeague.conf.factory.TeamFactory;
import za.ac.PremierSoccerLeague.domain.Broadcaster;
import za.ac.PremierSoccerLeague.domain.Player;
import za.ac.PremierSoccerLeague.domain.Team;
import za.ac.PremierSoccerLeague.domain.TechnicalTeam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by student on 2015/05/03.
 */
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class TestCrudTeam extends AbstractTestNGSpringContextTests {
    private Long id;


    @Autowired
    TeamRepository repository;
    //@Test
    public void testCreate() throws Exception {
        List<Player> players = new ArrayList<Player>();
        Map<String,String> values = new HashMap<>();

        Broadcaster brdcsts = new Broadcaster.Builder("SS3").build();
        TechnicalTeam tchtms = new TechnicalTeam.Builder("Physical").build();

        Player p = new Player.Builder("Strike").age(21).sponsor("Adidas").lastName("Ronaldo").build();
        Player p1 = new Player.Builder("Defender").age(25).sponsor("Adidas").lastName("Ramos").build();

        players.add(p);
        players.add(p1);

        values.put("teamName", "Real Madrid");
        values.put("location", "Italy");

        Team team = TeamFactory.createTeam(values, brdcsts, tchtms,players);
        repository.save(team);
        id = team.getId();
        Assert.assertNotNull(team.getId());
    }

    //@Test(dependsOnMethods = "testCreate")
    public void testRead() throws Exception {
        Team team = repository.findOne(id);
        Assert.assertEquals("Real Madrid", team.getTeamName());
    }

    //@Test(dependsOnMethods = "testRead")
    public void testUpdate() throws Exception {
        Team team = repository.findOne(id);
        Team newTeam = new Team.Builder("Real Madrid").id(team.getId()).location("Spain").build();
        repository.save(newTeam);
        Assert.assertEquals("Real Madrid", team.getTeamName());
        Assert.assertEquals("Italy", team.getLocation());
        //Assert.assertEquals("SS4", team.getChannel());
    }

    //@Test(dependsOnMethods = "testUpdate")
    public void testDelete() throws Exception {
        Team team = repository.findOne(id);
        repository.delete(team);
        Team newTeam = repository.findOne(id);
        Assert.assertNull(newTeam);
    }
}
