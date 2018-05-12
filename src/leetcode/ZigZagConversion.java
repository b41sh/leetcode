package leetcode.zigZagConversion;

// Source : https://leetcode.com/problems/zigzag-conversion/
// Author : Shen Bai
// Date   : 2018-05-12

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 * Write the code that will take a string and make this conversion given a number of rows:
 */

public class ZigZagConversion {

    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        String[] strs = new String[numRows];
        for (int i = 0; i < strs.length; i++) {
            strs[i] = "";
        }
        int n = numRows + numRows - 2;
        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            int p = j % n;
            int m = p;
            if (p >= numRows) {
                m = n - p;
            }
            if (strs[m] == null) {
                strs[m] = String.valueOf(c);
            } else {
                strs[m] = strs[m] + String.valueOf(c);
            }
        }

        String retStr = "";
        for (int k = 0; k < strs.length; k++) {
            retStr = retStr + strs[k];
        }

        return retStr;
    }
}
