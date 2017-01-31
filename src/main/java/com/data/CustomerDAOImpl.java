package com.data;

import com.domain.Customer;
import com.domain.Employee;
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
public class CustomerDAOImpl  extends AbstractDAO  implements  EntityDAO<Customer>{


    @Override
    public Customer findById(long id) {
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
    public List<Customer> findAll() {
        return null;
    }
}
