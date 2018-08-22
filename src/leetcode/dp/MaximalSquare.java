package leetcode.dp.maximalSquare;

// Source : https://leetcode.com/problems/maximal-square/
// Author : Shen Bai
// Date   : 2018-08-22

/**
 * Given a 2D binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.
 *
 * Example:
 *
 * Input:
 *
 * 1 0 1 0 0
 * 1 0 1 1 1
 * 1 1 1 1 1
 * 1 0 0 1 0
 *
 * Output: 4
 */

public class MaximalSquare {

    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int max = 0;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = matrix[i][j] - '0';
                } else {
                    if (matrix[i][j] == '1') {
                        dp[i][j] = Math.min(Math.min(dp[i][j - 1], dp[i - 1][j]), dp[i - 1][j - 1]) + 1;
                    } else {
                        dp[i][j] = 0;
                    }
                }
                if (dp[i][j] > max) {
                    max = dp[i][j];
                }
            }
        }
        return max * max;
    }

    public int maximalSquare0(char[][] matrix) {

        int m = matrix.length;
        if (m == 0) {
            return 0;
        }
        int n = matrix[0].length;
        if (n == 0) {
            return 0;
        }
        int[] h = new int[n];
        int[] w = new int[m];
        int[][] dp = new int[m][n];
        int maxArea = 0;
        int area = 0;

        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == '1') {
                w[i] = 1;
                dp[i][0] = 1;
                if (maxArea == 0) {
                    maxArea = 1;
                }
            }
        }
        for (int j = 1; j < n; j++) {
            if (matrix[0][j] == '1') {
                h[j] = 1;
                dp[0][j] = 1;
                if (maxArea == 0) {
                    maxArea = 1;
                }
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == '1') {
                    if (dp[i - 1][j - 1] > 0) {
                        dp[i][j] = Math.min(Math.min(w[i], h[j]), dp[i - 1][j - 1]) + 1;
                    } else {
                        dp[i][j] = 1;
                    }
                    w[i]++;
                    h[j]++;
                } else {
                    dp[i][j] = 0;
                    w[i] = 0;
                    h[j] = 0;
                }
                area = dp[i][j] * dp[i][j];
                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }
        return maxArea;
    }
}
