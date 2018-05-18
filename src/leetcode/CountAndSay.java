package leetcode.countAndSay;

// Source : https://leetcode.com/problems/count-and-say/
// Author : Shen Bai
// Date   : 2018-05-17

/**
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * Given an integer n, generate the nth term of the count-and-say sequence.
 * Note: Each term of the sequence of integers will be represented as a string.
 * Example 1:
 * Input: 1
 * Output: "1"
 * Example 2:
 * Input: 4
 * Output: "1211"
 */
public class CountAndSay {

    public String countAndSay(int n) {
        if (n <= 1) {
            return "1";
        }
        int count = 0;
        int num = -1;
        int lastNum = -1;
        String s = "1";
        for (int i = 2; i <= n; i++) {
            count = 0;
            lastNum = -1;
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < s.length(); j++) {
                num = s.charAt(j) - 48;
                if (lastNum == -1 || lastNum == num) {
                    count++;
                } else {
                    sb.append(count);
                    sb.append(lastNum);
                    count = 1;
                }
                lastNum = num;
            }
            if (count > 0) {
                sb.append(count);
                sb.append(lastNum);
            }
            s = sb.toString();
        }
        return s;
    }
}
