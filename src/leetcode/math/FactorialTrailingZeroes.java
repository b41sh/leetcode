package leetcode.math.factorialTrailingZeroes;

// Source : https://leetcode.com/problems/factorial-trailing-zeroes
// Author : Shen Bai
// Date   : 2018-09-21

/**
 * Given an integer n, return the number of trailing zeroes in n!.
 *
 * Example 1:
 *
 * Input: 3
 * Output: 0
 * Explanation: 3! = 6, no trailing zero.
 * Example 2:
 *
 * Input: 5
 * Output: 1
 * Explanation: 5! = 120, one trailing zero.
 * Note: Your solution should be in logarithmic time complexity.
 *
 */

public class FactorialTrailingZeroes {

    public int trailingZeroes(int n) {
        int total = 0;
        int cnt = n / 5;
        while (cnt > 0) {
            total += cnt;
            cnt /= 5;
        }
        return total;
    }
}
