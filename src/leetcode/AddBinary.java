package leetcode.addBinary;

// Source : https://leetcode.com/problems/add-binary/
// Author : Shen Bai
// Date   : 2018-05-29

/**
 * Given two binary strings, return their sum (also a binary string).
 * The input strings are both non-empty and contains only characters 1 or 0.
 * Example 1:
 * Input: a = "11", b = "1"
 * Output: "100"
 * Example 2:
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 */

public class AddBinary {

    public String addBinary(String a, String b) {

        int i = a.length() - 1;
        int j = b.length() - 1;
        int n1 = 0;
        int n2 = 0;
        int n = 0;
        int carrier = 0;
        StringBuilder sb = new StringBuilder();
        while (true) {
            n1 = 0;
            n2 = 0;
            if (i >= 0) {
                n1 = (int) a.charAt(i) - 48;
            }
            if (j >= 0) {
                n2 = (int) b.charAt(j) - 48;
            }
            n = n1 + n2 + carrier;
            if (n == 0 || n == 1) {
                sb.append(n);
                carrier = 0;
            } else if (n == 2) {
                sb.append(0);
                carrier = 1;
            } else if (n == 3) {
                sb.append(1);
                carrier = 1;
            }
            i--;
            j--;
            if (i < 0 && j < 0) {
                break;
            }
        }
        if (carrier == 1) {
            sb.append(1);
        }

        return sb.reverse().toString();
    }
}