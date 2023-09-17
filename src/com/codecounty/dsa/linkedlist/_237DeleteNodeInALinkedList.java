package com.codecounty.dsa.linkedlist;

import com.codecounty.dsa.linkedlist._141LinkedListCycle.ListNode;

public class _237DeleteNodeInALinkedList {

	public static void main(String[] args) {
		ListNode head = new ListNode(3);// 3
		head.next = new ListNode(2);// 3 -> 2
		ListNode nodeToBeDeleted = new ListNode(0);

		head.next.next = nodeToBeDeleted;// 3->2->0
		head.next.next.next = new ListNode(4);// 3->2->0->4
		head.next.next.next.next = new ListNode(5);// 3->2->0->4->5

		deleteNode(nodeToBeDeleted);

	}

	public static void deleteNode(ListNode node) {
		node.val = node.next.val;// copying the data of the next node
		node.next = node.next.next;// relinking it to next.next node

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
