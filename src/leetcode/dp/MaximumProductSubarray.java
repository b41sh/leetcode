package leetcode.dp.maximumProductSubarray;

// Source : https://leetcode.com/problems/maximum-product-subarray
// Author : Shen Bai
// Date   : 2018-08-28

import java.util.Arrays;

/**
 * Given an integer array nums, find the contiguous subarray within an array (containing at least one number) which has the largest product.
 *
 * Example 1:
 *
 * Input: [2,3,-2,4]
 * Output: 6
 * Explanation: [2,3] has the largest product 6.
 * Example 2:
 *
 * Input: [-2,0,-1]
 * Output: 0
 * Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 */

public class MaximumProductSubarray {

    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        }
        int len = nums.length;
        int[] dp1 = new int[len + 1];
        int[] dp2 = new int[len + 1];
        int maxNum = Integer.MIN_VALUE;
        for (int i = 1; i <= len; i++) {
            int n = nums[i - 1];
            int a = dp1[i - 1] * n;
            int b = dp2[i - 1] * n;
            int max = Math.max(Math.max(a, b), n);
            int min = Math.min(Math.min(a, b), n);
            dp1[i] = (max > 0) ? max : 0;
            dp2[i] = (min < 0) ? min : 0;
            maxNum = Math.max(maxNum, max);
        }

        return maxNum;
    }
}
