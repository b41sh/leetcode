package leetcode.array.pascalsTriangle;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

/**
 * Test for 118. Pascal's Triangle
 * Test for 119. Pascal's Triangle II
 */
public class PascalsTriangleTest {
    @Test
    public void test() {

        System.out.println("PascalsTriangleTest");

        PascalsTriangle solution = new PascalsTriangle();

        int numRows = 5;
        List<List<Integer>> ret = solution.generate(numRows);
        System.out.println(ret);

        int rowIndex = 3;
        List<Integer> ret1 = solution.getRow(rowIndex);
        System.out.println(ret1);

    }
}