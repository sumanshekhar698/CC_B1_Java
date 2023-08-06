package com.codecounty.dsa.arrays.matrix;

public class _74SearchInA2DMatrix {
//	https://leetcode.com/problems/search-a-2d-matrix/submissions/
	public static void main(String[] args) {
		// CONDITION
		// Each row is sorted in non-decreasing order.
		// The first integer of each row is greater than the last integer of the
		// Full Sorted 2D matrix

		int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		int target = 3;
		boolean result = searchMatrixOptimized(matrix, target);
		System.out.println(result);

	}

	public static boolean searchMatrix(int[][] matrix, int target) {

		// Time : O(m*n) m : rows and n :column
		for (int i = 0; i < matrix.length; i++) {// traversal
			for (int j = 0; j < matrix[i].length; j++) {// traversal
				if (matrix[i][j] == target) {
					return true;
				}
			}
		}

		return false;
	}

	public static boolean searchMatrixOptimized(int[][] matrix, int target) {

//		t:2

//		{ 1,  3,  5,  7 }
//		{ 10, 11, 16, 20 }
//		{ 23, 30, 34, 60 } 

		int i = 0;
		int j = matrix[0].length - 1;

//		O() = m + n | m: rows n:colums = O(n) 
		while (i < matrix.length && j >= 0) {
			if (matrix[i][j] == target) {
				return true;
			} else if (matrix[i][j] > target) {
				j--;
			} else {
				i++;
			}

		}

		return false;
	}

}
