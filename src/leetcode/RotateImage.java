package leetcode.rotateImage;

// Source : https://leetcode.com/problems/rotate-image/
// Author : Shen Bai
// Date   : 2018-05-23

/**
 * You are given an n x n 2D matrix representing an image.
 * Rotate the image by 90 degrees (clockwise).
 * Note:
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
 * Example 1:
 * Given input matrix = 
 * [
 *  [1,2,3],
 *  [4,5,6],
 *  [7,8,9]
 * ],
 * rotate the input matrix in-place such that it becomes:
 * [
 *  [7,4,1],
 *  [8,5,2],
 *  [9,6,3]
 * ]
 * Example 2:
 * Given input matrix =
 * [
 * [ 5, 1, 9,11],
 * [ 2, 4, 8,10],
 * [13, 3, 6, 7],
 * [15,14,12,16]
 * ], 
 * rotate the input matrix in-place such that it becomes:
 * [
 *  [15,13, 2, 5],
 *  [14, 3, 4, 1],
 *  [12, 6, 8, 9],
 *  [16, 7,10,11]
 * ]
 */

public class RotateImage {

    public void rotate(int[][] matrix) {

        int start = 0;
        int end = matrix.length - 1;
        while (start < end) {
            for (int i = 0; i < end - start; i++) {
                int a = matrix[start][start + i];
                int b = matrix[start + i][end];
                int c = matrix[end][end - i];
                int d = matrix[end - i][start];

                matrix[start][start + i] = d;
                matrix[start + i][end] = a;
                matrix[end][end - i] = b;
                matrix[end - i][start] = c;
            }
            start++;
            end--;
        }
    }
}