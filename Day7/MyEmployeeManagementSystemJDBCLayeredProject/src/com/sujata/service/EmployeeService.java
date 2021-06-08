package com.sujata.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.sujata.bean.Employee;

public interface EmployeeService {

	Collection<Employee> getAllEmployees()throws SQLException, ClassNotFoundException;
	
	boolean saveEmployee(Employee employee)throws SQLException, ClassNotFoundException;
}
