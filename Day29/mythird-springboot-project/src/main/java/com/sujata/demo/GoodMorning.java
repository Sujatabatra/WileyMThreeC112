package com.sujata.demo;

import org.springframework.stereotype.Component;

public class GoodMorning implements Greet {

	private String name;

	public GoodMorning(String name) {
		super();
		this.name = name;
	}

	@Override
	public void wish() {
		System.out.println("Good Morning " + name);

	}

}
