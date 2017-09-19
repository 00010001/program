package sample;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionFactoryManager {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if(sessionFactory == null) {
            StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder()
                    // Ustawienia dotyczące połączenia z bazą (należy zmienić tak, aby odpowiadało lokalnej konfiguracji!).
                    .applySetting("hibernate.connection.url", "jdbc:mysql://localhost:3306/program_db")
                    .applySetting("hibernate.connection.username", "root")
                    .applySetting("hibernate.connection.password", "123qwe")
                    .applySetting("hibernate.connection.driver", "com.mysql.jdbc.Driver")
                    // Chcemy, aby tabele były tworzone korzystając z silnika innoDB - on obsługuje transakcje,
                    // domyślnie hibernate tworzy je korzystając z myIsam, który transakcji nie obsługuje.
                    .applySetting("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect")
                    .applySetting("hibernate.dialect.storage_engine", "innodb")
                    // Przy inicjalizacji na nowo utworzymy tabele w bazie
                    .applySetting("hibernate.hbm2ddl.auto", "create")
                    // Będziemy logowali zapytania wywoływane przez hibernate
                    .applySetting("hibernate.show_sql", "true")
                    // Zapytania będą "upiększone", jęśli chodzi o formatowanie.
                    .applySetting("hibernate.format_sql", "true")
                    .build();
            MetadataSources metadataSources = new MetadataSources(standardServiceRegistry);
            // Dodajemy klasy - encje

            Metadata metadata = metadataSources.buildMetadata();
            sessionFactory = metadata.buildSessionFactory();
        }
        return sessionFactory;
    }
}
