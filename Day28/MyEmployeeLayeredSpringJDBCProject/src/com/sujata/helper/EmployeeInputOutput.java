package com.sujata.helper;

import java.util.Collection;
import java.util.Scanner;

import com.sujata.bean.Employee;
import com.sujata.service.EmployeeServiceImpl;

public class EmployeeInputOutput {

	static Scanner scanner=new Scanner(System.in);
	static EmployeeServiceImpl service = new EmployeeServiceImpl();
	public static Employee inputEmployee() {
		
		
		Employee employee=new Employee();
		System.out.println("Enter Employee ID ");
		employee.seteId(scanner.nextInt());
		System.out.println("Enter Employee Name ");
		scanner.nextLine();
		employee.seteName(scanner.nextLine());
		System.out.println("Enter Employee Designation ");
		employee.setDesig(scanner.nextLine());
		System.out.println("Enter Employee Department ");
		employee.setDeptt(scanner.nextLine());
		System.out.println("Enter Employee Salary ");
		employee.setSalary(scanner.nextInt());

		return employee;
	}
	public static Employee searchEmployee(Collection<Employee> employee) throws Exception {
		System.out.print("Enter the ID: ");
		int id = scanner.nextInt(); 
		return service.findEmployee(id);
	}
	
	public static boolean removeEmployee(Collection<Employee> employee) throws Exception {
		System.out.print("Enter the ID: ");
		int id = scanner.nextInt();
		return service.removeEmployee(id);
	}
}