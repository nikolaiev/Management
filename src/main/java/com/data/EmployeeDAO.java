package com.data;

import com.domain.Employee;

import java.util.List;

/**
 * Created by vlad on 30.01.17.
 */
public interface EmployeeDAO {
    List<Employee> findAll();
}
