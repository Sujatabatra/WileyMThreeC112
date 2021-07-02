package com.sujata.producer;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitPerformers implements BeanPostProcessor {
	  
		   public Object postProcessBeforeInitialization(Object bean, String beanName) 
		      throws BeansException {
		      System.out.println("==================================");
		      System.out.println("BeforeInitialization : " + beanName);
		      System.out.println("=================================");
		      return bean;  
		   }
		   public Object postProcessAfterInitialization(Object bean, String beanName) 
		      throws BeansException {
		      
			  System.out.println("=================================");
		      System.out.println("AfterInitialization : " + beanName);
		      System.out.println("=================================");
		      return bean;  
		   }
		
}
