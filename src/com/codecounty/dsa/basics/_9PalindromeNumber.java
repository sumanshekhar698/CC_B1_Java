package com.codecounty.dsa.basics;

import java.util.Scanner;

public class _9PalindromeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

//		Using Strings
//		String xInString = "" + x;
//		StringBuilder sb = new StringBuilder(xInString);
//		String sbString = sb.reverse().toString();
//		System.out.println(xInString.equals(sbString));
		
		boolean palindrome = isPalindrome(x);
		System.out.println(palindrome);
		
		

	}

	static boolean isPalindrome(int x) {// function == methods

//		569 =? 9*100 + 6*10 + 5*1 = 9*10^2 + 6*10^1 + 5*10^0 =   965
		if (x < 0)// handling the corner cases
			return false;
		if (x < 9 && x >= 0)
			return true;

		int noOfDigits = (int) (Math.log10(x) + 1);// 3
		int temp = x, digit, result = 0;

//		result = 965
		while (temp > 0) {//
			digit = temp % 10;// extracting the rightmost digit
//			5
			result += digit * Math.pow(10, --noOfDigits);// 5 * 10^0
			temp/=10;//removing the last digit
		}
		
		return result == x;

	}

}
