package leetcode.searchInRotatedSortedArray;

// Source : https://leetcode.com/problems/search-in-rotated-sorted-array/
// Author : Shen Bai
// Date   : 2018-05-16

/**
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 * (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
 *  You are given a target value to search. If found in the array return its index, otherwise return -1.
 * You may assume no duplicate exists in the array.
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * Example 1:
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 * Example 2:
 * Input: nums = [4,5,6,7,0,1,2], target = 3
 * Output: -1
 */
public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;
        int m = nums.length / 2;
        int ret = -1;

        while (l <= r) {
            int ln = nums[l];
            int rn = nums[r];
            int mn = nums[m];

            if (mn == target) {
                ret = m;
                break;
            } else if (ln == target) {
                ret = l;
                break;
            } else if (rn == target) {
                ret = r;
                break;
            }
            if (l == r) {
                break;
            }
            if (mn > ln) {
                if (mn > target && ln < target) {
                    r = m;
                } else {
                    l = m;
                }
            } else {
                if (mn < target && ln > target) {
                    l = m;
                } else {
                    r = m;
                }
            }
            m = (r + l) / 2;
        }

        return ret;
    }
}