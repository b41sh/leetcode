package leetcode.math.majorityElement;

// Source : https://leetcode.com/problems/majority-element/
// Author : Shen Bai
// Date   : 2018-09-21

/**
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 *
 * You may assume that the array is non-empty and the majority element always exist in the array.
 *
 * Example 1:
 *
 * Input: [3,2,3]
 * Output: 3
 * Example 2:
 *
 * Input: [2,2,1,1,1,2,2]
 * Output: 2
 *
 */

public class MajorityElement {

    public int majorityElement(int[] nums) {

        int num = 0;
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num) {
                cnt++;
            } else if (cnt == 0) {
                num = nums[i];
                cnt++;
            } else {
                cnt--;
            }
        }

        return num;
    }
}
