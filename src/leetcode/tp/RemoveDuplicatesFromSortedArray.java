package leetcode.tp.removeDuplicatesFromSortedArray;

// Source : https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Author : Shen Bai
// Date   : 2018-05-10

// Source : https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
// Author : Shen Bai
// Date   : 2018-06-09

/**
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 */

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {

        int len = nums.length;
        if (len <= 1) {
            return len;
        }
        int j = 1;
        int num = 0;
        int first = nums[0];
        for (int i = 1; i < len; i++) {
            num = nums[i];
            if (first != num) {
                nums[j] = num;
                first = nums[i];
                j++;
            }
        }

        return j;
    }

    public int removeDuplicatesII(int[] nums) {

        int len = nums.length;
        if (len <= 2) {
            return len;
        }
        int j = 2;
        int num = 0;
        int first = nums[0];
        int second = nums[1];
        for (int i = 2; i < len; i++) {
            num = nums[i];
            if (first != second || (first == second && first != num)) {
                nums[j] = num;
                j++;
                first = second;
                second = num;
            }
        }

        return j;
    }
}