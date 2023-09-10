package com.codecounty.dsa.arrays.matrix;

public class MatrixInSnakePattern {
    public static void main(String[] args) {

        int[][] matrix = {{45, 48, 54},{21, 89, 87},{70, 78, 15}};
        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i = 0; i < rows; i++) {
                if(i%2 == 0) {
                    // left to right
                    for (int j = 0; j < cols; j++) {
                        System.out.print(matrix[i][j]+" ");
                    }
                } else {
                    // right to left
                    for(int j = cols-1; j >= 0; j--) {
                        System.out.print(matrix[i][j]+" ");
                    }
                }

        }
    }
}
