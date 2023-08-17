package com.codecounty.dsa.arrays.matrix;

public class IndexDisplayForA2DMatrix {
	
	public static void main(String[] args) {
		char [][] board = {{'5','3','.','.','7','.','.','.','.'}
		,{'6','.','.','1','9','5','.','.','.'}
		,{'.','9','8','.','.','.','.','6','.'}
		,{'8','.','.','.','6','.','.','.','3'}
		,{'4','.','.','8','.','3','.','.','1'}
		,{'7','.','.','.','2','.','.','.','6'}
		,{'.','6','.','.','.','.','2','8','.'}
		,{'.','.','.','4','1','9','.','.','5'}
		,{'.','.','.','.','8','.','.','7','9'}};
		
		for (int i = 0; i < board.length; i+=3) {
			for (int j = 0; j < board[i].length; j+=3) {
				System.out.print(i +" "+j + "|");
			
				
			}
			
			System.out.println();
			
		}
	}

}
