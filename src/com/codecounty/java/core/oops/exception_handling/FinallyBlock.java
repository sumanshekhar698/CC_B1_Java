package com.codecounty.java.core.oops.exception_handling;

import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {

		System.out.println("START");
		Scanner sc = new Scanner(System.in);
		int arr[] = { 4 };

		try {
			System.exit(6);
			System.out.println(8 / sc.nextInt());// >> 0
			System.out.println("flag 1");
			System.out.println(arr[1]);// Array Index Out Of Bounds
		} catch (ArithmeticException e) {
			System.out.println("flag 2" + e.getMessage());
		} // DEH Default Exception hanndle
		finally {
			System.out.println("flag 3");
			sc.close();
		}

		System.out.println("END");

	}

}
