package com.codecounty.dsa.stack;

import java.util.Stack;

public class StackExample {
// to create your own Int Stack class ,
//	constructor you have  to define size
// push pop peek size isEmpty
	public static void main(String[] args) {

		Stack stack = new Stack();// collections can only stor Object parent of all the parent
		stack.push(2);// int --> Integer
		stack.push("fas");
		stack.push(true);// 3

		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.size());

		Stack<Integer> stackOfInt = new Stack();
		System.out.println(stackOfInt.size());
		stackOfInt.add(54);
		stackOfInt.add(2342);
		stackOfInt.add(54234);
		stackOfInt.add(54);
		stackOfInt.add(null);
		System.out.println(stackOfInt.pop());
		System.out.println(stackOfInt.peek());
		System.out.println(stackOfInt.peek());
		System.out.println(stackOfInt.peek());
		boolean empty = stackOfInt.isEmpty();
		System.out.println(empty);

//		stackOfInt.add("");

	}

}
