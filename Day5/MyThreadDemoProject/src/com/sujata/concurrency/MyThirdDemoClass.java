package com.sujata.concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadJobThree implements Runnable{

	private int counter;
	
	
	public ThreadJobThree(int counter) {
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
public class MyThirdDemoClass {

	public static void main(String[] args) {
		ExecutorService threadPool=Executors.newFixedThreadPool(4);
		for(int jobId=1;jobId<=10;jobId++) {
			threadPool.execute(new ThreadJobThree(jobId));
		}
		
		threadPool.execute(new ThreadJobThree(999));
		threadPool.shutdown();
		threadPool.execute(new ThreadJobThree(888));

	}

}
