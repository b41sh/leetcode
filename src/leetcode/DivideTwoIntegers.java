package leetcode.divideTwoIntegers;

// Source : https://leetcode.com/problems/divide-two-integers/
// Author : Shen Bai
// Date   : 2018-05-15

/**
 * Given two integers dividend and divisor, divide two integers without using multiplication, division and mod operator.
 * Return the quotient after dividing dividend by divisor.
 * The integer division should truncate toward zero.
 *
 * Example 1:
 *
 * Input: dividend = 10, divisor = 3
 * Output: 3
 * Example 2:
 * 
 * Input: dividend = 7, divisor = -3
 * Output: -2
 * Note:
 *
 * Both dividend and divisor will be 32-bit signed integers.
 * The divisor will never be 0.
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 231 − 1 when the division result overflows.
 *
 */

public class DivideTwoIntegers {

    public int divide(int dividend, int divisor) {

        boolean isNegative = false;
        if ((dividend > 0 && divisor < 0)
            || (dividend < 0 && divisor > 0)) {
            isNegative = true;
        }
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        if (a < b) {
            return 0;
        }
        long m = 1l;
        long ret = 1l;
        while (a > b) {
            if (b << 1 > a) {
                break;
            }
            b = b << 1;
            m = m << 1;
        }
        long bb = b;
        ret = m;
        while (bb > 0) {
            bb = bb >> 1;
            m = m >> 1;
            if (b + bb <= a) {
                b += bb;
                ret += m;
            }
        }
        if (!isNegative) {
            if (ret > Integer.MAX_VALUE) {
                ret = Integer.MAX_VALUE;
            }
            return (int) ret;
        } else {
            return (int) -ret;
        }
    }
}