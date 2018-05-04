package leetcode.fourSum;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Test for 18. 4Sum
 */
public class FourSumTest {
    @Test
    public void test() {

        System.out.println("FourSumTest");

        FourSum solution = new FourSum();

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int[] nums = new int[6];
        int target = 0;
        nums[0] = 1;
        nums[1] = 0;
        nums[2] = -1;
        nums[3] = 0;
        nums[4] = -2;
        nums[5] = 2;
        target = 0;
        result = solution.fourSum(nums, target);
        System.out.println(result);

        nums[0] = 0;
        nums[1] = 0;
        nums[2] = 5;
        nums[3] = -1;
        nums[4] = 0;
        nums[5] = -4;

        target = 0;
        result = solution.fourSum(nums, target);
        System.out.println(result);

        int[] nums1 = new int[8];
        nums1[0] = 0;
        nums1[1] = 0;
        nums1[2] = 0;
        nums1[3] = 0;
        nums1[4] = 0;
        nums1[5] = 0;
        nums1[6] = 0;
        nums1[7] = 0;
        target = 0;
        result = solution.fourSum(nums1, target);
        System.out.println(result);
    }
}
