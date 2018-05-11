package leetcode.threeSumClosest;

// Source : https://leetcode.com/problems/3sum-closest/
// Author : Shen Bai
// Date   : 2018-05-11

/**
 * Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target. Return the sum of the three integers. You may assume that each input would have exactly one solution.
 * Example:
 * Given array nums = [-1, 2, 1, -4], and target = 1.
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 */

import java.util.Arrays;

public class ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);

        int sum = 0;
        int diff = -1;
        int absDiff = 0;
        int minDiff = -1;
        int minSum = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (k > j) {
                sum = nums[i] + nums[j] + nums[k];
                diff = sum - target;
                absDiff = abs(diff);

                if (minDiff == -1 || absDiff < minDiff) {
                    minDiff = absDiff;
                    minSum = sum;
                }
                if (diff == 0) {
                    break;
                } else if (diff < 0) {
                    j++;
                } else {
                    k--;
                }
            }
            if (diff == 0) {
                break;
            }
        }

        return minSum;
    }

    private int abs(int num) {
        if (num < 0) {
            return num * -1;
        }
        return num;
    }
}
