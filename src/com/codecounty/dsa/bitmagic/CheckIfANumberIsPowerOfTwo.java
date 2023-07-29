package com.codecounty.dsa.bitmagic;

import java.util.Scanner;

//Calculate the position of the right most SetBit for a given number
public class CheckIfANumberIsPowerOfTwo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();// 8
		// 44
//		2^n = 256

		int temp = n, count = 0;
		int result;

//      count will hold the number of set bits
		while (temp > 0) {// O(log n) because we are dividing the number by 2
			count += temp & 1;// using bitwise AND operator with 1 to check if the last bit is set or not
			temp = temp >> 1;// shifting the bits toward right by one place by using
								// signed-right-shift-operator
		}

		if (count == 1)//any number that is power of 2 will have only and only ONE set bit 
			System.out.println("Power of 2");
		else
			System.out.println("Not a power of 2");

	}

}
