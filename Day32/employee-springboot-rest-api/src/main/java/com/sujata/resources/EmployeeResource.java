package com.sujata.resources;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@RequestMapping(value = "/xml/employees/{id}" ,method = RequestMethod.GET,produces = "application/xml")
	public Employee searchEmployeeXML(@PathVariable("id") int id) {
		return employeeService.findEmployee(id);
	}
	
	@GetMapping(path = "/employees",produces = "application/json")
	public Collection<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@PostMapping(path = "/employees",produces = "application/json",consumes = "application/json")
	public Employee insertEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}
	
	@DeleteMapping(path = "/employees/{id}",produces = "application/json")
	public Employee deleteEmployee(@PathVariable("id") int eid) {
		return employeeService.removeEmployee(eid);
	}
	
	@PutMapping(path = "/employees/{id}/{sal}",produces = "application/json")
	public Employee updateEmployee(@PathVariable("id") int id,@PathVariable("sal") int salary) {
		return employeeService.updateEmployee(id, salary);
	}
	
}
