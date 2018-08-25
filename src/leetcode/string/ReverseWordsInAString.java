package leetcode.string.reverseWordsInAString;

// Source : https://leetcode.com/problems/evaluate-reverse-polish-notation/
// Author : Shen Bai
// Date   : 2018-08-25

import java.util.ArrayList;
import java.util.List;

/**
 * Given an input string, reverse the string word by word.
 *
 * Example:
 *
 * Input: "the sky is blue",
 * Output: "blue is sky the".
 * Note:
 *
 * A word is defined as a sequence of non-space characters.
 * Input string may contain leading or trailing spaces. However, your reversed string should not contain leading or trailing spaces.
 * You need to reduce multiple spaces between two words to a single space in the reversed string.
 * Follow up: For C programmers, try to solve it in-place in O(1) space.
 */

public class ReverseWordsInAString {

    public String reverseWords(String s) {

        int len = s.length();
        int end = -1;
        List<String> list = new ArrayList<String>();
        for (int i = len - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == ' ') {
                if (end != -1) {
                    list.add(s.substring(i + 1, end + 1));
                    end = -1;
                }
            } else {
                if (end == -1) {
                    end = i;
                }
            }
        }
        if (end != -1) {
            list.add(s.substring(0, end + 1));
        }
        return String.join(" ", list);
    }
}
