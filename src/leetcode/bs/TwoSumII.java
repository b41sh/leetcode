package leetcode.bs.twoSumII;

// Source : https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
// Author : Shen Bai
// Date   : 2018-09-18

/**
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
 *
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
 *
 * Note:
 *
 * Your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution and you may not use the same element twice.
 * Example:
 *
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 *
 */

public class TwoSumII {

    public int[] twoSum(int[] numbers, int target) {

        int ret[] = new int[2];
        int l = 0;
        int r = numbers.length - 1;
        while (l < r) {
            int sum = numbers[l] + numbers[r];
            if (sum < target) {
                l++;
            } else if (sum > target) {
                r--;
            } else {
                ret[0] = l + 1;
                ret[1] = r + 1;
                break;
            }
        }

        return ret;
    }
}
