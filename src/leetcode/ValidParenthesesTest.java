package leetcode.validParentheses;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 20. Valid Parentheses
 */
public class ValidParenthesesTest {
    @Test
    public void test() {

        System.out.println("ValidParenthesesTest");

        ValidParentheses solution = new ValidParentheses();
        String s = "";
        boolean isValid = false;

        s = "()[]{}";
        isValid = solution.isValid(s);
        System.out.println("string=" + s + "isValid=" + isValid);
        Assert.assertTrue(new Boolean(isValid).equals(true));

        s = "{()()[(())][]}((()))";
        isValid = solution.isValid(s);
        System.out.println("string=" + s + "isValid=" + isValid);
        Assert.assertTrue(new Boolean(isValid).equals(true));

        s = "()[)]]";
        isValid = solution.isValid(s);
        System.out.println("string=" + s + "isValid=" + isValid);
        Assert.assertTrue(new Boolean(isValid).equals(false));

    }
}