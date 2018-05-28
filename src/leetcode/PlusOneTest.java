package leetcode.plusOne;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 65. Plus One
 */
public class PlusOneTest {

    @Test
    public void test() {

        System.out.println("PlusOneTest");

        PlusOne solution = new PlusOne();

        //int[] digits = new int[]{1, 2, 3, 4};
        int[] digits = new int[]{9, 9, 8};
        int[] retDigits = solution.plusOne(digits);
    }
}