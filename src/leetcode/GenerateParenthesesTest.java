package leetcode.generateParentheses;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Test for 22. Generate Parentheses
 */
public class GenerateParenthesesTest {

    @Test
    public void test() {
        System.out.println("GenerateParenthesesTest");

        GenerateParentheses solution = new GenerateParentheses();
        int n = 3;
        System.out.println("n = " + n);
        List<String> items = solution.generateParenthesis(n);
        items.forEach(item -> {
            System.out.println(item);
        });

        n = 4;
        System.out.println("n = " + n);
        items = solution.generateParenthesis(n);
        items.forEach(item -> {
            System.out.println(item);
        });

    }
}
