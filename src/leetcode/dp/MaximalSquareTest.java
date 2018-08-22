package leetcode.dp.maximalSquare;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 221. Maximal Square
 */
public class MaximalSquareTest {
    @Test
    public void test() {

        System.out.println("MaximalSquareTest");

        MaximalSquare solution = new MaximalSquare();

        char[][] matrix = new char[][] {
            {'1','0','1','0','0'},
            {'1','0','1','1','1'},
            {'1','1','1','1','1'},
            {'1','0','0','1','0'}};

        int ret = 0;
        ret = solution.maximalSquare(matrix);
        System.out.println(ret);
        Assert.assertTrue(new Integer(ret).equals(4));

        char[][] matrix1 = new char[][] {
                {'1','0','1','0'},
                {'1','0','1','1'},
                {'1','0','1','1'},
                {'1','1','1','1'}};
        ret = solution.maximalSquare(matrix1);
        System.out.println(ret);
        Assert.assertTrue(new Integer(ret).equals(4));


        char[][] matrix2 = new char[][] {
                {'0','0','1','0'},
                {'1','1','1','1'},
                {'1','1','1','1'},
                {'1','1','1','0'},
                {'1','1','0','0'},
                {'1','1','1','1'},
                {'1','1','1','0'}};
        ret = solution.maximalSquare(matrix2);
        System.out.println(ret);
        Assert.assertTrue(new Integer(ret).equals(9));
    }
}

