/*package za.ac.PremierSoccerLeague.repository;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import za.ac.PremierSoccerLeague.App;

/**
 * Created by student on 2015/05/03.
 *//*
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class TestCrudBroadcaster extends AbstractTestNGSpringContextTests{

    /*private Map<String,String> values;
    private Long id;

    @Autowired
    BroadcasterRepository repository;

    @BeforeMethod
    public void setUp() throws Exception {
        values = new HashMap<String, String>();

    }

    @Test
    public void testCreate() throws Exception {
        Broadcaster broadcaster = new Broadcaster.Builder("SABC").offers("Cup Games").build();


//        values.put("SABC", "League Match");

        repository.save(broadcaster);
        id = broadcaster.getId();
        Assert.assertNotNull(broadcaster.getId());
    }

   /* @Test
    public void testRead() throws Exception {
        Broadcaster broadcaster = repository.findOne(id);
        Assert.assertEquals("SABC", broadcaster.getchannel());
    }

    @Test
    public void testUpdate() throws Exception {
        Broadcaster broadcaster = repository.findOne(id);
        Broadcaster newBroadcaster = new Broadcaster.Builder("SS3").offers("League Games").build();
        repository.save(newBroadcaster);
        Assert.assertEquals("SS3", broadcaster.getchannel());
        Assert.assertEquals("League Games", broadcaster.getOffers());
    }

    @Test
    public void testDelete() throws Exception {
        Broadcaster broadcaster = repository.findOne(id);
        repository.delete(broadcaster);
        Broadcaster newBroadcaster = repository.findOne(id);
        Assert.assertNull(newBroadcaster);
    }

}
*/