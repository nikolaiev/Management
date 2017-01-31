package com.data;

import com.domain.Project;

/**
 * Created by vlad on 30.01.17.
 */
public interface ProjectDAO {
    Project findOne(long projectId);
}
