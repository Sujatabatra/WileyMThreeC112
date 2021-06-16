package com.sujata.demo;

public class Address implements Cloneable{

	private int hNo;
	private String street;
	private String city;
	private String state;

	public Address() {

	}

	public Address(int hNo, String street, String city, String state) {
		super();
		this.hNo = hNo;
		this.street = street;
		this.city = city;
		this.state = state;
	}

	public int gethNo() {
		return hNo;
	}

	public void sethNo(int hNo) {
		this.hNo = hNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "Address [hNo=" + hNo + ", street=" + street + ", city=" + city + ", state=" + state + "]";
	}

	
}
