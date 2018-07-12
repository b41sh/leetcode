package leetcode.tp.validPalindrome;

// Source : https://leetcode.com/problems/valid-palindrome/
// Author : Shen Bai
// Date   : 2018-07-12

/**
 * Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).
 * Example:
 * Input: S = "ADOBECODEBANC", T = "ABC"
 * Output: "BANC"
 * Note:
 * If there is no such window in S that covers all characters in T, return the empty string "".
 * If there is such window, you are guaranteed that there will always be only one unique minimum window in S.
 */

public class ValidPalindrome {

    public boolean isPalindrome(String s) {

        if (s.length() == 0) {
            return true;
        }
        char[] chars = s.toLowerCase().toCharArray();

        int i = 0;
        int j = chars.length - 1;
        boolean isPalindrome = true;
        while (i < j) {
            if (chars[i] < '0' || (chars[i] > '9' && chars[i] < 'a') || chars[i] > 'z') {
                i++;
                continue;
            }
            if (chars[j] < '0' || (chars[j] > '9' && chars[j] < 'a') || chars[j] > 'z') {
                j--;
                continue;
            }
            if (chars[i] == chars[j]) {
                i++;
                j--;
            } else {
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;
    }
}
