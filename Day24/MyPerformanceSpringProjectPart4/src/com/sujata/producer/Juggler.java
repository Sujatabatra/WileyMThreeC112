package com.sujata.producer;

import java.util.HashMap;
import java.util.Set;

public class Juggler implements Performer {

	private HashMap<String, Integer> objectsBalls;
	
	
	public Juggler(HashMap<String, Integer> objectsballs) {
		super();
		objectsBalls = objectsballs;
	}


	@Override
	public void perform() {
		Set<String> objects=objectsBalls.keySet();
		for(String obj:objects) {
			System.out.println("Juggler is juggling "+objectsBalls.get(obj)+" "+obj);
		}
		
		System.out.println("JUGGLER PERFORMANCE ENDS!!");

	}

}
