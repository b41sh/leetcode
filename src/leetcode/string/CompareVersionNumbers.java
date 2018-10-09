package leetcode.string.compareVersionNumbers;

// Source : https://leetcode.com/problems/compare-version-numbers/
// Author : Shen Bai
// Date   : 2018-10-09

import java.util.Arrays;

/**
 * Compare two version numbers version1 and version2.
 * If version1 > version2 return 1; if version1 < version2 return -1;otherwise return 0.
 *
 * You may assume that the version strings are non-empty and contain only digits and the . character.
 * The . character does not represent a decimal point and is used to separate number sequences.
 * For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.
 *
 * Example 1:
 *
 * Input: version1 = "0.1", version2 = "1.1"
 * Output: -1
 * Example 2:
 *
 * Input: version1 = "1.0.1", version2 = "1"
 * Output: 1
 * Example 3:
 *
 * Input: version1 = "7.5.2.4", version2 = "7.5.3"
 * Output: -1
 */

public class CompareVersionNumbers {

    public int compareVersion(String version1, String version2) {
        int ret = 0;
        String[] v1s = version1.split("\\.");
        String[] v2s = version2.split("\\.");
        int len1 = v1s.length;
        int len2 = v2s.length;
        for (int i = 0; i < Math.max(len1, len2); i++) {
            String v1 = "0";
            String v2 = "0";
            if (i < len1) {
                v1 = v1s[i];
            }
            if (i < len2) {
                v2 = v2s[i];
            }
            if (v1.length() > v2.length()) {
                StringBuilder sb = new StringBuilder();
                char[] pad = new char[v1.length() - v2.length()];
                Arrays.fill(pad, '0');
                v2 = sb.append(pad).append(v2).toString();
            } else if (v2.length() > v1.length()) {
                StringBuilder sb = new StringBuilder();
                char[] pad = new char[v2.length() - v1.length()];
                Arrays.fill(pad, '0');
                v1 = sb.append(pad).append(v1).toString();
            }
            for (int j = 0; j < v1.length(); j++) {
                int diff = (int) v1.charAt(j) - (int) v2.charAt(j);
                if (diff > 0) {
                    ret = 1;
                    break;
                } else if (diff < 0) {
                    ret = -1;
                    break;
                }
            }
            if (ret != 0) {
                break;
            }
        }
        return ret;
    }
}
