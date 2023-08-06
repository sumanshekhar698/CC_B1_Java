package com.codecounty.dsa.arrays.matrix;

import java.util.Arrays;

public class MatrixMultiplication {

	public static void main(String[] args) {
//		matrix1 [m*n]	*	matrix2 [n*k] =	result = [m*k]
		int[][] matrix1 = { // Symmetric matrix
				{ 1, 4, 0 }, { -253, 34, 63 }, { 3, -5, 62 }, { 30, -5, 2 } };// 4*3 matrix
		int row1 = matrix1.length;
		int col1 = matrix1[0].length;

		int[][] matrix2 = { { 3, 5, 7 }, { 23, 534, -6 }, { 23, 5, 6 }, };// 3*3 matrix

		// 95 0 0
		// 0 0 0 0
		// 0 0 0 0

		int row2 = matrix2.length;
		int col2 = matrix2[0].length;

//		matrix1 [row1*col1]	*	matrix2 [col1*col2] =	result = [row1*col2]

		if (col1 != row2) {
			System.out.println("Not eligible for multiplication");
			return;
		}

		int[][] result = new int[row1][col2];// 4*3
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0

//		Time : O(n^3)
//		Space: O(n)

//		
		for (int i = 0; i < result.length; i++) {// traversal
			for (int j = 0; j < result[i].length; j++) {// traversal
				for (int k = 0; k < matrix2.length; k++) {// computation

					result[i][j] = result[i][j] + (matrix1[i][k] * matrix2[k][j]);

				}
			}
		}
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(Arrays.toString(result[i]));
		}

	}

}
