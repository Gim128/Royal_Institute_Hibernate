package lk.ijse.hibernate.business.custom;

import lk.ijse.hibernate.business.SuperBO;
import lk.ijse.hibernate.dto.StudentDTO;

public interface StudentBO extends SuperBO {
    public boolean addStudent(StudentDTO student)throws Exception;
}
