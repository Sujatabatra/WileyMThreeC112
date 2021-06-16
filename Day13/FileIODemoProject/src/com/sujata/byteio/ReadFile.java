package com.sujata.byteio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

	public static void main(String args[]) {
		
//		FileInputStream fis=null;
		
		try(FileInputStream fis=new FileInputStream("ByteIODemoFile")) {
//			fis=new FileInputStream("ByteIODemoFile");
			int c;
			while((c=fis.read())!=-1) {
				System.out.print((char)c);
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
//		finally {
//			try {
//				fis.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
	}
}
