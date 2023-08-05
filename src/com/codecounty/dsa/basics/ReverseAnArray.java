package com.codecounty.dsa.basics;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		String[] vegiesArray = { "Tomato", "potato", "Ladysfinger", "Biitergourd", "Pumpkin" };

//		String[] reversedArr = new String[vegiesArray.length];//EXTRA SPACE
//
//		int counter = 0;
//		for (int i = reversedArr.length - 1; i >= 0; i--) {
//			reversedArr[counter++] = vegiesArray[i];
//		}
//		
//		System.out.println(Arrays.toString(reversedArr));

		int start = 0, end = vegiesArray.length - 1;
		String temp;
		while (start <= end) {//2 poniters
			// SWAPPING
			temp = vegiesArray[start];
			vegiesArray[start] = vegiesArray[end];
			vegiesArray[end] = temp;
			
			start++;
			end--;

		}
		
		System.out.println(Arrays.toString(vegiesArray));

		

	}

}
