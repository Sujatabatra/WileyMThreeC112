package com.sujata.producer;

import java.util.HashMap;
import java.util.Set;

public class MultiTalented implements Performer {

	private HashMap<String, String> songsDanceStyle;
	
	public void setSongsDanceStyle(HashMap<String, String> songsDanceStyle) {
		this.songsDanceStyle = songsDanceStyle;
	}


	@Override
	public void perform() {
		Set<String> songs=songsDanceStyle.keySet();
		for(String song:songs) {
			System.out.println("Performer is dancing in "+songsDanceStyle.get(song)+" on song "+song);
		}
		System.out.println("Multitalented Performance ends here");
	}

}
