package com.sujata.demo;

import java.io.Serializable;

public class Person implements Serializable {

	private String pId;
	private String pName;
	
	public Person(){
		
	}
	
	public Person(String pId, String pName) {
		super();
		this.pId = pId;
		this.pName = pName;
	}

	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	
	
}
