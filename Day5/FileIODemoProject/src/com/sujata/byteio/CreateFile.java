package com.sujata.byteio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream("ByteIODemoFile");
			
			byte data[]= {'S','U','J','A','T','A',' ','B','A','T','R','A','\n','I','N','D','I','A'};
			fos.write(data);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("File Created!");

	}

}
