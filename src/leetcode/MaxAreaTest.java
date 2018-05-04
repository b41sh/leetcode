package leetcode.maxArea;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 11. Container With Most Water
 */
public class MaxAreaTest {
    @Test
    public void test() {

        System.out.println("MaxAreaTest");

        int a = 10;
        int b = 3;
        int c = a / b;
        System.out.println("c is " + c);
        b = 4;
        c = a / b;
        System.out.println("c is " + c);

        MaxArea solution = new MaxArea();

        int[] nums = new int[2];
        nums[0] = 1;
        nums[1] = 1;

        int ret = solution.maxArea(nums);
        System.out.println(ret);
        Assert.assertTrue(new Integer(ret).equals(1));
    }
}
