package com.data;

import com.domain.Project;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by vlad on 30.01.17.
 */
@Repository
@Transactional
public class ProjectDAOImpl extends AbstractDAO   implements ProjectDAO{

    public Project findOne(long projectId) {
        return currentSession().load(Project.class,projectId);
    }
}
