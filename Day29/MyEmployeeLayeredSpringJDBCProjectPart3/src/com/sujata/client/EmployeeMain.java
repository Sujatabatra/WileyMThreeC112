package com.sujata.client;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.config.EmployeeConfiguration;
import com.sujata.presentation.EmployeePresentation;
import com.sujata.presentation.EmployeePresentationImpl;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		ApplicationContext springContainer=new AnnotationConfigApplicationContext(EmployeeConfiguration.class);
		
		EmployeePresentation presentation=(EmployeePresentation)springContainer.getBean("employeePresentation");
		while(true) {
			presentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=sc.nextInt();
			
			presentation.performMenu(choice);
		}
	}

}