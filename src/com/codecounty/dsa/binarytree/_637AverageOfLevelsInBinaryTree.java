package com.codecounty.dsa.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _637AverageOfLevelsInBinaryTree {
//    https://leetcode.com/problems/average-of-levels-in-binary-tree/submissions/1084076173/?envType=list&envId=9fen75ur

    static public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    class Solution {


        public List<Double> averageOfLevels(TreeNode root) {

            //            basically, we will count the number of levels
//            O(n) ::  n => n is the number of nodes


            Queue<TreeNode> queue = new LinkedList();//Generally BFS involves a queue or a dequeue
            queue.add(root);

            ArrayList<Double> res = new ArrayList<>();
            res.add((double) root.val);
            int depthLevel = 0;

            while (!queue.isEmpty()) {

                long sum = 0;//To handle corner cases of Integer Overflow
                int size = queue.size();//taking a snapshot of the current queue length
                for (int i = 0; i < size; i++) {//at each for it will keep on adding the nodes of that level

                    TreeNode node = queue.poll();

                    if (node.left != null) {
                        queue.add(node.left);
                        sum += node.left.val;
                    }

                    if (node.right != null) {
                        queue.add(node.right);
                        sum += node.right.val;

                    }
                }
                if (queue.size() != 0) {//avoid Arithmetic Exeption
                    double temp = sum;//To maintain the Accuracy
                    res.add(temp / queue.size());
                }
                depthLevel++;
            }

            return res;


        }

    }
}
