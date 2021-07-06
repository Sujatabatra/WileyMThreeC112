package com.sujata.model.service;

import java.util.Collection;
import com.sujata.bean.Employee;

public interface EmployeeService {

	Collection<Employee> getAllEmployees() throws Exception;
	boolean saveEmployee(Employee employee)throws Exception;
	Employee findEmployee(int id) throws Exception;
	boolean removeEmployee(int id) throws Exception;
}
