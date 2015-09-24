package za.ac.PremierSoccerLeague.services.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.PremierSoccerLeague.domain.PremierSoccerLeague;
import za.ac.PremierSoccerLeague.domain.Stadium;
import za.ac.PremierSoccerLeague.repository.PremierSoccerLeagueRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Songezo on 2015-05-20.
 */
@Service
public class PremierSoccerLeagueServiceImpl implements PremierSoccerLeagueService {
    @Autowired
    PremierSoccerLeagueRepository repository;

    public List<PremierSoccerLeague> getPremierSoccerLeagues()
    {
        List<PremierSoccerLeague> allLeagues = new ArrayList<PremierSoccerLeague>();

        Iterable<PremierSoccerLeague> PremierSoccerLeagues = repository.findAll();
        for (PremierSoccerLeague premierSoccerLeague : PremierSoccerLeagues)
        {
            allLeagues.add(premierSoccerLeague);
        }
            return allLeagues;
    }

    @Override
    public List<Stadium> getStadiums(Long id) {
        return repository.findOne(id).getStadiums();
    }
}
