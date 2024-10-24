package mate.academy;

import mate.academy.exceptions.DataProcessingException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory sessionFactory = initSessionFactory();

    private HibernateUtil() {
    }

    private static SessionFactory initSessionFactory() {
        try {
            return new Configuration().configure().buildSessionFactory();
        } catch (Exception e) {
            throw new DataProcessingException("Can't create session factory ", e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
