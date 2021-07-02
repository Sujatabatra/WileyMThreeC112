package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.config.PerformanceConfiguration;
import com.sujata.producer.Juggler;
import com.sujata.producer.Performer;

public class PerformanceConsumer {

	public static void main(String[] args) {
		
		/*
		 * Life Cycle : Constructor call -> setter methods call (Spring Container is doing it for us)
		 * Spring container is looking at configuration file and picking all the beans
		 */
		ApplicationContext springContainer=new AnnotationConfigApplicationContext(PerformanceConfiguration.class);
		

		Performer firstPerformer=(Performer)springContainer.getBean("Vasu");
//		((Juggler)firstPerformer).setBalls(3);
		firstPerformer.perform();
	}

}
