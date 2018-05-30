package leetcode.sqrtx;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 69. Sqrt(x)
 */
public class SqrtxTest {

    @Test
    public void test() {

        System.out.println("SqrtxTest");

        Sqrtx solution = new Sqrtx();

        int x = 8;
        int ret = 0;
        while (x <= 100) {
            ret = solution.mySqrt(x);
            System.out.println("x=" + x + " ret=" + ret);
            x++;
        }
    }
}