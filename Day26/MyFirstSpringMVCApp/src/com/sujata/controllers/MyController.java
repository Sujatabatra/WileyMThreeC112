package com.sujata.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("/first")
	public ModelAndView myFirstController() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("message", "Welcome to the world of Spring");
		mv.setViewName("output.jsp");
		return mv;
	}
	
	@RequestMapping("/second")
	public ModelAndView mySecondController() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("message", "Welcome Once Again to the world of Spring");
		mv.setViewName("output.jsp");
		return mv;
	}
	
}
