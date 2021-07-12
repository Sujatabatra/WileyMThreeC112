package com.sujata.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.bean.Employee;
import com.sujata.persistence.EmployeeDao;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public Collection<Employee> getAllEmployees(){

		return employeeDao.findAll();
	}

	@Override
	public boolean saveEmployee(Employee employee){
		Employee emp=employeeDao.save(employee);
		if(emp!=null)
			return true;
		return false;
	}

	@Override
	public Employee findEmployee(int id){
		Optional<Employee> opEmp=employeeDao.findById(id);
		Employee emp=null;
		if(opEmp.isPresent())
			 emp=opEmp.get();
		return emp;
	}

	@Override
	public boolean removeEmployee(int id){
		employeeDao.deleteById(id);
		return true;
	}

}
