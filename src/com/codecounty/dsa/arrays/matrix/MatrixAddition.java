package com.codecounty.dsa.arrays.matrix;

public class MatrixAddition {

	public static void main(String[] args) {
		int[][] matrix1 = { //Symmetric matrix
				{ 1, 4, 0 }, 
				{ -253, 34, 63 }, 
				{ 3, -5, 62 }, 
				{ 30, -5, 2 } };// 4*3 matrix

		int[][] matrix2 = { 
				{ 3, 5, 7 }, 
				{ 23, 534, -6 }, 
				{ 23, 5, 6 }, 
				{ 3, -5, 52 } };// 4*3 matrix

		if (matrix1.length != matrix2.length && matrix1[0].length != matrix2[0].length) {
			System.out.println("Matrices not compatitble for addition");
			return;
		}

		int[][] resultantMatrix = new int[matrix1.length][matrix1[0].length];// 4*3 matrix
		
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[0].length; j++) {
				resultantMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		
		
		for (int i = 0; i < resultantMatrix.length; i++) {
			for (int j = 0; j < resultantMatrix[0].length; j++) {
				System.out.print(resultantMatrix[i][j] + " ");
			}
			System.out.println();
		}
		
		


	}

}
