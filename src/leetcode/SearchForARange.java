package leetcode.searchForARange;

// Source : https://leetcode.com/problems/search-for-a-range/
// Author : Shen Bai
// Date   : 2018-05-16

/**
 * Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * If the target is not found in the array, return [-1, -1].
 * Example 1:
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * Example 2:
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 */
public class SearchForARange {

    public int[] searchRange(int[] nums, int target) {

        int[] ret = new int[]{-1, -1};
        if (nums.length == 0) {
            return ret;
        }

        int l = 0;
        int r = nums.length - 1;
        int m = 0;
        int num = 0;
        int min = 0;
        int max = 0;

        while (l + 1 < r) {
            m = (l + r) / 2;
            num = nums[m];
            if (num < target) {
                l = m;
            } else {
                r = m;
            }
        }
        if (nums[l] == target) {
            min = l;
        } else if (nums[r] == target) {
            min = r;
        } else {
            return ret;
        }

        l = 0;
        r = nums.length - 1;
        while (l + 1 < r) {
            m = (l + r) / 2;
            num = nums[m];
            if (num > target) {
                r = m;
            } else {
                l = m;
            }
        }
        if (nums[r] == target) {
            max = r;
        } else if (nums[l] == target) {
            max = l;
        } else {
            return ret;
        }

        ret[0] = min;
        ret[1] = max;

        return ret;
    }
}