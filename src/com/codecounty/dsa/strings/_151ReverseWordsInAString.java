package com.codecounty.dsa.strings;

import java.util.Arrays;

public class _151ReverseWordsInAString {
//https://leetcode.com/problems/reverse-words-in-a-string/submissions/
	public static void main(String[] args) {

		String s = "   the sky is blue   ";
		s = "a good   example";
		String result = reverseWords(s);
		System.out.println(result);// blue is sky the

	}

	private static String reverseWords(String s) {
		String[] words = s.trim().split("\\s+");
//		System.out.println(Arrays.toString(split));

		StringBuilder sb = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			sb.append(words[i] + " ");
		}

//		System.out.println(sb);
		return sb.toString().trim();

	}

}
