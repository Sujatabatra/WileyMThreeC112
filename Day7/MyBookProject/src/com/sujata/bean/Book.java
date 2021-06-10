package com.sujata.bean;

public class Book {

	private int bId;
	private String bName;
	private String authodName;
	private int noOfPages;
	private int price;
	
	public Book() {
		
	}

	public Book(int bId, String bName, String authodName, int noOfPages, int price) {
		super();
		this.bId = bId;
		this.bName = bName;
		this.authodName = authodName;
		this.noOfPages = noOfPages;
		this.price = price;
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getAuthodName() {
		return authodName;
	}

	public void setAuthodName(String authodName) {
		this.authodName = authodName;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bId=" + bId + ", bName=" + bName + ", authodName=" + authodName + ", noOfPages=" + noOfPages
				+ ", price=" + price + "]";
	}
	
	
}
