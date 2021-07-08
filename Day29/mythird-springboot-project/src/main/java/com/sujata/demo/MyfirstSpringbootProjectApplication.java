package com.sujata.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

//@SpringBootApplication = @Configuration + @ComponentScan
@SpringBootApplication
public class MyfirstSpringbootProjectApplication implements CommandLineRunner {

	@Value("${mrng.name}")
	String mName;
	@Value("${eve.name}")
	String eName;
	@Autowired
	@Qualifier("eve")
	private Greet greet;
	
	public static void main(String[] args) {
		SpringApplication.run(MyfirstSpringbootProjectApplication.class, args);
//		ApplicationContext springContainer= SpringApplication.run(MyfirstSpringbootProjectApplication.class, args);
//		Greet g1=(Greet)springContainer.getBean("goodMorning");
//		g1.wish("Sujata");
	}

	@Override
	public void run(String... args) throws Exception {
		greet.wish();
		
	}
	
	@Bean("mrng")
	public GoodMorning getMrng() {
		return new GoodMorning(mName);
	}
	
	@Bean("eve")
	public GoodEvening getEve() {
		GoodEvening goodEvening=new GoodEvening();
		goodEvening.setName(eName);
		return goodEvening;
	}

}
