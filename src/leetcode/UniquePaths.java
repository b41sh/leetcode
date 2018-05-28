package leetcode.uniquePaths;

// Source : https://leetcode.com/problems/unique-paths/
// Source : https://leetcode.com/problems/unique-paths-ii/
// Source : https://leetcode.com/problems/minimum-path-sum/
// Author : Shen Bai
// Date   : 2018-05-27

/**
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 * The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 * How many possible unique paths are there?
 * Note: m and n will be at most 100.
 * Example 1:
 * Input: m = 3, n = 2
 * Output: 3
 * Explanation:
 * From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
 * 1. Right -> Right -> Down
 * 2. Right -> Down -> Right
 * 3. Down -> Right -> Right
 * Example 2:
 * Input: m = 7, n = 3
 * Output: 28

 * Now consider if some obstacles are added to the grids. How many unique paths would there be?
 * An obstacle and empty space is marked as 1 and 0 respectively in the grid.
 * Note: m and n will be at most 100.
 * Example 1:
 * Input:
 * [
 *  [0,0,0],
 *  [0,1,0],
 *  [0,0,0]
 * ]
 * Output: 2
 * Explanation:
 * There is one obstacle in the middle of the 3x3 grid above.
 * There are two ways to reach the bottom-right corner:
 * 1. Right -> Right -> Down -> Down
 * 2. Down -> Down -> Right -> Right
 *
 * Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.
 * Note: You can only move either down or right at any point in time.
 * Example:
 * Input:
 * [
 *  [1,3,1],
 *  [1,5,1],
 *  [4,2,1]
 * ]
 * Output: 7
 * Explanation: Because the path 1→3→1→1→1 minimizes the sum.
 */
public class UniquePaths {

    public int uniquePaths(int m, int n) {

        if (m == 0 || n == 0) {
            return 0;
        } else if (m == 1) {
            return 1;
        } else if (n == 1) {
            return 1;
        }

        int[][] dp = new int[m][n];
        dp[0][0] = 0;
        for (int i = 1; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < n; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[m - 1][n - 1];
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        if (m == 0) {
            return 0;
        } else if (m == 1) {
            for (int i = 0; i < obstacleGrid[0].length; i++) {
                if (obstacleGrid[0][i] == 1) {
                    return 0;
                }
            }
            return 1;
        }
        int n = obstacleGrid[0].length;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            for (int i = 0; i < m; i++) {
                if (obstacleGrid[i][0] == 1) {
                    return 0;
                }
            }
            return 1;
        }
        if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1) {
            return 0;
        }

        int[][] dp = new int[m][n];
        dp[0][0] = 0;
        int count = 1;
        for (int i = 1; i < m; i++) {
            if (obstacleGrid[i][0] == 1) {
                count = 0;
            }
            dp[i][0] = count;
        }
        count = 1;
        for (int i = 1; i < n; i++) {
            if (obstacleGrid[0][i] == 1) {
                count = 0;
            }
            dp[0][i] = count;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }

        return dp[m - 1][n - 1];
    }


    public int minPathSum(int[][] grid) {

        int m = grid.length;
        if (m == 0) {
            return 0;
        }
        int n = grid[0].length;
        if (n == 0) {
            return 0;
        }

        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        for (int i = 1; i < n; i++) {
            dp[0][i] = dp[0][i - 1] + grid[0][i];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }

        return dp[m - 1][n - 1];
    }

}