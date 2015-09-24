package za.ac.PremierSoccerLeague.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;
import za.ac.PremierSoccerLeague.App;
import za.ac.PremierSoccerLeague.conf.factory.TournamentFactory;
import za.ac.PremierSoccerLeague.domain.Tournament;

/**
 * Created by Songezo on 2015-08-09.
 */
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class TestCrudTournament extends AbstractTestNGSpringContextTests {

    private Long id;

    @Autowired
    TournamentRepository repository;

 //   @Test
    public void testCreate() throws Exception{
        String name;
        int numOfTeams;
        double prize;

        Tournament tournament = TournamentFactory.createTournament("Nedbank Cup", 16, 2000000.00);
        repository.save(tournament);
        id = tournament.getId();
        Assert.assertNotNull(tournament.getId());
    }

  //  @Test(dependsOnMethods = "testCreate")
    public void testRead() throws Exception{
        Tournament tournament = repository.findOne(id);
        Assert.assertEquals("Nedbank Cup", tournament.getName());
    }

  //  @Test(dependsOnMethods = "testRead")
    public void testUpdate() throws Exception {
        Tournament tournament = repository.findOne(id);
        Tournament newTournament = new Tournament.Builder("MTN Top 8").numOfTeams(8).copy(tournament)
                .prize(5000000.00).build();
        repository.save(newTournament);
        Assert.assertEquals("Nedbank Cup", tournament.getName());
        Assert.assertEquals(16, tournament.getNumOfTeams());
        Assert.assertEquals(2000000.00, tournament.getPrize());
    }

  //  @Test(dependsOnMethods = "testUpdate")
    public void testDelete() throws Exception {
        Tournament tournament = repository.findOne(id);
        repository.delete(tournament);
        Tournament newTournament = repository.findOne(id);
        Assert.assertNull(newTournament);
    }
}
