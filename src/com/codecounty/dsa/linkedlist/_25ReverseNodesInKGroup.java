
package com.codecounty.dsa.linkedlist;

public class _25ReverseNodesInKGroup {

	public static void main(String[] args) {
		ListNode head = new ListNode(4);
		head.next = new ListNode(22);
		head.next.next = new ListNode(23);
		head.next.next.next = new ListNode(46);
		head.next.next.next.next = new ListNode(51);
		ListNode headNew = reverseKGroup(head, 3);

		ListNode temp = headNew;
		while (temp != null) {
			System.out.println(temp.val);
			temp = temp.next;

		}

	}

	static ListNode th = null, tt = null;

	public static ListNode reverseKGroup(ListNode head, int k) {
		if (head == null || head.next == null || k == 1)
			return head;

		int length = findLength(head);
		ListNode curr = head, oh = null, ot = null;

		while (length >= k) {// 8 3
			int tempK = k;
			while (tempK-- > 0) {// reversal logic of k groups
				ListNode forward = curr.next;
				curr.next = null;
				addNodeAtStart(curr);
				curr = forward;

			}

			if (oh == null) {
				oh = th;
				ot = tt;
			} else {
				ot.next = th;
				ot = tt;
			}

			th = null;
			tt = null;
			length -= k;

		}

		ot.next = curr;//VVI
		return oh;

	}

	public static void addNodeAtStart(ListNode node) {
		if (th == null) {
			th = node;
			tt = node;
		} else {
			node.next = th;
			th = node;
		}
	}

	public static int findLength(ListNode head) {
		ListNode curr = head;
		int len = 0;
		while (curr != null) {
			curr = curr.next;
			++len;
		}
		return len;
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
