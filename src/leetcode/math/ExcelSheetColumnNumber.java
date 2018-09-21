package leetcode.math.excelSheetColumnNumber;

// Source : https://leetcode.com/problems/excel-sheet-column-number/
// Author : Shen Bai
// Date   : 2018-09-21

/**
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 *
 * For example:
 *
 *     A -> 1
 *     B -> 2
 *     C -> 3
 *     ...
 *     Z -> 26
 *     AA -> 27
 *     AB -> 28
 *     ...
 * Example 1:
 *
 * Input: "A"
 * Output: 1
 * Example 2:
 *
 * Input: "AB"
 * Output: 28
 * Example 3:
 *
 * Input: "ZY"
 * Output: 701
 */

public class ExcelSheetColumnNumber {

    public int titleToNumber(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int num = 0;
        int size = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int n = (int) (c - 'A');
            n++;
            num += n * size;
            size *= 26;
        }

        return num;
    }
}
