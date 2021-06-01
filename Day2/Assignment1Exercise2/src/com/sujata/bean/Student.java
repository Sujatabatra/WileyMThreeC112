package com.sujata.bean;

public class Student {
	
	private int rollNo;
	private String studName;
	private int marksEng;
	private int marksMaths;
	private int marksScience;
	
	public Student() {
		
	}

	public Student(int rollNo, String studName, int marksEng, int marksMaths, int marksScience) {
		super();
		this.rollNo = rollNo;
		this.studName = studName;
		this.marksEng = marksEng;
		this.marksMaths = marksMaths;
		this.marksScience = marksScience;
	}
	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public int getMarksEng() {
		return marksEng;
	}

	public void setMarksEng(int marksEng) {
		this.marksEng = marksEng;
	}

	public int getMarksMaths() {
		return marksMaths;
	}

	public void setMarksMaths(int marksMaths) {
		this.marksMaths = marksMaths;
	}

	public int getMarksScience() {
		return marksScience;
	}

	public void setMarksScience(int marksScience) {
		this.marksScience = marksScience;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studName=" + studName + ", marksEng=" + marksEng + ", marksMaths="
				+ marksMaths + ", marksScience=" + marksScience + "]";
	}

	
	

}
