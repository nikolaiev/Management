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
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by vlad on 30.01.17.
 */
@Controller
@RequestMapping(value = "/admin")
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

    //update employee page
    @RequestMapping(value = "/employees/edit",method = RequestMethod.GET)
    public String getEditEmployeeForm(
            @RequestParam("emp_id") Long emp_id,
            Model view){
        Employee employee=employeeDAO.findById(emp_id);
        view.addAttribute("employee",employee);
        view.addAttribute("page","employees");
        return "/admin/employee";
    }

    //Request to update Employee
    @RequestMapping(value = "/employees/edit",method = RequestMethod.POST)
    public String editEmployee(Employee employee){
        employeeDAO.update(employee);
        return "redirect:/admin/employees";
    }

    //Removing employee
    @RequestMapping(value = "/employees/remove",method = RequestMethod.GET)
    public String removeEmployee(
            @RequestParam("emp_id") Long emp_id
        ){
        employeeDAO.delete(emp_id);
        return "redirect:/admin/employees";
    }

    //Adding new employee
    @RequestMapping(value = "/employees/add",method = RequestMethod.POST)
    public String addEmployee(Employee employee){
                //TODO add operation success mesage
                employeeDAO.add(employee);
                return "redirect:/admin/employees";
    }
}
