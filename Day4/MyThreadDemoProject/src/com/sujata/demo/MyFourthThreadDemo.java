package com.sujata.demo;


class InputNumber
{
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
}

class Reverse extends InputNumber implements Runnable{
	private int reverse;

	public Reverse(int number) {
		setNumber(number);
	}
	public int getReverse() {
		int no=getNumber();
		while(no!=0) {
			int remainder=no%10;
			reverse=reverse*10+remainder;
			no=no/10;
		}
		return reverse;
	}
	//Job of a thread
	@Override
	public void run() {
		int reverse=getReverse();
		System.out.println(Thread.currentThread().getName()+" calculated reverse : "+reverse);
		
	}
	
	
}
public class MyFourthThreadDemo {

	public static void main(String args[]) {
		//No Thread Characterstick but only the job of a thread
		Reverse reverseJob=new Reverse(5674);
		
		Thread thread1=new Thread(reverseJob,"ReverseThread");
		
		thread1.start();
	}
}
