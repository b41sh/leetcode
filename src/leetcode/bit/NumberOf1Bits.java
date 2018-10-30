package leetcode.bit.numberOf1Bits;

// Source : https://leetcode.com/problems/reverse-bits
// Author : Shen Bai
// Date   : 2018-10-29

/**
 * Write a function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).
 *
 * Example 1:
 *
 * Input: 11
 * Output: 3
 * Explanation: Integer 11 has binary representation 00000000000000000000000000001011
 * Example 2:
 *
 * Input: 128
 * Output: 1
 * Explanation: Integer 128 has binary representation 00000000000000000000000010000000
 */

public class NumberOf1Bits {

    public int hammingWeight(int n) {

        int ret = 0;
        for (int i = 0; i < 32; i++) {
            int mask = 1 << i;
            ret += (n & mask) != 0 ? 1 : 0;
        }
        return ret;
    }
}
