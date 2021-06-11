package com.sujata.demo;

public class MethodReferenceDemoForConstructor {

	public static void main(String[] args) {
		
//		EmployeeFactory empFactory=new EmployeeFactory() {
//			@Override
//			public Employee getEmployee(int id, String name) {
//				return new Employee(id, name);
//			}
//		};
		
//		EmployeeFactory empFactory=(id,name)-> {
//				return new Employee(id, name);
//			};
		
//		EmployeeFactory empFactory=(id,name)-> new Employee(id, name);
		
		EmployeeFactory empFactory=Employee::new;
	
		
		System.out.println(empFactory.getEmployee(101, "AAA"));
		

	}

}
