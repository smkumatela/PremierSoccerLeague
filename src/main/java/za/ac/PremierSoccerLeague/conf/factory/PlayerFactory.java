package za.ac.PremierSoccerLeague.conf.factory;

import za.ac.PremierSoccerLeague.domain.Player;

import java.util.Map;

/**
 * Created by student on 2015/04/25.
 */
public class PlayerFactory {
    public static Player createPlayer(Map<String, String> values, int age){
        Player player = new Player
                .Builder(values.get("position"))
                .lastName(values.get("lastName"))
                .sponsor("Adidas").age(27)
                .build();
        return player;
    }
}
