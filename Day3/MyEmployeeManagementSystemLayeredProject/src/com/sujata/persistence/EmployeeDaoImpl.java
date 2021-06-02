package com.sujata.persistence;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.sujata.bean.Employee;
import com.sujata.database.EmployeeList;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public Collection<Employee> getAllRecords() {
		 HashMap<Integer,Employee> employees=EmployeeList.getEmployees();
		 Collection<Employee> emps=employees.values();
		return emps;
	}

	@Override
	public boolean insertEmployee(Employee employee) {
		EmployeeList.getEmployees().put(employee.geteId(), employee);
		return true;
	}

}
