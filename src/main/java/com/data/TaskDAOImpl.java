package com.data;

import com.domain.Task;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by vlad on 30.01.17.
 */
@Repository
@Transactional
public class TaskDAOImpl extends AbstractDAO /*implements EntityDAO<Task> */{

    public List<Task> findAll() {
        return null;
    }
    public Task findById(long id) {
        return null;
    }

    public void add(Task obj) {

    }
    public void update(Task obj) {

    }
    public void delete(long id) {

    }
}
