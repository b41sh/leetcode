package leetcode.tp.minimumWindowSubstring;

// Source : https://leetcode.com/problems/minimum-window-substring/
// Author : Shen Bai
// Date   : 2018-06-13

import java.util.Map;
import java.util.HashMap;

/**
 * Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).
 * Example:
 * Input: S = "ADOBECODEBANC", T = "ABC"
 * Output: "BANC"
 * Note:
 * If there is no such window in S that covers all characters in T, return the empty string "".
 * If there is such window, you are guaranteed that there will always be only one unique minimum window in S.
 */

public class MinimumWindowSubstring {

    public String minWindow(String s, String t) {

        int tLen = t.length();
        int sLen = s.length();

        Map<Character, Integer> sMap = new HashMap<Character, Integer>();
        Map<Character, Integer> tMap = new HashMap<Character, Integer>();
        for (int i = 0; i < tLen; i++) {
            Character key = new Character(t.charAt(i));
            if (tMap.get(key) == null) {
                tMap.put(key, 1);
                sMap.put(key, 0);
            } else {
                tMap.put(key, tMap.get(key) + 1);
            }
        }

        int count = 0;
        int left = 0;
        int right = 0;
        int start = 0;
        int min = -1;
        for (int i = 0; i < sLen; i++) {
            Character key = new Character(s.charAt(i));
            if (tMap.get(key) == null) {
                continue;
            }
            if (sMap.get(key) < tMap.get(key)) {
                count++;
            }
            sMap.put(key, sMap.get(key) + 1);
            if (count < tLen) {
                continue;
            }
            for (int j = start; j <= i; j++) {
                Character key2 = new Character(s.charAt(j));
                if (tMap.get(key2) == null) {
                    continue;
                }
                int w = i - j;
                if (w < min || min == -1) {
                    min = w;
                    left = j;
                    right = i + 1;
                }
                sMap.put(key2, sMap.get(key2) - 1);
                if (sMap.get(key2) < tMap.get(key2)) {
                    start = j + 1;
                    count--;
                    break;
                }
            }
            if (min == 1) {
                break;
            }
        }

        if (left == 0 && right == 0) {
            return "";
        }

        return s.substring(left, right);
    }
}