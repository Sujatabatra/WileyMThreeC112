package com.sujata.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.sujata.bean.Employee;

public interface EmployeeService {

	Collection<Employee> getAllEmployees();
	
	boolean saveEmployee(Employee employee);
}
