package com.data;

import com.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by vlad on 30.01.17.
 */
public interface CustomerDAO  extends JpaRepository<Customer,Integer>{
}
