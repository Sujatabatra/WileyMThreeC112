package com.sujata.model.persistence;

import java.util.Collection;

import com.sujata.bean.Employee;

public interface EmployeeDao {

	Collection<Employee> getAllRecords() throws Exception;
	boolean insertEmployee(Employee employee) throws Exception;
	Employee searchEmployee(int id) throws Exception;
	boolean removeEmployee(int id) throws Exception;
}
