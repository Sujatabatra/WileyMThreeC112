package com.sujata.demo;

class MyMethodLocalOuter{
	
	
	public void display() {
		System.out.println("Hi I am display method of MyMethodLocalOuter class");
		
//		Demo d=new Demo();
	}
	public void method() {
//		Demo d=new Demo();
//		d.show();
		//Demo is a local class of method method()
		int x=10;
//		x=x+5;
		class Demo{
			public void show() {
				System.out.println("Hi I am show method of Demo class "+x);
				display();
			}
		}
		Demo d=new Demo();
		d.show();
	}
}
public class MethodLocalInnerClassDemo {

	public static void main(String[] args) {
		MyMethodLocalOuter ob=new MyMethodLocalOuter();
		ob.method();

	}

}
