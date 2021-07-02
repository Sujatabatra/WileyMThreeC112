package com.sujata.producer;

public class Dancer implements Performer {

	private String style;
	
	public Dancer(String style) {
		super();
		this.style = style;
	}

	@Override
	public void perform() {
		System.out.println("Dancer is dancing in "+style+" style");

	}
	
	public void init() {
		System.out.println("Hi I am dancer custom init");
	}
	
	public void dest() {
		System.out.println("Hi I am dancer custom destroy");
	}

}
