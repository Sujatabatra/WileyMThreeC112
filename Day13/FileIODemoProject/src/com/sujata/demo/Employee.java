package com.sujata.demo;

import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Employee extends Person {

	private String deptt;

	
	public Employee(){
		
	}
	public Employee(String pId, String pName,String deptt) {
		super(pId, pName);
		this.deptt=deptt;
	}

	public String getDeptt() {
		return deptt;
	}

	public void setDeptt(String deptt) {
		this.deptt = deptt;
	}

//	private void writeObject(ObjectOutputStream os) throws NotSerializableException {
//        throw new NotSerializableException("This class cannot be Serialized");
//	} 
//	
//	private void readObject(ObjectInputStream is) throws NotSerializableException {
//        throw new NotSerializableException("This class cannot be Serialized");
//	} 
}
