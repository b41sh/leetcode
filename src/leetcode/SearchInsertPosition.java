package leetcode.searchInsertPosition;

// Source : https://leetcode.com/problems/search-insert-position/
// Author : Shen Bai
// Date   : 2018-05-17

/**
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * You may assume no duplicates in the array.
 * Example 1:
 * Input: [1,3,5,6], 5
 * Output: 2
 * Example 2:
 * Input: [1,3,5,6], 2
 * Output: 1
 * Example 3:
 * Input: [1,3,5,6], 7
 * Output: 4
 * Example 4:
 * Input: [1,3,5,6], 0
 * Output: 0
 */
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }

        int l = 0;
        int r = nums.length - 1;
        int m = 0;
        int num = 0;
        while (l + 1 < r) {
            m = (l + r) / 2;
            num = nums[m];
            if (num < target) {
                l = m;
            } else if (num > target) {
                r = m;
            } else {
                return m;
            }
        }
        if (target > nums[r]) {
            return r + 1;
        } else if (target == nums[r]) {
            return r;
        } else if (target > nums[l] && target < nums[r]) {
            return l + 1;
        } else {
            return l;
        }
    }
}