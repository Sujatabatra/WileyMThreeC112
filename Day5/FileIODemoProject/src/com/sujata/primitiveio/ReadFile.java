package com.sujata.primitiveio;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		FileInputStream fis=null;
		DataInputStream dis=null;
		try {
			fis=new FileInputStream("PrimitiveIODemoFile");
			//Decorator Design Pattern
			dis=new DataInputStream(fis);
			System.out.println(dis.readDouble());
			System.out.println(dis.readInt());
			System.out.println(dis.readBoolean());
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				dis.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}


	}

}
