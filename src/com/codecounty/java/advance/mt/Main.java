package com.codecounty.java.advance.mt;

public class Main {

	public static void main(String[] args) {// Single Thrad Program [main]

		System.out.println("START");

		MyThread t1 = new MyThread();
		t1.setName("t1");
		System.out.println(t1.getState());
		t1.start();
		t1.setPriority(Thread.MAX_PRIORITY);// 1 - 10
		System.out.println(t1.getState());

		MyThread t2 = new MyThread();
		t2.setName("t2");
		System.out.println(t2.getState());
		t2.start();// 5
		System.out.println(t2.getState());

		// 2
		Thread t3 = new Thread(new Work());
		t3.setName("t3");
		System.out.println(t3.getState());
		t3.start();
		System.out.println(t3.getState());


		// 3
		Thread t4 = new Thread(() -> {
			for (int i = 0; i < 8; i++) {

				try {
					Thread.sleep(200);
					System.out.println(i + " :: " + Thread.currentThread() +" :: " +Thread.currentThread().getState());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
		t4.setName("t4");
		System.out.println(t4.getState());
		t4.start();
		System.out.println(t4.getState());

		System.out.println("END");

	}

}

//1
class MyThread extends Thread {// Worker

	@Override
	public void run() {// work
		
		for (int i = 0; i < 8; i++) {

			try {
				Thread.sleep(200);
				System.out.println(i + " :: " + Thread.currentThread() +" :: " +Thread.currentThread().getState());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}

//2 
class Work implements Runnable {// Work

	@Override
	public void run() {
		for (int i = 0; i < 8; i++) {

			try {
				Thread.sleep(800);
				System.out.println(i + " :: " + Thread.currentThread() +" :: " +Thread.currentThread().getState());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
