package com.sujata.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//@SpringBootApplication = @Configuration + @ComponentScan
@SpringBootApplication
public class MyfirstSpringbootProjectApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("goodEvening")
	private Greet greet;
	
	public static void main(String[] args) {
		SpringApplication.run(MyfirstSpringbootProjectApplication.class, args);
//		ApplicationContext springContainer= SpringApplication.run(MyfirstSpringbootProjectApplication.class, args);
//		Greet g1=(Greet)springContainer.getBean("goodMorning");
//		g1.wish("Sujata");
	}

	@Override
	public void run(String... args) throws Exception {
		greet.wish("Amber");
		
	}

}
