package com.data;

import com.domain.Employee;
import com.domain.Project;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by vlad on 30.01.17.
 */
@Repository
@Transactional
public class ProjectDAOImpl extends AbstractDAO   implements EntityDAO<Project>{


    @Override
    public Project findById(long id) {
        return null;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public void update(Employee employee) {

    }

    @Override
    public void add(Employee employee) {

    }

    @Override
    public List<Project> findAll() {
        return null;
    }
}
