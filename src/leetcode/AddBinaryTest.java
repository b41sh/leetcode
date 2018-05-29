package leetcode.addBinary;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 67. Add Binary
 */
public class AddBinaryTest {

    @Test
    public void test() {

        System.out.println("AddBinaryTest");

        AddBinary solution = new AddBinary();

        String a = "1010";
        String b = "1011";
        String ret = "";
        ret = solution.addBinary(a, b);
        System.out.println("ret=" + ret);
        Assert.assertTrue(ret.equals("10101"));
    }
}
