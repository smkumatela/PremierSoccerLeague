package za.ac.PremierSoccerLeague.domain;

import org.junit.Assert;
import org.junit.Before;
import za.ac.PremierSoccerLeague.conf.factory.BroadcasterFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/04/26.
 */
public class BroadcasterTest {
    @Before
    public void setUp() throws Exception {


    }

    //@Test
    public void testCreateBroadcaster() throws Exception {
        Map<String, String> values = new HashMap<String, String>();

        values.put("channel", "SS4");
        values.put("offers", "Tourchannelnts");

        Broadcaster broadcaster = BroadcasterFactory.createBroadcaster(values);

        Assert.assertEquals("SS4", broadcaster.getchannel());

    }

    //@Test
    public void testUpdate() throws Exception {
        Map<String, String> values = new HashMap<String, String>();

        values.put("channel", "SS4");
        values.put("offers", "Tourchannelnts");

        Broadcaster broadcaster = BroadcasterFactory.createBroadcaster(values);

        Broadcaster newBroadcaster = new Broadcaster.Builder(broadcaster.getchannel()).copy(broadcaster)
                .offers("Friendly Matches").build();

        Assert.assertEquals("SS4", newBroadcaster.getchannel());
        Assert.assertEquals("Friendly Matches", newBroadcaster.getOffers());
        Assert.assertEquals("Tourchannelnts", broadcaster.getOffers());

    }
}
