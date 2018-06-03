package leetcode.powx;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 50. Pow(x, n)
 */
public class PowxTest {

    @Test
    public void test() {

        System.out.println("PowxTest");

        Powx solution = new Powx();

        double x = 2;
        int n = 10;
        double ret = solution.myPow(x, n);
        System.out.println("x=" + x + " n=" + n + " ret=" + ret);

        x = 2.1;
        n = 3;
        ret = solution.myPow(x, n);
        System.out.println("x=" + x + " n=" + n + " ret=" + ret);

        x = 2;
        n = -2;
        ret = solution.myPow(x, n);
        System.out.println("x=" + x + " n=" + n + " ret=" + ret);

        x = 10;
        n = Integer.MAX_VALUE;
        ret = solution.myPow(x, n);
        System.out.println("x=" + x + " n=" + n + " ret=" + ret);

        x = 10;
        n = Integer.MIN_VALUE;
        ret = solution.myPow(x, n);
        System.out.println("x=" + x + " n=" + n + " ret=" + ret);


        x = 2;
        n = 2147483647;
        ret = solution.myPow(x, n);
        System.out.println("x=" + x + " n=" + n + " ret=" + ret);

        x = 2;
        n = -2147483648;
        ret = solution.myPow(x, n);
        System.out.println("x=" + x + " n=" + n + " ret=" + ret);

        x = 1;
        n = -2147483648;
        ret = solution.myPow(x, n);
        System.out.println("x=" + x + " n=" + n + " ret=" + ret);

        x = -1;
        n = -2147483648;
        ret = solution.myPow(x, n);
        System.out.println("x=" + x + " n=" + n + " ret=" + ret);

    }
}
