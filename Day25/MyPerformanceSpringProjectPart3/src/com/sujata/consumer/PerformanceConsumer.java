package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.producer.Instrumentalist;
import com.sujata.producer.Juggler;
import com.sujata.producer.Performer;

public class PerformanceConsumer {

	public static void main(String[] args) {
		
		/*
		 * Life Cycle : Constructor call -> setter methods call (Spring Container is doing it for us)
		 * Spring container is looking at configuration file and picking all the beans
		 */
		ApplicationContext springContainer=new ClassPathXmlApplicationContext("performer.xml");
		

		Performer firstPerformer=(Performer)springContainer.getBean("Gourav");
//		((Juggler)firstPerformer).setBalls(3);
		firstPerformer.perform();
		System.out.println(springContainer.isSingleton("Gourav"));
		System.out.println("firstPerformer : "+firstPerformer);
		System.out.println(((Instrumentalist)(firstPerformer)).getInstrument());
		
		Performer secondPerformer=(Performer)springContainer.getBean("Gourav");
		System.out.println("secondPerformer : "+secondPerformer);
		System.out.println(((Instrumentalist)(secondPerformer)).getInstrument());
	}

}
