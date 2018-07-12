package leetcode.tp.validPalindrome;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 125. Valid Palindrome
 */
public class ValidPalindromeTest {

    @Test
    public void test() {

        System.out.println("ValidPalindromeTest");

        ValidPalindrome solution = new ValidPalindrome();

        String s = "A man, a plan, a canal: Panama";
        boolean ret = false;
        ret = solution.isPalindrome(s);
        System.out.println(ret);
        Assert.assertTrue(new Boolean(ret).equals(true));

        s = "race a car";
        ret = solution.isPalindrome(s);
        System.out.println(ret);
        Assert.assertTrue(new Boolean(ret).equals(false));

    }
}