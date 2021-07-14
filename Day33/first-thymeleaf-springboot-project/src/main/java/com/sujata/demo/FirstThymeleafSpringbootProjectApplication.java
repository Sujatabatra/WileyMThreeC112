package com.sujata.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.sujata.controllers")
public class FirstThymeleafSpringbootProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstThymeleafSpringbootProjectApplication.class, args);
	}

}
