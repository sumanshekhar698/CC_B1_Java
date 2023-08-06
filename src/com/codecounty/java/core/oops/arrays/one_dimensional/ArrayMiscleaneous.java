package com.codecounty.java.core.oops.arrays.one_dimensional;

import java.util.Arrays;

public class ArrayMiscleaneous {

	public static void main(String[] args) {

//		Pass By Value and Pass By Refrence
		int[] arr = { 1, 1, 2, 2, 4, 6, 6 };// arr is a object
		int x = 9;
		int[] arr2 = arr;

		// manual cloning
		int[] arr3 = new int[arr.length];
		for (int i = 0; i < arr3.length; i++) {
			arr3[1] = arr[i];
		}

//		inbuilt cloning
		int[] clonedArray = arr.clone(); // this is only valid for 1D arrrays
		test(clonedArray, x);// passing an object is pass by refrence
//		passing an integer in pass by value
		System.out.println(Arrays.toString(arr));
		System.out.println(x);
		
		Arrays.fill(arr,2 , 5 ,1000);
		System.out.println(Arrays.toString(arr));


	}

	static void test(int[] array, int x) {
		Arrays.fill(array, -1);
		x = 0;

	}

}
