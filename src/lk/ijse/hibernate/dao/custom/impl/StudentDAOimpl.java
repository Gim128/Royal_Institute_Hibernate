package lk.ijse.hibernate.dao.custom.impl;

import lk.ijse.hibernate.dao.custom.StudentDAO;
import lk.ijse.hibernate.entity.Student;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class StudentDAOimpl implements StudentDAO{
    @Override
    public boolean add(Student entity) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();

        session.save(entity);

        Transaction transaction = session.beginTransaction();

        transaction.commit();

        session.close();
        return true;
    }

    @Override
    public boolean delete(Student entity) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();

        session.delete(entity);

        Transaction transaction = session.beginTransaction();

        transaction.commit();

        session.close();
        return true;
    }

    @Override
    public boolean update(Student entity) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();

        session.update(entity);

        Transaction transaction = session.beginTransaction();

        transaction.commit();

        session.close();
        return true;
    }

    @Override
    public Student find(String s) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        Student student = session.get(Student.class, s);

        transaction.commit();

        session.close();

        return student;
    }

    @Override
    public List<Student> findAll() throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        Query from_customer = session.createQuery("from Student");

        List<Student> list = from_customer.list();

        transaction.commit();
        session.close();
        return list;
    }
}
