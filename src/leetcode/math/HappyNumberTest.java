package leetcode.math.happyNumber;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 202. Happy Number
 */
public class HappyNumberTest {
    @Test
    public void test() {

        System.out.println("HappyNumberTest");

        HappyNumber solution = new HappyNumber();

        int n = 19;
        boolean ret = solution.isHappy(n);
        System.out.println("ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(true));
    }
}
