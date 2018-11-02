package leetcode.bit.bitwiseAndOfNumbersRange;

// Source : https://leetcode.com/problems/repeated-dna-sequences/
// Author : Shen Bai
// Date   : 2018-10-31

/**
 * Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND of all numbers in this range, inclusive.
 *
 * Example 1:
 *
 * Input: [5,7]
 * Output: 4
 * Example 2:
 *
 * Input: [0,1]
 * Output: 0
 */

public class BitwiseAndOfNumbersRange {

    public int rangeBitwiseAnd(int m, int n) {

        int count = 0;
        while (m != n) {
            m >>= 1;
            n >>= 1;
            count++;
        }
        return m <<= count;
    }
}
