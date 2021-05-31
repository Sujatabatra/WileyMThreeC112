package com.sujata.demo;

//POJO : Plain Old Java Object
/*
 * 1. Constructor is used to initialize objects at the time of declaring it
 * 2. Constructor name will be same as that of your class name
 * 3. Constructor can be argumented as well as non argumented
 * 4. Constructor can exist in any scope (i.e public, private , default and protected)
 * 5. If class is constructor challenged (i.e No Constructor), then compiler will going
 * to create a default(zero argument) constructor for you, but if class is not constructor
 * challenged(i.e has any constructor) , then compile will not going to provide you with any constructor
 */
public class Complex {

	private int real, imag;

	//public scope
	public /*int*/ Complex(int real, int imag) {
	    
		this.real = real;
		this.imag = imag;
//		return 10;
	}
	//private scope
	private Complex(){
		
	}
	//default scope
	Complex(int real) {
		super();
		this.real = real;
	}
	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImag() {
		return imag;
	}

	public void setImag(int imag) {
		this.imag = imag;
	}

	public void display() {
		System.out.print(real);
		if (imag > 0) {
			System.out.println("+" + imag + "i");
		}
		if (imag < 0) {
			System.out.println(imag + "i");
		}
	}
	
	public Complex sumComplex(Complex c2) {
		Complex sum=new Complex();
		sum.real=this.real+c2.real;
		sum.imag=this.imag+c2.imag;
		return sum;
	}

}
