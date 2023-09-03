package com.codecounty.dsa.linkedlist;

public class SinglyLinkedListTraversal {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        printList(head);
    }

    /**
     *
     * @param head
     * prints the content of linked list
     */
    private static void printList(Node head) {
        Node curr = head;
        while(curr != null) {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
       /* for(Node curr = head; curr != null; curr = curr.next) {
            System.out.print(curr.data+" ");
        } */
    }
}
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}
