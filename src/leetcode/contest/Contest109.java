package leetcode.contest.contest109;

// Source : https://leetcode.com/contest/weekly-contest-109
// Author : Shen Bai
// Date   : 2018-11-04

import java.util.*;

/**
 * Weekly Contest 109
 *
 */
public class Contest109 {

    public class RecentCounter {

        private Queue<Integer> queue;
        private int sum;

        public RecentCounter() {
            queue = new LinkedList<Integer>();
            sum = 0;
        }

        public int ping(int t) {
            int lastT = t - 3001;
            if (lastT >= 0) {
                while (queue.size() > 0) {
                    if (queue.peek() <= lastT) {
                        queue.poll();
                        sum--;
                    } else {
                        break;
                    }
                }
            }
            queue.offer(t);
            sum++;
            return sum;
        }
    }

    // timeout
    private long[] cnt;
    private int[][] state;
    private long kMod;
    private Map<String, Long> map;

    public int knightDialer0(int N) {
        if (N == 0) {
            return 0;
        } else if (N == 1) {
            return 10;
        }

        kMod = 1000000007l;
        cnt = new long[10];
        cnt[0] = 2l;
        cnt[1] = 2l;
        cnt[2] = 2l;
        cnt[3] = 2l;
        cnt[4] = 3l;
        cnt[5] = 0l;
        cnt[6] = 3l;
        cnt[7] = 2l;
        cnt[8] = 2l;
        cnt[9] = 2l;

        state = new int[][]{
                {4, 6},
                {6, 8},
                {7, 9},
                {4, 8},
                {0, 3, 9},
                {},
                {0, 1, 7},
                {2, 6},
                {1, 3},
                {2, 4},
        };
        map = new HashMap<String, Long>();

        long total = 0;
        for (int i = 0; i < 10; i++) {
            total += cal(i, N) % kMod;
        }
        total = total % kMod;
        System.out.println(total);
        return (int) total;
    }

    private long cal(int currState, int n) {
        if (n == 2) {
            return cnt[currState];
        }
        StringBuilder sb = new StringBuilder();
        sb.append(currState);
        sb.append("_");
        sb.append(n);
        String key = sb.toString();
        if (map.containsKey(key)) {
            return map.get(key);
        }

        long total = 0;
        for (int i = 0; i < state[currState].length; i++) {
            total += cal(state[currState][i], n - 1) % kMod;
        }
        map.put(key, total);
        return total;
    }


    public int knightDialer(int N) {
        N--;
        long[] dp = new long[10];
        long kMod = 1000000007l;
        Arrays.fill(dp, 1l);
        for (int i = 0; i < N; i++) {
            long[] ndp = new long[10];
            ndp[0] = dp[4] + dp[6];
            ndp[1] = dp[6] + dp[8];
            ndp[2] = dp[7] + dp[9];
            ndp[3] = dp[4] + dp[8];
            ndp[4] = dp[0] + dp[3] + dp[9];
            ndp[6] = dp[0] + dp[1] + dp[7];
            ndp[7] = dp[2] + dp[6];
            ndp[8] = dp[1] + dp[3];
            ndp[9] = dp[2] + dp[4];
            for (int j = 0; j < 10; j++) {
                ndp[j] %= kMod;
            }
            dp = ndp;
        }
        long total = 0l;
        for (int i = 0; i < 10; i++) {
            total += dp[i];
        }

        return (int)(total % kMod);
    }
}
