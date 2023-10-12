package com.codecounty.java.advance.mt;

public class ThreadJoins {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("START");
		System.out.println(Thread.currentThread().getState());
		MyThread t1 = new MyThread();
		t1.setName("t1");
		System.out.println(t1.getState());
		t1.setDaemon(true);
		t1.start();
		
		System.out.println(t1.getState());

	
		
		t1.join();
		System.out.println(t1.getState());

		System.out.println(Thread.currentThread().getState());

		System.out.println("END");
//		t1.start();
		System.out.println(t1.getState());
		System.out.println(t1.isDaemon());

	}

}
