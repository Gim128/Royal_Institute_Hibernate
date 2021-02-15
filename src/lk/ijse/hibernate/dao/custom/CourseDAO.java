package lk.ijse.hibernate.dao.custom;

import lk.ijse.hibernate.dao.SuperDAO;
import lk.ijse.hibernate.entity.Course;

public interface CourseDAO extends SuperDAO<Course,String> {
    public String getLastCourseCode()throws Exception;
}
