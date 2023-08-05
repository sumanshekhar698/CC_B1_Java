package com.codecounty.dsa.strings;

import java.util.Arrays;

public class _242ValidAnagram {

	public static void main(String[] args) {

		String s = "abagram";
		String t = "bagaram";

		int x = 'a';
		System.out.println(x);

		boolean result = isAnagram(s, t);
		System.out.println(result);

	}

	private static boolean isAnagram(String s, String t) {

		int[] hashArray = new int[26];// 122

		if (s.length() != t.length())
			return false;

		// 1st for loop
		for (int i = 0; i < s.length(); i++) {// i = 0 | s
			hashArray[s.charAt(i) - 97]++;
		}
//		System.out.println(Arrays.toString(hashArray));

		// 2nd for loop
		for (int i = 0; i < t.length(); i++) {// i = 0 | s
			hashArray[t.charAt(i) - 97]--;
		}
//		System.out.println(Arrays.toString(hashArray));

		// 3rd for loop
		for (int i = 0; i < hashArray.length; i++) {
			if(hashArray[i] != 0)
				return false;
		}

//		System.out.println(Arrays.toString(hashArray));
		return true;

	}

}
