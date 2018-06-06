package leetcode.bs.searchA2DMatrix;

// Source : https://leetcode.com/problems/search-a-2d-matrix/
// Author : Shen Bai
// Date   : 2018-06-06

/**
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
 * 
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the previous row.
 * Example 1:
 * Input:
 * matrix = [
 *  [1,   3,  5,  7],
 *  [10, 11, 16, 20],
 *  [23, 30, 34, 50]
 * ]
 * target = 3
 * Output: true
 * Example 2:
 * Input:
 * matrix = [
 *  [1,   3,  5,  7],
 *  [10, 11, 16, 20],
 *  [23, 30, 34, 50]
 * ]
 * target = 13
 * Output: false
 */

public class SearchA2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {

        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        int midRow = 0;
        int midColumn = 0;

        while (top <= bottom) {
            midRow = top + (bottom - top) / 2;
            if (matrix[midRow][left] == target || matrix[midRow][right] == target) {
                return true;
            } else if (matrix[midRow][left] > target) {
                bottom = midRow - 1;
            } else if (matrix[midRow][right] < target) {
                top = midRow + 1;
            } else {
                while (left <= right) {
                    midColumn = left + (right - left) / 2;
                    if (matrix[midRow][midColumn] == target) {
                        return true;
                    } else if (matrix[midRow][midColumn] > target) {
                        right = midColumn - 1;
                    } else {
                        left = midColumn + 1;
                    }
                }
            }
        }

        return false;
    }
}
