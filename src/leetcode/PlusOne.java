package leetcode.plusOne;

// Source : https://leetcode.com/problems/plus-one/
// Author : Shen Bai
// Date   : 2018-05-28

/**
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 * Example 1:
 * Input: [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Example 2:
 * Input: [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {

        int digit = 0;
        int carrier = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            digit = digits[i] + carrier;
            if (digit >= 10) {
                digits[i] = digit % 10;
                carrier = 1;
            } else {
                digits[i] = digit;
                carrier = 0;
                break;
            }
        }

        if (carrier == 1) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            for (int i = 1; i < digits.length - 1; i++) {
                newDigits[i] = digits[i - 1];
            }
            digits = newDigits;
        }

        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }

        return digits;
    }
}