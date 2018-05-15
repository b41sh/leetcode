package leetcode.nextPermutation;

// Source : https://leetcode.com/problems/next-permutation/
// Author : Shen Bai
// Date   : 2018-05-15

/**
 * Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
 * If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).
 * The replacement must be in-place and use only constant extra memory.
 * Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
 *
 * 1,2,3 → 1,3,2
 * 3,2,1 → 1,2,3
 * 1,1,5 → 1,5,1
 */

import java.util.Arrays;

public class NextPermutation {

    public void nextPermutation(int[] nums) {
        if (nums.length <= 1) {
            return;
        }
        int depth = 0;
        int[] position = {0, 0};

        rearrange(nums, 0, nums.length - 1, depth, position);
    }

    private void rearrange(int[] nums, int start, int end, int depth, int[] position) {
        if (start >= end) {
            return;
        }

        int num = nums[end];
        int index = end - 1;
        while (index >= start) {
            if (nums[index] < num) {
                break;
            }
            index--;
        }
        position[0] = index;
        position[1] = end;
        rearrange(nums, index + 1, end - 1, depth + 1, position);

        if (position[0] > index) {
            index = position[0];
            end = position[1];
        } else if (position[0] == index) {
            if (nums[position[1]] < nums[end]) {
                end = position[1];
            }
        }
        position[0] = index;
        position[1] = end;

        if (depth == 0) {
            if (index == -1) {
                Arrays.sort(nums);
            } else {
                int indexNum = nums[index];
                nums[index] = nums[end];
                nums[end] = indexNum;
                Arrays.sort(nums, index + 1, nums.length);
            }
        }

        return;
    }
}
