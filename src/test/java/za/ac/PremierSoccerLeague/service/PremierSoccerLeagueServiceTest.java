package za.ac.PremierSoccerLeague.service;

import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.annotations.BeforeMethod;
import za.ac.PremierSoccerLeague.App;
import za.ac.PremierSoccerLeague.conf.factory.PremierSoccerLeagueFactory;
import za.ac.PremierSoccerLeague.domain.PremierSoccerLeague;
import za.ac.PremierSoccerLeague.domain.Stadium;
import za.ac.PremierSoccerLeague.repository.PremierSoccerLeagueRepository;
import za.ac.PremierSoccerLeague.services.Implementation.PremierSoccerLeagueService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Songezo on 2015-05-21.
 */
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class PremierSoccerLeagueServiceTest extends AbstractTestNGSpringContextTests {
    @Autowired
    private PremierSoccerLeagueService service;
    private Long id;

    @Autowired
    private PremierSoccerLeagueRepository repository;
    private List<Stadium> stadiums;

    @BeforeMethod
    public void setUp() throws Exception {
        stadiums = new ArrayList<Stadium>();

    }

    //@Test
    public void create() throws Exception {

        List<Stadium> stadiums = new ArrayList<Stadium>();
        Map<String,String> values = new HashMap<>();
        Stadium stadium = new Stadium.Builder("Old Trafford").location("London").build();
        Stadium stadium2 = new Stadium.Builder("Fly Emirates").location("England").build();

        stadiums.add(stadium);
        stadiums.add(stadium2);

        values.put("name", "Berclays Premier Soccer League");
        values.put("abbreviation", "BPL");

        PremierSoccerLeague premierSoccerLeague = PremierSoccerLeagueFactory.createPremierSoccerLeague(values, stadiums);

        repository.save(premierSoccerLeague);
        id = premierSoccerLeague.getId();
        Assert.assertNotNull(premierSoccerLeague.getId());
    }

    //@Test
    public void testGetPremierSoccerLeagueStadiums() throws Exception {
        List<Stadium> stadiums = service.getStadiums(id);
        Assert.assertTrue(stadiums.size() == 2);
    }
}
