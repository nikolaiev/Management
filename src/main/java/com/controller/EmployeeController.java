package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by vlad on 30.01.17.
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {
    //goes method conserned to employee activity

    @RequestMapping(value = "/tasks/new", method = RequestMethod.GET)
    public String doGetTaskNew(){
        return "/employee/newTasks";
    }

    @RequestMapping(value = "/tasks", method = RequestMethod.GET)
    public String doGetTask(){
        return "/employee/currentTasks";
    }
}
