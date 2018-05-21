package leetcode.trappingRainWater;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 42. Trapping Rain Water
 */
public class TrappingRainWaterTest {
    @Test
    public void test() {

        System.out.println("TrappingRainWaterTest");

        TrappingRainWater solution = new TrappingRainWater();

        int[] height = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        int ret = 0;
        ret = solution.trap(height);
        System.out.println("ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(6));
    }
}