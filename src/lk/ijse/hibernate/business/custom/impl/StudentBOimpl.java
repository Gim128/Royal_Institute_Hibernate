package lk.ijse.hibernate.business.custom.impl;

import lk.ijse.hibernate.business.custom.StudentBO;
import lk.ijse.hibernate.dao.DAOFactory;
import lk.ijse.hibernate.dao.DAOType;
import lk.ijse.hibernate.dao.SuperDAO;
import lk.ijse.hibernate.dao.custom.StudentDAO;
import lk.ijse.hibernate.dao.custom.impl.StudentDAOimpl;
import lk.ijse.hibernate.dto.StudentDTO;
import lk.ijse.hibernate.entity.Student;

public class StudentBOimpl implements StudentBO {

    StudentDAOimpl studentDAO = DAOFactory.getInstance().getDAO(DAOType.STUDENT);

    @Override
    public boolean addStudent(StudentDTO student) throws Exception {
       return studentDAO.add(new Student(student.getId(),student.getStudentName(),student.getAddress(),student.getContact(),student.getDob(),student.getGender()));
    }
}
