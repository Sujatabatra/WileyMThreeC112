package com.sujata.chario;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		FileReader reader=null;
		
		try {
			reader=new FileReader("CharIODemoFile");
			int ch;
			while((ch=reader.read())!=-1)
				System.out.print((char)ch);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
