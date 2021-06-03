package com.sujata.demo;

class SecondThread extends Thread{
	
	public SecondThread() {
//		super();
	}
	public SecondThread(String name) {
		super(name);
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" i : "+i);
		}
		System.out.println("Good Bye from "+Thread.currentThread().getName());
	}
}
public class MySecondThreadDemo {

	public static void main(String[] args) {
		
		//New Born
		SecondThread thread1=new SecondThread(); //Thread-0
		SecondThread thread2=new SecondThread("SecondThread"); //SecondThread
		SecondThread thread3=new SecondThread(); //Thread-1
		SecondThread thread4=new SecondThread(); //Thread-2
		SecondThread thread5=new SecondThread(); //Thread-3
		
		
		//thread moves from new born state -> ready or running
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" i : "+i);
		}
		System.out.println("Good Bye from "+Thread.currentThread().getName());

	}

}
