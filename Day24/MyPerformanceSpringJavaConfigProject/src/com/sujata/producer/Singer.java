package com.sujata.producer;

import org.springframework.stereotype.Component;


public class Singer implements Performer {

	@Override
	public void perform() {
		System.out.println("Singer is singing LALALALA!");

	}

}
