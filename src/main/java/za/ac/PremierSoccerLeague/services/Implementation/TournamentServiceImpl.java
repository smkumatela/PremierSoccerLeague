package za.ac.PremierSoccerLeague.services.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.PremierSoccerLeague.domain.Tournament;
import za.ac.PremierSoccerLeague.repository.TournamentRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Songezo on 2015-08-09.
 */
public class TournamentServiceImpl implements TournamentService {
    @Autowired
    TournamentRepository repository;

    public List<Tournament> getTournaments() {
        List<Tournament> allTournaments = new ArrayList<Tournament>();

        Iterable<Tournament> tournaments = repository.findAll();
        for (Tournament tournament: tournaments)
        {
            allTournaments.add(tournament);
        }
        return allTournaments;
    }

}
