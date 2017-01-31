package com.data;

import com.domain.Company;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by vlad on 30.01.17.
 */
@Repository
@Transactional
public class CompanyDAOImpl  extends AbstractDAO /*implements EntityDAO<Company>*/ {

    public List<Company> findAll() {
        return null;
    }

    public Company findById(long id) {
        return currentSession().get(Company.class, id);
    }

    public void add(Company obj) {

    }

    public void update(Company obj) {

    }

    public void delete(long id) {

    }
}
