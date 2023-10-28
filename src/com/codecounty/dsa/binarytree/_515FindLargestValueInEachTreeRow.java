package com.codecounty.dsa.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _515FindLargestValueInEachTreeRow {

	public static void main(String[] args) {

	}

	public List<Integer> largestValues(TreeNode root) {

		Queue<TreeNode> queue = new LinkedList();// BFS /LOT
		ArrayList result = new ArrayList();// to store result
		if (root != null) {// covering the 1st level
			queue.add(root);
			result.add(root.val);
		}

		while (!queue.isEmpty()) {// I will cover 1 level
			int max = Integer.MIN_VALUE;
			int size = queue.size();
			
			for (int i = 0; i < size; i++) {// It will traverse amon all the elements of that particualtr level
				TreeNode node = queue.poll();
				if (node.left != null) {
					queue.add(node.left);
					max = Math.max(max, node.left.val);
				}

				if (node.right != null) {
					queue.add(node.right);
					max = Math.max(max, node.right.val);
				}

			}
			
			if (queue.size() != 0) {
				result.add(max);
			}

		}

		return result;

	}

	public static class TreeNode {
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
}
