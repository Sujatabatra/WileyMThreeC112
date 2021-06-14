package com.sujata.demo;


class StaticOuterDemo{
	static int data=20;
	static void behaviour() {
		System.out.println("Hi i am behaviour() methid of public statuc void main");
	}
	
	static class Inner{
		void innerBehaviour() {
			System.out.println("Hi I am innerBehaviour of Inner class");
		}
	}
}
public class JavaStaticNestedClassDemp {

	public static void main(String[] args) {
		StaticOuterDemo.Inner iOb=new StaticOuterDemo.Inner();
		iOb.innerBehaviour();

	}

}
