package com.controller;

import com.data.CompaniHibernateDAO;
import com.domain.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by vlad on 30.01.17.
 */
@Controller

public class HomeController {
    @Autowired
    CompaniHibernateDAO companiHibernateDAO;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String home(Model model){
        Company company=companiHibernateDAO.findOne(1);
        model.addAttribute(company);
        return "home";
    }
}
