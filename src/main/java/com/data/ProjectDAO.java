package com.data;

import com.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by vlad on 30.01.17.
 */
public interface ProjectDAO extends JpaRepository<Project,Integer> {
}
