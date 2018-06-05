package leetcode.dp.regularExpressionMatching;

// Source : https://leetcode.com/problems/regular-expression-matching/
// Author : Shen Bai
// Date   : 2018-06-05

/**
 * Given an input string (s) and a pattern (p), implement regular expression matching with support for '.' and '*'.
 * '.' Matches any single character.
 * '*' Matches zero or more of the preceding element.
 * The matching should cover the entire input string (not partial).
 * Note:
 * s could be empty and contains only lowercase letters a-z.
 * p could be empty and contains only lowercase letters a-z, and characters like . or *.
 */

public class RegularExpressionMatching {

    public boolean isMatch(String s, String p) {

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
        int k = 0;
        for (int i = 1; i <= m; i++) {
            if (p.charAt(i - 1) >= 'a' && p.charAt(i - 1) <= 'z') {
                for (int j = 1; j <= n; j++) {
                    if (dp[i - 1][j - 1] && p.charAt(i - 1) == s.charAt(j - 1)) {
                        dp[i][j] = true;
                    }
                }
                if (i < m && p.charAt(i) == '*') {
                    i++;
                    for (int j = 0; j <= n; j++) {
                        if (dp[i - 2][j]) {
                            dp[i][j] = true;
                            if (j >= 1 && dp[i - 2][j - 1]) {
                                dp[i][j - 1] = true;
                            }
                            k = j + 1;
                            while (k <= n) {
                                if (p.charAt(i - 2) != s.charAt(k - 1)) {
                                    break;
                                }
                                dp[i][k] = true;
                                k++;
                            }
                        }
                    }
                }
            } else if (p.charAt(i - 1) == '.') {
                for (int j = 1; j <= n; j++) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                if (i < m && p.charAt(i) == '*') {
                    i++;
                    for (int j = 0; j <= n; j++) {
                        if (dp[i - 2][j]) {
                            dp[i][j] = true;
                            if (j >= 1 && dp[i - 2][j - 1]) {
                                dp[i][j - 1] = true;
                            }
                            k = j + 1;
                            while (k <= n) {
                                dp[i][k] = true;
                                k++;
                            }
                            break;
                        }
                    }
                }
            }
        }

        for (int x = 0; x <= m; x++) {
            for (int y = 0; y <= n; y++) {
                int num = 0;
                if (dp[x][y]) {
                    num = 1;
                }
                System.out.print(num + " ");
            }
            System.out.print("\n");
        }

        return dp[m][n];
    }
}
