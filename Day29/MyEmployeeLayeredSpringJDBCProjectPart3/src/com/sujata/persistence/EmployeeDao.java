package com.sujata.persistence;

import java.util.Collection;

import com.sujata.bean.Employee;

public interface EmployeeDao {

	Collection<Employee> getAllRecords();
	boolean insertEmployee(Employee employee);
	Employee searchEmployee(int id);
	boolean removeEmployee(int id);
}
