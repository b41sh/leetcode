package leetcode.removeDuplicatesFromSortedArray;

// Source : https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Author : Shen Bai
// Date   : 2018-05-10

/**
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 */

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {

        int j = 0;
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                num = nums[i];
                j++;
            } else {
                if (num != nums[i]) {
                    nums[j] = nums[i];
                    num = nums[i];
                    j++;
                }
            }
        }

        return j;
    }
}