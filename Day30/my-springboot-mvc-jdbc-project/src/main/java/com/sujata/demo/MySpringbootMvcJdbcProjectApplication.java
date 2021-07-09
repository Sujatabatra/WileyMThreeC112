package com.sujata.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.sujata")
public class MySpringbootMvcJdbcProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringbootMvcJdbcProjectApplication.class, args);
	}

}
