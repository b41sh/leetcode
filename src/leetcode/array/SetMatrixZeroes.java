package leetcode.array.setMatrixZeroes;

// Source : https://leetcode.com/problems/set-matrix-zeroes/
// Author : Shen Bai
// Date   : 2018-06-06

/**
 * Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in-place.
 * Example 1:
 * Input: 
 * [
 *  [1,1,1],
 *  [1,0,1],
 *  [1,1,1]
 * ]
 * Output: 
 * [
 *  [1,0,1],
 *  [0,0,0],
 *  [1,0,1]
 * ]
 * Example 2:
 * Input: 
 * [
 *  [0,1,2,0],
 *  [3,4,5,2],
 *  [1,3,1,5]
 * ]
 * Output: 
 * [
 *  [0,0,0,0],
 *  [0,4,5,0],
 *  [0,3,1,0]
 * ]
 * Follow up:
 * A straight forward solution using O(mn) space is probably a bad idea.
 * A simple improvement uses O(m + n) space, but still not the best solution.
 * Could you devise a constant space solution?
 */

public class SetMatrixZeroes {

    /**
     * use first row set all columns is zero
     * use first column set all rows is zero
     */
    public void setZeroes(int[][] matrix) {

        if (matrix.length == 0 || matrix[0].length == 0) {
            return;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        // check first row and first column is zero
        int firstRow = 1;
        int firstColumn = 1;
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                firstColumn = 0;
                break;
            }
        }
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                firstRow = 0;
                break;
            }
        }
        // check rows and columns is zero
        // set result in first row and column
        for (int i = 1; i < m; i++) {
            int row = 1;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row = 0;
                    break;
                }
            }
            if (row == 0) {
                matrix[i][0] = 0;
            }
        }
        for (int j = 1; j < n; j++) {
            int column = 1;
            for (int i = 0; i < m; i++) {
                if (matrix[i][j] == 0) {
                    column = 0;
                    break;
                }
            }
            if (column == 0) {
                matrix[0][j] = 0;
            }
        }
        // set result in rows and columns
        for (int i = 1; i < m; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int j = 1; j < n; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 0; i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
        // set result in first row and column
        if (firstColumn == 0) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
        if (firstRow == 0) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        return;
    }
}
