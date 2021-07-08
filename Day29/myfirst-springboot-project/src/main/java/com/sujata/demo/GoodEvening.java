package com.sujata.demo;

import org.springframework.stereotype.Component;

@Component
public class GoodEvening implements Greet {

	@Override
	public void wish(String name) {
		System.out.println("Good Evening "+name);

	}

}
