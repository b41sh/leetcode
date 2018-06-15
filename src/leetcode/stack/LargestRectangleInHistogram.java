package leetcode.stack.largestRectangleInHistogram;

// Source : https://leetcode.com/problems/largest-rectangle-in-histogram/
// Author : Shen Bai
// Date   : 2018-06-15

import java.util.Arrays;
import java.util.Stack;

/**
 * Given n non-negative integers representing the histogram's bar height where the width of each bar is 1, find the area of largest rectangle in the histogram.
 */

public class LargestRectangleInHistogram {

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