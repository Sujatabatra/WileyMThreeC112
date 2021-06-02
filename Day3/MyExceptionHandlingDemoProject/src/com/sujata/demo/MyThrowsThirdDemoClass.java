package com.sujata.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class MyThrowsThirdDemoClass {

	public static FileReader openFile(String name)throws FileNotFoundException {
		FileReader fr=null;
//		try {
			fr = new FileReader(name);
			System.out.println("file "+name+" opened!");
//		} catch (FileNotFoundException e) {
//			System.out.println("No File with such name exist");
//		}
		
		return fr;
	}
	
	public static void main(String[] args)/*throws FileNotFoundException*/ {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter File Name : ");
		String na=sc.next();
		try {
			openFile(na);
		} catch (FileNotFoundException e) {
			System.out.println("No File Named "+na+" Exist!, please try with different filename");
		}

	}

}
