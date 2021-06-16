package com.sujata.demo;

public class MainStudent {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student st=new Student(101, "AAAAA");

		Student copiedStudent=(Student)st.clone();
		
		System.out.println(st);
		System.out.println(copiedStudent);
		
		System.out.println("St : "+st.hashCode());
		System.out.println("copiedStudent "+copiedStudent.hashCode());
		
		st.setName("Ashish");
		System.out.println(st);
		System.out.println(copiedStudent);
		
	}

}
