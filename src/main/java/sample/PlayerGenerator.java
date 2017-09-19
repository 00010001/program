package sample;

/**
 * Created by RENT on 2017-09-19.
 */
public class PlayerGenerator {

    public Player generate(int numeberOfPlayers) {
        for (int i = 0; i < numeberOfPlayers; i++) {
            Player player = new Player();
            player.setUsername(String.valueOf(i));

        }

        return null;
    }
}
