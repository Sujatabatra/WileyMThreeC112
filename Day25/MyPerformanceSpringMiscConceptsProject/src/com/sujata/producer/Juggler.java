package com.sujata.producer;

public class Juggler implements Performer {

	private int balls;
	
	public Juggler() {
		System.out.println("JUGGLER CONSTRUCTOR!");
	}
	public void setBalls(int balls) {
		this.balls = balls;
	}
	@Override
	public void perform() {
		System.out.println("Juggler is juggling "+balls+" balls");

	}

}
