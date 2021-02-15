package lk.ijse.hibernate.dao.custom;

import lk.ijse.hibernate.dao.SuperDAO;
import lk.ijse.hibernate.entity.Registration;

public interface RegistrationDAO extends SuperDAO<Registration,String> {
    public String getLastRegId()throws Exception;
}
