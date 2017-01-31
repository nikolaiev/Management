package com.controller;

import com.data.EmployeeDAO;
import com.data.EmployeeDAOImpl;
import com.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by vlad on 30.01.17.
 */
@Controller
@RequestMapping(value = "/admin",method = RequestMethod.GET)
public class AdminController {

    @Autowired
    EmployeeDAO employeeDAO=new EmployeeDAOImpl();

    @RequestMapping("/employees")
    public String getEmployeesCrudPage(Model view){
        List<Employee> empls=employeeDAO.findAll();
        view.addAttribute("employees",empls);
        view.addAttribute("page","employees");
        return "/admin/employees";
    }

    @RequestMapping("/customers")
    public String getCustomersCrudPage(){
        return "/admin/customers";
    }

    @RequestMapping("/projects")
    public String getProjectsCrudPage(Model view){
        view.addAttribute("page","projects");
        return "/admin/projects";
    }
}
