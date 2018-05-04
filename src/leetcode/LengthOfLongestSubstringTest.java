package leetcode.lengthOfLongestSubstring;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 03. Length Of Longest Substring Without Repeating Characters    
 */
public class LengthOfLongestSubstringTest {

    @Test
    public void test() {

        System.out.println("LengthOfLongestSubstringTest");

        LengthOfLongestSubstring solution = new LengthOfLongestSubstring();

        String s = "abcd";
        int len = solution.lengthOfLongestSubstring(s);
        System.out.println("string is " + s + " len is " + len);
        Assert.assertTrue(new Integer(len).equals(4));
    }
}
