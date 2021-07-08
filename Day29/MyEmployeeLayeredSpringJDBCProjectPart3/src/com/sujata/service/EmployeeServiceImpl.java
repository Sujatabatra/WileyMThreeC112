package com.sujata.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.bean.Employee;
import com.sujata.persistence.EmployeeDao;
import com.sujata.persistence.EmployeeDaoImpl;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public Collection<Employee> getAllEmployees(){

		return employeeDao.getAllRecords();
	}

	@Override
	public boolean saveEmployee(Employee employee){
		return employeeDao.insertEmployee(employee);
	}

	@Override
	public Employee findEmployee(int id){
		return employeeDao.searchEmployee(id);
	}

	@Override
	public boolean removeEmployee(int id){
		return employeeDao.removeEmployee(id);
	}

}
