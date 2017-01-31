package com.controller;

import com.data.ProjectDAOImpl;
import com.domain.Project;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by vlad on 30.01.17.
 */
@Controller
@RequestMapping("/manager")
public class ManagerController {

    ProjectDAOImpl projectDAO=new ProjectDAOImpl();

    @RequestMapping(value = "/projects",method = RequestMethod.GET)
    public String doGetProject(){
        return "projectControl";
    }

    @RequestMapping(value = "/sprints",method = RequestMethod.GET)
    public String doGet(
            @RequestParam("project_id") long projectId,
            Model model
    ){
        Project project=projectDAO.findOne(projectId);
        model.addAttribute(project);
        return "projectControl";
    }
}
