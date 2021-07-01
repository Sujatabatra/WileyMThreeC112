package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.config.PerformanceConfiguration;
import com.sujata.producer.Performer;

public class PerformanceConsumer {

	public static void main(String[] args) {
		
		ApplicationContext springContainer=new AnnotationConfigApplicationContext(PerformanceConfiguration.class);
		

		Performer firstPerformer=(Performer)springContainer.getBean("Bhanu");
		
		firstPerformer.perform();
	}

}
