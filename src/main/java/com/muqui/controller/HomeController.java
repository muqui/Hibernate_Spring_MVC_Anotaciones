/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muqui.controller;

import com.muqui.entity.Person;
import com.muqui.service.IPersonService;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author mq12
 */
@Controller
public class HomeController {
    	@Autowired
	private IPersonService personService;
    @RequestMapping(value="home")
    public ModelAndView home(){
       	ModelAndView mv = new ModelAndView("home","person",new Person());
        return mv;
    }
    @RequestMapping(value="home", method = RequestMethod.POST)
    public String addPerson(@ModelAttribute("person") @Valid Person person, BindingResult result, 
			ModelMap model, HttpServletRequest request){
         if(!result.hasErrors()) {
	    	boolean flag = personService.addPerson(person);
	    	
	    }
        System.out.println("home home home home" + person.getName());
        	return "home";
    }
    
}
