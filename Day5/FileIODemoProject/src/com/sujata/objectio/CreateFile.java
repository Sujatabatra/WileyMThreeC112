package com.sujata.objectio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CreateFile {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try {
			fos=new FileOutputStream("ObjectIODemoFile");
			oos=new ObjectOutputStream(fos);
			Person p=new Person(101, "AAAAA");
			oos.writeObject(p);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			System.out.println("File Created");
		}

	}

}
