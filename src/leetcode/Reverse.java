package leetcode.reverse;

// Source : https://leetcode.com/problems/reverse/
// Author : Shen Bai
// Date   : 2018-05-03

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * Example 1:
 * Input: 123
 * Output: 321
 * Example 2:
 * Input: -123
 * Output: -321
 * Example 3:
 * Input: 120
 * Output: 21
 * Note:
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */
public class Reverse {

    /**
     * don't forget check max value of int
     * @todo use int
     */
    public int reverse(int x) {

        if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
            return 0;
        }
        long xl = (long) x;

        boolean isNegtive = false;
        if (xl < 0) {
            xl = xl * -1;
            isNegtive = true;
        }
        long tmp = xl;
        long plus = 1;
        while (tmp >= 10) {
            tmp = tmp / 10;
            plus *= 10;
        }

        long a = 0l;
        long b = 0l;
        long ret = 0l;
        while (xl > 0) {
            a = xl / 10;
            b = xl % 10;
            xl = a;
            ret += b * plus;
            plus /= 10;
        }

        if (isNegtive) {
            ret = ret * -1;
        }

        if (ret > Integer.MAX_VALUE || ret < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) ret;
    }
}
