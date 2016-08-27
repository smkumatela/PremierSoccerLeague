package za.ac.PremierSoccerLeague.factory;

import za.ac.PremierSoccerLeague.domain.TechnicalTeam;

import java.util.Map;

/**
 * Created by student on 2015/04/26.
 */
public class TechnicalTeamFactory {
    public static TechnicalTeam craeteTechnicalTeam(Map<String, String> values){

        return new TechnicalTeam
                .Builder(values.get("name"))
                .coaching(values.get("coaching"))
                .build();

    }
}
