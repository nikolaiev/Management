package com.data;

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
public class EmployeeDAOImpl extends AbstractDAO implements  EmployeeDAO {
    public List<Employee> findAll() {
        List<Employee> empls = currentSession().createQuery("from Employee").list();
        System.out.println(empls);
        return empls;
    }
}
