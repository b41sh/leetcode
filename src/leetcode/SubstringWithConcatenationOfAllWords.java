package leetcode.substringWithConcatenationOfAllWords;

// Source : https://leetcode.com/problems/substring-with-concatenation-of-all-words/
// Author : Shen Bai
// Date   : 2018-05-15

/**
 * You are given a string, s, and a list of words, words, that are all of the same length. Find all starting indices of substring(s) in s that is a concatenation of each word in words exactly once and without any intervening characters.
 * Example 1:
 * Input:
 *  s = "barfoothefoobarman",
 *  words = ["foo","bar"]
 * Output: [0,9]
 * Explanation: Substrings starting at index 0 and 9 are "barfoor" and "foobar" respectively.
 * The output order does not matter, returning [9,0] is fine too.
 * Example 2:
 * Input:
 *  s = "wordgoodstudentgoodword",
 *  words = ["word","student"]
 * Output: []
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubstringWithConcatenationOfAllWords {

    public List<Integer> findSubstring(String s, String[] words) {

        List<Integer> ret = new ArrayList<Integer>();
        Arrays.sort(words);

        int len = -1;
        int count = words.length;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (len == -1) {
                len = word.length();
            } else if (len != word.length()) {
                return ret;
            }
        }
        if (s.length() < len * count || len * count <= 0) {
            return ret;
        }

        for (int j = 0; j <= s.length() - len * count; j++) {
            String[] newWords = new String[count];
            int k = 0;
            int index = j;
            while (k < count) {
                newWords[k] = s.substring(index, index + len);
                index += len;
                k++;
            }
            Arrays.sort(newWords);

            if (Arrays.equals(words, newWords)) {
                ret.add(j);
            }
        }

        return ret;
    }
}