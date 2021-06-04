package com.sujata.concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

class ThreadJobTwo implements Runnable{

	private int counter;
	
	
	public ThreadJobTwo(int counter) {
		super();
		this.counter = counter;
	}


	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" counter before sleep : "+counter);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" counter after sleep : "+counter);
	}
	
}
public class MySecondDemoClass {

	public static void main(String[] args) {
		Executor threadPool=Executors.newFixedThreadPool(4);
		for(int jobId=1;jobId<=10;jobId++) {
			threadPool.execute(new ThreadJobTwo(jobId));
		}
		

	}

}
