package com.sujata.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("/")
	public ModelAndView firstController() {
		return new ModelAndView("first", "message", "Displaying using Thymeleaf");
	}
}
