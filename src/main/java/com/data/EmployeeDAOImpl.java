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
public class EmployeeDAOImpl extends AbstractDAO  implements  EntityDAO<Employee>{


    @Override
    @SuppressWarnings("unchecked")
    public List<Employee> findAll() {
        List<Employee> empls = currentSession().createQuery("from Employee").list();
        System.out.println(empls);
        return empls;
    }

    @Override
    public Employee findById(long id) {
        return currentSession().load(Employee.class, id);
    }

    @Override
    public void delete(long id) {
        Session session = currentSession();
        Employee p = session.load(Employee.class, id);
        if(null != p){
            session.delete(p);
        }
    }

    @Override
    public void update(Employee employee) {
        currentSession().update(employee);
    }

    @Override
    public void add(Employee employee) {
        currentSession().persist(employee);
    }
}
