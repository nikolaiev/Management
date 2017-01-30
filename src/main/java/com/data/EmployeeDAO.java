package com.data;

import com.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by vlad on 30.01.17.
 */
public interface EmployeeDAO extends JpaRepository<Employee,Integer>{
}
