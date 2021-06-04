package com.sujata.primitiveio;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		
		FileOutputStream fos=null;
		DataOutputStream dos=null;
		try {
			fos=new FileOutputStream("PrimitiveIODemoFile");
			//Decorator Design Pattern
			dos=new DataOutputStream(fos);
			
			dos.writeDouble(56.4);
			dos.writeInt(124);
			dos.writeBoolean(true);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				dos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		System.out.println("File Created");
	}

}
