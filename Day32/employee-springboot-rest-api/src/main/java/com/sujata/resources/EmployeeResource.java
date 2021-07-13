package com.sujata.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.bean.Employee;
import com.sujata.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeResource {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/employees/{id}" ,method = RequestMethod.GET,produces = "application/json")
	public Employee searchEmployee(@PathVariable("id") int id) {
		return employeeService.findEmployee(id);
	}
	
	@RequestMapping(value = "xml/employees/{id}" ,method = RequestMethod.GET,produces = "application/xml")
	public Employee searchEmployeeXML(@PathVariable("id") int id) {
		return employeeService.findEmployee(id);
	}
}
