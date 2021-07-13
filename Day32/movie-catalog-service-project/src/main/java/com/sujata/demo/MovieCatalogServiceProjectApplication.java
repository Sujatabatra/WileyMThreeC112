package com.sujata.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "com.sujata")
public class MovieCatalogServiceProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieCatalogServiceProjectApplication.class, args);
	}
	
	@Bean
	RestTemplate getTemplate() {
		return new RestTemplate();
	}

}
