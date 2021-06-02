package com.sujata.demo;

import java.util.Scanner;

public class MainAgeInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter Age to check for eligibility for voting: ");
			int a = sc.nextInt();
			AgeInput aOb = new AgeInput();
			aOb.setAge(a);
			System.out.println("Age entered by user : " + aOb.getAge());
			
			System.out.println("Enter Age to check for eligibility for employment: ");
			int a1 = sc.nextInt();
			AgeInput aOb1=new AgeInput();
			aOb1.oneMoreSetAge(a1);
			System.out.println("Person is eligible for employment as his/her age is"+aOb1.getAge());
		} catch (AgeUnCheckedException exception) {
			System.out.println("User is not eligible for voting");
		}
		catch(AgeCheckedException exception) {
			System.out.println("person is not eligible for employment");
		}
	}

}
