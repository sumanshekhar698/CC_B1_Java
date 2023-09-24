package com.codecounty.dsa.linkedlist;

public class _92ReverseLinkedListII {

	public static void main(String[] args) {
		ListNode head = new ListNode(4);
		head.next = new ListNode(22);
		head.next.next = new ListNode(23);
		head.next.next.next = new ListNode(46);
		head.next.next.next.next = new ListNode(51);
		ListNode headNew = reverseBetween(head, 2, 4);

		ListNode temp = headNew;
		while (temp != null) {
			System.out.println(temp.val);
			temp = temp.next;

		}

	}

	public static ListNode reverseBetween(ListNode head, int left, int right) {
		
		
		
//		O(n) time  = n
//		O(n) space  = k

		
//		L: 2 ; R :4 
//		H 4 -> 22 -> 23 ->46 ->51 -> null     ==>  4 -> 46 -> 23 ->22->51
		ListNode dummy = new ListNode();
		dummy.next = head;
//		dummy | leftPrev -> H  4 -> 22 -> 23 ->46 ->51 -> null
		ListNode leftPrev = dummy;
		ListNode curr = head;
//		dummy | leftPrev -> H C 4 -> L 22 -> 23 ->46 ->51 -> null

//		Phase 1 :: reaching curr till the left most node
		for (int i = 1; i <= left - 1; i++) {
			leftPrev = curr;
			curr = curr.next;

		}

//		Phase 2 :: reversing from L to R

		ListNode prev = null;
		for (int i = 1; i <= right - left + 1; i++) {
			ListNode temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;

		}

//		Phase 3 :: connection
		leftPrev.next.next = curr;
		leftPrev.next = prev;

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
