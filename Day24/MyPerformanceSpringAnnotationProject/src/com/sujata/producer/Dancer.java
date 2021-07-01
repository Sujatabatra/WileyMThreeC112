package com.sujata.producer;

import org.springframework.stereotype.Component;

@Component("Aryan")
public class Dancer implements Performer {

	@Override
	public void perform() {
		System.out.println("Dancer is dancing in free style");

	}

}
