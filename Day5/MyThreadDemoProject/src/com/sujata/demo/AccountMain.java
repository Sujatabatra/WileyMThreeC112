package com.sujata.demo;

class Account implements Runnable {

	private static int balance = 1000;

	@Override
	public void run() {
		// Object level locking
//		synchronized (this) {
		//class level locking
			synchronized (Account.class) {
			if (balance >= 800) {
				System.out.println(Thread.currentThread().getName()
						+ " you have sufficient balance to withdraw and your balance is Rs." + balance);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				balance = balance - 800;
				System.out.println(Thread.currentThread().getName() + " your balance after withdrawl is Rs." + balance);
			} else {
				System.out.println(Thread.currentThread().getName()
						+ " you don't have sufficient balance to withdraw and your balance is Rs." + balance);
			}

		}
	}

}

public class AccountMain {

	public static void main(String[] args) {
		Account a001 = new Account();
//		Account a002 = new Account();
		Thread yash = new Thread(a001, "Yash");
		Thread kajal = new Thread(a001, "Kajal");

		yash.start();
		kajal.start();

	}

}
