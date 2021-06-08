package com.sujata.presentation;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.sujata.bean.Employee;
import com.sujata.helper.EmployeeInputOutput;
import com.sujata.service.EmployeeService;
import com.sujata.service.EmployeeServiceImpl;

public class EmployeePresentationImpl implements EmployeePresentation {

	private EmployeeService employeeService=new EmployeeServiceImpl();
	@Override
	public void showMenu() {
		System.out.println("WELCOME TO EMPLOYEE MANAGEMENT SYSTEM");
		System.out.println("1. Display All Employees");
		System.out.println("2. Add New Employee");
		System.out.println("3. Exit");
	}

	@Override
	public void performMenu(int choice) {
		switch(choice) {
		case 1:
			Collection<Employee> employees=null;
			try {
				employees = employeeService.getAllEmployees();
			} catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
			}
			for(Employee employee:employees) {
				System.out.println(employee);
			}
			break;
		case 2:
			try {
				if(employeeService.saveEmployee(EmployeeInputOutput.inputEmployee()))
					System.out.println("Employee Record Added Succefully");
				else
					System.out.println("Employee Record Insertion Failed");
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			break;
		case 3:
			System.out.println("Thanks for using Employee Management System!!!");
			System.exit(0);
		default :
			System.out.println("Invalid Choice");
		}

	}

}
