package leetcode.threeSumClosest;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 16. 3Sum Closest
 */
public class ThreeSumClosestTest {
    @Test
    public void test() {

        System.out.println("ThreeSumClosestTest");

        ThreeSumClosest solution = new ThreeSumClosest();

        int[] nums = new int[]{-1, 2, 1, 4};
        int target = 1;
        int ret;
        ret = solution.threeSumClosest(nums, target);
        System.out.println(ret);
        Assert.assertTrue(new Integer(ret).equals(2));
    }
}
