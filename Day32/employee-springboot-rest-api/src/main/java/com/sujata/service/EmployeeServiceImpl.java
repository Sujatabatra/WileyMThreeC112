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
	public Employee saveEmployee(Employee employee){
		Employee emp=employeeDao.save(employee);
		return emp;
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
	public Employee removeEmployee(int id){
		
		employeeDao.deleteById(id);
		Optional<Employee> opEmp=employeeDao.findById(id);
		Employee emp=null;
		if(opEmp.isPresent())
			 emp=opEmp.get();
		return emp;
		
	}

	@Override
	public Employee updateEmployee(int id, int salary) {
		employeeDao.updateSalary(id, salary);
		Optional<Employee> opEmp=employeeDao.findById(id);
		Employee emp=null;
		if(opEmp.isPresent())
			 emp=opEmp.get();
		return emp;
	}

}
