package leetcode.dp.interleavingString;

// Source : https://leetcode.com/problems/interleaving-string/
// Author : Shen Bai
// Date   : 2018-06-20

import java.util.Arrays;

/**
 * Given s1, s2, s3, find whether s3 is formed by the interleaving of s1 and s2.
 * Example 1:
 * Input: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac"
 * Output: true
 * Example 2:
 * Input: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc"
 * Output: false
 */

public class InterleavingString {

    public boolean isInterleave(String s1, String s2, String s3) {

        int l1 = s1.length();
        int l2 = s2.length();
        int l3 = s3.length();
        if (l1 + l2 != l3) {
            return false;
        } else if (l1 == 0) {
            if (s2.equals(s3)) {
                return true;
            } else {
                return false;
            }
        } else if (l2 == 0) {
            if (s1.equals(s3)) {
                return true;
            } else {
                return false;
            }
        }

        boolean dp[][] = new boolean[l1 + 1][l2 + 1];
        for (int i = 0; i <= l1; i++) {
            Arrays.fill(dp[i], false);
        }
        dp[0][0] = true;
        int i = 1;
        int j = 1;
        int k = 1;
        char c1 = ' ';
        char c2 = ' ';
        char c3 = ' ';
        while (k <= l3) {
            c3 = s3.charAt(k - 1);
            for (i = 1; i <= k; i++) {
                j = k - i;
                if (i > l1 || j > l2) {
                    continue;
                }
                c1 = s1.charAt(i - 1);
                if (c1 == c3 && dp[i - 1][j]) {
                    dp[i][j] = true;
                }
            }
            for (j = 1; j <= k; j++) {
                i = k - j;
                if (i > l1 || j > l2) {
                    continue;
                }
                c2 = s2.charAt(j - 1);
                if (c2 == c3 && dp[i][j - 1]) {
                    dp[i][j] = true;
                }
            }
            k++;
        }

/**
        for (int x = 0; x <= l1; x++) {
            for (int y = 0; y <= l2; y++) {
                if (dp[x][y]) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.print("\n");
        }
*/
        return dp[l1][l2];
    }
}
