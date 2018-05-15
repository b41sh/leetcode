package leetcode.nextPermutation;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 31. Next Permutation
 */
public class NextPermutationTest {
    @Test
    public void test() {

        System.out.println("NextPermutationTest");

        NextPermutation solution = new NextPermutation();

        int[] nums = {8, 7, 6, 5, 4, 3, 2, 1};
        System.out.print("before nums=");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(" " + nums[i]);
        }
        System.out.print("\n");
        solution.nextPermutation(nums);
        System.out.print(" after nums=");
        for (int j = 0; j < nums.length; j++) {
            System.out.print(" " + nums[j]);
        }
        System.out.print("\n");
            
        System.out.println("=================");

        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 5;
        nums[4] = 5;
        nums[5] = 5;
        nums[6] = 5;
        nums[7] = 4;
        System.out.print("before nums=");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(" " + nums[i]);
        }
        System.out.print("\n");
        solution.nextPermutation(nums);
        System.out.print(" after nums=");
        for (int j = 0; j < nums.length; j++) {
            System.out.print(" " + nums[j]);
        }
        System.out.print("\n");

        System.out.println("=================");

        int[] nums1 = {1, 3, 5, 7, 9, 8, 6, 4, 2};
        System.out.print("before nums=");
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(" " + nums1[i]);
        }
        System.out.print("\n");
        solution.nextPermutation(nums1);
        System.out.print(" after nums=");
        for (int j = 0; j < nums1.length; j++) {
            System.out.print(" " + nums1[j]);
        }
        System.out.print("\n");


        System.out.println("=================");

        int[] nums2 = {5, 4, 7, 5, 3, 2};
        System.out.print("before nums=");
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(" " + nums2[i]);
        }
        System.out.print("\n");
        solution.nextPermutation(nums2);
        System.out.print(" after nums=");
        for (int j = 0; j < nums2.length; j++) {
            System.out.print(" " + nums2[j]);
        }
        System.out.print("\n");


        System.out.println("=================");

        /**
        2 2 7 5 4 3 2 2 1
        0 1 2 3 4 5 6 7 8
      -1                8
      -1              7
      -1            6 
          1       5
          1     4
          1   3
          1 2
        */

        int[] nums3 = {2, 2, 7, 5, 4, 3, 2, 2, 1};
        System.out.print("before nums=");
        for (int i = 0; i < nums3.length; i++) {
            System.out.print(" " + nums3[i]);
        }
        System.out.print("\n");
        solution.nextPermutation(nums3);
        System.out.print(" after nums=");
        for (int j = 0; j < nums3.length; j++) {
            System.out.print(" " + nums3[j]);
        }
        System.out.print("\n");
    }
}
