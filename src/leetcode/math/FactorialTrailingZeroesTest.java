package leetcode.math.factorialTrailingZeroes;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 172. Factorial Trailing Zeroes
 */
public class FactorialTrailingZeroesTest {
    @Test
    public void test() {

        System.out.println("FactorialTrailingZeroesTest");

        FactorialTrailingZeroes solution = new FactorialTrailingZeroes();

        int n = 30;
        int ret = solution.trailingZeroes(n);
        System.out.println("ret=" + ret);
        //Assert.assertTrue(new Integer(ret).equals(1));
    }
}
