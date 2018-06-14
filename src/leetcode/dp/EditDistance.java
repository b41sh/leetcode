package leetcode.dp.editDistance;

// Source : https://leetcode.com/problems/edit-distance/
// Author : Shen Bai
// Date   : 2018-06-14

/**
 * Given two words word1 and word2, find the minimum number of operations required to convert word1 to word2.
 * You have the following 3 operations permitted on a word:
 * Insert a character
 * Delete a character
 * Replace a character
 */

public class EditDistance {

    public int minDistance(String word1, String word2) {

        int m = word1.length();
        int n = word2.length();
        if (m == 0) {
            return n;
        } else if (n == 0) {
            return m;
        }

        int dp[][] = new int[m + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            dp[0][i] = i;
        }

        int add = 0;
        int del = 0;
        int rep = 0;
        for (int i = 1; i <= m; i++) {
            dp[i][0] = i;
            char w1 = word1.charAt(i - 1);
            for (int j = 1; j <= n; j++) {
                char w2 = word2.charAt(j - 1);
                add = dp[i - 1][j] + 1;
                del = dp[i][j - 1] + 1;
                rep = dp[i - 1][j - 1];
                if (w1 != w2) {
                    rep++;
                }
                dp[i][j] = Math.min(Math.min(add, del), rep);
            }
        }
/**
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                System.out.print(dp[x][y] + " ");
            }
            System.out.print("\n");
        }
*/
        return dp[m][n];
    }
}
