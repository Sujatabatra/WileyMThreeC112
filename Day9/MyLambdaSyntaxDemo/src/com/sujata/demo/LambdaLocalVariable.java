package com.sujata.demo;

import java.util.function.Consumer;

public class LambdaLocalVariable {
	static int n=10;
	String str;
	
	public void check() {
		str="Sujata";
		n=n+10;
		/*final*/ int y=10;
//		y=y+10;
		str=str.toUpperCase();
		Consumer<Integer> cOb=(x)->{
			System.out.println("Value accepted :"+x);
			System.out.println("static variable coming from outside is "+n);
			System.out.println("local variable coming from outside is "+y);
			System.out.println("instance variable coming from outside is "+str);
		};
		cOb.accept(30);
	
	}
	public static void main(String[] args) {	
		LambdaLocalVariable ob=new LambdaLocalVariable();
		ob.check();

	}

}
