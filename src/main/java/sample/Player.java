package sample;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by RENT on 2017-09-19.
 */
@Entity
public class Player {
    private String firstName;
    private String lastName;
    private String username;

    @ManyToMany
    private Set<Match> participatedMatches = new HashSet<>();


    public Player() {
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
