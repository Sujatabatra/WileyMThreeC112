package com.sujata.model;

import com.sujata.bean.Student;

public class Standard {

	private Student students[];
	private static int index;
	
	public Standard(int totalNoOfStudents) {
		students=new Student[totalNoOfStudents];
	}
	
	public void addStudent(Student student) {
		students[index++]=student;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}
	
	public Student getStudent(int index) {
		return students[index];
	}
	
	
}
