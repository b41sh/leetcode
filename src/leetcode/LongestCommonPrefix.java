package leetcode.longestCommonPrefix;

// Source : https://leetcode.com/problems/longest-common-prefix/
// Author : Shen Bai
// Date   : 2018-05-05

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 *
 * Example 1:
 *
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * Note:
 * All given inputs are in lowercase letters a-z.
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";
        } else if (strs.length == 1) {
            return strs[0];
        }

        int minLength = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < minLength) {
                minLength = strs[i].length();
            }
        }

        StringBuilder sb = new StringBuilder(minLength);
        for (int j = 0; j < minLength; j++) {
            char firstChar = strs[0].charAt(j);
            boolean equal = true;
            for (int k = 1; k < strs.length; k++) {
                char otherChar = strs[k].charAt(j);
                if (firstChar != otherChar) {
                    equal = false;
                    break;
                }
            }
            if (equal) {
                sb.append(firstChar);
            } else {
                break;
            }
        }

        return sb.toString();
    }
}
