package com.codecounty.java.core.oops.arrays.one_dimensional;

public class ArraysIntro {

	public static void main(String[] args) {

		// arays a the simplest data structire in Java to store homogenous(similar type)
		// data
		int[] arr = new int[8];// 0 - 7

//		PROS
//		indexed acces

//		CONS
//		Arrays are not dynamic in size
		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		String fruitsArray[] = new String[5];//
		System.out.println();
		for (int i = 0; i < fruitsArray.length; i++) {
			System.out.print(fruitsArray[i] + " ");
		}
		fruitsArray[0] = "Mango";
		fruitsArray[1] = "Grapes";

		fruitsArray[2] = "Lichi";

		fruitsArray[3] = "Guava";

		fruitsArray[4] = "Dates";

		fruitsArray[3] = "Watermelon";

		System.out.println();
		for (int i = 0; i < fruitsArray.length; i++) {
			System.out.print(fruitsArray[i] + " ");
		}

		String[] vegiesArray = { "Tomato", "potato", "Ladysfinger" };
		System.out.println();
		for (int i = 0; i < vegiesArray.length; i++) {
			System.out.print(vegiesArray[i] + " ");
		}

	}

}
