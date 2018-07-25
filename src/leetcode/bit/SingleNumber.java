package leetcode.bit.singleNumber;

// Source : https://leetcode.com/problems/single-number
// Author : Shen Bai
// Date   : 2018-07-25

/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 *
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Example 1:
 *
 * Input: [2,2,1]
 * Output: 1
 * Example 2:
 *
 * Input: [4,1,2,1,2]
 * Output: 4
 *
 *
 * Given a non-empty array of integers, every element appears three times except for one, which appears exactly once. Find that single one.
 *
 * Note:
 *
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Example 1:
 *
 * Input: [2,2,3,2]
 * Output: 3
 * Example 2:
 *
 * Input: [0,1,0,1,0,1,99]
 * Output: 99
 */

public class SingleNumber {

    public int singleNumber(int[] nums) {

        int ret = 0;
        for (int i = 0; i < nums.length; i++) {
            ret ^= nums[i];
        }
        return ret;
    }

    public int singleNumberII(int[] nums) {

        int[] bit = new int[32];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < 32; j++) {
                bit[j] += nums[i] >> j & 1;
            }
        }

        int ret = 0;
        for (int j = 0; j < 32; j++) {
            ret += bit[j] % 3 << j;
        }

        return ret;
    }
}

