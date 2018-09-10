package leetcode.contest.contest101;

// Source : https://leetcode.com/contest/weekly-contest-101
// Author : Shen Bai
// Date   : 2018-09-10

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;
import leetcode.TreeNode;

/**
 * Weekly Contest 101
 *
 */
public class Contest101 {

    public class RLEIterator {
        private int[] list = null;
        private int pos = 0;

        public RLEIterator(int[] A) {
            this.list = A;
        }

        public int next(int n) {
            for (int i = pos; i < list.length; i++) {
                if (i % 2 == 1) {
                    continue;
                }
                if (list[i] >= n) {
                    pos = i;
                    list[i] -= n;
                    return list[i + 1];
                } else {
                    n -= list[i];
                    list[i] = 0;
                }
            }
            pos = list.length;
            return -1;
        }
    }

    // use stack less memory
    public class StockSpanner {

        private int[] prices = null;
        private int[] days = null;
        private int pos = -1;
        public StockSpanner() {
            this.prices = new int[10000];
            this.days = new int[10000];
            this.pos = -1;
        }

        public int next(int price) {
            int day = 1;
            int cur = pos;
            while (cur >= 0) {
                if (prices[cur] > price) {
                    break;
                }
                day += days[cur];
                cur -= days[cur];
            }
            pos++;
            prices[pos] = price;
            days[pos] = day;
            return day;
        }
    }


    public int atMostNGivenDigitSet(String[] D, int N) {
        int n = N;
        int size = Integer.toString(N).length();
        int nums[] = new int[10];
        int j = 0;
        while (n > 0) {
            nums[j] = n % 10;
            n = n / 10;
            j++;
        }
        int cntNums[] = new int[size];
        cntNums[0] = D.length;
        for (int i = 1; i < size; i++) {
            cntNums[i] = cntNums[i - 1] * D.length;
        }
        int total = 0;
        for (int i = 0; i < size - 1; i++) {
            total += cntNums[i];
        }
        total += _getSubCount(D, size - 1, nums, cntNums);
        return total;
    }

    private int _getSubCount(String[] D, int pos, int[] nums, int[] cntNums) {
        if (pos < 0) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < D.length; i++) {
            int nn = D[i].charAt(0) - '0';
            if (pos == 0) {
                if (nn <= nums[pos]) {
                    count++;
                }
            } else {
                if (nn < nums[pos]) {
                    count += cntNums[pos - 1];
                } else if (nn == nums[pos]) {
                    count += _getSubCount(D, pos - 1, nums, cntNums);
                }
            }
        }

        return count;
    }

    public int numPermsDISequence(String S) {

        if (S == null || S.length() == 0) {
            return 0;
        }
        int M = (int)1e9 + 7;
        int len = S.length();
        int[][] dp = new int[len + 1][len + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= len; i++) {
            for (int j = 0; j <= i; j++) {
                if (S.charAt(i - 1) == 'D') {
                    for (int k = j; k < i; k++) {
                        dp[i][j] += dp[i - 1][k];
                        dp[i][j] %= M;
                    }
                } else {
                    for (int k = 0; k < j; k++) {
                        dp[i][j] += dp[i - 1][k];
                        dp[i][j] %= M;
                    }
                }
            }
        }
        int result = 0;
        for (int j = 0; j <= len; j++) {
            result += dp[len][j];
            result %= M;
        }
        return result;
    }

    // wrong answer
    public int numPermsDISequence0(String S) {

        if (S == null || S.length() == 0) {
            return 0;
        }
        int len = S.length() + 1;
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = i;
        }
        int total = 0;
        Map<String, Long> map = new HashMap<String, Long>();
        for (int i = 0; i < len; i++) {
            int num = nums[i];
            nums[i] = -1;
            total += _numPermsDISequence(S, num, nums, map);
            nums[i] = num;
        }

        int M = (int)1e9 + 7;
        return new Long(total).intValue() % M;
    }

    private long _numPermsDISequence(String S, int pre, int[] nums, Map<String, Long> map) {
        StringBuilder sb = new StringBuilder(S);
        sb.append(pre);

        String key = sb.toString();
        if (map.containsKey(key)) {
            return map.get(key);
        }
        long total = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == -1) {
                continue;
            }
            int num = nums[i];
            char direct = S.charAt(0);
            if ((direct == 'D' && num > pre) || (direct == 'I' && num < pre)) {
                continue;
            }
            nums[i] = -1;
            if (S.length() == 1) {
                total += 1;
            } else {
                total += _numPermsDISequence(S.substring(1), num, nums, map);
            }
            nums[i] = num;
        }
        map.put(key, total);

        return total;
    }
}
