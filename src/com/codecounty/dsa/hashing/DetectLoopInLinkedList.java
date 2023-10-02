package com.codecounty.dsa.hashing;

import java.util.HashSet;

public class DetectLoopInLinkedList {
	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		head.next.next.next.next.next = new Node(60);
		head.next.next.next.next.next = head.next;
		boolean result = detectLoop(head);
		System.out.println("Whether Linked list contains loop or not? :: " + result);
	}

	private static boolean detectLoop(Node head) {

		// Time O(n) = n
		// Space O(n) = k

		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast)
				return true;
		}
		return false;
	}

	private static boolean detectLoopUsingHashset(Node head) {

		// Time O(n) = n
		// Space O(n) = n

		Node temp = head;// [2 -> 4 -> 65 -> 6 -> 4 -> null]
		System.out.println(temp.hashCode());
		HashSet<Node> setOfNodes = new HashSet<>();//hashCode

		while (temp != null) {
			if (setOfNodes.contains(temp)) {
				return true;
			} else {
				setOfNodes.add(temp);
			}
			temp = temp.next;
		}
		return false;
	}

	static class Node {
		int val;
		Node next;

		Node(int x) {
			val = x;
			next = null;
		}
	}
}
