package leetcode.validNumber;

// Source : https://leetcode.com/problems/valid-number/
// Author : Shen Bai
// Date   : 2018-06-01

/**
 * Validate if a given string is numeric.
 * Some examples:
 * "0" => true
 * " 0.1 " => true
 * "abc" => false
 * "1 a" => false
 * "2e10" => true
 * Note: It is intended for the problem statement to be ambiguous. You should gather all requirements up front before implementing one.
 */

public class ValidNumber {

    public boolean isNumber(String s) {

        s = s.trim();
        if (s.length() == 0) {
            return false;
        }
        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            s = s.substring(1);
        }
        if (s.length() == 0) {
            return false;
        }

        boolean afterNum = false;
        int eIndex = -1;
        int dotIndex = -1;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c == '.') {
                if (dotIndex > -1 || eIndex > -1) {
                    return false;
                }
                dotIndex = i;
            } else if (c == 'e') {
                if (eIndex > -1) {
                    return false;
                }
                eIndex = i;
                if (i == len - 1) {
                    return false;
                }
                if (s.charAt(i + 1) == '+' || s.charAt(i + 1) == '-') {
                    i++;
                }
            } else if (c >= '0' && c <= '9') {
                if (eIndex > -1) {
                    afterNum = true;
                }
            } else {
                return false;
            }
        }

        if (dotIndex > -1 && eIndex == -1) {
            if (len == 1) {
                return false;
            }
        } else if (eIndex > -1) {
            if (!afterNum) {
                return false;
            } else if (dotIndex == 0 && eIndex == 1) {
                return false;
            } else if (eIndex == 0) {
                return false;
            }
        }

        return true;
    }
}