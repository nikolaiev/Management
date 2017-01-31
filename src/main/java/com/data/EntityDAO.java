package com.data;

import com.domain.Employee;

import java.util.List;

/**
 * Created by vlad on 31.01.17.
 */
public interface EntityDAO<T> {
    T findById(long id);
    void delete (long id);
    void update (Employee employee);
    void add(Employee employee);
    List<T> findAll();
}
