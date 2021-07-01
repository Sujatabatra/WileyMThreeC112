package com.sujata.producer;

import java.util.HashMap;
import java.util.Set;

public class Instrumentalist implements Performer {

	private HashMap<String, Instrument> songsInstrument;

	public void setSongsInstrument(HashMap<String, Instrument> songsInstrument) {
		this.songsInstrument = songsInstrument;
	}

	@Override
	public void perform() {
		Set<String> songs = songsInstrument.keySet();
		for (String song : songs) {
			System.out.print(" Instrumentalist is playing ");
			songsInstrument.get(song).play();
			System.out.println("On Song " + song);
		}

		System.out.println("Instrumentalist Performance ends here!!");
	}

}
