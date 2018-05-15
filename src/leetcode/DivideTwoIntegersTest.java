package leetcode.divideTwoIntegers;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 29. Divide Two Integers
 */
public class DivideTwoIntegersTest {
    @Test
    public void test() {

        System.out.println("DivideTwoIntegersTest");

        DivideTwoIntegers solution = new DivideTwoIntegers();

        int dividend = 0;
        int divisor = 1;
        int ret = 0;

        dividend = 10;
        divisor = 3;
        ret = solution.divide(dividend, divisor);
        System.out.println("dividend=" + dividend + " divisor=" + divisor + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(3));

        dividend = 7;
        divisor = -3;
        ret = solution.divide(dividend, divisor);
        System.out.println("dividend=" + dividend + " divisor=" + divisor + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(-2));

        dividend = 999990;
        divisor = 6;
        ret = solution.divide(dividend, divisor);
        System.out.println("dividend=" + dividend + " divisor=" + divisor + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(166665));

        dividend = Integer.MIN_VALUE;
        divisor = 2;
        ret = solution.divide(dividend, divisor);
        System.out.println("dividend=" + dividend + " divisor=" + divisor + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(-1073741824));

        dividend = Integer.MAX_VALUE;
        divisor = 1;
        ret = solution.divide(dividend, divisor);
        System.out.println("dividend=" + dividend + " divisor=" + divisor + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(2147483647));

        dividend = Integer.MIN_VALUE;
        divisor = 1;
        ret = solution.divide(dividend, divisor);
        System.out.println("dividend=" + dividend + " divisor=" + divisor + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(-2147483648));

        dividend = 1;
        divisor = 1;
        ret = solution.divide(dividend, divisor);
        System.out.println("dividend=" + dividend + " divisor=" + divisor + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(1));

        dividend = 0;
        divisor = 1;
        ret = solution.divide(dividend, divisor);
        System.out.println("dividend=" + dividend + " divisor=" + divisor + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(0));

        dividend = -2147483648;
        divisor = -1;
        ret = solution.divide(dividend, divisor);
        System.out.println("dividend=" + dividend + " divisor=" + divisor + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(2147483647));
    }
}
