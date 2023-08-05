package com.codecounty.dsa.strings;

public class _58LengthOfLastWord {
//https://leetcode.com/problems/length-of-last-word/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "   fly me   to   the moon  ";
		int ans = lengthOfLastWord(s);
		System.out.println(ans);

	}

	private static int lengthOfLastWord(String s) {

		String trimedString = s.trim();//fly me   to   the moon

		int counter = 0;

		for (int i = trimedString.length() - 1; i >= 0; i--) {

			if (trimedString.charAt(i) != ' ')
				counter++;
			else
				return counter;
		}

		return counter;

	}

}
