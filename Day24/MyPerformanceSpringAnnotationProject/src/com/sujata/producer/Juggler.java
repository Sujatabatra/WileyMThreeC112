package com.sujata.producer;

import org.springframework.stereotype.Component;

@Component("Kratika")
public class Juggler implements Performer {

	@Override
	public void perform() {
		System.out.println("Juggler is juggling 5 balls");

	}

}
