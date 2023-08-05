package com.codecounty.dsa.strings;

import java.lang.reflect.Array;

public class CheckForPalindrome {

	public static void main(String[] args) {

		String str = "RaDar";
		boolean result = checkPalindromeSpaceOptimized(str);
		System.out.println(result);

	}

	private static boolean checkPalindrome(String str) {

		String reversedStr = "";
		str = str.toLowerCase();

		for (int i = str.length() - 1; i >= 0; i--) {
			reversedStr += str.charAt(i);
		}

		if (reversedStr.equals(str))
			return true;
		return false;
	}

	private static boolean checkPalindromeSpaceOptimized(String str) {

		str = str.toLowerCase();
		int start = 0, end = str.length() - 1;

		while (start <= end) {
			if (str.charAt(start) != str.charAt(end))
				return false;
			start++;
			end--;
		}
		return true;
	}

}
