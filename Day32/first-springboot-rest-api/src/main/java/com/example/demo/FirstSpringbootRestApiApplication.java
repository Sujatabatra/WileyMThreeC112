package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.sujata.resources")
public class FirstSpringbootRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringbootRestApiApplication.class, args);
	}

}
