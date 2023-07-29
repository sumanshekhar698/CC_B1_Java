package com.codecounty.dsa.bitmagic;

import java.util.Scanner;

public class CountTheSetBitsInAnInteger {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

//		n = 157;
		int temp = n, count = 0;
		int result;
		
//      count will hold the number of set bits
		while (temp > 0) {
			result = temp & 1;// using bitwise AND operator with 1 to check if the last bit is set or not
			count += result;
			temp = temp >> 1;//shifting the bits toward right by one place by using signed-right-shift-operator
		}
		
		System.out.println(count);

		
		

	}

}
