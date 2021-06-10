package com.sujata.demo;

class PopCorn{
	public void pop() {
		System.out.println("PopCorn is popping");
	}
}
class CaramelPopCorn extends PopCorn{
	public void pop() {
		System.out.println("Caramel PopCorn is popping");
	}
	public void quantity() {
		System.out.println("Additing lots of caramel");
	}
}


public class MyAnonymousInnerClassDemo {

	
	
	public static void main(String args[]) {
		PopCorn p;
//		p=new PopCorn();
//		p.pop();
//		
//		p=new CaramelPopCorn();
//		p.pop();
		
		
		
		//reference variable is of base class=object is of child class (Object slicing)
		p=new CaramelPopCorn();
		p.pop();
		((CaramelPopCorn)(p)).quantity();
		
		p=new PopCorn() {
			public void pop() {
				System.out.println("Yummy Butter PopCorn is popping");
			}
			public void quantity() {
				System.out.println("Adding lots of Butter");
			}
		};
		
		p.pop();
		
		
		
	}
}
