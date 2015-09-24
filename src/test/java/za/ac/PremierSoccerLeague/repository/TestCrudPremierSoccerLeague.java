package za.ac.PremierSoccerLeague.repository;

import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import za.ac.PremierSoccerLeague.App;
import za.ac.PremierSoccerLeague.conf.factory.PremierSoccerLeagueFactory;
import za.ac.PremierSoccerLeague.domain.PremierSoccerLeague;
import za.ac.PremierSoccerLeague.domain.Stadium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by student on 2015/05/02.
 */
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class TestCrudPremierSoccerLeague extends AbstractTestNGSpringContextTests{
    private Long id;


    @Autowired
    PremierSoccerLeagueRepository repository;

    //@Test
    public void testCreate() throws Exception {

        List<Stadium> stadiums = new ArrayList<Stadium>();
        Map<String,String> values = new HashMap<>();
        Stadium stadium = new Stadium.Builder("Old Trafford").location("London").build();
        Stadium stadium2 = new Stadium.Builder("Fly Emirates").location("England").build();

        stadiums.add(stadium);
        stadiums.add(stadium2);

        values.put("name", "Berclays Premier Soccer League");
        values.put("abbreviation", "BPL");

        PremierSoccerLeague premierSoccerLeague = PremierSoccerLeagueFactory.createPremierSoccerLeague
                                                  (values, stadiums);

        repository.save(premierSoccerLeague);
        id = premierSoccerLeague.getId();
        Assert.assertNotNull(id);
    }

    //@Test(dependsOnMethods = "testCreate")
    public void testRead() throws Exception {
        PremierSoccerLeague premierSoccerLeague = repository.findOne(id);
        Assert.assertEquals("Berclays Premier Soccer League", premierSoccerLeague.getLeaguename());
    }


    //@Test(dependsOnMethods = "testRead")
    public void testUpdate() throws Exception {
        PremierSoccerLeague premierSoccerLeague = repository.findOne(id);
        PremierSoccerLeague newPremierSoccerLeague = new PremierSoccerLeague
                .Builder("BPL").copy(premierSoccerLeague).Leaguename("Berclays Premiership").build();
        repository.save(newPremierSoccerLeague);
        Assert.assertEquals("BPL", premierSoccerLeague.getAbbreviation());
        Assert.assertEquals("Berclays Premier Soccer League", premierSoccerLeague.getLeaguename());
    }

    //@Test(dependsOnMethods = "testUpdate")
    public void testDelete() throws Exception {
        PremierSoccerLeague premierSoccerLeague = repository.findOne(id);
        repository.delete(premierSoccerLeague);
        PremierSoccerLeague newPremierSoccerLeague = repository.findOne(id);
        Assert.assertNull(newPremierSoccerLeague);
    }

}
