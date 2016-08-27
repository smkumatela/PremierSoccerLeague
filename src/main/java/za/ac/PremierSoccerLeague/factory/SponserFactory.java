package za.ac.PremierSoccerLeague.factory;

import za.ac.PremierSoccerLeague.domain.Sponsor;

import java.util.Map;

/**
 * Created by Songezo on 2016-08-06.
 */
public class SponserFactory {
    public static Sponsor createSponsor(Map<String, String> values){
        return new Sponsor
                .Builder(values.get("name"))
                .sponsors("sponsor")
                .build();
    }
}
