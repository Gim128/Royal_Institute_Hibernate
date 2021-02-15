package lk.ijse.hibernate.dao.custom.impl;

import lk.ijse.hibernate.dao.custom.RegistrationDAO;
import lk.ijse.hibernate.entity.Registration;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class registrationDAOimpl implements RegistrationDAO {
    @Override
    public boolean add(Registration entity) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        session.save(entity);
        Transaction transaction = session.beginTransaction();
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean delete(Registration entity) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        session.delete(entity);
        Transaction transaction = session.beginTransaction();
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Registration entity) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        session.update(entity);
        Transaction transaction = session.beginTransaction();
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public Registration find(String s) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Registration registration = session.get(Registration.class, s);
        Transaction transaction = session.beginTransaction();
        transaction.commit();
        session.close();
        return registration;
    }

    @Override
    public List<Registration> findAll() throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Query from_find = session.createQuery("from Registration ");
        List<Registration> list = from_find.list();
        Transaction transaction = session.beginTransaction();
        transaction.commit();
        session.close();
        return list;
    }

    @Override
    public String getLastRegId() throws Exception {
        return null;
    }
}
