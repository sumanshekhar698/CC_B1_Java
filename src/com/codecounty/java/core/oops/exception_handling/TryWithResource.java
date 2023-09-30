package com.codecounty.java.core.oops.exception_handling;

import java.util.Scanner;

public class TryWithResource {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in);) {// try with resource
			System.out.println(8 / scanner.nextInt());
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

	}

}
