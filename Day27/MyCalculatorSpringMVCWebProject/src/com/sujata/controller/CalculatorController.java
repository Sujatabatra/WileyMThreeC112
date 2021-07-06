package com.sujata.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.bean.Numbers;
import com.sujata.model.service.Calculator;

@Controller
public class CalculatorController {

	@Autowired
	private Calculator calculatorService;
	
	@RequestMapping("/")
	public ModelAndView getInputPageController() {
		return new ModelAndView("inputPage.jsp", "command", new Numbers());
	}
	
	@RequestMapping("/performCalculator")
	public ModelAndView performCalculationController(@ModelAttribute Numbers numbers,@RequestParam("operation") String operator) {
		int result=0;
		String message=null;
		switch(operator) {
		case "Sum":
			message="Addition";
			result=calculatorService.sum(numbers);
			break;
		case "Subtract":
			message="Difference";
			result=calculatorService.difference(numbers);
			break;
		case "Multiply":
			message="Product";
			result=calculatorService.product(numbers);
			break;
		case "Divide":
			message="Division";
			result=calculatorService.division(numbers);
			break;
		}
		ModelAndView mv=new ModelAndView();
		mv.setViewName("result.jsp");
		mv.addObject("message", message);
		mv.addObject("result", result);
		
		return mv;
		
	}
	
//	@RequestMapping("/performCalculator")
//	public ModelAndView performCalculationController(HttpServletRequest request) {
//		String n1=request.getParameter("no1");
//		String n2=request.getParameter("no2");
//		String operator=request.getParameter("operation");
//		
//		Numbers numbers=new Numbers(Integer.parseInt(n1), Integer.parseInt(n2));
//		
//		int result=0;
//		String message=null;
//		switch(operator) {
//		case "Sum":
//			message="Addition";
//			result=calculatorService.sum(numbers);
//			break;
//		case "Subtract":
//			message="Difference";
//			result=calculatorService.difference(numbers);
//			break;
//		case "Multiply":
//			message="Product";
//			result=calculatorService.product(numbers);
//			break;
//		case "Divide":
//			message="Division";
//			result=calculatorService.division(numbers);
//			break;
//		}
//		ModelAndView mv=new ModelAndView();
//		mv.setViewName("result.jsp");
//		mv.addObject("message", message);
//		mv.addObject("result", result);
//		
//		return mv;
//		
//	}
}
