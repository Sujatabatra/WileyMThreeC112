package com.sujata.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	public ModelAndView getEmpIDForSearchPage() {
		return new ModelAndView("inputEmpIdForSearch", "command", new Employee()); 
	}

	@ModelAttribute("departments")
	List<String> getDepartmentList(){
		Collection<Employee> emps=null;
		try {
			emps= employeeService.getAllEmployees();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emps.stream()
				.map(Employee::getDeptt)
				.distinct()
				.collect(Collectors.toList());
	}
	
	@ModelAttribute("empIds")
	List<Integer> getEmployeeIds(){
		Collection<Employee> emps=null;
		
		try {
			emps=employeeService.getAllEmployees();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emps.stream()
				.map(Employee::geteId)
				.collect(Collectors.toList());
	}
	
	@RequestMapping("/searchEmp")
	public ModelAndView searchEmpController(@ModelAttribute Employee emp) {
		Employee employee=null;
		try {
			employee=employeeService.findEmployee(emp.geteId());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(employee!=null) {
			return new ModelAndView("displayEmployee", "employee", employee);
		}
		return new ModelAndView("output", "message", "Employee with id "+emp.geteId()+" doesnot exist");
	}

	@RequestMapping("/insertEmployeePage")
	public ModelAndView insertEmpPageController() {
		return new ModelAndView("inputEmpDetails", "emp", new Employee());
	}
	
	@RequestMapping("/insertEmp")
	public ModelAndView insertEmployeeController(@ModelAttribute("emp") Employee emp ) {
		try {
			if(employeeService.saveEmployee(emp))
				return new ModelAndView("output", "message", "Employee Saved Successfully!");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return new ModelAndView("output", "message", "Saving Employee Failed!");
	
	}
	
	@RequestMapping("/deleteEmployeePage")
	public String deleteEmployeePageController() {
		return "inputEmpForDelete";
	}
	
	@RequestMapping("/deleteEmp")
	public ModelAndView deleteEmployeeController(@RequestParam("empId") String id) {
		try {
			if(employeeService.removeEmployee(Integer.parseInt(id))) {
				return new ModelAndView("output","message","Employee with ID "+id+" deleted Successfully!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ModelAndView("output","message","Employee with ID "+id+" deletion Failed!");
		
	}
	
	@RequestMapping("/getAllEmps")
	public ModelAndView getAllEmployeesController() {
		Collection<Employee> employees=null;
		try {
			employees=employeeService.getAllEmployees();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ModelAndView("displayAllEmployeesWithoutScriplets", "employees", employees);
	}
}
