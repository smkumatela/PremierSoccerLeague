package za.ac.PremierSoccerLeague.domain;

import org.junit.Assert;
import org.junit.Before;
import za.ac.PremierSoccerLeague.conf.factory.TechnicalTeamFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/04/26.
 */
public class TechnicalTeamTest {
    @Before
    public void setUp() throws Exception {


    }

    //@Test
    public void testCreateTechnicalTeam() throws Exception {
        Map<String, String> values = new HashMap<String, String>();

        values.put("name", "Physician");
        values.put("coaching", "Defenders");

        TechnicalTeam technicalTeam = TechnicalTeamFactory.craeteTechnicalTeam(values);

        Assert.assertEquals("Physician", technicalTeam.getName());
    }

    //@Test
    public void testUpdate() throws Exception {
        Map<String, String> values = new HashMap<String, String>();

        values.put("name", "Physician");
        values.put("coaching", "Defenders");

        TechnicalTeam technicalTeam = TechnicalTeamFactory.craeteTechnicalTeam(values);

        TechnicalTeam newTechnicalTeam = new TechnicalTeam.Builder(technicalTeam.getName())
                .copy(technicalTeam).coaching("Goal Keepers").build();

        Assert.assertEquals("Physician", newTechnicalTeam.getName());
        Assert.assertEquals("Goal Keepers", newTechnicalTeam.getCoaching());
        Assert.assertEquals("Defenders", technicalTeam.getCoaching());
    }
}
