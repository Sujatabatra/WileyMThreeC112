package com.sujata.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.sujata.bean.Employee;
import com.sujata.bean.EmployeePaySlip;

public interface EmployeeService {

	Collection<Employee> getAllEmployees()throws SQLException, ClassNotFoundException,ClassNotFoundException, IOException;
	
	boolean saveEmployee(Employee employee)throws SQLException, ClassNotFoundException,ClassNotFoundException, IOException;
	
	EmployeePaySlip getPaySlip(int eid)throws SQLException, ClassNotFoundException,ClassNotFoundException, IOException;
}
