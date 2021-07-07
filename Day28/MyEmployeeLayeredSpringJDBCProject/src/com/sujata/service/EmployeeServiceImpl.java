package com.sujata.service;

import java.util.Collection;
import com.sujata.bean.Employee;
import com.sujata.persistence.EmployeeDao;
import com.sujata.persistence.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao;

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public Collection<Employee> getAllEmployees() throws Exception {

		return employeeDao.getAllRecords();
	}

	@Override
	public boolean saveEmployee(Employee employee) throws Exception {
		return employeeDao.insertEmployee(employee);
	}

	@Override
	public Employee findEmployee(int id) throws Exception {
		return employeeDao.searchEmployee(id);
	}

	@Override
	public boolean removeEmployee(int id) throws Exception {
		return employeeDao.removeEmployee(id);
	}

}
