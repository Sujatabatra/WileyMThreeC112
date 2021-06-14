package com.sujata.demo;

class OuterClass{
	
	private int data=10;
	public void behaviour() {
		System.out.println("Hi I am behaviour() of OuterClass");
	}
	
	public class Inner{
		private int innerData=20;
		public void innerClassBehaviour() {
			System.out.println("Hi I am innerclass behaviour()"+data);
		}
		public void behaviour() {
			System.out.println("Hi I am behaviour of Inner class");
		}
		
		public void callDiffBehaviour() {
			OuterClass.this.behaviour();
			behaviour();
		}
	}
	
	public void behaviour1() {
		Inner inner=new Inner();
		System.out.println("innerData : "+inner.innerData);
		inner.innerClassBehaviour();
	}
}

public class MemberInnerClassDemo {

	public static void main(String[] args) {
	
		OuterClass oc=new OuterClass();
		oc.behaviour();
		oc.behaviour1();
		
		OuterClass.Inner iOb=oc.new Inner();
		iOb.innerClassBehaviour();
		iOb.behaviour();
		

	}

}
