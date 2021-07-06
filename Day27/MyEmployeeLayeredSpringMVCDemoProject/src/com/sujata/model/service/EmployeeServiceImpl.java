package com.sujata.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.bean.Employee;
import com.sujata.model.persistence.EmployeeDao;
import com.sujata.model.persistence.EmployeeDaoImpl;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public Collection<Employee> getAllEmployees() throws Exception {
		
		return employeeDao.getAllRecords();
	}

	@Override
	public boolean saveEmployee(Employee employee) throws Exception{
		return employeeDao.insertEmployee(employee);
	}

	@Override
	public Employee findEmployee(int id) throws Exception{
		return employeeDao.searchEmployee(id);
	}

	@Override
	public boolean removeEmployee(int id) throws Exception{
		return employeeDao.removeEmployee(id);
	}

}
