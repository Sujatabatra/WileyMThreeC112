package com.sujata.demo;


interface Shape{
	void area();
}
public class MyAnonymousInnerClassTwo {

	public static void main(String[] args) {
		
		Shape rectangle=new Shape() {
			public void area() {
				System.out.println("Hi I am rectangle area");
			}
		};
		
		rectangle.area();

	}

}
