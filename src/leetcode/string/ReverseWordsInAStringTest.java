package leetcode.string.reverseWordsInAString;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 151. Reverse Words in a String
 */
public class ReverseWordsInAStringTest {
    @Test
    public void test() {

        System.out.println("ReverseWordsInAStringTest");

        ReverseWordsInAString solution = new ReverseWordsInAString();

        String s = "the sky is blue";
        String ret = solution.reverseWords(s);
        System.out.println(ret);
        Assert.assertTrue(ret.equals("blue is sky the"));
    }
}

