package za.ac.PremierSoccerLeague.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.PremierSoccerLeague.domain.Stadium;
import za.ac.PremierSoccerLeague.repository.StadiumRepository;
import za.ac.PremierSoccerLeague.services.StadiumService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Songezo on 2016-08-10.
 */
public class StadiumServiceImpl implements StadiumService {

    @Autowired
    private StadiumRepository repository;

    @Override
    public List<Stadium> getStadiums() {
        List<Stadium> allStadiums = new ArrayList<>();

        Iterable<Stadium> stadiums = repository.findAll();
        for (Stadium stadium : stadiums)
            {
                allStadiums.add(stadium);
            }
        return allStadiums;
    }
}
