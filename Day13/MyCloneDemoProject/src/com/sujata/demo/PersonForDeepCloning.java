package com.sujata.demo;

public class PersonForDeepCloning implements Cloneable{

	private String pId;
	private String pName;
	private Address addr;
	
	public PersonForDeepCloning() {
		
	}

	public PersonForDeepCloning(String pId, String pName, Address addr) {
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
		PersonForDeepCloning p=(PersonForDeepCloning)super.clone();
		p.addr=(Address)addr.clone();
//		p.addr=new Address(p.getAddr().gethNo(),p.getAddr().getStreet(),p.getAddr().getCity(),p.getAddr().getState());
		return p;
	}

	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", addr=" + addr + "]";
	}
	
}
