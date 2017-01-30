package com.data;

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
public class CustomerDAOImpl  implements  CustomerDAO{
    private SessionFactory sessionFactory;

    @Autowired
    public CustomerDAOImpl(SessionFactory sf){
        this.sessionFactory=sf;
    }

    private Session currentSession() {
        return sessionFactory.getCurrentSession();
    }
}
