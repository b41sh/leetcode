package leetcode.backtracking.palindromePartitioning;

// Source : https://leetcode.com/problems/palindrome-partitioning/
// Author : Shen Bai
// Date   : 2018-07-18

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string s, partition s such that every substring of the partition is a palindrome.
 *
 * Return all possible palindrome partitioning of s.
 *
 * Example:
 *
 * Input: "aab"
 * Output:
 * [
 *   ["aa","b"],
 *   ["a","a","b"]
 * ]
 *
 */

public class PalindromePartitioning {

    public List<List<String>> partition(String s) {
        int length = s.length();
        List<List<String>> ret = new ArrayList<List<String>>();
        if (length == 0) {
            return ret;
        }

        for (int i = 1; i <= length; i++) {
            String a = s.substring(0, i);
            if (!_isPartition(a)) {
                continue;
            }
            if (i == length) {
                List<String> list = new ArrayList<String>();
                list.add(a);
                ret.add(list);
                continue;
            }
            String b = s.substring(i, length);
            List<List<String>> subLists = partition(b);
            if (subLists.isEmpty()) {
                continue;
            }
            for (List<String> subList : subLists) {
                List<String> list = new ArrayList<String>();
                list.add(a);
                list.addAll(subList);
                ret.add(list);
            }
        }

        return ret;
    }

    private boolean _isPartition(String s) {
        if (s.length() == 1) {
            return true;
        }
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
