package lk.ijse.hibernate.dao;

import lk.ijse.hibernate.dao.custom.impl.CourseDAOimpl;
import lk.ijse.hibernate.dao.custom.impl.QueryDAOimpl;
import lk.ijse.hibernate.dao.custom.impl.StudentDAOimpl;
import lk.ijse.hibernate.dao.custom.impl.registrationDAOimpl;
import lk.ijse.hibernate.entity.Student;

public class DAOFactory {
    private static DAOFactory daoFactory;

    private DAOFactory(){

    }

    public static DAOFactory getInstance(){
        return (daoFactory == null) ? daoFactory = new DAOFactory() : daoFactory;
    }
    public <T extends SuperDAO> T getDAO(DAOType daoType){
        switch (daoType){
            case STUDENT:
                return (T) new StudentDAOimpl();
            case COURSE:
                return (T) new CourseDAOimpl();
            case REGISTRATION:
                return (T) new registrationDAOimpl();
            case QUERY:
                return (T) new QueryDAOimpl();
            default:
                return null;
        }
    }
}
