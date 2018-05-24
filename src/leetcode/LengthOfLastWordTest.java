package leetcode.lengthOfLastWord;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 58. Length of Last Word
 */
public class LengthOfLastWordTest {

    @Test
    public void test() {

        System.out.println("LengthOfLastWordTest");

        LengthOfLastWord solution = new LengthOfLastWord();

        String s = "Hello World";
        int ret = solution.lengthOfLastWord(s);
        System.out.println("s=" + s + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(5));

        String s1 = "a ";
        int ret1 = solution.lengthOfLastWord(s1);
        System.out.println("s=" + s1 + " ret=" + ret1);
        Assert.assertTrue(new Integer(ret1).equals(1));

    }
}