package com.data;

import com.domain.Sprint;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by vlad on 30.01.17.
 */
@Repository
@Transactional
public class SprintDAOImpl extends AbstractDAO /*implements EntityDAO<Sprint>*/{

    public List<Sprint> findAll() {
        return null;
    }

    public Sprint findById(long id) {
        return null;
    }

    public void add(Sprint obj) {

    }

    public void update(Sprint obj) {

    }

    public void delete(long id) {

    }
}
