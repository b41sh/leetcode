package leetcode.removeElement;

// Source : https://leetcode.com/problems/remove-element/
// Author : Shen Bai
// Date   : 2018-05-10

/**
 * Given an array nums and a value val, remove all instances of that value in-place and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int j = 0;
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            if (val != nums[i]) {
                nums[j] = nums[i];
                num = nums[i];
                j++;
            }
        }

        return j;
    }
}