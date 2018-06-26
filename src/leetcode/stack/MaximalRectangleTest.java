package leetcode.stack.maximalRectangle;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 85. Maximal Rectangle
 */
public class MaximalRectangleTest {
    @Test
    public void test() {

        System.out.println("MaximalRectangleTest");

        MaximalRectangle solution = new MaximalRectangle();

        char[][] matrix = new char[][]{
            {'1','0','1','0','0'},
            {'1','0','1','1','1'},
            {'1','1','1','1','1'},
            {'1','0','0','1','0'}
        };

        int ret = 0;
        ret = solution.maximalRectangle(matrix);
        System.out.println("ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(6));

    }
}