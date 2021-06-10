package com.sujata.demo;

//Functional Interface
@FunctionalInterface
interface DemoInterface {
	void show();
}

interface Greet {
	void wish(String name);
}
interface WelcomeNote{
	String welcome();
}

interface Addition{
	int sum(int no1,int no2);
}
public class MyFirstDemo {

	public static void main(String[] args) {
//		DemoInterface ob1=new DemoInterface() {
//			@Override
//			public void show() {
//				System.out.println("Hello everyone , I am demonstrating Lambda!");
//			}
//		};
//		DemoInterface ob1=()-> {
//				System.out.println("Hello everyone , I am demonstrating Lambda!");
//		};

		DemoInterface ob1 = () -> System.out.println("Hello everyone , I am demonstrating Lambda!");

		ob1.show();

//		Greet gOb=new Greet() {
//			
//			@Override
//			public void wish(String name) {
//			System.out.println("Welcome "+name);
//				
//			}
//		};
//
//		Greet gOb = (name)-> 
//				System.out.println("Welcome " + name);

		Greet gOb = name -> System.out.println("Welcome " + name);
		gOb.wish("Chetan");

//		WelcomeNote wOb=new WelcomeNote() {
//			@Override
//			public String welcome() {
//				return "Welcome to the world of lambdas";
//			}
//		};
		
		WelcomeNote wOb=()-> "Welcome to the world of lambdas";
		System.out.println(wOb.welcome());
		
//		Addition aOb=new Addition() {	
//			@Override
//			public int sum(int no1, int no2) {
//				return no1+no2;
//			}
//		};
		
		Addition aOb=(no1, no2)-> no1+no2;
			
		
		System.out.println(aOb.sum(10, 30));
		
		
	}

}
