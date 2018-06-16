package leetcode.dp.decodeWays;

// Source : https://leetcode.com/problems/decode-ways/
// Author : Shen Bai
// Date   : 2018-06-16

import java.util.Arrays;

/**
 * A message containing letters from A-Z is being encoded to numbers using the following mapping:
 * 'A' -> 1
 * 'B' -> 2
 * ...
 * 'Z' -> 26
 * Given a non-empty string containing only digits, determine the total number of ways to decode it.
 * Example 1:
 * Input: "12"
 * Output: 2
 * Explanation: It could be decoded as "AB" (1 2) or "L" (12).
 * Example 2:
 * Input: "226"
 * Output: 3
 * Explanation: It could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).
 */

public class DecodeWays {

    public int numDecodings(String s) {

        int l = s.length();
        if (l == 0) {
            return 0;
        }
        int num = Character.getNumericValue(s.charAt(0));
        if (num == 0 || num > 9) {
            return 0;
        }
        int pre = num;
        int twoNum = 0;
        int dp[] = new int[l + 1];
        Arrays.fill(dp, 0);
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 1; i < l; i++) {
            num = Character.getNumericValue(s.charAt(i));
            twoNum = pre * 10 + num;
            if (twoNum > 9 && twoNum <= 26) {
                dp[i + 1] += dp[i - 1];
            }
            if (num != 0) {
                dp[i + 1] += dp[i];
            }
            pre = num;
        }

        for (int i = 0; i <= l; i++) {
            System.out.print(dp[i] + " ");
        }
        System.out.print("\n");
        return dp[l];
    }
}