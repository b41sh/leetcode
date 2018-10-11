package leetcode.design.minStack;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 155. Min Stack
 */
public class MinStackTest {

    @Test
    public void test() {

        System.out.println("MinStackTest");

        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        int min = minStack.getMin();
        System.out.println("min=" + min);
        Assert.assertTrue(new Integer(min).equals(-3));
        minStack.pop();
        int top = minStack.top();
        System.out.println("top=" + top);
        Assert.assertTrue(new Integer(top).equals(0));
        min = minStack.getMin();
        System.out.println("min=" + min);
        Assert.assertTrue(new Integer(min).equals(-2));

    }
}
