package com.sujata.demo;

import org.springframework.stereotype.Component;

public class GoodEvening implements Greet {

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void wish() {
		System.out.println("Good Evening " + name);

	}

}
