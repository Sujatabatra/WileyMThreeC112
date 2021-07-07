package com.sujata.presentation;

import java.util.Collection;
import com.sujata.bean.Employee;
import com.sujata.helper.EmployeeInputOutput;
import com.sujata.service.EmployeeService;
import com.sujata.service.EmployeeServiceImpl;

public class EmployeePresentationImpl implements EmployeePresentation {

	private EmployeeService employeeService;
	
	
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@Override
	public void showMenu() {
		System.out.println("\nWELCOME TO EMPLOYEE MANAGEMENT SYSTEM\n");
		System.out.println("1. Display All Employees");
		System.out.println("2. Add New Employee");
		System.out.println("3. Search For an Employee using ID");
		System.out.println("4. Remove an Employee using ID");
		System.out.println("5. Exit");
	}

	@Override
	public void performMenu(int choice) {
		switch(choice) {
		case 1:
			Collection<Employee> employees;
			try {
				employees = employeeService.getAllEmployees();
				for(Employee employee:employees) {
					System.out.println(employee);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case 2:
			try {
				if(employeeService.saveEmployee(EmployeeInputOutput.inputEmployee()))
					System.out.println("Employee Record Added Succefully");
				else
					System.out.println("Employee Record Insertion Failed");
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case 3:Employee employee;
			try {
				employee = EmployeeInputOutput.searchEmployee(employeeService.getAllEmployees());
				if(employee!=null)
					System.out.println(employee);
				else
					System.out.println("No such employee found!");
			} catch (Exception e) {
				e.printStackTrace();
			}
				break;
		case 4:boolean status;
			try {
				status = EmployeeInputOutput.removeEmployee(employeeService.getAllEmployees());
				if(status)
					System.out.println("Employee Removed Successfully!");
				else
					System.out.println("Employee Not Found!");
			} catch (Exception e) {
				e.printStackTrace();
			}
				break;
		case 5:
			System.out.println("Thanks for using Employee Management System!!!");
			System.exit(0);
		default :
			System.out.println("Invalid Choice");
		}

	}

}
