package com.codecounty.dsa.binarytree;

import java.util.ArrayList;

public class Postordertraversal {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        ArrayList<Integer> result = postorder(root);
        System.out.println(result);
    }
    private static ArrayList<Integer> postorder(Node root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        printPostorder(root , res);

        return res;
    }
    private static void printPostorder(Node root, ArrayList<Integer> res) {
        if(root!=null)
        {
            printPostorder(root.left , res);
            printPostorder(root.right , res);
            res.add(root.key);
        }
    }
}
