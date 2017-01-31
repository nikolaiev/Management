package com.data;

import com.domain.Sprint;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Table;

/**
 * Created by vlad on 30.01.17.
 */
@Repository
@Transactional
public class SprintDAOImpl extends AbstractDAO  implements SprintDAO{

}
