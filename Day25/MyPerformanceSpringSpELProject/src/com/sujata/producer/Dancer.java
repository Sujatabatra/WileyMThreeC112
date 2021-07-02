package com.sujata.producer;

public class Dancer implements Performer {

	private String style;

	public Dancer(String style) {
		super();
		this.style = style;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	@Override
	public void perform() {
		System.out.println("Dancer is dancing in " + style + " style");

	}

}
