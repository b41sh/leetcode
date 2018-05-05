package leetcode.lengthOfLongestSubstring;

// Source : https://leetcode.com/problems/longest-substring-without-repeating-characters/
// Author : Shen Bai
// Date   : 2018-05-01

import java.util.*;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 * Examples:
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1.
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        byte[] b = s.getBytes();

        int maxLength = 0;
        int startIndex = 0;
        int lastIndex = 0;
        int curIndex = 0;
        Map<Byte, Integer> keys = new HashMap<Byte, Integer>();
        for (int i = 0; i < b.length; i++) {
            Byte curByte = new Byte(b[i]);
            curIndex = i;
            if (keys.containsKey(curByte)) {
                lastIndex = keys.get(curByte).intValue();
                if (lastIndex >= startIndex) {
                    startIndex = lastIndex + 1;
                } else {
                    if (curIndex - startIndex + 1 > maxLength) {
                        maxLength = curIndex - startIndex + 1;
                    }
                }
            } else {
                if (curIndex - startIndex + 1 > maxLength) {
                    maxLength = curIndex - startIndex + 1;
                }
            }
            keys.put(curByte, new Integer(curIndex));
        }

        return maxLength;
    }
}
