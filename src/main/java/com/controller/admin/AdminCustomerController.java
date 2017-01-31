package com.controller.admin;

import com.data.EntityDAO;
import com.domain.Customer;
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
public class AdminCustomerController {

    @Autowired
    @Qualifier("customerDAOImpl")
    private EntityDAO<Customer> customerDAO;

    //Customers operations
    @RequestMapping("/customers")
    public String getCustomersCrudPage(Model view){
        List<Customer> customers=customerDAO.findAll();
        view.addAttribute("customers",customers);
        view.addAttribute("page","customers");
        return "/admin/customers";
    }
}
