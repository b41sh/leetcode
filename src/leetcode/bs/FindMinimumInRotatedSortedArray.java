package leetcode.bs.findMinimumInRotatedSortedArray;

// Source : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
// Author : Shen Bai
// Date   : 2018-08-31

/**
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 *
 * (i.e.,  [0,1,2,4,5,6,7] might become  [4,5,6,7,0,1,2]).
 *
 * Find the minimum element.
 *
 * You may assume no duplicate exists in the array.
 *
 * Example 1:
 *
 * Input: [3,4,5,1,2]
 * Output: 1
 * Example 2:
 *
 * Input: [4,5,6,7,0,1,2]
 * Output: 0
 */

public class FindMinimumInRotatedSortedArray {

    public int findMin(int[] nums) {
        if (nums == null) {
            return -1;
        } else if (nums.length == 1) {
            return nums[0];
        }
        int beg = 0;
        int end = nums.length - 1;
        int mid = 0;
        while (beg < end) {
            if (nums[beg] < nums[end]) {
                break;
            }
            mid = beg + (end - beg) / 2;
            if (mid == beg || mid == end) {
                break;
            }
            if (nums[mid] > nums[beg]) {
                beg = mid;
            } else {
                end = mid;
            }
        }
        return Math.min(nums[beg], nums[end]);
    }

    public int findMinII(int[] nums) {
        if (nums == null) {
            return -1;
        } else if (nums.length == 1) {
            return nums[0];
        }
        int beg = 0;
        int end = nums.length - 1;
        int mid = 0;

        while (beg < end) {
            if (nums[beg] < nums[end]) {
                break;
            }
            mid = beg + (end - beg) / 2;
            if (mid == beg || mid == end) {
                break;
            } else if (nums[mid] == nums[beg] && nums[mid] == nums[end]) {
                break;
            }
            if (nums[mid] >= nums[beg]) {
                beg = mid;
            } else {
                end = mid;
            }
        }

        return Math.min(nums[beg], nums[end]);
    }
}
