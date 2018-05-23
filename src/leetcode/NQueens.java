package leetcode.nQueens;

// Source : https://leetcode.com/problems/n-queens/
// Source : https://leetcode.com/problems/n-queens-ii/
// Author : Shen Bai
// Date   : 2018-05-23

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The n-queens puzzle is the problem of placing n queens on an n×n chessboard such that no two queens attack each other.
 * Given an integer n, return all distinct solutions to the n-queens puzzle.
 * Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space respectively.
 * Example:
 * Input: 4
 * Output: [
 * [".Q..",  // Solution 1
 *  "...Q",
 *  "Q...",
 *  "..Q."],
 * 
 * ["..Q.",  // Solution 2
 *  "Q...",
 *  "...Q",
 *  ".Q.."]
 * ]
 * Explanation: There exist two distinct solutions to the 4-queens puzzle as shown above.
 */

public class NQueens {

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> retList = new ArrayList<List<String>>();
        if (n <= 0) {
            return retList;
        }
        List<String> curList = new ArrayList<String>();

        solve(0, n, curList, retList);

        return retList;
    }

    public int totalNQueens(int n) {
        List<List<String>> retList = new ArrayList<List<String>>();
        if (n <= 0) {
            return 0;
        }
        List<String> curList = new ArrayList<String>();

        solve(0, n, curList, retList);

        return retList.size();
    }

    private void solve(int l, int n, List<String> curList, List<List<String>> list) {

        char[] a = new char[n];
        Arrays.fill(a, '.');
        StringBuilder sb = new StringBuilder();
        sb.append(a);

        for (int i = 0; i < n; i++) {
            if (!isSafe(l, i, n, curList)) {
                continue;
            }
            int iq = sb.indexOf("Q");
            if (iq >= 0) {
                sb.replace(iq, iq + 1, ".");
            }
            sb.replace(i, i + 1, "Q");
            String str = sb.toString();
            curList.add(str);
            if (l == n - 1) {
                list.add(new ArrayList<String>(curList));
            } else {
                solve(l + 1, n, curList, list);
            }
            curList.remove(l);
        }
    }

    /**
     * @param l current line number
     * @param p current line position
     * @param n total line number
     * @param curList current Queen list
     */
    private boolean isSafe(int l, int p, int n, List<String> curList) {
        if (l == 0) {
            return true;
        }
        for (int i = 0; i < l; i++) {
            String curStr = curList.get(i);
            System.out.println(curStr);
            char left = '.';
            char right = '.';
            char mid = curStr.charAt(p);
            if (p - l + i >= 0) {
                left = curStr.charAt(p - l + i);
            }
            if (p + l - i <= n - 1) {
                right = curStr.charAt(p + l - i);
            }
            if (left == 'Q' || mid == 'Q' || right == 'Q') {
                return false;
            }
        }

        return true;
    }
}