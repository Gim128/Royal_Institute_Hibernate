package lk.ijse.hibernate.dao.custom.impl;

import lk.ijse.hibernate.dao.custom.QueryDAO;
import lk.ijse.hibernate.entity.CustomEntity;

import java.util.List;

public class QueryDAOimpl implements QueryDAO {
    @Override
    public boolean add(CustomEntity entity) throws Exception {
        return false;
    }

    @Override
    public boolean delete(CustomEntity entity) throws Exception {
        return false;
    }

    @Override
    public boolean update(CustomEntity entity) throws Exception {
        return false;
    }

    @Override
    public CustomEntity find(String s) throws Exception {
        return null;
    }

    @Override
    public List<CustomEntity> findAll() throws Exception {
        return null;
    }
}
