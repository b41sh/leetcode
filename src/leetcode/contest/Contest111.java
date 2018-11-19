package leetcode.contest.contest111;

// Source : https://leetcode.com/contest/weekly-contest-111
// Author : Shen Bai
// Date   : 2018-11-18

import java.util.*;

/**
 * Weekly Contest 111
 *
 */
public class Contest111 {

    public boolean validMountainArray(int[] A) {
        if (A == null || A.length < 3) {
            return false;
        }
        int len = A.length;
        if (A[0] >= A[1] || A[len - 2] <= A[len - 1]) {
            return false;
        }
        boolean isLeft = true;
        for (int i = 1; i < A.length - 1; i++) {
            if (A[i] > A[i - 1] && A[i] < A[i + 1]) {
                if (!isLeft) {
                    return false;
                }
            } else if (A[i] < A[i - 1] && A[i] > A[i + 1]) {
                if (isLeft) {
                    return false;
                }
            } else if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
                if (isLeft) {
                    isLeft = false;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }


    public int[] diStringMatch(String S) {
        int N = S.length();
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i <= N * 2; i++) {
            map.put(i, new ArrayList<Integer>());
        }
        List<Integer> l0 = map.get(N);
        l0.add(0);
        map.put(N, l0);
        int[] di = new int[N + 1];
        for (int i = 0; i < N; i++) {
            char c = S.charAt(i);
            if (c == 'I') {
                di[i + 1] = di[i] + 1;
            } else {
                di[i + 1] = di[i] - 1;
            }

            List<Integer> l = map.get(di[i + 1] + N);
            l.add(i + 1);
            map.put(di[i + 1] + N, l);
        }
        int n = 0;
        for (int i = 0; i <= N * 2; i++) {
            List<Integer> l = map.get(i);
            for (Integer ll : l) {
                di[ll] = n;
                n++;
            }
        }

        return di;
    }

    public int minDeletionSize(String[] A) {
        int m = A.length;
        int n = A[0].length();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < m; j++) {
                char c = A[j].charAt(i);
                sb.append(c);
            }
            String s = sb.toString();
            char preC = s.charAt(0);
            for (int k = 1; k < s.length(); k++) {
                char c = s.charAt(k);
                if (c < preC) {
                    cnt++;
                    break;
                }
                preC = c;
            }
        }
        return cnt;
    }
}

