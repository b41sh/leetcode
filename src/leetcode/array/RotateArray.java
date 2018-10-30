package leetcode.array.rotateArray;

// Source : https://leetcode.com/problems/rotate-array/
// Author : Shen Bai
// Date   : 2018-10-27

import java.util.Arrays;

/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 *
 * Example 1:
 *
 * Input: [1,2,3,4,5,6,7] and k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * Example 2:
 *
 * Input: [-1,-100,3,99] and k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 * Note:
 *
 * Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
 * Could you do it in-place with O(1) extra space?
 */

public class RotateArray {

    // use extra space
    public void rotate(int[] nums, int k) {

        int len = nums.length;
        if (k > len) {
            k = k % len;
        }
        int[] tmp = new int[k];
        for (int i = 0; i < k; i++) {
            tmp[i] = nums[len - k + i];
        }
        for (int i = len - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }
        for (int i = 0; i < k; i++) {
            nums[i] = tmp[i];
        }
    }

    // no extra space
    public void rotate2(int[] nums, int k) {

        k = k % nums.length;
        _reverse(nums, 0, nums.length - 1);
        _reverse(nums, 0, k - 1);
        _reverse(nums, k, nums.length - 1);
    }

    private void _reverse(int[] nums, int start, int end) {
        while (end > start) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }
}

