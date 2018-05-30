package leetcode.sqrtx;

// Source : https://leetcode.com/problems/sqrtx/
// Author : Shen Bai
// Date   : 2018-05-30

/**
 * Implement int sqrt(int x).
 * Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
 * Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.
 * Example 1:
 * Input: 4
 * Output: 2
 * Example 2:
 * Input: 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842..., and since 
 *             the decimal part is truncated, 2 is returned.
 */

public class Sqrtx {

    public int mySqrt(int x) {

        if (x <= 1) {
            return x;
        } else if (x >= 2147395600) {
            return 46340;
        }
        int start = 0;
        int end = x >> 1;
        end++;
        int mid = 0;
        while (start < end) {
            mid = start + (end - start) / 2;
            if (x / mid == mid) {
                return mid;
            } else if (x / mid < mid) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if (x >= end * end) {
            return end;
        } else {
            return end - 1;
        }
    }
}