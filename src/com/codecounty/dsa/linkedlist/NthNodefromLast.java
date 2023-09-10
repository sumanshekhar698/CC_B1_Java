package com.codecounty.dsa.linkedlist;

public class NthNodefromLast {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next = new Node(70);
        int n = 3;
        Node nthnode = getNthNodeFromLast(head,n);
        System.out.println("Nth Node from Last in Linked List :: "+nthnode.data);
    }

    private static Node getNthNodeFromLast(Node head,int n) {
        if(head == null) return null;
        Node first = head;
        for(int i=0;i<n;i++) {
            if(first == null) return null;
            first = first.next; // Step 1: Move first n places ahead
        }
        Node second = head; // Step 2 : start second pointer from head
        //Step 3 : Move first and second at same speed , when first reaches null then second will at required node
        while(first != null) {
            second = second.next;
            first = first.next;
        }
        return second;
    }
}
