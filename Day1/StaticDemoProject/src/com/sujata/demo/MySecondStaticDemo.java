package com.sujata.demo;

class Base{
	static {
		System.out.println("Hi I am static block of Base class!");
	}
	{
		System.out.println("Hi I am instance block of Base class!");
	}
	Base(){
		System.out.println("Hi I am Base class Constructor");
	}
//	{
//		System.out.println("Hi I am instance block TWO of Base class!");
//	}
//	static {
//		System.out.println("Hi I am static block 2 of Base class!");
//	}
}

class Derived extends Base{
	static {
		System.out.println("Hi I am static block of Derived class!");
	}
	{
		System.out.println("Hi I am instance block of Derived class!");
	}
	Derived(){
		System.out.println("Hi I am Derived class Constructor");
	}
}

public class MySecondStaticDemo {

	
	public static void main(String[] args) {
	
		
		Derived d1=new Derived();
		System.out.println("================");
		Base b1=new Base();
	}

}
