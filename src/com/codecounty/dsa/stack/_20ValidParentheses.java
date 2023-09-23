package com.codecounty.dsa.stack;

import java.util.Stack;

public class _20ValidParentheses {

	public static void main(String[] args) {

		String str = "()[]{}";
		boolean valid = isValid(str);
		System.out.println(valid);

	}

	private static boolean isValid(String str) {
		Stack<Character> stack = new Stack();

//		O(T) = O(n)
//		O(s) = n
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} else {
				if (stack.isEmpty())
					return false;//edge case
				char top = stack.pop();
				if ((top == '(' && ch == ')') || (top == '{' && ch == '}') || (top == '[' && ch == ']'))
					continue;
				else
					return false;
			}

		}

		if (stack.isEmpty())
			return true;
		return false;
	}

}
