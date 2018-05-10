package leetcode.removeElement;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 27. Remove Element
 */
public class RemoveElementTest {
    @Test
    public void test() {

        System.out.println("RemoveElementTest");

        RemoveElement solution = new RemoveElement();
        int[] nums = new int[] {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        for (int i = 0; i < nums.length; i++) {
            System.out.println("before nums=" + nums[i]);
        }

        int retNums = solution.removeElement(nums, val);
        System.out.println("retNums val=" + retNums);
        for (int i = 0; i < retNums; i++) {
            System.out.println("after nums=" + nums[i]);
        }
    }
}