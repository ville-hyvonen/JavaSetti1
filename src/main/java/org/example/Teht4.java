package org.example;

public class Teht4 {
    static int[][] testMatrix =  {
            {1, 5, 7},
            {9, 3, 1},
            {0, 1, 1}
    };
    static int[] findMaxValueIndex(int[][] matrix) {
        int rowMax = 0, colMax = 0;
        int maxIndex = matrix[rowMax][colMax];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] > maxIndex) {
                    rowMax = row;
                    colMax = col;
                    maxIndex = matrix[rowMax][colMax];
                }
            }
        }
        return new int[] {rowMax, colMax};
    }
}
