/*package za.ac.PremierSoccerLeague.repository;

/**
 * Created by student on 2015/05/03.
 */
/*public class TestCrudTechnicalTeam {
/*
    private Long id;
    
    @Autowired
    TechnicalTeamRepository repository;

    @Test
    public void testCreate() throws Exception {
        TechnicalTeam technicalTeam = new TechnicalTeam.Builder("Tovey").coaching("Deffence coach").build();
        repository.save(technicalTeam);
        id = technicalTeam.getId();
        Assert.assertNotNull(technicalTeam.getId());
    }

    @Test
    public void testRead() throws Exception {
        TechnicalTeam technicalTeam = repository.findOne(id);
        Assert.assertEquals("Tovey", technicalTeam.getId());
    }

    @Test
    public void testUpdate() throws Exception {
        TechnicalTeam technicalTeam = repository.findOne(id);
        TechnicalTeam newTechnicalTeam = new TechnicalTeam.Builder("Pitso").coaching("Head coach").build();
        repository.save(newTechnicalTeam);
        Assert.assertEquals("Pitso", technicalTeam.getName());
        Assert.assertEquals("Head coach", technicalTeam.getCoaching());
    }

    @Test
    public void testDelete() throws Exception {
        TechnicalTeam technicalTeam = repository.findOne(id);
        repository.delete(technicalTeam);
        TechnicalTeam newTechnicalTeam = repository.findOne(id);
        Assert.assertNull(newTechnicalTeam);
    }
    }*/
