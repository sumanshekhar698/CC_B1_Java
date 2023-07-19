package com.codecounty.java.basic_dsa;

import java.util.Scanner;

public class CountTheSetBitsInAnInteger {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

//		n = 157;
		int temp = n, count = 0;
		int result;
		while (temp > 0) {
			result = temp & 1;
			count += result;
			
			temp = temp >> 1;
		}
		
		System.out.println(count);

		
		

	}

}
