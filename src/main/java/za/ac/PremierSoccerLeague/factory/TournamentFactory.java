package za.ac.PremierSoccerLeague.factory;

import za.ac.PremierSoccerLeague.domain.Tournament;

/**
 * Created by student on 2015/05/03.
 */
public class TournamentFactory {
    public static Tournament createTournament(String name, int numOfTeams, double prize){

       return new Tournament
               .Builder(name)
               .numOfTeams(numOfTeams)
               .prize(prize)
               .build();
    }
}
