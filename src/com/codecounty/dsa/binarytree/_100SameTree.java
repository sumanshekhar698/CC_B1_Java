package com.codecounty.dsa.binarytree;

public class _100SameTree {

	public static void main(String[] args) {

	}

	public static boolean isSameTree(TreeNode p, TreeNode q) {
		// BASE CASE
		if (p == null && q == null) {
			return true;
		} else if (p == null || q == null) {
			return false;
		} else if (p.val != q.val) {
			return false;
		}

		// RECURSIVE CASE
		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

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
