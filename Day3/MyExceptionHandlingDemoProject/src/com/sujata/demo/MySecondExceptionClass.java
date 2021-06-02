package com.sujata.demo;

import java.util.Scanner;

public class MySecondExceptionClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int location = 0;
		try {
			System.out.println("Enter first No : ");
			int no1 = scanner.nextInt();
			System.out.println("Enter second No : ");
			int no2 = scanner.nextInt();
			int div = no1 / no2;
			System.out.println("Division Result : " + div);

			int arr[];
			System.out.println("Enter Total no of elements in an array : ");
			int total = scanner.nextInt();
			arr = new int[total];

			for (int index = 0; index < total; index++) {
				System.out.println("Enter " + (index + 1) + " element : ");
				arr[index] = scanner.nextInt();
			}

			System.out.println("Enter location of an element in an array whoes value you want to view ");
			location = scanner.nextInt();
			System.out.println("Value at location " + location + " : " + arr[location]);
		} catch (ArithmeticException exception) {
			System.out.println("Infinity");
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println(location + "location doesnot exist in an array");
		}
		catch (NegativeArraySizeException exception) {
			System.out.println("Array Size can never be negative....");
		} catch (Exception exception) {
			System.out.println("Something went wrong, please try again with different set of values");
		}
		finally {
			System.out.println("Hi I am finally block!!");
		}
		System.out.println("Good Bye , have a Nice Day from Main!");

	}

}
