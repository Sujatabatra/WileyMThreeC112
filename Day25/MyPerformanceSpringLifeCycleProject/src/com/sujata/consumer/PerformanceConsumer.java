package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.producer.Juggler;
import com.sujata.producer.Performer;

public class PerformanceConsumer {

	public static void main(String[] args) {
		
		AbstractApplicationContext springContainer=new ClassPathXmlApplicationContext("performer.xml");
		
		springContainer.registerShutdownHook();

		Performer firstPerformer=(Performer)springContainer.getBean("Kratika");
//		((Juggler)firstPerformer).setBalls(3);
		firstPerformer.perform();
	}

}
