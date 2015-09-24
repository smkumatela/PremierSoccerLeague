//package za.ac.PremierSoccerLeague.domain;
//
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import za.ac.PremierSoccerLeague.conf.factory.StadiumFactory;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * Created by student on 2015/04/26.
// */
//public class StadiumTest {
//    @Before
//    public void setUp() throws Exception {
//
//
//    }
//
//    @Test
//    public void testCreateStadium() throws Exception {
//        Map<String, String> values = new HashMap<String, String>();
//
//        values.put("name", "Old Trafford");
//        values.put("location", "England");
//
//        Stadium stadium = StadiumFactory.craeteStadium(values);
//
//        Assert.assertEquals("Old Trafford", stadium.getName());
//
//    }
//
//    @Test
//    public void testUpdate() throws Exception {
//        Map<String, String> values = new HashMap<String, String>();
//
//        values.put("name", "Old Trafford");
//        values.put("location", "England");
//
//        Stadium stadium = StadiumFactory.craeteStadium(values);
//
//        Stadium newStadium = new Stadium.Builder(stadium.getName())
//                .copy(stadium).location("London").build();
//
//        Assert.assertEquals("Old Trafford", newStadium.getName());
//        Assert.assertEquals("London", newStadium.getLocation());
//        Assert.assertEquals("England", stadium.getLocation());
//    }
//}
