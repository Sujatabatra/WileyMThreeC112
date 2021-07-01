package com.sujata.producer;

import java.util.ArrayList;

public class Singer implements Performer {

	private ArrayList<String> songs;

	public Singer(ArrayList<String> songs) {
		super();
		this.songs = songs;
	}

	@Override
	public void perform() {
		System.out.println("Singer is singing : ");
		for(String song:songs) {
			System.out.println(song);
		}
		System.out.println("SINGER PERFORMANCE ENDS");

	}

}
