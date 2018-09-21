package leetcode.math.excelSheetColumnTitle;

// Source : https://leetcode.com/problems/excel-sheet-column-title/
// Author : Shen Bai
// Date   : 2018-09-21

/**
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
 *
 * For example:
 *
 *     1 -> A
 *     2 -> B
 *     3 -> C
 *     ...
 *     26 -> Z
 *     27 -> AA
 *     28 -> AB
 *     ...
 * Example 1:
 *
 * Input: 1
 * Output: "A"
 * Example 2:
 *
 * Input: 28
 * Output: "AB"
 * Example 3:
 *
 * Input: 701
 * Output: "ZY"
 */

public class ExcelSheetColumnTitle {

    public String convertToTitle(int n) {
        if (n <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            n--;
            char c = (char) (n % 26 + 'A');
            sb.append(c);
            n = n / 26;
        }
        sb.reverse();
        return sb.toString();
    }
}
