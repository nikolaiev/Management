package com.controller.admin;

import com.data.EntityDAO;
import com.domain.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by vlad on 31.01.17.
 */
@Controller
@Transactional
public class AdminProjectController {

    @Autowired
    @Qualifier("projectDAOImpl")
    private EntityDAO<Project> projectDAO;

    //Project operations
    @RequestMapping("/projects")
    public String getProjectsCrudPage(Model view){
        List<Project> projects=projectDAO.findAll();
        view.addAttribute("projects",projects);
        view.addAttribute("page","projects");
        return "/admin/projects";
    }

}
