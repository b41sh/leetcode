package leetcode.powx;

// Source : https://leetcode.com/problems/powx-n/
// Author : Shen Bai
// Date   : 2018-06-03

/**
 * Implement pow(x, n), which calculates x raised to the power n (xn).
 * Example 1:
 * Input: 2.00000, 10
 * Output: 1024.00000
 * Example 2:
 * Input: 2.10000, 3
 * Output: 9.26100
 * Example 3:
 * Input: 2.00000, -2
 * Output: 0.25000
 * Explanation: 2-2 = 1/22 = 1/4 = 0.25
 * Note:
 * -100.0 < x < 100.0
 * n is a 32-bit signed integer, within the range [−231, 231 − 1]
 */

public class Powx {

    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return x;
        }
        boolean isFalse = false;
        boolean isMinValue = false;
        if (n == -2147483648) {
            n = 2147483647;
            isFalse = true;
            isMinValue = true;
        } else if (n < 0) {
            n = Math.abs(n);
            isFalse = true;
        }
        double ret = myPow(x, n / 2);
        if (n % 2 == 1) {
            ret = ret * ret * x;
        } else {
            ret = ret * ret;
        }
        if (isMinValue) {
            ret = 1 / (ret * x);
        } else if (isFalse) {
            ret = 1 / ret;
        }
        return ret;
    }
}