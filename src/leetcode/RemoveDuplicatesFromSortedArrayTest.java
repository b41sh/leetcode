package leetcode.removeDuplicatesFromSortedArray;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 26. Remove Duplicates from Sorted Array
 */
public class RemoveDuplicatesFromSortedArrayTest {
    @Test
    public void test() {

        System.out.println("RemoveDuplicatesFromSortedArrayTest");

        RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();
        int[] nums = new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        for (int i = 0; i < nums.length; i++) {
            System.out.println("before nums=" + nums[i]);
        }

        int retNums = solution.removeDuplicates(nums);
        System.out.println("retNums val=" + retNums);
        for (int i = 0; i < retNums; i++) {
            System.out.println("after nums=" + nums[i]);
        }
    }
}