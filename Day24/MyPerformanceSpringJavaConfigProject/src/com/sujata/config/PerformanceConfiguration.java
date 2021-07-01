package com.sujata.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sujata.producer.Dancer;
import com.sujata.producer.Juggler;
import com.sujata.producer.Singer;

@Configuration
public class PerformanceConfiguration {

	@Bean(name = "Saumya")
	public Singer getSinger() {
		return new Singer();
	}
	
	@Bean
	public Dancer Aryan() {
		return new Dancer();
	}
	
	@Bean
	public Juggler Kratika() {
		return new Juggler();
	}
	
	public Juggler Bhanu() {
		return new Juggler();
	}
}
