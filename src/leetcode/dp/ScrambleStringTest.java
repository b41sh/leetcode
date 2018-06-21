package leetcode.dp.scrambleString;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 87. Scramble String
 */
public class ScrambleStringTest {
    @Test
    public void test() {

        System.out.println("ScrambleStringTest");

        ScrambleString solution = new ScrambleString();

        String s1 = "great";
        String s2 = "rgeat";
        boolean ret = false;

        ret = solution.isScramble(s1, s2);
        System.out.println("s1=" + s1 + " s2=" + s2 + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(true));

        s1 = "abcde";
        s2 = "caebd";
        ret = solution.isScramble(s1, s2);
        System.out.println("s1=" + s1 + " s2=" + s2 + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(false));

        s1 = "abcdefghijklmn";
        s2 = "efghijklmncadb";
        ret = solution.isScramble(s1, s2);
        System.out.println("s1=" + s1 + " s2=" + s2 + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(false));

        s1 = "abb";
        s2 = "bba";
        ret = solution.isScramble(s1, s2);
        System.out.println("s1=" + s1 + " s2=" + s2 + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(true));
    }
}
