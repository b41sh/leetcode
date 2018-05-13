package leetcode.integerToRoman;

// Source : https://leetcode.com/problems/integer-to-roman/
// Author : Shen Bai
// Date   : 2018-05-13

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 *
 * I can be placed before V (5) and X (10) to make 4 and 9. 
 * X can be placed before L (50) and C (100) to make 40 and 90. 
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given an integer, convert it to a roman numeral. Input is guaranteed to be within the range from 1 to 3999.
 */
public class IntegerToRoman {

    public String intToRoman(int num) {

        StringBuilder sb = new StringBuilder();
        int a = 0;
        int b = 0;
        while (num > 0) {
            if (num >= 1000) {
                a = num / 1000;
                b = num % 1000;
                while (a > 0) {
                    sb.append("M");
                    a--;
                }
            } else if (num >= 100) {
                a = num / 100;
                b = num % 100;
                if (a == 9) {
                    sb.append("CM");
                } else if (a == 8) {
                    sb.append("DCCC");
                } else if (a == 7) {
                    sb.append("DCC");
                } else if (a == 6) {
                    sb.append("DC");
                } else if (a == 5) {
                    sb.append("D");
                } else if (a == 4) {
                    sb.append("CD");
                } else if (a == 3) {
                    sb.append("CCC");
                } else if (a == 2) {
                    sb.append("CC");
                } else if (a == 1) {
                    sb.append("C");
                }
            } else if (num >= 10) {
                a = num / 10;
                b = num % 10;
                if (a == 9) {
                    sb.append("XC");
                } else if (a == 8) {
                    sb.append("LXXX");
                } else if (a == 7) {
                    sb.append("LXX");
                } else if (a == 6) {
                    sb.append("LX");
                } else if (a == 5) {
                    sb.append("L");
                } else if (a == 4) {
                    sb.append("XL");
                } else if (a == 3) {
                    sb.append("XXX");
                } else if (a == 2) {
                    sb.append("XX");
                } else if (a == 1) {
                    sb.append("X");
                }
            } else {
                a = num;
                b = 0;
                if (a == 9) {
                    sb.append("IX");
                } else if (a == 8) {
                    sb.append("VIII");
                } else if (a == 7) {
                    sb.append("VII");
                } else if (a == 6) {
                    sb.append("VI");
                } else if (a == 5) {
                    sb.append("V");
                } else if (a == 4) {
                    sb.append("IV");
                } else if (a == 3) {
                    sb.append("III");
                } else if (a == 2) {
                    sb.append("II");
                } else if (a == 1) {
                    sb.append("I");
                }
            }

            num = b;
        }

        return sb.toString();
    }
}