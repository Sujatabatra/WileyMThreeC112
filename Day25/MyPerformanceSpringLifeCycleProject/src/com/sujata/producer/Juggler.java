package com.sujata.producer;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Juggler implements Performer
,BeanNameAware,BeanFactoryAware,ApplicationContextAware,InitializingBean,DisposableBean {

	private int balls;
	private String name;
	
	public Juggler() {
		System.out.println("Step 1 : Constructor call of Juggler");
	}
	public void setBalls(int balls) {
		System.out.println("Step 2: Setter call of Juggler");
		this.balls = balls;
	}
	@Override
	public void perform() {
		System.out.println(name+" is juggling "+balls+" balls");

	}
	@Override
	public void setBeanName(String name) {
		System.out.println("Step 3: setBeanNAme call of juggler");
		this.name=name;
		
	}
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("Step 4: setBeanFactory() of Juggler");
		
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("Step 5: setApplicationContext of Juggler");
		
	}

	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Step 7: Initializing Bean afterPropertySetMethod() of juggler");
		
	}
	
	public void customInit() {
		System.out.println("Step 8: Hi I am cusom init method");
	}
	
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Step 1: destroy() from DisposableBean of Juggler");
		
	}
	
	public void customDestroy() {
		System.out.println("Hi I am custom destroy method");
	}
	
	
}
