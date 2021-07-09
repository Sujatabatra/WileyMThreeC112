package com.sujata.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.sujata.controllers")
public class MySpringbootMvcProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringbootMvcProjectApplication.class, args);
	}

}
