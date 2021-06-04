package com.sujata.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class ReturnableThreadJob implements Callable<String>{

	private int counter;
	
	public ReturnableThreadJob(int counter) {
		super();
		this.counter = counter;
	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return Thread.currentThread().getName()+" counter : "+counter;
	}
	
}
public class MyFourthDemoClass {
	public static void main(String args[]) {
		
		ExecutorService threadPool=Executors.newFixedThreadPool(4);
		
		Future<String> futureValue=threadPool.submit(new ReturnableThreadJob(999));
		System.out.println(futureValue.isDone());
		
		
		try {
			System.out.println(futureValue.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
//		try {
//			Thread.sleep(500);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("Completion Status :"+futureValue.isDone());
	}
}
