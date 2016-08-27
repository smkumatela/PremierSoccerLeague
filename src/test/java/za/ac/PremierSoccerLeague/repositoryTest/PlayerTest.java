package za.ac.PremierSoccerLeague.repositoryTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import za.ac.PremierSoccerLeague.App;
import za.ac.PremierSoccerLeague.domain.Player;
import za.ac.PremierSoccerLeague.factory.PlayerFactory;
import za.ac.PremierSoccerLeague.repository.PlayerRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by radebeth on 2016-08-06.
 */
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class PlayerTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private PlayerRepository repository  ;
    Map<String,String> playerMap;
    Long id;

    @BeforeMethod
    public void setUp() throws Exception {

        playerMap = new HashMap<>();
    }

    @Test
    public void testCreate() throws Exception {
        playerMap.put("position","Forward");
        playerMap.put("lastName","Hadebe");
        playerMap.put("sponsor","Adidas");

        Player player = PlayerFactory.createPlayer(playerMap,64);

        Player playerId = repository.save(player);
        id = playerId.getId();
        Assert.assertEquals(player.getLastName(),"Hadebe");
    }
}
