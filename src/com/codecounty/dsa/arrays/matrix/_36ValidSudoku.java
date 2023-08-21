package com.codecounty.dsa.arrays.matrix;

public class _36ValidSudoku {
//	https://leetcode.com/problems/valid-sudoku
	public static void main(String[] args) {

		char[][] board = { 
				{ '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' },
				{ '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' },
				{ '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' },
				{ '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' },
				{ '.', '.', '.', '.', '8', '.', '.', '7', '9' } 
				};

		boolean result = isValidSudoku(board);
		System.out.println(result);
		System.out.println((int) '5');
		System.out.println((int) '1');
		System.out.println('5' - '1');// '4'

	}

	static public boolean isValidSudoku(char[][] board) {

//		Time O(n) = n^3 + n^2 n^2 = n^3
//		Space O(n) = n
//		Here n is the dimension of the 2D array, n = 9 {either number of rows or colums}

		// 1. Each row must contain the digits 1-9 without repetition.
		for (int i = 0; i < board.length; i++) {// O(n) = n^2
			boolean[] row = new boolean[9];// all the cells will be false [0 to 8]
//			1 2 3 4 5 6 7 8 9
//			0 1 2 3 4 5 6 7 8  boolean [] row
//			[false, false, false, false, false, false, false, false, false]
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] != '.') {
					if (row[board[i][j] - '1']) {// '5' - '1'
						return false;
					}

					row[board[i][j] - '1'] = true;
				}

			}

		}

//		System.out.println("check 1");
		// 2. Each column must contain the digits 1-9 without repetition.
		for (int i = 0; i < board.length; i++) { // O(n) = n^2
			boolean[] column = new boolean[9];// all the cells will be false [0 to 8]
//			[false, false, false, false, false, false, false, false, false]
			for (int j = 0; j < board.length; j++) {
				if (board[j][i] != '.') {
					if (column[board[j][i] - '1']) {// '5' - '1'
						return false;
					}

					column[board[j][i] - '1'] = true;
				}

			}

		}

//		System.out.println("check 2");

//		3. Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.\
		// O(n) =n^4 = n^3 = n^2
		for (int i = 0; i < board.length; i += 3) {// n/3 * n/3 = 3 * 3 =9
			for (int j = 0; j < board.length; j += 3) {
//				System.out.print(i + "," + j + " ");
				boolean[] subBox = new boolean[9];// all the cells will be false [0 to 8]

//				i,j = indexed of subBox
				for (int k = i; k < i + 3; k++) {// n/3 * n/3 = 3 * 3 =9
					for (int l = j; l < j + 3; l++) {
						if (board[k][l] != '.') {
							if (subBox[board[k][l] - '1']) {// '5' - '1'

								return false;
							}

							subBox[board[k][l] - '1'] = true;
						}

					}
				}

			}

//			System.out.println();
		}
//		System.out.println("check 3");

		return true;

	}

}
