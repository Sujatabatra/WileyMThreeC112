package com.sujata.demo;

@FunctionalInterface
public interface EmployeeFactory {
	Employee getEmployee(int id,String name);
}
