package com.sujata.helper;

import java.util.Scanner;

import com.sujata.bean.Employee;

public class EmployeeInputOutput {

	public static Employee inputEmployee() {
		Scanner scanner=new Scanner(System.in);
		
		Employee employee=new Employee();
		
		System.out.println("Enter Employee ID");
		employee.setEmpId(scanner.nextInt());
		System.out.println("Enter Employee Name ");
		employee.setEmpName(scanner.next());
		System.out.println("Enter Employee Designation ");
		employee.setDesignation(scanner.next());
		System.out.println("Enter Employee Department ");
		employee.setDepartment(scanner.next());
		System.out.println("Enter Employee Salary ");
		employee.setEmpSalary(scanner.nextInt());

		return employee;
	}
}
