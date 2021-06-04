package com.sujata.concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

class ThreadJob implements Runnable{

	private int counter;
	
	
	public ThreadJob(int counter) {
		super();
		this.counter = counter;
	}


	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" counter : "+counter);
		
	}
	
}
public class MyFirstDemoClass {

	public static void main(String[] args) {
		Executor threadPool=Executors.newFixedThreadPool(4);
		for(int jobId=1;jobId<=10;jobId++) {
			threadPool.execute(new ThreadJob(jobId));
		}
		

	}

}
