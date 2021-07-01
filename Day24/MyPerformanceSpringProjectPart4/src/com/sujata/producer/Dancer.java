package com.sujata.producer;

import java.util.HashSet;

public class Dancer implements Performer {

	private HashSet<String> styles;

	public void setStyles(HashSet<String> styles) {
		this.styles = styles;
	}

	@Override
	public void perform() {
		System.out.print("Dancer is dancing in " );
		for(String style:styles) {
			System.out.print(style+" ");
		}
		System.out.println("Styles!");
		System.out.println("DANCER PERFORMANCE ENDS");
	}

}
