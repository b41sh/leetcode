package leetcode.contest.contest106;

// Source : https://leetcode.com/contest/weekly-contest-106
// Author : Shen Bai
// Date   : 2018-10-14

import java.util.LinkedList;
import java.util.Queue;
import leetcode.TreeNode;
import java.util.Stack;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

/**
 * Weekly Contest 106
 *
 */
public class Contest106 {

    public int[] sortArrayByParityII(int[] A) {

        int j = 0;
        int k = 1;
        int[] A2 = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                A2[j] = A[i];
                j += 2;
            } else {
                A2[k] = A[i];
                k += 2;
            }
        }

        return A2;
    }


    public int minAddToMakeValid(String S) {

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else if (!stack.empty() && stack.peek() == '(') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.size();
    }

    public int threeSumMulti(int[] A, int target) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < A.length; i++) {
            if (map.containsKey(A[i])) {
                map.put(A[i], map.get(A[i]) + 1);
            } else {
                map.put(A[i], 1);
            }
        }

        int i = 0;
        int[] A2 = new int[map.size()];
        for (Integer key : map.keySet()) {
            A2[i] = key;
            i++;
        }
        Arrays.sort(A2);
        long total = 0l;
        long kMod = 1000000007l;
        for (i = 0; i < A2.length; i++) {
            int j = i;
            int k = A2.length - 1;
            while (j <= k) {
                int a = A2[i];
                int b = A2[j];
                int c = A2[k];
                if (a + b + c > target) {
                    k--;
                } else if (a + b + c < target) {
                    j++;
                } else {
                    j++;
                    k--;
                    if (a == b && b == c) {
                        if (map.get(a) < 3) {
                            continue;
                        }
                        total += getCombineCount(map.get(a), 3) % kMod;
                    } else if (a == b) {
                        if (map.get(a) < 2) {
                            continue;
                        }
                        total += getCombineCount(map.get(a), 2) * map.get(c) % kMod;
                    } else if (b == c) {
                        if (map.get(b) < 2) {
                            continue;
                        }
                        total += getCombineCount(map.get(b), 2) * map.get(a) % kMod;
                    } else {
                        total += map.get(a) * map.get(b) * map.get(c) % kMod;
                    }
                }
            }
        }

        return (int)total;
    }

    public long getCombineCount(int m, int n) {
        long result = 0l;

        if (m == n) {
            result = 1l;
        } else if (m == n + 1) {
            result = (long)m;
        } else if (m > n + 1) {
            long numerator = 1l;
            for (int i = n; i > 0; i--) {
                numerator = numerator * i;
            }
            long denominator = 1l;
            for (int j = m; j > m - n; j--) {
                denominator = denominator * j;
            }
            result = denominator / numerator;
        } else {
            result = 0;
        }

        return result;
    }

}
