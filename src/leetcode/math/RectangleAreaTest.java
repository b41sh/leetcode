package leetcode.math.rectangleArea;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 223. Rectangle Area
 */
public class RectangleAreaTest {
    @Test
    public void test() {

        System.out.println("RectangleAreaTest");

        RectangleArea solution = new RectangleArea();

        int A = -3;
        int B = 0;
        int C = 3;
        int D = 4;
        int E = 0;
        int F = -1;
        int G = 9;
        int H = 2;

        int ret = solution.computeArea(A, B, C, D, E, F, G, H);
        System.out.println("ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(45));
    }
}
