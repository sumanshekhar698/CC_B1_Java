package com.codecounty.dsa.stack;

import java.util.Stack;

public class _155MinStack {

	public static void main(String[] args) {

	}

}

class MinStack {

	Stack<Pair> stack;

	public MinStack() {
		this.stack = new Stack();
	}

	public void push(int val) {
		if (!stack.isEmpty()) {
			stack.push(new Pair(val, val));
		} else {
			int minimum = stack.peek().min;
			if (val < minimum) {
				stack.push(new Pair(val, val));
			} else {
				stack.push(new Pair(val, minimum));

			}
		}

	}

	public void pop() {
		if (!stack.isEmpty()) {
			stack.pop();
		}
	}

	public int top() {
		if (!stack.isEmpty()) {
			return stack.peek().val;
		}

		return -1;

	}

	public int getMin() {
		if (!stack.isEmpty()) {
			return stack.peek().min;
		}

		return -1;
	}

	class Pair {
		int val;
		int min;

		public Pair(int val, int min) {
			this.val = val;
			this.min = min;
		}

	}
}
