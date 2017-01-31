package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by vlad on 30.01.17.
 */
@Controller
public class DashboardController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String home(Model model){
        return "redirect:dashboard";
    }

    @RequestMapping(value = "dashboard",method = RequestMethod.GET)
    public void dash(){ };
}
