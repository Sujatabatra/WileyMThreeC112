package com.sujata.objectio;

import java.io.Serializable;

public class Person implements Serializable{

	
	private static final long serialVersionUID = -305011557217068981L;
	private int personId;
	private String personName;
	
	public Person() {
		
	}
	
	public Person(int personId, String personName) {
		super();
		this.personId = personId;
		this.personName = personName;
	}
	
	public Person(int personId) {
		super();
		this.personId = personId;
	}

	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + "]";
	}
	
	
}
