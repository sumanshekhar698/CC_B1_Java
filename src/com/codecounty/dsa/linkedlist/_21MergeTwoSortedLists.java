package com.codecounty.dsa.linkedlist;

public class _21MergeTwoSortedLists {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(4);
		head.next.next.next = new ListNode(5);// 1 -> 2 -> 4 -> 5

		ListNode head2 = new ListNode(1);
		head2.next = new ListNode(3);
		head2.next.next = new ListNode(4);// 1 -> 3 ->4

		ListNode result = mergeTwoLists(head, head2);

		while (result != null) {
			System.out.print(result.val + " -> ");
			result = result.next;
		}
	}

	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

//		O(n) time = n
//		O(n) space = 1

		ListNode dummy = new ListNode(-1);
		ListNode current = dummy;

		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				current.next = list1;
				list1 = list1.next;
			} else {
				current.next = list2;
				list2 = list2.next;
			}

			current = current.next;

		}

		if (list1 != null)
			current.next = list1;
		else
			current.next = list2;

		return dummy.next;

	}

	static public class ListNode {
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
