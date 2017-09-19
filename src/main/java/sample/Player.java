package sample;

import javax.persistence.Entity;

/**
 * Created by RENT on 2017-09-19.
 */
@Entity
public class Player {
    private String firstName;
    private String lastName;
    private String username;

    public Player() {
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
