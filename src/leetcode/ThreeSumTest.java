package leetcode.threeSum;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Test for 15. 3Sum
 */
public class ThreeSumTest {
    @Test
    public void test() {

        System.out.println("ThreeSumTest");

        ThreeSum solution = new ThreeSum();

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int[] nums = new int[6];
        nums[0] = -1;
        nums[1] = 0;
        nums[2] = 1;
        nums[3] = 2;
        nums[4] = -1;
        nums[5] = 4;

        result = solution.threeSum(nums);
        System.out.println(result);

        nums[0] = 0;
        nums[1] = 0;
        nums[2] = 5;
        nums[3] = 1;
        nums[4] = 0;
        nums[5] = 4;

        result = solution.threeSum(nums);
        System.out.println(result);

        int[] nums1 = new int[3];
        nums1[0] = 0;
        nums1[1] = 0;
        nums1[2] = 0;
        result = solution.threeSum(nums1);
        System.out.println(result);
    }
}
