package za.ac.PremierSoccerLeague.domain;

import org.junit.Assert;
import org.junit.Before;
import za.ac.PremierSoccerLeague.conf.factory.TournamentFactory;

/**
 * Created by student on 2015/05/03.
 */
public class TournamentTest {
    @Before
    public void setUp() throws Exception {

    }

    //@Test
    public void testCreateTournament() throws Exception {
        String name;
        int numOfTeams;
        double prize;

        Tournament tournament = TournamentFactory.createTournament("Nedbank Cup", 16, 2000000.00 );
        Assert.assertEquals("Nedbank Cup", tournament.getName());
    }

    //@Test
    public void testUpdate() throws Exception {
        String name;
        int numOfTeams;
        double prize;

        Tournament tournament = TournamentFactory.createTournament("Nedbank Cup", 16, 2000000.00 );
        Assert.assertEquals("Nedbank Cup", tournament.getName());

        Tournament newTournament = new Tournament.Builder("MTN Top 8").numOfTeams(8).copy(tournament)
                                    .prize(5000000.00).build();
        Assert.assertEquals("Nedbank Cup", newTournament.getName());
        Assert.assertEquals(16, newTournament.getNumOfTeams());
        Assert.assertEquals(16, tournament.getNumOfTeams());
    }
}
