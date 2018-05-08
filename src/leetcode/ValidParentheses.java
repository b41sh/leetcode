package leetcode.validParentheses;

// Source : https://leetcode.com/problems/valid-parentheses/
// Author : Shen Bai
// Date   : 2018-05-08

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 * Given an array nums of n integers and an integer target, are there elements a, b, c, and d in nums such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.
 */
import java.util.Map;
import java.util.HashMap;


public class ValidParentheses {

    public boolean isValid(String s) {
        if (s.length() == 0) {
            return true;
        }

        char l1 = '(';
        char l2 = '{';
        char l3 = '[';
        char r1 = ')';
        char r2 = '}';
        char r3 = ']';

        Integer depth = 0;
        Map<Integer, Character> tree = new HashMap<Integer, Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != l1 && c != l2 && c != l3 && c != r1 && c != r2 && c != r3) {
                return false;
            }
            if (c == l1 || c == l2 || c == l3) {
                if (tree.get(depth) != null) {
                    return false;
                }
                tree.put(depth, new Character(c));
                depth++;
            } else if (c == r1 || c == r2 || c == r3) {
                depth--;
                if (tree.get(depth) == null) {
                    return false;
                }
                char lc = tree.get(depth).charValue();
                if (lc == '{' && c != '}') {
                    return false;
                } else if (lc == '(' && c != ')') {
                    return false;
                } else if (lc == '[' && c != ']') {
                    return false;
                }
                tree.put(depth, null);
            }
        }

        if (depth == 0) {
            return true;
        } else {
            return false;
        }
    }
}