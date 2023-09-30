package com.codecounty.java.core.oops.exception_handling;

public class TryFinally {

	public static void main(String[] args) {

		int[] arr = { 245, 34, 46, 46 };
		try {
			System.out.println(arr[4]);
		} finally {
			System.out.println("Fianlly !!");
		}
		
		System.out.println("END");
	}

}
