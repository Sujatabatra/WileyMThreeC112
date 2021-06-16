package com.sujata.demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MyMainClass {

	public static void main(String[] args) {
		Employee emp=new Employee("E001", "ABC", "Manager");
		try {
			   FileOutputStream fileOutputStream = new FileOutputStream("serialObject.ser");
			   ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			   objectOutputStream.writeObject(emp);

		  }
		  catch (IOException e) {
			   e.printStackTrace();
		  } 

System.out.println("File Created ");

	}

}
