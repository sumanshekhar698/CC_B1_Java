package com.codecounty.dsa.linkedlist;

public class SinglyLinkedListDeletion {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        Node updatedHead = DeleteAtBegin(head);
        System.out.println("Delete At First :: ");
        printList(updatedHead);
        Node updatedHead1 = DeleteAtLast(head);
        System.out.println("Delete At Last :: ");
        printList(updatedHead1);

    }

    private static Node DeleteAtLast(Node head) {
        if(head == null) return null;
        if(head.next == null) return null;
        Node curr = head;
        while(curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
        return head;
    }

    private static Node DeleteAtBegin(Node head) {
        if(head == null) return null;
        return head.next;
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
