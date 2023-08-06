package com.codecounty.java.core.oops.arrays.two_dimensional;

import java.util.Arrays;

public class TwoDArrayIntro {

	public static void main(String[] args) {

		int[] arr = new int[0];
		int[][] matrix = new int[4][2];
		int[][] matrix2 = { { 3, 5, 7 }, { 23, 534, 6 }, { 23, 5, 6 } };// 3*3 matrix
		System.out.println(Arrays.toString(matrix));

		for (int i = 0; i < matrix2.length; i++) {// matrix.length will give you nymber of 1D arrays
			for (int j = 0; j < matrix2[i].length; j++) {
				System.out.print(matrix2[i][j] + "  ");
			}
			System.out.println();
		}

	}

}
