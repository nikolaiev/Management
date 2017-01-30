package com.data;

import com.domain.Company;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by vlad on 30.01.17.
 */
public interface CompanyDAO extends JpaRepository<Company,Integer> {
}
