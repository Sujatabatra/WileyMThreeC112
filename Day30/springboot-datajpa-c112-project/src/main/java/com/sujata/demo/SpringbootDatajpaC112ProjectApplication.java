package com.sujata.demo;

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
		employeeDao.save(new Employee(101, "Aman", "IT", "Associate", 45000));
		System.out.println("Employee added!");
		
	}

}
