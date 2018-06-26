package leetcode.stack.maximalRectangle;

// Source : https://leetcode.com/problems/maximal-rectangle/
// Author : Shen Bai
// Date   : 2018-06-26

import java.util.Arrays;
import java.util.Stack;

/**
 * Given a 2D binary matrix filled with 0's and 1's, find the largest rectangle containing only 1's and return its area.
 * Example:
 * Input:
 * [
 *  ["1","0","1","0","0"],
 *  ["1","0","1","1","1"],
 *  ["1","1","1","1","1"],
 *  ["1","0","0","1","0"]
 * ]
 * Output: 6
 */

public class MaximalRectangle {

    public int maximalRectangle(char[][] matrix) {

        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int max = 0;
        for (int i = 0; i < m; i++) {
            int[] heights = new int[n];
            for (int j = 0; j < n; j++) {
                int h = 0;
                int k = i;
                while (k < m) {
                    if (matrix[k][j] == '1') {
                        h++;
                    } else {
                        break;
                    }
                    k++;
                }
                heights[j] = h;
            }
            int area = largestRectangleArea(heights);
            if (area > max) {
                max = area;
            }
        }

        return max;
    }

    // https://stackoverflow.com/questions/4311694/maximize-the-rectangular-area-under-histogram
    public int largestRectangleArea(int[] heights) {

        int l = heights.length;
        if (l == 0) {
            return 0;
        } else if (l == 1) {
            return heights[0];
        }
        Integer ii = 0;
        int[] widths = new int[l];
        Arrays.fill(widths, 1);
        Stack<Integer> left = new Stack<Integer>();
        Stack<Integer> right = new Stack<Integer>();
        for (int i = 0; i < l; i++) {
            ii = new Integer(i);
            while (!left.empty() && heights[left.peek().intValue()] >= heights[i]) {
                left.pop();
            }
            if (left.empty()) {
                widths[i] += i;
            } else {
                widths[i] += i - left.peek().intValue() - 1;
            }
            left.push(ii);
        }
        for (int i = l - 1; i >= 0; i--) {
            ii = new Integer(i);
            while (!right.empty() && heights[right.peek().intValue()] >= heights[i]) {
                right.pop();
            }
            if (right.empty()) {
                widths[i] += l - i - 1;
            } else {
                widths[i] += right.peek().intValue() - i - 1;
            }
            right.push(ii);
        }
        int max = 0;
        for (int i = 0; i < l; i++) {
            max = Math.max(max, heights[i] * widths[i]);
        }

        return max;
    }
}