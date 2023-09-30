package com.codecounty.java.core.oops.exception_handling;

import java.util.Scanner;

public class MultipleCatchInSingleLineExceptionHandling {

	public static void main(String[] args) {

		System.out.println("START");
		int arr[] = { 2, 4, 8 };
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println(8 / arr[sc.nextInt()]);// 2
			System.out.println("flag 1");
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("flag 2" + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("END");

	}

}
