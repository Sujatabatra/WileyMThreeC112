package com.sujata.demo;

//One Function
interface ShowType{
	void show();
}
public class MyFirstDemoClass {

	public static void main(String[] args) {
		int a=10;
		float x=9.4f;
		
		String str="Sujata";
		
		
		
		ShowType var=()->{
			System.out.println("Hello everyone!");
		};
		
		var.show();

	}

}
