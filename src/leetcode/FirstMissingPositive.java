package leetcode.firstMissingPositive;

// Source : https://leetcode.com/problems/first-missing-positive/
// Author : Shen Bai
// Date   : 2018-05-19

/**
 * Given an unsorted integer array, find the smallest missing positive integer.
 * Example 1:
 * Input: [1,2,0]
 * Output: 3
 * Example 2:
 * Input: [3,4,-1,1]
 * Output: 2
 * Example 3:
 * Input: [7,8,9,11,12]
 * Output: 1
 * Note: Your algorithm should run in O(n) time and uses constant extra space.
 */
public class FirstMissingPositive {

    public int firstMissingPositive(int[] nums) {
        if (nums.length == 0) {
            return 1;
        }

        int num = -1;
        int len = nums.length;
        int min = -1;
        int[] pos = new int[len + 1];

        for (int i = 0; i < len; i++) {
            num = nums[i];
            if (num <= 0) {
                continue;
            } else if (num <= len) {
                pos[num] = 1;
            } else {
                if (min == -1 || num - 1 < min) {
                    min = num - 1;
                }
            }
        }
        for (int j = 1; j <= len; j++) {
            if (pos[j] == 0) {
                min = j;
                break;
            }
        }
        if (min == -1) {
            min = len + 1;
        }

        return min;
    }
}