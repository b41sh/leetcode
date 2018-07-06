package leetcode.array.pascalsTriangle;

// Source : https://leetcode.com/problems/pascals-triangle
// Source : https://leetcode.com/problems/pascals-triangle-ii
// Author : Shen Bai
// Date   : 2018-07-06

import java.util.ArrayList;
import java.util.List;

/**
 * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 *
 * Example:
 *
 * Input: 5
 * Output:
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 *
 * Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.
 *
 * Note that the row index starts from 0.
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 *
 * Example:
 *
 * Input: 3
 * Output: [1,3,3,1]
 * Follow up:
 *
 * Could you optimize your algorithm to use only O(k) extra space?
 */

public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (numRows <= 0) {
            return ret;
        }

        List<Integer> firstRow = new ArrayList<Integer>();
        firstRow.add(1);
        ret.add(firstRow);
        numRows--;
        while (numRows > 0) {
            List<Integer> curRow = new ArrayList<Integer>();
            List<Integer> lastRow = ret.get(ret.size() - 1);

            Integer lastItem = 0;
            for (Integer curItem : lastRow) {
                curRow.add(lastItem + curItem);
                lastItem = curItem;
            }
            curRow.add(lastItem);
            ret.add(curRow);
            numRows--;
        }

        return ret;
    }

    public List<Integer> getRow(int rowIndex) {

        List<Integer> row = new ArrayList<Integer>(rowIndex + 1);
        row.add(1);
        rowIndex--;
        while (rowIndex >= 0) {
            int size = row.size();
            Integer lastItem = 0;
            for (int i = 0; i < size; i++) {
                Integer item = row.get(i);
                row.set(i, lastItem + item);
                lastItem = item;
            }
            row.add(1);
            rowIndex--;
        }
        return row;
    }
}
