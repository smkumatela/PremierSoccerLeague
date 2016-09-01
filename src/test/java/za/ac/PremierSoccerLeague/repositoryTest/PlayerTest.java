package za.ac.PremierSoccerLeague.repositoryTest;

/**
 * Created by radebeth on 2016-08-06.
 */

//@SpringApplicationConfiguration(classes = App.class)
//@WebAppConfiguration
//public class PlayerTest extends AbstractTestNGSpringContextTests {
//
//    @Autowired
//    private PlayerRepository repository  ;
//    Map<String,String> playerMap;
//    Long id;
//
//    @BeforeMethod
//    public void setUp() throws Exception {
//
//        playerMap = new HashMap<>();
//    }
//
//    @Test
//    public void testCreate() throws Exception {
//        playerMap.put("position","Forward");
//        playerMap.put("lastName","Hadebe");
//        playerMap.put("sponsor","Adidas");
//
//        Player player = PlayerFactory.createPlayer(playerMap,64);
//
//        Player playerId = repository.save(player);
//        id = playerId.getId();
//        Assert.assertEquals(player.getLastName(),"Hadebe");
//    }
//}
