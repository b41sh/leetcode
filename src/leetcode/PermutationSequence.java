package leetcode.permutationSequence;

// Source : https://leetcode.com/problems/permutation-sequence/
// Author : Shen Bai
// Date   : 2018-05-24

/**
 * The set [1,2,3,...,n] contains a total of n! unique permutations.
 * By listing and labeling all of the permutations in order, we get the following sequence for n = 3:
 * "123"
 * "132"
 * "213"
 * "231"
 * "312"
 * "321"
 * Given n and k, return the kth permutation sequence.
 * Note:
 * Given n will be between 1 and 9 inclusive.
 * Given k will be between 1 and n! inclusive.
 * Example 1:
 * Input: n = 3, k = 3
 * Output: "213"
 * Example 2:
 * Input: n = 4, k = 9
 * Output: "2314"
 */
public class PermutationSequence {

    public String getPermutation(int n, int k) {

        int[] factorial = new int[n];
        factorial[0] = 1;
        for(int i = 1; i < n; i++) {
            factorial[i] = factorial[i - 1] * i;
        }

        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = i + 1;
        }

        k--;
        StringBuilder sb = new StringBuilder();
        for(int i = n; i >= 1; i--) {
            int j = k / factorial[i - 1];
            k %= factorial[i - 1];
            sb.append(num[j]);

            int m = 0;
            int[] newNum = new int[i - 1];
            for (int l = 0; l < i - 1; l++) {
                if (m == j) {
                    m++;
                }
                newNum[l] = num[m];
                m++;
            }

            num = newNum;
        }

        return sb.toString();
    }
}