package com.codecounty.java.core.oops.final_kweyword;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		// final with local variables
		final int dozen;

		dozen = 12;// INITIALIZING
//		dozen = 16; // you cannot chamge a final value once reinitalized

		Toy t1 = new Toy("Red");
		Arrays.fill(t1.arr, 9);
		Arrays.fill(t1.arr, 0);
		
//		t1.arr = new int [10];

		System.out.println(Arrays.toString(t1.arr));
		Toy t2 = new Toy("Blue");
//		t2.color = "Orange";
		
		System.out.println(Constants.SPEED_OF_LIGHT);

	}

}
