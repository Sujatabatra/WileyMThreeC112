package com.sujata.presentation;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sujata.bean.Employee;
import com.sujata.bean.EmployeePaySlip;
import com.sujata.helper.EmployeeInputOutput;
import com.sujata.service.EmployeeService;
import com.sujata.service.EmployeeServiceImpl;

@Component("empPresentation")
public class EmployeePresentationImpl implements EmployeePresentation {

//	private EmployeeService employeeService=new EmployeeServiceImpl();

	@Autowired
	private EmployeeService employeeService;

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@Override
	public void showMenu() {
		System.out.println("WELCOME TO EMPLOYEE MANAGEMENT SYSTEM");
		System.out.println("1. Display All Employees");
		System.out.println("2. Add New Employee");
		System.out.println("3. Display Payslip by Employee ID");
		System.out.println("4. Exit");
	}

	@Override
	public void performMenu(int choice) {
		Scanner sc = new Scanner(System.in);
		switch (choice) {
		case 1:
			Collection<Employee> employees = null;
			try {
				employees = employeeService.getAllEmployees();
			} catch (ClassNotFoundException | SQLException e) {

				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}
			for (Employee employee : employees) {
				System.out.println(employee);
			}
			break;
		case 2:
			try {
				if (employeeService.saveEmployee(EmployeeInputOutput.inputEmployee()))
					System.out.println("Employee Record Added Succefully");
				else
					System.out.println("Employee Record Insertion Failed");
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}
			break;
		case 3:
			System.out.println("Enter Employee ID : ");
			int id = sc.nextInt();
			EmployeePaySlip paySlip = null;
			try {
				paySlip = employeeService.getPaySlip(id);
			} catch (ClassNotFoundException | SQLException | IOException e) {

				e.printStackTrace();
			}
			if (paySlip != null)
				System.out.println(paySlip);
			else
				System.out.println("Employee with id " + id + "does not exist");
			break;

		case 4:
			System.out.println("Thanks for using Employee Management System!!!");
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
		}

	}

}
