package com.codecounty.dsa.basics;

public class AverageOfTwoNumbers {

	public static void main(String[] args) {
		int x = Integer.MAX_VALUE;// 2147483647
		int y = Integer.MAX_VALUE;

//		[ -2147483648    .....    -2..  0   ......  +2147483647]
//		System.out.println((Integer.MAX_VALUE + Integer.MAX_VALUE));

//		int avg = (x+y)/2;
//		x = 5;
//		y = 7;
		int avg = (x / 2) + (y / 2) + (((x % 2) + (y % 2)) / 2);// prevent rotation

		// We wil use the above logioc in Binary Search

//		float m = 7.9f;
//		int n = (int)m;
		System.out.println(avg);

	}

}
