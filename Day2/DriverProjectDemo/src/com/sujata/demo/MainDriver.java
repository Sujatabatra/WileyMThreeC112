package com.sujata.demo;

public class MainDriver {

	public static void main(String[] args) {
		Car car1=new Audi("A8", "Blue");
		Car car2=new BMW("Q5", "Black");
		Car car3=new Toyota("Altis", "Golden");
		
		Driver sonu=new Driver("Sonu");
		Driver monu=new Driver("Monu");
		
		sonu.setCar(car2);
		sonu.drive();
		

	}

}
