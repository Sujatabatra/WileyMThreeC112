package com.sujata.demo;

public class MyFirstStaticDemo {

	private int number1;
	private static int number2;
	
	public int getNumber1() {
		return number1;
	}
	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	
	public static int getNumber2() {
		return number2;
	}
	
	public static void setNumber2(int number2) {
		MyFirstStaticDemo.number2 = number2;
	}
	
	public void display() {
		System.out.println("number1 : "+number1);
		System.out.println("number2 : "+number2);
	}
	
	public static void show() {
//		System.out.println("number1 : "+number1); //existence depends upon object
		System.out.println("number2 : "+number2);
	}
}
