package leetcode.dp.houseRobber;

// Source : https://leetcode.com/problems/house-robber/
// Author : Shen Bai
// Date   : 2018-08-28

import java.util.Arrays;

/**
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
 *
 * Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
 *
 * Example 1:
 *
 * Input: [1,2,3,1]
 * Output: 4
 * Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
 *              Total amount you can rob = 1 + 3 = 4.
 * Example 2:
 *
 * Input: [2,7,9,3,1]
 * Output: 12
 * Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
 *              Total amount you can rob = 2 + 9 + 1 = 12.
 */

public class HouseRobber {

    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        } else if (nums.length <= 2) {
            return nums.length == 1 ? nums[0] : Math.max(nums[0], nums[1]);
        }
        int len = nums.length;
        int[] dp = new int[len + 2];
        for (int i = 2; i <= len + 1; i++) {
            dp[i] = Math.max(nums[i - 2] + dp[i - 2], dp[i - 1]);
        }
        return Math.max(dp[len], dp[len + 1]);
    }

    public int robII(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        } else if (nums.length <= 2) {
            return nums.length == 1 ? nums[0] : Math.max(nums[0], nums[1]);
        }
        int len = nums.length;
        int[] dp = new int[len + 2];
        for (int i = 3; i <= len + 1; i++) {
            dp[i] = Math.max(nums[i - 2] + dp[i - 2], dp[i - 1]);
        }
        int max1 = Math.max(dp[len], dp[len + 1]);
        Arrays.fill(dp, 0);
        for (int i = 2; i <= len; i++) {
            dp[i] = Math.max(nums[i - 2] + dp[i - 2], dp[i - 1]);
        }
        int max2 = Math.max(dp[len], dp[len + 1]);
        return Math.max(max1, max2);
    }
}
