package leetcode.spiralMatrix;

// Source : https://leetcode.com/problems/spiral-matrix/
// Source : https://leetcode.com/problems/spiral-matrix-ii/
// Author : Shen Bai
// Date   : 2018-05-23

import java.util.ArrayList;
import java.util.List;

/**
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
 * Example 1:
 * Input:
 * [
 * [ 1, 2, 3 ],
 * [ 4, 5, 6 ],
 * [ 7, 8, 9 ]
 * ]
 * Output: [1,2,3,6,9,8,7,4,5]
 * Example 2:
 * Input:
 * [
 *  [1, 2, 3, 4],
 *  [5, 6, 7, 8],
 *  [9,10,11,12]
 * ]
 * Output: [1,2,3,4,8,12,11,10,9,5,6,7]


 * Given a positive integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.
 * Example:
 * Input: 3
 * Output:
 * [
 *  [ 1, 2, 3 ],
 *. [ 8, 9, 4 ],
 *. [ 7, 6, 5 ]
 * ]
 */
public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> list = new ArrayList<Integer>();
        if (matrix.length == 0 || matrix[0].length == 0) {
            return list;
        }

        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;
        while (left <= right && top <= bottom) {
            if (left == right && top == bottom) {
                list.add(new Integer(matrix[top][top]));
            } else if (left == right) {
                for (int i = top; i <= bottom; i++) {
                    list.add(new Integer(matrix[i][left]));
                }
            } else if (top == bottom) {
                for (int i = left; i <= right; i++) {
                    list.add(new Integer(matrix[top][i]));
                }
            } else {
                for (int i = left; i < right; i++) {
                    list.add(new Integer(matrix[top][i]));
                }
                for (int i = top; i < bottom; i++) {
                    list.add(new Integer(matrix[i][right]));
                }
                for (int i = right; i > left; i--) {
                    list.add(new Integer(matrix[bottom][i]));
                }
                for (int i = bottom; i > left; i--) {
                    list.add(new Integer(matrix[i][left]));
                }
            }

            left++;
            right--;
            top++;
            bottom--;

            System.out.println("l=" + left + "r=" + right + " t=" + top + " b=" + bottom);
        }

        return list;
    }

    public int[][] generateMatrix(int n) {

        int[][] matrix = new int[n][n];
        if (n == 0) {
            return matrix;
        }

        int start = 0;
        int end = n - 1;
        int num = 1;
        while (start <= end) {
            if (start == end) {
                matrix[start][start] = num;
                num++;
            } else {
                for (int i = start; i < end; i++) {
                    matrix[start][i] = num;
                    num++;
                }
                for (int i = start; i < end; i++) {
                    matrix[i][end] = num;
                    num++;
                }
                for (int i = end; i > start; i--) {
                    matrix[end][i] = num;
                    num++;
                }
                for (int i = end; i > start; i--) {
                    matrix[i][start] = num;
                    num++;
                }
            }
            start++;
            end--;
        }

        return matrix;
    }
}