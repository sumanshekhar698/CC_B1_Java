package com.codecounty.dsa.linkedlist;

public class _141LinkedListCycle {

	public static void main(String[] args) {
		ListNode head = new ListNode(3);// 3
		head.next = new ListNode(2);// 3 -> 2
		head.next.next = new ListNode(0);// 3->2->0
		head.next.next.next = new ListNode(4);// 3->2->0->4
		head.next.next.next.next = head.next;// H 3->2->0->4-> H
		boolean result = hasCycle(head);
		System.out.println(result);

	}

	private static boolean hasCycle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;

		// O(n) time = n
		// O(n) space = 1
		while (fast != null && fast.next != null) {
			slow = slow.next;// 1 step
			fast = fast.next.next;// 2 step

			if (slow == fast)
				return true;

		}
		return false;
	}

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

}
