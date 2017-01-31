package com.controller.admin;

import com.data.EntityDAO;
import com.domain.Customer;
import com.domain.Employee;
import com.domain.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by vlad on 30.01.17.
 */
@Controller
@RequestMapping(value = "/admin",method = RequestMethod.GET)
public class AdminEmployeeController {
    //Repositories
    @Autowired
    @Qualifier("employeeDAOImpl")
    private EntityDAO<Employee> employeeDAO;

    //Employees operations
    @RequestMapping("/employees")
    public String getEmployeesCrudPage(Model view){
        List<Employee> employees=employeeDAO.findAll();
        view.addAttribute("employees",employees);
        view.addAttribute("page","employees");
        return "/admin/employees";
    }

    @RequestMapping(value = "/employees/edit/{id}",method = RequestMethod.GET)
    public String getEditEmployeeForm(
            @PathVariable("id") Long id,
            Model view){
        Employee employee=employeeDAO.findById(id);
        view.addAttribute("employee",employee);
        view.addAttribute("page","employees");
        return "/admin/employee";
    }

    @RequestMapping(value = "/employees/edit",method = RequestMethod.POST)
    public String editEmployee(Employee employee){
        employeeDAO.update(employee);
        return "redirect:/employees";
    }

}
