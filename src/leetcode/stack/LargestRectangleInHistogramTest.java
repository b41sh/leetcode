package leetcode.stack.largestRectangleInHistogram;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 84. Largest Rectangle in Histogram
 */
public class LargestRectangleInHistogramTest {
    @Test
    public void test() {

        System.out.println("LargestRectangleInHistogramTest");

        LargestRectangleInHistogram solution = new LargestRectangleInHistogram();

        int[] heights = new int[]{2,1,5,6,2,3};
        int ret = 0;
        ret = solution.largestRectangleArea(heights); 
        System.out.println("ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(10));

        heights = new int[]{999,999,999,999};
        ret = solution.largestRectangleArea(heights); 
        System.out.println("ret=" + ret);
//        Assert.assertTrue(new Integer(ret).equals(10));

    }
}