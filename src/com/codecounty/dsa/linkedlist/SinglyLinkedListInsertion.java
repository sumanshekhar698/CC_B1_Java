package com.codecounty.dsa.linkedlist;

public class SinglyLinkedListInsertion {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        Node updatedHead = InsertAtBegin(head,5);
        printList(updatedHead);
        Node updatedHead1 = InsertAtLast(head,60);
        printList(updatedHead1);
    }

    private static Node InsertAtLast(Node head, int x) {
        Node temp = new Node(x);
        Node curr = head;
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        return head;
    }

    private static Node InsertAtBegin(Node head, int x) {
        Node temp = new Node(x);
        temp.next = head;
        return temp;
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

