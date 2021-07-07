package com.sujata.service;

import java.util.Collection;
import com.sujata.bean.Employee;

public interface EmployeeService {

	Collection<Employee> getAllEmployees();
	
	boolean saveEmployee(Employee employee);
	Employee findEmployee(int id);
	boolean removeEmployee(int id);
}
