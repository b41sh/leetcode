package leetcode.multiplyStrings;

// Source : https://leetcode.com/problems/multiply-strings/
// Author : Shen Bai
// Date   : 2018-05-21

/**
 * Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.
 * Example 1:
 * Input: num1 = "2", num2 = "3"
 * Output: "6"
 * Example 2:
 * Input: num1 = "123", num2 = "456"
 * Output: "56088"
 * Note:
 * The length of both num1 and num2 is < 110.
 * Both num1 and num2 contain only digits 0-9.
 * Both num1 and num2 do not contain any leading zero, except the number 0 itself.
 * You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */
public class MultiplyStrings {

    public String multiply(String num1, String num2) {

        int l1 = num1.length();
        int l2 = num2.length();
        if (l1 == 0 || l2 == 0) {
            return "";
        }
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        StringBuilder num = new StringBuilder(l1 * l2 + 1);
        for (int i = 0; i < l1 * l2 + 1; i++) {
            num.append('0');
        }
        int off1 = 0;
        int off2 = 0;
        int off = 0;
        int n1 = 0;
        int n2 = 0;
        int oldNum = 0;
        int curNum = 0;
        int newNum = 0;
        int nextNum = 0;
        for (int j = l1 - 1; j >= 0; j--) {
            n1 = num1.charAt(j) - 48;
            off2 = 0;
            for (int k = l2 - 1; k >= 0; k--) {
                n2 = num2.charAt(k) - 48;
                if (n1 > 0 && n2 > 0) {
                    newNum = (n1 * n2) % 10;
                    nextNum = (n1 * n2) / 10;
                    off = off1 + off2;
                    while (true) {
                        oldNum = num.charAt(off) - 48;
                        curNum = (newNum + oldNum) % 10;
                        num.replace(off, off + 1, String.valueOf(curNum));
                        nextNum = (newNum + oldNum) / 10 + nextNum;
                        if (nextNum == 0) {
                            break;
                        }
                        newNum = nextNum % 10;
                        nextNum = nextNum / 10;
                        off++;
                    }
                }
                off2++;
            }
            off1++;
        }
    
        for (int m = num.length() - 1; m >=0; m--) {
            if (num.charAt(m) == '0') {
                continue;
            } else {
                num.delete(m + 1, num.length());
                break;
            }
        }

        return num.reverse().toString();
    }
}
