package sample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.time.LocalDate;

/**
 * Created by RENT on 2017-09-19.
 */
public class Main {
    public static void main(String[] args) {

        PlayerGenerator playerGenerator = new PlayerGenerator();
        playerGenerator.generate(20);
    }
}
