package com.howtodoinjava.demo.controller;

import com.howtodoinjava.demo.service.EmployeeManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/employee-module")
public class EmployeeController 
{
	@Autowired
	EmployeeManager manager;

    Logger logger = Logger.getLogger(EmployeeController.class);

    @RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
	public String getAllEmployees(Model model){
        logger.info("Call getAllEmployees()!");
		model.addAttribute("employees", manager.getAllEmployees());
		return "employeesListDisplay";
	}

    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    public String hello(Model model){
        logger.info("Call hello()!");
        return "hello";
    }
}