package za.ac.PremierSoccerLeague.conf.factory;

import za.ac.PremierSoccerLeague.domain.Tournament;

/**
 * Created by student on 2015/05/03.
 */
public class TournamentFactory {
    public static Tournament createTournament(String name, int numOfTeams, double prize){

        Tournament tournament = new Tournament.Builder("Nedbank Cup")
                                .numOfTeams(16).prize(2000000).build();
        return tournament;
    }
}
