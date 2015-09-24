package za.ac.PremierSoccerLeague.domain;

import org.junit.Assert;
import org.junit.Before;
import za.ac.PremierSoccerLeague.conf.factory.PlayerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/04/25.
 */
public class PlayerTest {
    @Before
    public void setUp() throws Exception {

    }

    //@Test
    public void testCreatePlayer() throws Exception {
        Map<String, String> values = new HashMap<String, String>();

        values.put("lastName", "Musona");
        values.put("position", "Striker");
        values.put("sponsor", "Adidas");

        Player player = PlayerFactory.createPlayer(values, 27);

        Assert.assertEquals("Striker", player.getPosition());
        Assert.assertEquals("Musona", player.getLastName());
    }

    //@Test
    public void testUpdate() throws Exception {

        //List<Sponsor> sponsors = new ArrayList<Sponsor>();
        Map<String, String> values = new HashMap<String, String>();

        values.put("lastName", "Musona");
        values.put("position", "Striker");
        values.put("sponsor", "Adidas");

        Player player = PlayerFactory
                .createPlayer(values, 27);

        Player newPlayer = new Player
                .Builder(player.getPosition())
                .copy(player).lastName("Lebese").sponsor("Nike").build();

        Assert.assertEquals("Striker", newPlayer.getPosition());
        Assert.assertEquals("Lebese", newPlayer.getLastName());
        Assert.assertEquals("Musona", player.getLastName());
        Assert.assertEquals("Adidas", player.getSponsor());

    }
}
