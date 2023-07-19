package com.codecounty.java.basic_dsa;

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
		while (temp > 0) {
			count += temp & 1;
			temp >>= 1;
		}

		if (count == 1)
			System.out.println("Power of 2");
		else
			System.out.println("Not a power of 2");

	}

}
