package za.ac.PremierSoccerLeague.repository;

/**
 * Created by student on 2015/05/03.
 */
/*public class TestCrudLeague {
    private Long id;

    Broadcaster channel;
    
    @Autowired
    LeagueRepository repository;

    @Test
    public void testCraete() throws Exception {
        List<Team> teams = new ArrayList<Team>();
        League league = new League.Builder("Bundeshliga").country("Grmany").channel(channel).build();
        repository.save(league);
        id = league.getId();
        Assert.notNull(league);
    }

    @Test
    public void testRead() throws Exception {
        League league = repository.findOne(id);
        org.junit.Assert.assertEquals("Bundeshliga", league.getName());
    }

    @Test
    public void testUpdate() throws Exception {
        League league = repository.findOne(id);
        League newLeague = new League.Builder("Berclays Premiership").country("England").build();
        repository.save(newLeague);
        junit.framework.Assert.assertEquals("Berclays Premiership", league.getName());
        junit.framework.Assert.assertEquals("England", league.getCountry());
    }

    @Test
    public void testDelete() throws Exception {
        League league = repository.findOne(id);
        repository.delete(league);
        League newLeague = repository.findOne(id);
        Assert.isNull(newLeague);

    }
}*/
