package com.sujata.demo;

import java.util.List;

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
		employeeDao.save(new Employee("Aman", "IT", "Associate", 45000));
		employeeDao.save(new Employee("Bharti", "Sales", "Executive", 25000));
		employeeDao.save(new Employee("Charu", "Purchase", "Manager", 140000));
		employeeDao.save(new Employee("Deepika", "Marketing", "Sr. Associate", 67000));
		
		System.out.println("Employees added!");
		
		List<Employee> employees=employeeDao.findAll();
		for(Employee employee:employees) {
			System.out.println(employee);
		}
		
	}

}
