package com.sujata.demo;

public class ComplexMain {

	public static void main(String[] args) {
		Complex complex1=new Complex(5,4);
//		complex1.setReal(5);
//		complex1.setImag(2);
		complex1.display();
		
		Complex complex2=new Complex(6,7);
		complex2.display();
//		int value=complex2.Complex(6, 9);

//		System.out.println(value);
		Complex c3=complex1.sumComplex(complex2);
		c3.display();
	}

}
