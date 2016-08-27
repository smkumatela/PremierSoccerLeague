package za.ac.PremierSoccerLeague.factory;

import za.ac.PremierSoccerLeague.domain.Broadcaster;

import java.util.Map;

/**
 * Created by student on 2015/04/26.
 */
public class BroadcasterFactory {
    public static Broadcaster createBroadcaster(Map<String, String> values){

        Broadcaster broadcaster = new Broadcaster
                .Builder(values.get("channel"))
                .offers(values.get("offers"))
                .build();

        return broadcaster;
    }
}
