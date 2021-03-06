package za.ac.PremierSoccerLeague.repositoryTest;


/**
 * Created by Songezo on 2016-08-06.
 */
//@SpringApplicationConfiguration(classes = App.class)
//@WebAppConfiguration
//public class Test_CRUD_Tournament extends AbstractTestNGSpringContextTests {
//
//    @Autowired
//    TournamentRepository repository;
//    private Long id;
//
//    @Test
//    public void testCreate() throws Exception {
//        Tournament tournament = TournamentFactory.createTournament("Nedbank Cup", 16, 2000000.00);
//        repository.save(tournament);
//        id = tournament.getId();
//        Assert.assertNotNull(tournament.getId());
//    }
//
//    @Test(dependsOnMethods = "testCreate")
//    public void testRead() throws Exception {
//        Tournament tournament = repository.findOne(id);
//        Assert.assertEquals("Nedbank Cup", tournament.getName());
//    }
//
//    @Test(dependsOnMethods = "testRead")
//    public void testUpdate() throws Exception {
//        Tournament tournament = repository.findOne(id);
//        Tournament newTournament = new Tournament.Builder("MTN Top 8").numOfTeams(8).copy(tournament)
//                .prize(5000000.00).build();
//        repository.save(newTournament);
//        Assert.assertEquals("Nedbank Cup", tournament.getName());
//        Assert.assertEquals(16, tournament.getNumOfTeams());
//        Assert.assertEquals(2000000.00, tournament.getPrize());
//    }
//
//    @Test(dependsOnMethods = "testUpdate")
//    public void testDelete() throws Exception {
//        Tournament tournament = repository.findOne(id);
//        repository.delete(tournament);
//        Tournament newTournament = repository.findOne(id);
//        Assert.assertNull(newTournament);
//    }
//}
