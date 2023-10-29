package com.codecounty.dsa.binarytree.bst;

public class _1008ConstructBinarySearchTreeFromPreorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	int i = 0;

	public TreeNode bstFromPreorder(int[] arr) {
		return helper(arr, Integer.MAX_VALUE);
	}

	private TreeNode helper(int[] arr, int bound) {
		if (i == arr.length || arr[i] > bound)
			return null;
		// BASE CONDITION

		// RECURSIVE LOGIC
		TreeNode root = new TreeNode(arr[i++]);
		root.left = helper(arr, root.val);
		root.right = helper(arr, bound);

		return root;

	}

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

}
