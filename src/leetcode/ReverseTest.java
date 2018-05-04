package leetcode.reverse;

import org.junit.Assert;
import org.junit.Test;

public class ReverseTest {
    @Test
    public void test() {

        System.out.println("ReverseTest");

        Reverse solution = new Reverse();

        int num = 0;
        int ret = 0;

        num = -12342121;
        ret = solution.reverse(num);
        System.out.println(ret);
        Assert.assertTrue(new Integer(ret).equals(-12124321));

        num = 10;
        ret = solution.reverse(num);
        System.out.println(ret);
        Assert.assertTrue(new Integer(ret).equals(1));

        num = 1534236469;
        ret = solution.reverse(num);
        System.out.println(ret);
        Assert.assertTrue(new Integer(ret).equals(0));
    }
}
