package com.codecounty.dsa.recursion;

public class Main {

	static int counter = 0;

	public static void main(String[] args) {
		call();
	}

	private static void call() {
		System.out.println("START");
		System.out.println(++counter);
		call();//STACKOVERFLOW ERROR
		System.out.println("END");
	}

}
