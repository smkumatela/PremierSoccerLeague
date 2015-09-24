package za.ac.PremierSoccerLeague.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Songezo on 2015-09-24.
 */
@RestController
@RequestMapping(value = "/")
public class Landing_page {

    public String gethi(){
        return "hello world";
    }
}
