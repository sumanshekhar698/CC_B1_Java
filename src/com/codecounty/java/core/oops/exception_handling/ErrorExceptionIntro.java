package com.codecounty.java.core.oops.exception_handling;

public class ErrorExceptionIntro {

	static int counter = 0;

	public static void main(String[] args) {

		System.out.println();// Compile Time Error
		callMe();
	}

	private static void callMe() {
		System.out.println(++counter);
		callMe();
	}

}
