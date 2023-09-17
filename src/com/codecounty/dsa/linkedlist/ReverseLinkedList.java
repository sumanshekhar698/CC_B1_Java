package com.codecounty.dsa.linkedlist;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next = new Node(70);
        Node updatedHead = reverseLinkedList(head);
        printList(updatedHead);
    }
    private static Node reverseLinkedList(Node head) {
        Node curr = head;
        Node prev = null;
        while(curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    private static void printList(Node head) {
        Node curr = head;
        while(curr != null) {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }
}
