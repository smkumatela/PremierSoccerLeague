package za.ac.PremierSoccerLeague.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import za.ac.PremierSoccerLeague.App;
import za.ac.PremierSoccerLeague.conf.factory.TeamFactory;
import za.ac.PremierSoccerLeague.domain.Broadcaster;
import za.ac.PremierSoccerLeague.domain.Player;
import za.ac.PremierSoccerLeague.domain.Team;
import za.ac.PremierSoccerLeague.domain.TechnicalTeam;
import za.ac.PremierSoccerLeague.repository.TeamRepository;
import za.ac.PremierSoccerLeague.services.Implementation.TeamService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Songezo on 2015-07-26.
 */
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class TeamServiceTest extends AbstractTestNGSpringContextTests {
    @Autowired
    private TeamService service;
    private Long id;

    @Autowired
    private TeamRepository repository;
    private List<Player> players;

    @BeforeMethod
    public void setUp() throws Exception{
        players = new ArrayList<Player>();
    }

    public void create() throws Exception{
        List<Player> players = new ArrayList<Player>();
        Map<String, String> values = new HashMap<>();
        Player player = new Player.Builder("Striker").lastName("Ronaldo").age(27).sponsor("Adidas").build();
        Player player1 = new Player.Builder("Defender").lastName("Ramos").age(30).sponsor("Nike").build();

        Broadcaster channel = new Broadcaster.Builder("SS3").build();
        TechnicalTeam coach = new TechnicalTeam.Builder("Physical").build();

        players.add(player);
        players.add(player1);

        values.put("team Name", "Real Madrid");
        values.put("location", "Italy");
        values.put("channel", "SS4");
        values.put("coach", "Raffa Benitez");
        values.put("sponsor", "Adidas");

        Team team = TeamFactory.createTeam(values, channel, coach, players);

        repository.save(team);
        id = team.getId();
        Assert.assertNotNull(team.getId());
    }

    //@Test
    public void testGetTeamPlayers() throws Exception{
        List<Player> players = service.getPlayers(id);
        Assert.assertTrue(players.size() == 2);
    }
}
