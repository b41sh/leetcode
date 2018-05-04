package leetcode.isPalindrome;

import org.junit.Assert;
import org.junit.Test;

public class IsPalindromeTest {
    @Test
    public void test() {

        System.out.println("IsPalindromeTest");

        IsPalindrome solution = new IsPalindrome();

        int x = 0;
        boolean ret = true;

        x = 12321;
        ret = solution.isPalindrome(x);
        System.out.println(ret);
        Assert.assertTrue(new Boolean(ret).equals(true));

        x = 123321;
        ret = solution.isPalindrome(x);
        System.out.println(ret);
        Assert.assertTrue(new Boolean(ret).equals(true));

        x = 1213321;
        ret = solution.isPalindrome(x);
        System.out.println(ret);
        Assert.assertTrue(new Boolean(ret).equals(false));

        x = 1000000001;
        ret = solution.isPalindrome(x);
        System.out.println(ret);
        Assert.assertTrue(new Boolean(ret).equals(true));
    }
}
