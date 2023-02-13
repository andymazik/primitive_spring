package com.javarush.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;


@SuppressWarnings({"rawtypes", "resource"})
@Repository
public class DBConnection {
    private Session session;

    public Session getSession(Class tClass) {
        if (session == null) {
            SessionFactory sessionFactory = new Configuration()
                    .addAnnotatedClass(tClass)
                    .buildSessionFactory();

            session = sessionFactory.openSession();
        }

        return session;
    }
}
