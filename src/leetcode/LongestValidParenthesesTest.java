package leetcode.longestValidParentheses;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 32. Longest Valid Parentheses
 */
public class LongestValidParenthesesTest {
    @Test
    public void test() {

        System.out.println("LongestValidParenthesesTest");
        LongestValidParentheses solution = new LongestValidParentheses();

        String s = "";
        int ret = 0;

        s = "(()";
        ret = solution.longestValidParentheses(s);
        System.out.println("str=" + s + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(2));

        s = ")()())";
        ret = solution.longestValidParentheses(s);
        System.out.println("str=" + s + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(4));

        s = "(((()(())()))))))(())";
        ret = solution.longestValidParentheses(s);
        System.out.println("str=" + s + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(14));

        s = "(()()";
        ret = solution.longestValidParentheses(s);
        System.out.println("str=" + s + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(4));


        s = "()(()";
        ret = solution.longestValidParentheses(s);
        System.out.println("str=" + s + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(2));

    }
}
