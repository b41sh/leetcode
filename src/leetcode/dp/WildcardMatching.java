package leetcode.dp.wildcardMatching;

// Source : https://leetcode.com/problems/wildcard-matching/
// Author : Shen Bai
// Date   : 2018-06-04

/**
 * Given an input string (s) and a pattern (p), implement wildcard pattern matching with support for '?' and '*'.
 * '?' Matches any single character.
 * '*' Matches any sequence of characters (including the empty sequence).
 * The matching should cover the entire input string (not partial).
 * Note:
 * s could be empty and contains only lowercase letters a-z.
 * p could be empty and contains only lowercase letters a-z, and characters like ? or *.
 */

public class WildcardMatching {

    public boolean isMatch(String s, String p) {

        int m = p.length();
        int n = s.length();
        if (m == 0 && n == 0) {
            return true;
        }

        int preI = -1;
        int preJ = -1;
        int i = 0;
        int j = 0;
        while (j < n) {
            if (i < m && (p.charAt(i) == '?' || p.charAt(i) == s.charAt(j))) {
                i++;
                j++;
            } else if (i < m && p.charAt(i) == '*') {
                preI = i;
                preJ = j;
                i++;
            } else if (preI >= 0) {
                i = preI;
                i++;
                preJ++;
                j = preJ;
            } else {
                return false;
            }
        }

        while (i < m) {
            if (p.charAt(i) != '*') {
                return false;
            }
            i++;
        }

        return true;
    }


    // dp
    //Submission Result: Time Limit Exceeded
    public boolean isMatchDP(String s, String p) {

        int m = p.length();
        int n = s.length();
        if (m == 0 && n == 0) {
            return true;
        }

        boolean dp[][] = new boolean[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = false;
            }
        }
        dp[0][0] = true;
        int j = 1;
        for (int i = 1; i <= m; i++) {
            if (p.charAt(i - 1) == '*') {
                int l = j - 1;
                for (int k = j - 1; k <= n; k++) {
                    if (dp[i - 1][k]) {
                        break;
                    }
                    l++;
                }
                for (; l <= n; l++) {
                    dp[i][l] = true;
                }
            } else {
                for (int k = j; k <= n; k++) {
                    if (dp[i - 1][k - 1]) {
                        if (p.charAt(i - 1) == '?' || p.charAt(i - 1) == s.charAt(k - 1)) {
                            dp[i][k] = true;
                        }
                    }
                }
                j++;
            }
        }

        for (int i = 0; i <= m; i++) {
            for (int k = 0; k <= n; k++) {
                int num = 0;
                if (dp[i][k]) {
                    num = 1;
                }
                System.out.print(num + " ");
            }
            System.out.print("\n");
        }

        return dp[m][n];
    }
}
