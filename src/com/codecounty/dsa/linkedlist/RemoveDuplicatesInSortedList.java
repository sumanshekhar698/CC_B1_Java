package com.codecounty.dsa.linkedlist;

public class RemoveDuplicatesInSortedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(20);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(30);
        head.next.next.next.next.next = new Node(30);
        System.out.println("Original List ::");
        printList(head);
        Node updatedHead = removeDuplicates(head);
        System.out.println("Updated List ::");
        printList(updatedHead);
    }

    private static Node removeDuplicates(Node head) {
        Node curr = head;
        while(curr != null && curr.next != null) {
            if(curr.data == curr.next.data) {
                curr.next = curr.next.next;
            }
            else {
                curr = curr.next;
            }
        }
        return head;
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
