//package za.ac.PremierSoccerLeague.domain;
//
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import za.ac.PremierSoccerLeague.conf.factory.SponsorFactory;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * Created by student on 2015/04/25.
// */
//public class SponsorTest {
//    @Before
//    public void setUp() throws Exception {
//
//    }
//
//    @Test
//    public void testCreateSponsor() throws Exception {
//       // List<Player> players = new ArrayList<Player>();
//        Map<String, String> values = new HashMap<String, String>();
//
//        values.put("name", "PUMMA");
//        values.put("sponsors", "Ronaldo");
//
//        Sponsor sponsor = SponsorFactory.createSponsor(values/* players*/);
//
//        Assert.assertEquals("Ronaldo", sponsor.getSponsors());
//        Assert.assertEquals("PUMMA", sponsor.getName());
//    }
//
//    @Test
//    public void testUpdate() throws Exception {
//        //List<Player> players = new ArrayList<Player>();
//        Map<String, String> values = new HashMap<String, String>();
//
//        values.put("name", "PUMMA");
//        values.put("sponsors", "Ronaldo");
//
//        Sponsor sponsor = SponsorFactory.createSponsor(values /*players*/);
//
//        Sponsor newSponsor = new Sponsor.Builder("puma").sponsors("Ronaldo").copy(sponsor).build();
//
//        Assert.assertEquals("Ronaldo", newSponsor.getSponsors());
//        Assert.assertEquals("PUMMA", newSponsor.getName());
//        Assert.assertEquals("Ronaldo", sponsor.getSponsors());
//
//    }
//}
