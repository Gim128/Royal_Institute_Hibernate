package lk.ijse.hibernate.dao.custom.impl;

import lk.ijse.hibernate.dao.custom.CourseDAO;
import lk.ijse.hibernate.entity.Course;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class CourseDAOimpl implements CourseDAO{
    @Override
    public boolean add(Course entity) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        session.save(entity);
        Transaction transaction = session.beginTransaction();
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean delete(Course entity) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        session.delete(entity);
        Transaction transaction = session.beginTransaction();
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Course entity) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        session.update(entity);
        Transaction transaction = session.beginTransaction();
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public Course find(String s) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Course course = session.get(Course.class, s);
        Transaction transaction = session.beginTransaction();
        transaction.commit();
        session.close();
        return course;
    }

    @Override
    public List<Course> findAll() throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        Query from_course = session.createQuery("from Course ");
        List<Course> list = from_course.list();
        transaction.commit();
        session.close();
        return list;
    }

    @Override
    public String getLastCourseCode() throws Exception {
        return null;
    }
}
