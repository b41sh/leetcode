package leetcode.stack.evaluateReversePolishNotation;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 150. Evaluate Reverse Polish Notation
 */
public class EvaluateReversePolishNotationTest {
    @Test
    public void test() {

        System.out.println("EvaluateReversePolishNotationTest");

        EvaluateReversePolishNotation solution = new EvaluateReversePolishNotation();

        int ret = 0;
        String[] tokens = new String[]{"2", "1", "+", "3", "*"};
        ret = solution.evalRPN(tokens);
        System.out.println("ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(9));

        String[] tokens1 = new String[]{"4", "13", "5", "/", "+"};
        ret = solution.evalRPN(tokens1);
        System.out.println("ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(6));

        String[] tokens2 = new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        ret = solution.evalRPN(tokens2);
        System.out.println("ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(22));

    }
}