package com.codecounty.dsa.stack;

import java.util.Arrays;
import java.util.Stack;

public class _71SimplifyPath {

	public static void main(String[] args) {

		String path = "/../home//./foo/";// /home/foo
		String pathSimplified = simplifyPath(path);
		System.out.println(pathSimplified);
	}

	private static String simplifyPath(String path) {

		
		
//		O(T) = O(n)
//		O(s) = n
		
		String[] split = path.split("/");
		Stack<String> stack = new Stack();

		System.out.println(Arrays.toString(split));// [, .., home, , ., foo]// O(n)

		for (String str : split) {//O(n)
			if (str.equals("..")) {
				if (!stack.isEmpty())
					stack.pop();
			} else if (!str.equals(".") && !str.isEmpty()) {
				stack.push(str);
			}
		}
		System.out.println(stack);

		return "/" + String.join("/", stack);

	}

}
