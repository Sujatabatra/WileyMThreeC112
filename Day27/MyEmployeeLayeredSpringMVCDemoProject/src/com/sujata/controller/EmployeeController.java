package com.sujata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.bean.Employee;
import com.sujata.model.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
//	@RequestMapping("/")
//	public ModelAndView openingPageController() {
//		return new ModelAndView("index");
//	}
	
	@RequestMapping("/")
	public String openingPageController() {
		return "index";
	}
	
	@RequestMapping("/inputForEmpSearch")
	public String getEmpIDForSearchPage() {
		return "inputEmpIdForSearch";
	}
	
	@RequestMapping("/searchEmp")
	public ModelAndView searchEmpController(@RequestParam("empId") String id) {
		Employee employee=null;
		try {
			employee=employeeService.findEmployee(Integer.parseInt(id));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(employee!=null) {
			return new ModelAndView("displayEmployee", "employee", employee);
		}
		return new ModelAndView("output", "message", "Employee with id "+id+" doesnot exist");
	}

}
