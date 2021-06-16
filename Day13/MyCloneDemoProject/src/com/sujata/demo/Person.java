package com.sujata.demo;

public class Person implements Cloneable{

	private String pId;
	private String pName;
	private Address addr;
	
	public Person() {
		
	}

	public Person(String pId, String pName, Address addr) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.addr = addr;
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

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	@Override
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}

	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", addr=" + addr + "]";
	}
	
}
