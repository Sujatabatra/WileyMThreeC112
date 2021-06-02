package com.sujata.demo;

import java.util.Scanner;

public class MyThrowsFirstDemoClass {

	public static void divide(int number1, int number2)throws ArithmeticException {
		
			int result = number1 / number2;
			System.out.println("Division : " + result);
			System.out.println("End from Divide method!");
			
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter First No : ");
			int no1 = sc.nextInt();
			System.out.println("Enter Second No : ");
			int no2 = sc.nextInt();
			divide(no1, no2);
		} catch (ArithmeticException exception) {
			System.out.println("infinite");
		}
		System.out.println("Good By from main!!!");

	}

}
