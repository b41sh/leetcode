package leetcode.dp.palindromePartitioningII;

// Source : https://leetcode.com/problems/palindrome-partitioning-ii/
// Author : Shen Bai
// Date   : 2018-07-18

/**
 * Given a string s, partition s such that every substring of the partition is a palindrome.
 *
 * Return the minimum cuts needed for a palindrome partitioning of s.
 *
 * Example:
 *
 * Input: "aab"
 * Output: 1
 * Explanation: The palindrome partitioning ["aa","b"] could be produced using 1 cut.
 */

public class PalindromePartitioningII {

    // backtracking
    // run timeout
    public int minCut0(String s) {
        int length = s.length();
        if (length == 0 || _isPartition(s)) {
            return 0;
        }

        int minCut = -1;
        for (int i = length - 1; i >= 1; i--) {
            String a = s.substring(0, i);
            if (!_isPartition(a)) {
                continue;
            }
            String b = s.substring(i, length);
            int subMinCut = minCut0(b) + 1;
            if (minCut == -1 || subMinCut < minCut) {
                minCut = subMinCut;
            }
            if (minCut == 1) {
                break;
            }
        }

        return minCut;
    }

    private boolean _isPartition(String s) {
        if (s.length() == 1) {
            return true;
        }
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


    //  dp[i,n] = min(dp[i, j] + dp[j+1, n])  i <= j <n
    public int minCut(String s) {
        int length = s.length();
        int[] dp = new int[length + 1];
        boolean[][] dp2 = new boolean[length][length];
        // the worst case is cutting by each char
        for (int i = 0; i <= length; i++) {
            dp[i] = length - i;
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                dp2[i][j] = false;
            }
        }
        for (int i = length - 1; i >= 0; i--) {
            for (int j = i; j < length; j++) {
                if (s.charAt(i) == s.charAt(j) && (j - i < 2 || dp2[i + 1][j - 1])) {
                    dp2[i][j] = true;
                    dp[i] = Math.min(dp[i], dp[j + 1] + 1);
                }
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.print(s.charAt(i) + " ");
        }
        System.out.print("\n");
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (dp2[i][j]) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for (int i = 0; i < length; i++) {
            System.out.print(dp[i] + " ");
        }
        System.out.print("\n");

        return dp[0] - 1;
    }

    // @todo O(n) space
    public int minCut1(String s) {
        int length = s.length();
        if (length == 0) {
            return 0;
        }

        // store prev valid partition start position
        int[] dp = new int[length];
        dp[0] = 0;
        for (int i = 1; i < length; i++) {
            int pre = i - 1;
            int ppre = i - 2;
            int start = dp[pre];
            int sstart = dp[pre];
            if (start >= 1 && s.charAt(i) == s.charAt(start - 1)) {
                dp[i] = start - 1;
            } else if (ppre >= 0 && s.charAt(i) == s.charAt(ppre)) {
                dp[i] = ppre;
            } else if (s.charAt(i) == s.charAt(pre)) {
                dp[i] = pre;
            } else {
                dp[i] = i;
            }
        }

        int[] dp2 = new int[length];
        dp2[0] = 0;
        for (int i = 1; i < length; i++) {
            if (i == dp[i]) {
                dp2[i] = dp2[i - 1] + 1;
            } else {
                dp2[i] = Math.min(dp2[i - 1] + 1, dp2[dp[i]]);
            }
        }

        System.out.print("====================\n");
        for (int i = 0; i < length; i++) {
            System.out.print(s.charAt(i) + " ");
        }
        System.out.print("\n");
        for (int i = 0; i < length; i++) {
            System.out.print(dp[i] + " ");
        }
        System.out.print("\n");
        for (int i = 0; i < length; i++) {
            System.out.print(dp2[i] + " ");
        }
        System.out.print("\n");

        return dp2[length - 1];
    }
}
