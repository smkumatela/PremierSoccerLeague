package za.ac.PremierSoccerLeague.repositoryTest;

/**
 * Created by Songezo on 2016-08-06.
 */
//@SpringApplicationConfiguration(classes = App.class)
//@WebAppConfiguration
//public class Test_CRUD_PremierSoccerLeague extends AbstractTestNGSpringContextTests {
//
//    @Autowired
//    private PremierSoccerLeagueRepository repository;
//    private Map<String,String> values;
//    private ArrayList<Stadium> stadiums;
//    private Long id;
//
//
//    @BeforeMethod
//    public void setUp() throws Exception {
//        values = new HashMap<>();
//        stadiums = new ArrayList<Stadium>();
//
//    }
//
//    @Test
//    public void testCreate() throws Exception {
//        Stadium stadium = new Stadium.Builder("Old Trafford").location("London").build();
//        Stadium stadium2 = new Stadium.Builder("Fly Emirates").location("England").build();
//
//        stadiums.add(stadium);
//        stadiums.add(stadium2);
//
//        values.put("name", "Berclays Premier Soccer League");
//        values.put("abbreviation", "PSL");
//
//        PremierSoccerLeague premierSoccerLeague = PremierSoccerLeagueFactory
//                                                    .createPremierSoccerLeague(values, stadiums);
//        repository.save(premierSoccerLeague);
//        id = premierSoccerLeague.getId();
//        Assert.assertNotNull(id);
//    }
//    @Test(dependsOnMethods ="testCreate")
//    public void testRead() throws Exception {
//        PremierSoccerLeague psl = repository.findOne(id);
//        Assert.assertEquals(psl.getAbbreviation(), "PSL");
//    }
//
//    @Test(dependsOnMethods = "testRead")
//    public void testUpdate() throws Exception {
//        PremierSoccerLeague premierSoccerLeague = repository.findOne(id);
//        PremierSoccerLeague newPremierSoccerLeague = new PremierSoccerLeague
//                .Builder("BPL").copy(premierSoccerLeague).Leaguename("Berclays Premiership").build();
//        repository.save(newPremierSoccerLeague);
//        Assert.assertEquals("PSL", premierSoccerLeague.getAbbreviation());
//        Assert.assertEquals("Berclays Premier Soccer League", premierSoccerLeague.getLeagueName());
//    }
//
//    @Test(dependsOnMethods = "testUpdate")
//    public void testDelete() throws Exception {
//        PremierSoccerLeague premierSoccerLeague = repository.findOne(id);
//        repository.delete(premierSoccerLeague);
//        PremierSoccerLeague newPremierSoccerLeague = repository.findOne(id);
//        Assert.assertNull(newPremierSoccerLeague);
//    }
//}
