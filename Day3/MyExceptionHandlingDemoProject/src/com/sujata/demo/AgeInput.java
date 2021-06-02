package com.sujata.demo;

public class AgeInput {

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<18) {
			throw new AgeUnCheckedException("Age cannot be less then 18");
		}
		this.age = age;
	}
	
	public void oneMoreSetAge(int age) throws AgeCheckedException {
		if(age<18) {
			throw new AgeCheckedException("Age cannot be less then 18");
		}
		this.age = age;
	}
	
	
}
