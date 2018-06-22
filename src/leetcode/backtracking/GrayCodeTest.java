package leetcode.backtracking.grayCode;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

/**
 * Test for 89. Gray Code
 */
public class GrayCodeTest {
    @Test
    public void test() {

        System.out.println("GrayCodeTest");

        GrayCode solution = new GrayCode();

        int n = 5;
        List<Integer> ret = new ArrayList<Integer>();
        ret = solution.grayCode(n);
        System.out.println(ret);
        ret = solution.grayCode1(n);
        System.out.println(ret);
    }
}
