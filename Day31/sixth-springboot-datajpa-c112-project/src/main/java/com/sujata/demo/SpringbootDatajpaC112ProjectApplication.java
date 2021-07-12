package com.sujata.demo;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sujata.bean.Employee;
import com.sujata.persistence.EmployeeDao;

@SpringBootApplication(scanBasePackages = "com.sujata")
@EntityScan(basePackages = "com.sujata.bean")
@EnableJpaRepositories(basePackages = "com.sujata.persistence")
public class SpringbootDatajpaC112ProjectApplication implements CommandLineRunner{

	@Autowired
	private EmployeeDao employeeDao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDatajpaC112ProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Scanner sc=new Scanner(System.in);
		List<Employee> employees=employeeDao.findAll();
		for(Employee employee:employees) {
			System.out.println(employee);
		}
		
		System.out.println("Enter employee id whoes name we want to modify : ");
		int id=sc.nextInt();
		System.out.println("Enter new name : ");
		String name=sc.next();
		
		employeeDao.updateEmployeeName(id, name);
		
		List<Employee> employees1=employeeDao.findAll();
		for(Employee employee:employees1) {
			System.out.println(employee);
		}
		
		
	}

}
