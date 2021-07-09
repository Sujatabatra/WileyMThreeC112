package com.sujata.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyFirstController {
	
	@RequestMapping("/first")   //Mapping Handler
	public ModelAndView firstController() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("message", "Welcome to the first Spring boot MVC Application");  //Request Scope
		mv.setViewName("output");
		return mv;
	}

}
