package leetcode.maximumSubarray;

// Source : https://leetcode.com/problems/maximum-subarray/
// Author : Shen Bai
// Date   : 2018-05-23

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 * Example:
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * Follow up:
 * If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */
public class MaximumSubarray {

    // dp
    // dp[i] = max(dp[i - 1] + nums[i], nums[i])
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int max = nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max((dp[i - 1] + nums[i]), nums[i]);
            max = Math.max(max, dp[i]);
        }

        return max;
    }
}