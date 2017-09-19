package sample;

import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by RENT on 2017-09-19.
 */
//3. (2) Stwórz encję Match (player1Score, player2Score, finished, round, occurenceDateTime, String player1, String player2)
public class Match {
    int player1Score;
    int player2Score;
    boolean finished;
    int round;
    LocalDateTime occurenceDateTime;
    @ManyToOne
    private Player player1;
    @ManyToOne
    private Player player2;

}
