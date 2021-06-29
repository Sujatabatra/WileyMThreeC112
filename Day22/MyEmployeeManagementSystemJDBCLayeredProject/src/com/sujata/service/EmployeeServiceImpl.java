package com.sujata.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.sujata.bean.Employee;
import com.sujata.persistence.EmployeeDao;
import com.sujata.persistence.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao=new EmployeeDaoImpl();
	
	@Override
	public Collection<Employee> getAllEmployees()throws SQLException, ClassNotFoundException,ClassNotFoundException, IOException {
		
		return employeeDao.getAllRecords();
	}

	@Override
	public boolean saveEmployee(Employee employee) throws SQLException, ClassNotFoundException,ClassNotFoundException, IOException{
		return employeeDao.insertEmployee(employee);
	}

}
