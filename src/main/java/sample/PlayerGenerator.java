package sample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created by RENT on 2017-09-19.
 */
public class PlayerGenerator {

    public void generate(int numeberOfPlayers) {
        SessionFactory sessionFactory = SessionFactoryManager.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        for (int i = 0; i < numeberOfPlayers; i++) {
            Player player = new Player();
            player.setUsername("Gracz" + String.valueOf(i));
            session.save(player);

        }

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();

    }





    // School school = session.get(School.class, 1);
}