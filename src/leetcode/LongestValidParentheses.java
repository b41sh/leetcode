package leetcode.longestValidParentheses;

// Source : https://leetcode.com/problems/longest-valid-parentheses/
// Author : Shen Bai
// Date   : 2018-05-16

/**
 * Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.
 * Example 1:
 * Input: "(()"
 * Output: 2
 * Explanation: The longest valid parentheses substring is "()"
 * Example 2:
 * Input: ")()())"
 * Output: 4
 * Explanation: The longest valid parentheses substring is "()()"
 */

import java.util.Stack;

public class LongestValidParentheses {

    /**
     * dp
     * j = i - 2 - dp[i-1]
     * dp[i] = dp[i-1] + 2 + dp[j]
     */
    public int longestValidParentheses(String s) {

        int maxLen = 0;
        int j = 0;
        int[] dp = new int[s.length() + 1];
        for (int i = 1; i <= s.length(); i++) {
            j = i - 2 - dp[i-1];
            if(s.charAt(i - 1) == '(' || j < 0 || s.charAt(j) == ')') {
                dp[i] = 0;
            } else {
                dp[i] = dp[i - 1] + 2 + dp[j];
                maxLen = Math.max(maxLen, dp[i]);
            }
        }

        return maxLen;
    }

    /**
     * stack
     */
    public int longestValidParenthesesII(String s) {

        int maxLen = 0;
        int curLen = 0;
        Stack<Pair> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                Pair leftPair = new Pair(i, 0);
                stack.push(leftPair);
            } else {
                Pair rightPair = new Pair(i, 1);

                if (stack.empty() || stack.peek().getType() == 1) {
                    stack.push(rightPair);
                } else {
                    Pair lastPair = stack.pop();
                    if (stack.empty()) {
                        curLen = i + 1;
                    } else {
                        curLen = i - stack.peek().getIndex();
                    }
                    maxLen = Math.max(maxLen, curLen);
                }
            }
        }

        return maxLen;
    }

    private class Pair {
        private int index;
        private int type;

        Pair(int index, int type) {
            this.index = index;
            this.type = type;
        }

        public int getIndex() {
            return this.index;
        }
        public int getType() {
            return this.type;
        }
    }
}
