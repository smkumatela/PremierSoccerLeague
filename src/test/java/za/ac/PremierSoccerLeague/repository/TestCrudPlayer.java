package za.ac.PremierSoccerLeague.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;
import za.ac.PremierSoccerLeague.App;
import za.ac.PremierSoccerLeague.conf.factory.PlayerFactory;
import za.ac.PremierSoccerLeague.domain.Player;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/05/03.
 */
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class TestCrudPlayer extends AbstractTestNGSpringContextTests{
    private Long id;

    @Autowired
    PlayerRepository repository;

    //@Test
    public void testCreate() throws Exception {
        //List<Sponsor> sponsors = new ArrayList<Sponsor>();
        Map<String,String> values = new HashMap<>();

//        Sponsor sponsor = new Sponsor.Builder("Nike").sponsors("Ronaldo").build();
//        Sponsor sponsor2 = new Sponsor.Builder("Pumma").sponsors("Musona").build();
//
//        sponsors.add(sponsor);
//        sponsors.add(sponsor2);

        values.put("lastName", "Musona");
        values.put("position", "Striker");
        values.put("sponsor", "Adidas");

        Player player = PlayerFactory.createPlayer(values, 27);


       repository.save(player);
       id = player.getId();     //<---This might be another reason for errors
        Assert.assertNotNull(id);

    }

    //@Test(dependsOnMethods = "testCreate")
    public void testRead() throws Exception {
        Player player = repository.findOne(id);
        Assert.assertEquals("Musona", player.getLastName());
    }

    //@Test(dependsOnMethods = "testRead")
    public void testUpdate() throws Exception {
        Player player = repository.findOne(id);
        Player newPlayer = new Player.Builder("Middlefilder").copy(player).lastName("Letsolonyane").sponsor("Adidas").age(27).build();
        repository.save(newPlayer);
        Assert.assertEquals("Striker", player.getPosition());
        Assert.assertEquals("Musona", player.getLastName());
        Assert.assertEquals("Adidas", player.getSponsor());
        Assert.assertEquals(27, player.getAge());
    }

    //@Test(dependsOnMethods = "testUpdate")
    public void testDelete() throws Exception {

        Player player = repository.findOne(id);
        repository.delete(player);
        Player newPlayer = repository.findOne(id);
        Assert.assertNull(newPlayer);
    }
}
