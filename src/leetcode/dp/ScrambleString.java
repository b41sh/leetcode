package leetcode.dp.scrambleString;

// Source : https://leetcode.com/problems/scramble-string/
// Author : Shen Bai
// Date   : 2018-06-21

import java.util.Arrays;

/**
 * Given a string s1, we may represent it as a binary tree by partitioning it to two non-empty substrings recursively.
 * Below is one possible representation of s1 = "great":
 *     great
 *    /    \
 *   gr    eat
 *  / \    /  \
 * g   r  e   at
 *            / \
 *           a   t
 * To scramble the string, we may choose any non-leaf node and swap its two children.
 * For example, if we choose the node "gr" and swap its two children, it produces a scrambled string "rgeat".
 *     rgeat
 *    /    \
 *   rg    eat
 *  / \    /  \
 * r   g  e   at
 *            / \
 *           a   t
 * We say that "rgeat" is a scrambled string of "great".
 * Similarly, if we continue to swap the children of nodes "eat" and "at", it produces a scrambled string "rgtae".
 *    rgtae
 *    /    \
 *   rg    tae
 *  / \    /  \
 * r   g  ta  e
 *       / \
 *      t   a
 * We say that "rgtae" is a scrambled string of "great".
 * Given two strings s1 and s2 of the same length, determine if s2 is a scrambled string of s1.
 * Example 1:
 * Input: s1 = "great", s2 = "rgeat"
 * Output: true
 * Example 2:
 * Input: s1 = "abcde", s2 = "caebd"
 * Output: false
 */

public class ScrambleString {

    // recursion
    // @todo dp
    public boolean isScramble(String s1, String s2) {

        if (s1.equals(s2)) {
            return true;
        }
        int l1 = s1.length();
        int l2 = s2.length();
        if (l1 != l2) {
            return false;
        }

        char s1Arr[] = s1.toCharArray();
        char s2Arr[] = s2.toCharArray();
        Arrays.sort(s1Arr);
        Arrays.sort(s2Arr);
        String s1Str = new String(s1Arr);
        String s2Str = new String(s2Arr);
        if (!s1Str.equals(s2Str)) {
            return false;
        }
        for (int i = 1; i < l1; i++) {
            int j = l1 - i;
            boolean left1 = isScramble(s1.substring(0, i), s2.substring(0, i));
            boolean right1 = isScramble(s1.substring(i, l1), s2.substring(i, l1));
            boolean left2 = isScramble(s1.substring(0, i), s2.substring(j, l1));
            boolean right2 = isScramble(s1.substring(i, l1), s2.substring(0, j));
            if ((left1 && right1) || (left2 && right2)) {
                return true;
            }
        }

        return false;
    }
}