package leetcode.dp.triangle;

// Source : https://leetcode.com/problems/triangle/
// Author : Shen Bai
// Date   : 2018-07-11

import java.util.List;

/**
 * Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.
 *
 * For example, given the following triangle
 *
 * [
 *      [2],
 *     [3,4],
 *    [6,5,7],
 *   [4,1,8,3]
 * ]
 * The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
 *
 * Note:
 *
 * Bonus point if you are able to do this using only O(n) extra space, where n is the total number of rows in the triangle.
 */

public class Triangle {

    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle.isEmpty()) {
            return 0;
        }
        int dp[] = new int[triangle.size()];

        dp[0] = triangle.get(0).get(0);
        int i = 1;
        int min = dp[0];
        while (i < triangle.size()) {
            List<Integer> line = triangle.get(i);

            int tmp = dp[0];
            dp[0] += line.get(0);
            int j = 1;
            min = dp[0];
            while (j < line.size() - 1) {
                int tmp1 = dp[j];
                dp[j] = Math.min(tmp, tmp1) + line.get(j);
                tmp = tmp1;
                if (dp[j] < min) {
                    min = dp[j];
                }
                j++;
            }
            dp[j] = tmp + line.get(j);
            if (dp[j] < min) {
                min = dp[j];
            }
            i++;
        }

        return min;
    }
}
