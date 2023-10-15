package com.codecounty.dsa.binarytree;

import java.util.ArrayList;

public class HeightOfBinaryTree {
    public static void main(String[] args) {

            Node root = new Node(10);
            root.left = new Node(20);
            root.right = new Node(30);
            root.left.left = new Node(40);
            root.left.right = new Node(50);
            root.right.left = new Node(60);
            root.right.right = new Node(70);
            root.right.right.right = new Node(80);
            int result = height(root);
            System.out.println(result);
    }

    private static int height(Node root) {
       if(root == null) return 0;

       int x = height(root.left);
       int y = height(root.right);
       return 1 + Math.max(x,y);
    }
}
