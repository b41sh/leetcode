package leetcode.stringToInteger;

// Source : https://leetcode.com/problems/string-to-integer-atoi/
// Author : Shen Bai
// Date   : 2018-05-13

/**
 * Implement atoi which converts a string to an integer.
 * The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.
 * The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.
 * If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.
 * If no valid conversion could be performed, a zero value is returned.
 * Note:
 * Only the space character ' ' is considered as whitespace character.
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. If the numerical value is out of the range of representable values, INT_MAX (231 − 1) or INT_MIN (−231) is returned.
 */

public class StringToInteger {

    public int myAtoi(String str) {

        int num = 0;
        boolean isNegative = false;
        boolean isBeg = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!isBeg) {
                if (c == ' ') {
                    continue;
                } else if (c == '-') {
                    isBeg = true;
                    isNegative = true;
                } else if (c == '+') {
                    isBeg = true;
                } else if (c >= '0' && c <= '9') {
                    isBeg = true;
                    num += getInt(c);
                } else {
                    return num;
                }
            } else {
                if (c >= '0' && c <= '9') {
                    if (isNegative) {
                        if (num == Integer.MIN_VALUE / 10 && getInt(c) >= 8) {
                            num = Integer.MIN_VALUE;
                            break;
                        } else if (num < Integer.MIN_VALUE / 10) {
                            num = Integer.MIN_VALUE;
                            break;
                        } else {
                            num = num * 10 - getInt(c);
                        }
                    } else {
                        if (num == Integer.MAX_VALUE / 10 && getInt(c) >= 7) {
                            num = Integer.MAX_VALUE;
                            break;
                        } else if (num > Integer.MAX_VALUE / 10) {
                            num = Integer.MAX_VALUE;
                            break;
                        } else {
                            num = num * 10 + getInt(c);
                        }
                    }
                } else {
                    return num;
                }
            }
        }

        return num;
    }

    private int getInt(char c) {
        if (c == '0') {
            return 0;
        } else if (c == '1') {
            return 1;
        } else if (c == '2') {
            return 2;
        } else if (c == '3') {
            return 3;
        } else if (c == '4') {
            return 4;
        } else if (c == '5') {
            return 5;
        } else if (c == '6') {
            return 6;
        } else if (c == '7') {
            return 7;
        } else if (c == '8') {
            return 8;
        } else if (c == '9') {
            return 9;
        } else {
            return 0;
        }
    }
}