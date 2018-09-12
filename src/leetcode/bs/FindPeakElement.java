package leetcode.bs.findPeakElement;

// Source : https://leetcode.com/problems/find-peak-element
// Author : Shen Bai
// Date   : 2018-09-12

/**
 * A peak element is an element that is greater than its neighbors.
 *
 * Given an input array nums, where nums[i] ≠ nums[i+1], find a peak element and return its index.
 *
 * The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.
 *
 * You may imagine that nums[-1] = nums[n] = -∞.
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,1]
 * Output: 2
 * Explanation: 3 is a peak element and your function should return the index number 2.
 * Example 2:
 *
 * Input: nums = [1,2,1,3,5,6,4]
 * Output: 1 or 5
 * Explanation: Your function can return either index number 1 where the peak element is 2,
 *              or index number 5 where the peak element is 6.
 * Note:
 *
 * Your solution should be in logarithmic complexity.
 */

public class FindPeakElement {

    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    
    public int findPeakElement0(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int left = 1;
        int right = nums.length - 2;
        int ret = _findPeakElement(nums, left, right);
        if (ret == -1) {
            if (nums[0] > nums[1]) {
                return 0;
            } else {
                return nums.length - 1;
            }
        } else {
            return ret;
        }
    }

    private int _findPeakElement(int[] nums, int left, int right) {
        if (left < 1 || left > nums.length - 2 || right < 1 || right > nums.length - 2) {
            return -1;
        } else if (right - left <= 1) {
            if (nums[left] > nums[left - 1] && nums[left] > nums[left + 1]) {
                return left;
            } else if (nums[right] > nums[right - 1] && nums[right] > nums[right + 1]) {
                return right;
            } else {
                return -1;
            }
        }

        int i1 = -1;
        int i2 = -1;
        int mid = left + (right - left) / 2;
        if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
            return mid;
        } else if (nums[mid] > nums[mid - 1] && nums[mid] < nums[mid + 1]) {
            i1 = _findPeakElement(nums, left, mid - 2);
            if (i1 > 0) {
                return i1;
            }
            i2 = _findPeakElement(nums, mid + 1, right);
        } else if (nums[mid] < nums[mid - 1] && nums[mid] > nums[mid + 1]) {
            i1 = _findPeakElement(nums, left, mid - 1);
            if (i1 > 0) {
                return i1;
            }
            i2 = _findPeakElement(nums, mid + 2, right);
        } else {
            i1 = _findPeakElement(nums, left, mid - 1);
            if (i1 > 0) {
                return i1;
            }
            i2 = _findPeakElement(nums, mid + 1, right);
        }
        return i2;
    }
}
