package com.sujata.database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.sujata.bean.Employee;

public class EmployeeList {
	
	private static HashMap<Integer,Employee> employees=new HashMap<Integer, Employee>();
	
	static {
		employees.put(101, new Employee(101,"AAAA", "IT", "Associate", 37000));
		employees.put(102, new Employee(102,"BBBB", "Sales", "Executive", 25000));
		employees.put(103, new Employee(103,"CCCC", "HR", "Sr. Associate", 57000));
		employees.put(104, new Employee(104,"DDDD", "Marketing", "Manager", 87000));
		employees.put(105, new Employee(105,"EEEE", "IT", "Sr. Associate", 67000));
		employees.put(106, new Employee(106,"FFFF", "Sales", "Manager", 95000));
	}

	public static HashMap<Integer, Employee> getEmployees() {
		return employees;
	}

	public static void setEmployees(HashMap<Integer, Employee> employees) {
		EmployeeList.employees = employees;
	}

	
	
}
