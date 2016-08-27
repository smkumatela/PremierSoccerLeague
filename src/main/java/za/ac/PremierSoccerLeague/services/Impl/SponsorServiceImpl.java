package za.ac.PremierSoccerLeague.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.PremierSoccerLeague.domain.Sponsor;
import za.ac.PremierSoccerLeague.repository.SponsorRepository;
import za.ac.PremierSoccerLeague.services.SponsorService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Songezo on 2016-08-10.
 */
public class SponsorServiceImpl implements SponsorService {

    @Autowired
    private SponsorRepository repository;

    @Override
    public List<Sponsor> getSponsors() {
        List<Sponsor> allSponsors = new ArrayList<>();

        Iterable<Sponsor> sponsors = repository.findAll();
        for (Sponsor sponsor : sponsors)
            {
                allSponsors.add(sponsor);
            }
        return allSponsors;
    }
}
