package com.codecounty.dsa.binarytree;

import java.util.ArrayList;

public class Preordertraversal {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        ArrayList<Integer> result = preorder(root);
        System.out.println(result);
    }
    private static ArrayList<Integer> preorder(Node root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        printPreorder(root , res);

        return res;
    }
    private static void printPreorder(Node root, ArrayList<Integer> res) {
        if(root!=null)
        {
            res.add(root.key);
            printPreorder(root.left , res);
            printPreorder(root.right , res);
        }
    }
}
