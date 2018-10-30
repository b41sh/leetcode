package leetcode.array.rotateArray;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 189. rotate array
 */
public class RotateArrayTest {
    @Test
    public void test() {

        System.out.println("RotateArrayTest");

        RotateArray solution = new RotateArray();

        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        solution.rotate2(nums, k);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("");

        int[] nums1 = new int[]{-1,-100,3,99};
        int k1 = 2;
        solution.rotate2(nums1, k1);
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println("");

        int[] nums2 = new int[]{-1};
        int k2 = 2;
        solution.rotate2(nums2, k2);
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }


    }
}
