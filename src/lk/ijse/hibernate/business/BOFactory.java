package lk.ijse.hibernate.business;

import lk.ijse.hibernate.business.custom.impl.CourseBOimpl;
import lk.ijse.hibernate.business.custom.impl.QueryBOimpl;
import lk.ijse.hibernate.business.custom.impl.RegistrationBOimpl;
import lk.ijse.hibernate.business.custom.impl.StudentBOimpl;

public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory(){

    }

    public static BOFactory getInstance(){
        return (boFactory == null) ? boFactory = new BOFactory() : boFactory;
    }

    public <T extends SuperBO> T getBO(BOType boType){
        switch (boType){
            case STUDENT:
                return (T) new StudentBOimpl();
            case COURSE:
                return (T) new CourseBOimpl();
            case REGISTRATION:
                return (T) new RegistrationBOimpl();
            case QUERY:
                return (T) new QueryBOimpl();
            default:
                return null;
        }
    }
}
