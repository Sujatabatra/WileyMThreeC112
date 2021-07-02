package com.sujata.producer;

public class Singer implements Performer {

	private String song;
	
	public Singer(String song) {
		super();
		this.song = song;
	}

	@Override
	public void perform() {
		System.out.println("Singer is singing "+song+"!");

	}
	
	public void init() {
		System.out.println("Hi I am Singer custom init");
	}
	
	public void dest() {
		System.out.println("Hi I am Singer custom destroy");
	}

}
