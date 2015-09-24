package za.ac.PremierSoccerLeague.domain;

import org.junit.Assert;
import org.junit.Before;
import za.ac.PremierSoccerLeague.conf.factory.PremierSoccerLeagueFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by student on 2015/04/24.
 */
public class PremierSoccerLeagueTest {
    @Before
    public void setUp() throws Exception {

    }

    //@Test
    public void testCreatePremierSoccerLeague() throws Exception {
        List<Stadium> stadiums = new ArrayList<Stadium>();
        Map<String, String> values = new HashMap<String, String>();

        values.put("abbreviation", "PSL");
        values.put("name", "Absa Premiership Soccer League");

        PremierSoccerLeague premierSoccerLeague = PremierSoccerLeagueFactory
                .createPremierSoccerLeague(values, stadiums);
        Assert.assertEquals("PSL", premierSoccerLeague.getAbbreviation());
    }

    //@Test
    public void testUpdate() throws Exception {

        List<Stadium> stadiums = new ArrayList<Stadium>();
        Map<String, String> values = new HashMap<String, String>();

        values.put("abbreviation", "PSL");
        values.put("name", "Absa Premiership Soccer League");

        PremierSoccerLeague premierSoccerLeague = PremierSoccerLeagueFactory
                .createPremierSoccerLeague(values, stadiums);

        PremierSoccerLeague newPremierSoccerLeague = new PremierSoccerLeague
                .Builder(premierSoccerLeague.getAbbreviation())
                .copy(premierSoccerLeague).Leaguename("Mvela Golden League").build();

        Assert.assertEquals("PSL", newPremierSoccerLeague.getAbbreviation());
        Assert.assertEquals("Mvela Golden League", newPremierSoccerLeague.getLeaguename());
        Assert.assertEquals("Absa Premiership Soccer League", premierSoccerLeague.getLeaguename());
    }
}




