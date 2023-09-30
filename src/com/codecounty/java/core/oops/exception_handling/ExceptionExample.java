package com.codecounty.java.core.oops.exception_handling;

public class ExceptionExample {

	public static void main(String[] args) {

		System.out.println("START");// START

		try {
			System.out.println(9 / 0);
		} catch (Exception e) {

			System.out.println("Handled :: " + e.getMessage());
		}

		System.out.println("END");

	}

}
