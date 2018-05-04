package leetcode.longestPalindrome;

/**
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 * Example 1:
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 * Example 2:
 * Input: "cbbd"
 * Output: "bb"
 */
public class LongestPalindrome {

    public String longestPalindrome(String s) {

        byte[] bs = s.getBytes();
        int l = bs.length;

        int max = 0;
        int cMax = 0;
        int n = 0;
        int n1 = 0;
        int n2 = 0;
        int beg = 0;
        int end = 0;
        while (n <= l - 1) {
            cMax = 0;
            n1 = n;
            n2 = n;
            while (n1 >= 0 && n2 <= l - 1) {
                if (bs[n1] == bs[n2]) {
                    cMax++;
                    if (n1 != n) {
                        cMax++;
                    }
                    if (cMax > max) {
                        max = cMax;
                        beg = n1;
                        end = n2;
                    }
                    n1--;
                    n2++;
                } else {
                    break;
                }
            }

            cMax = 0;
            n1 = n;
            n2 = n + 1;
            while (n1 >= 0 && n2 <= l - 1) {
                if (bs[n1] == bs[n2]) {
                    cMax++;
                    cMax++;
                    if (cMax > max) {
                        max = cMax;
                        beg = n1;
                        end = n2;
                    }
                    n1--;
                    n2++;
                } else {
                    break;
                }
            }

            n++;
        }

        int j = 0;
        byte[] ret = new byte[end - beg + 1];
        for (int i = beg; i <= end; i++) {
            ret[j] = bs[i];
            j++;
        }

        return new String(ret);
    }
}
