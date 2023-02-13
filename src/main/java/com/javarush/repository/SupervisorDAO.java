package com.javarush.repository;

import com.javarush.entities.Supervisor;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SupervisorDAO {
    private final DBConnection dbConnection;

    public SupervisorDAO(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }


    public List<Supervisor> findAll() {
        List<Supervisor> list = null;
        Session session = dbConnection.getSession(Supervisor.class);

        try (session) {
            session.beginTransaction();

            Query<Supervisor> supervisors = session.createQuery("select sup from Supervisor sup", Supervisor.class);
            list = supervisors.list();

            session.getTransaction().commit();
        } catch (RuntimeException e) {
            session.getTransaction().rollback();
        }

        return list;
    }
}
