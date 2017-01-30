package com.data;

import com.domain.Sprint;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by vlad on 30.01.17.
 */
public interface SprintDAO extends JpaRepository<Sprint,Integer> {
}
