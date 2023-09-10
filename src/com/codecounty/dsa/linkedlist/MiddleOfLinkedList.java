package com.codecounty.dsa.linkedlist;

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        Node middleNode = getMiddleOfLinkedList(head);
        System.out.println("Middle of Linked List :: "+middleNode.data);
    }

    private static Node getMiddleOfLinkedList(Node head) {
        if(head == null) return null;
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
