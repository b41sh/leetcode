package leetcode.tp.sortColors;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 75. Sort Colors
 */
public class SortColorsTest {
    @Test
    public void test() {

        System.out.println("SortColorsTest");

        SortColors solution = new SortColors();

        int[] nums = new int[] {2,0,2,1,1,0};
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.print("\n");

        solution.sortColors(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.print("\n");

        System.out.println("======");

        nums = new int[] {2,0,1};
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.print("\n");

        solution.sortColors(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.print("\n");

        System.out.println("======");

        nums = new int[] {2,1,2};
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.print("\n");

        solution.sortColors(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.print("\n");

        System.out.println("======");

        nums = new int[] {1,0,2};
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.print("\n");

        solution.sortColors(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.print("\n");

        System.out.println("======");

        nums = new int[] {1,1,0,1,2,0,0,2,0,0,2,0};
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.print("\n");

        solution.sortColors(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.print("\n");

    }
}