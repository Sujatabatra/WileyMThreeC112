package com.sujata.presentation;

import java.util.Collection;
import java.util.Scanner;

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
		Scanner scanner = new Scanner(System.in);
		switch (choice) {
		case 1:
			Collection<Employee> employees;

			employees = employeeService.getAllEmployees();
			for (Employee employee : employees) {
				System.out.println(employee);
			}

			break;
		case 2:

			if (employeeService.saveEmployee(EmployeeInputOutput.inputEmployee()))
				System.out.println("Employee Record Added Succefully");
			else
				System.out.println("Employee Record Insertion Failed");

			break;
		case 3:
			System.out.print("Enter the ID: ");
			int id = scanner.nextInt();

			Employee employee = employeeService.findEmployee(id);

			if (employee != null)
				System.out.println(employee);
			else
				System.out.println("No such employee found!");

			break;
		case 4:
			boolean status;
			System.out.print("Enter the ID: ");
			int id1 = scanner.nextInt();

			status = employeeService.removeEmployee(id1);
			if (status)
				System.out.println("Employee Removed Successfully!");
			else
				System.out.println("Employee Not Found!");

			break;
		case 5:
			System.out.println("Thanks for using Employee Management System!!!");
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
		}

	}

}
