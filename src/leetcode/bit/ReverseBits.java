package leetcode.bit.reverseBits;

// Source : https://leetcode.com/problems/reverse-bits
// Author : Shen Bai
// Date   : 2018-10-29

/**
 * Reverse bits of a given 32 bits unsigned integer.
 *
 * Example:
 *
 * Input: 43261596
 * Output: 964176192
 * Explanation: 43261596 represented in binary as 00000010100101000001111010011100,
 *              return 964176192 represented in binary as 00111001011110000010100101000000.
 * Follow up:
 * If this function is called many times, how would you optimize it?
 *
 */

public class ReverseBits {

    public int reverseBits(int n) {

        int ret = 0;
        for (int i = 31; i >= 0; i--) {
            int mask = 1 << i;
            int bit = (n & mask) != 0 ? 1 : 0;
            if (bit == 1) {
                ret += 1 << (31 - i);
            }
        }
        return ret;
    }
}

