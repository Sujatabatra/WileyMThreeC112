package com.sujata.chario;

import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {

	public static void main(String args[]) {
		FileWriter writer=null;
		
		try {
			writer=new FileWriter("CharIODemoFile");
			String str ="Hello EveryOne from Sujata!";
			writer.write(str);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("File Created ");
	}
}
