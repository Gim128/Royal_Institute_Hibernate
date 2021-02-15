package lk.ijse.hibernate.dao;

import lk.ijse.hibernate.entity.Student;
import lk.ijse.hibernate.entity.superEntity;

import java.io.Serializable;
import java.util.List;

public interface SuperDAO <Entity extends superEntity, ID extends Serializable>{
    public boolean add(Entity entity)throws Exception;

    public boolean delete(Entity entity)throws Exception;

    public boolean update(Entity entity)throws Exception;

    public Entity find(ID id)throws  Exception;

    public List<Entity> findAll()throws Exception;
}
