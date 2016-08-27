package za.ac.PremierSoccerLeague.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.PremierSoccerLeague.domain.Tournament;
import za.ac.PremierSoccerLeague.repository.TournamentRepository;
import za.ac.PremierSoccerLeague.services.TournamentService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Songezo on 2015-08-09.
 */
@Service
public class TournamentServiceImpl implements TournamentService {
    @Autowired
    private TournamentRepository repository;

    public List<Tournament> getTournaments() {
        List<Tournament> allTournaments = new ArrayList<Tournament>();

        Iterable<Tournament> tournaments = repository.findAll();
        for (Tournament tournament : tournaments)
        {
            allTournaments.add(tournament);
        }
        return allTournaments;
    }

}
