package leetcode.implementStrStr;

// Source : https://leetcode.com/problems/implement-strstr/
// Author : Shen Bai
// Date   : 2018-05-10

/**
 * Implement strStr().
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */
public class ImplementStrStr {

    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        int start = -1;
        int i = 0;
        int j = 0;
        while (i < haystack.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                if (j == 0) {
                    start = i;
                    if (needle.length() == 1) {
                        return start;
                    }
                } else if (j == needle.length() - 1) {
                    return start;
                }
                j++;
            } else if (j > 0) {
                i = start;
                j = 0;
                start = -1;
            }
            i++;
        }

        return -1;
    }
}