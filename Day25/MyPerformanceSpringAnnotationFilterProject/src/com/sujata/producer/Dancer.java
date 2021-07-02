package com.sujata.producer;

import org.springframework.stereotype.Component;


public class Dancer implements Performer {

	@Override
	public void perform() {
		System.out.println("Dancer is dancing in free style");

	}

}
