package com.data;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by vlad on 31.01.17.
 */
public abstract class AbstractDAO {

    @Autowired
    private SessionFactory sessionFactory;

    Session currentSession() {
        return sessionFactory.getCurrentSession();
    }
}
