package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.producer.Performer;

public class PerformanceConsumer {

	public static void main(String[] args) {
		
		ApplicationContext springContainer=new ClassPathXmlApplicationContext("perform.xml");
		

		Performer firstPerformer=(Performer)springContainer.getBean("juggler");
		
		firstPerformer.perform();
	}

}
