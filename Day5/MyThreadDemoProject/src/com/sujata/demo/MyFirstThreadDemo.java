package com.sujata.demo;

class FirstThread extends Thread{
	
	public FirstThread() {
//		super();
	}
	public FirstThread(String name) {
		super(name);
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" i : "+i);
		}
		System.out.println("Good Bye from "+Thread.currentThread().getName());
	}
}
public class MyFirstThreadDemo {

	public static void main(String[] args) {
		
		//New Born
		FirstThread thread1=new FirstThread(); //Thread-0
		FirstThread thread2=new FirstThread(); //Thread-1
		thread2.setName("SecondThread"); //we changed the name of Thread-1 -> SecondThread
		FirstThread thread3=new FirstThread(); //Thread-2
		FirstThread thread4=new FirstThread(); //Thread-3
		FirstThread thread5=new FirstThread(); //Thread-4
		
		
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
