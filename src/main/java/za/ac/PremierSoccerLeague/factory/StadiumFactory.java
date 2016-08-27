package za.ac.PremierSoccerLeague.factory;

import za.ac.PremierSoccerLeague.domain.Stadium;

import java.util.Map;

/**
 * Created by Songezo on 2016-08-06.
 */
public class StadiumFactory {
    public static Stadium createStadium(Map<String, String> values){
        return new Stadium
                .Builder(values.get("name"))
                .location(values.get("location"))
                .build();
    }
}
