package com.codecounty.java.core.oops.exception_handling;

import java.util.Iterator;

public class ExceptionStack {

	public static void main(String[] args) {

		System.out.println("main()");
		callA();

	}

	private static void callA() {

		System.out.println("A");
		try {
			callB();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void callB() throws InterruptedException {
		System.out.println("B");

		callC();
	}

	private static void callC() throws InterruptedException {

		System.out.println("C");
		
		for (int i = 0; i < 5; i++) {
			Thread.sleep(500);
			System.out.println(i);
			
		}

	}

}
