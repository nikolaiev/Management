package com.data;

import com.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by vlad on 30.01.17.
 */
public interface TaskDAO extends JpaRepository<Task,Integer> {
}
