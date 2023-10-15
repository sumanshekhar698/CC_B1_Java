package com.codecounty.dsa.binarytree;

import java.util.ArrayList;

public class Inordertraversal {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        ArrayList<Integer> result = inorder(root);
        System.out.println(result);
    }
    private static ArrayList<Integer> inorder(Node root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        printInorder(root , res);

        return res;
    }
    private static void printInorder(Node root, ArrayList<Integer> res) {
        if(root!=null)
        {
            printInorder(root.left , res);
            res.add(root.key);
            printInorder(root.right , res);
        }
    }


}
