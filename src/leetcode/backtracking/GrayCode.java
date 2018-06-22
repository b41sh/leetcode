package leetcode.backtracking.grayCode;

// Source : https://leetcode.com/problems/gray-code/
// Author : Shen Bai
// Date   : 2018-06-22

import java.util.ArrayList;
import java.util.List;

/**
 * The gray code is a binary numeral system where two successive values differ in only one bit.
 * Given a non-negative integer n representing the total number of bits in the code, print the sequence of gray code. A gray code sequence must begin with 0.
 * For example, given n = 2, return [0,1,3,2]. Its gray code sequence is:
 * 00 - 0
 * 01 - 1
 * 11 - 3
 * 10 - 2
 * Note:
 * For a given n, a gray code sequence is not uniquely defined.
 * For example, [0,2,3,1] is also a valid gray code sequence according to the above definition.
 * For now, the judge is able to judge based on one instance of gray code sequence. Sorry about that.
 */

public class GrayCode {

    public List<Integer> grayCode(int n) {

        List<Integer> list = new ArrayList<Integer>();
        if (n == 0) {
            list.add(0);
            return list;
        }
        List<String> codes = _grayCode(n);
        for (int i = 0; i < codes.size(); i++) {
            list.add(Integer.valueOf(codes.get(i), 2));
        }
        return list;
    }

    private List<String> _grayCode(int n) {
        List<String> codes = new ArrayList<String>();
        if (n == 1) {
            codes.add("0");
            codes.add("1");
            return codes;
        }

        List<String> subCodes = _grayCode(n - 1);
        for (int i = 0; i < subCodes.size(); i++) {
            codes.add("0" + subCodes.get(i));
        }
        for (int i = subCodes.size() - 1; i >= 0; i--) {
            codes.add("1" + subCodes.get(i));
        }

        return codes;
    }

    // 1ms solution
    public List<Integer> grayCode1(int n) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0 ; i < 1<<n ; i++) {
            System.out.print(Integer.toBinaryString(i) + "^");
            System.out.print(Integer.toBinaryString(i>>1) + "=");
            System.out.print(Integer.toBinaryString(i^i>>1));
            System.out.print("\n");
            result.add(i^i>>1);
        }
        return result;
    }
}