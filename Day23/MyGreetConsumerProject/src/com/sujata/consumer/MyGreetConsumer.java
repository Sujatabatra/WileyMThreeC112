package com.sujata.consumer;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.sujata.demo.GoodMorning;
import com.sujata.demo.Greet;

public class MyGreetConsumer {

	public static void main(String[] args) {

		Resource resource = new ClassPathResource("greet.xml");

		BeanFactory springContainer = new XmlBeanFactory(resource);

		// Greet greet=new GoodMorning();
//		Greet greet=spring container give me the component
		Greet greet = (Greet) springContainer.getBean("eve");

		greet.wish("Kratika");
	}

}
