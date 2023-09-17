package com.codecounty.dsa.linkedlist;

public class _2AddTwoNumbers {

	public static void main(String[] args) {

		ListNode l1 = new ListNode(1).next = new ListNode(8).next = new ListNode(4).next = new ListNode(3);
		ListNode l2 = new ListNode(5).next = new ListNode(4).next = new ListNode(6);
		ListNode result = addTwoNumbers(l1, l2);
		System.out.println(result);

//	        1 7 4 3  reversed equals    3 4 8 1
//	          5 4 6  reversed equals +  0 6 4 5
//	      --------------------------------------
//	                                     4 1 2 6

	}

	private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode dummy = new ListNode(-1);
		ListNode current = dummy;
		ListNode s1 = l1;
		ListNode s2 = l2;
		int carry = 0;

//        1 7 4 3  reversed equals    3 4 8 1
//        5 4 6  reversed equals +    0 6 4 5
//    --------------------------------------
//                                   4 1 2 6 <- -1
		while (s1 != null || s2 != null || carry != 0) {
			int sum = 0;
			if (s1 != null) {
				sum += s1.val;
				s1 = s1.next;
			}

			if (s2 != null) {
				sum += s2.val;
				s2 = s2.next;
			}

			sum += carry;
			carry = sum / 10;

			current.next = new ListNode(sum % 10);
			current = current.next;

		}

		return dummy.next;
	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

}
