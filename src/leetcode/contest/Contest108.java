package leetcode.contest.contest108;

// Source : https://leetcode.com/contest/weekly-contest-108
// Author : Shen Bai
// Date   : 2018-10-29

import java.util.*;

/**
 * Weekly Contest 108
 *
 */
public class Contest108 {

    public int numUniqueEmails(String[] emails) {

        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < emails.length; i++) {
            String email = emails[i];
            StringBuilder sb = new StringBuilder();
            boolean isLocalName = true;
            boolean isIgnore = false;
            for (int j = 0; j < email.length(); j++) {
                char c = email.charAt(j);
                if (isLocalName) {
                    if (!isIgnore) {
                        if (c == '.') {
                            continue;
                        } else if (c == '+') {
                            isIgnore = true;
                        } else if (c == '@') {
                            isLocalName = false;
                        } else {
                            sb.append(c);
                        }
                    } else {
                        if (c == '@') {
                            isLocalName = false;
                        }
                    }
                } else {
                    sb.append(c);
                }
            }
            set.add(sb.toString());
        }
        return set.size();
    }


    public int numSubarraysWithSum(int[] A, int S) {

        int oneCnt = 0;
        int zeroCnt = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 1) {
                oneCnt++;
            } else {
                zeroCnt++;
            }
        }
        if (oneCnt < S) {
            return 0;
        }
        if (S == 0) {
            int totalZero = 0;
            int tmpZero = 0;
            for (int i = 0; i < A.length; i++) {
                if (A[i] == 0) {
                    tmpZero++;
                } else {
                    while (tmpZero > 0) {
                        totalZero += tmpZero;
                        tmpZero--;
                    }
                    tmpZero = 0;
                }
            }
            while (tmpZero > 0) {
                totalZero += tmpZero;
                tmpZero--;
            }
            return totalZero;
        }

        int total = 0;
        int i = 0;
        int j = 0;
        int tmpOneCnt = 0;
        while (j < A.length) {
            if (tmpOneCnt == S) {
                break;
            }
            if (A[j] == 1) {
                tmpOneCnt++;
            }
            j++;
        }
        int tmpLeft = 0;
        int tmpRight = 0;
        while (i < A.length && j <= A.length) {
            while (i < A.length && A[i] == 0) {
                tmpLeft++;
                i++;
            }
            while (j < A.length && A[j] == 0) {
                tmpRight++;
                j++;
            }
            total += (tmpLeft + 1) * (tmpRight + 1);
            tmpLeft = 0;
            tmpRight = 0;
            i++;
            j++;
        }

        return total;
    }

    // Conciseness
    public int numSubarraysWithSum2(int[] A, int S) {

        int[] num = new int[A.length + 1];
        int sum = 0;
        int n = 0;
        for (int i = 0; i < A.length; i++) {
            num[n]++;
            n += A[i];
            if (n - S >= 0) {
                sum += num[n - S];
            }
        }

        return sum;
    }

    public int minFallingPathSum(int[][] A) {

        int[][] B = new int[A.length][A[0].length];
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                B[i][j] = Integer.MAX_VALUE;
            }
        }
        int minSum = Integer.MAX_VALUE;
        for (int j = 0; j < A[0].length; j++) {
            int sum = A[0][j] + _minFallingPathSum(A, B, 1, j);
            minSum = Math.min(sum, minSum);
        }
        return minSum;
    }

    private int _minFallingPathSum(int[][] A, int[][] B, int i, int j) {
        if (i >= A.length) {
            return 0;
        }
        int leftSum = 0;
        int rightSum = 0;
        int midSum = 0;
        if (B[i][j] == Integer.MAX_VALUE) {
            B[i][j] = _minFallingPathSum(A, B, i + 1, j);
        }
        midSum = A[i][j] + B[i][j];
        int minSum = midSum;
        if (j - 1 >= 0) {
            if (B[i][j - 1] == Integer.MAX_VALUE) {
                B[i][j - 1] = _minFallingPathSum(A, B, i + 1, j - 1);
            }
            leftSum = A[i][j - 1] + B[i][j - 1];
            minSum = Math.min(leftSum, minSum);
        }
        if (j + 1 < A[i].length) {
            if (B[i][j + 1] == Integer.MAX_VALUE) {
                B[i][j + 1] = _minFallingPathSum(A, B, i + 1, j + 1);
            }
            rightSum = A[i][j + 1] + B[i][j + 1];
            minSum = Math.min(rightSum, minSum);
        }
        return minSum;
    }

    // dp
    public int minFallingPathSum2(int[][] A) {

        int[] dp = new int[A[0].length];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = A[0][i];
        }
        for (int i = 1; i < A.length; i++) {
            int[] dp2 = new int[A[0].length];
            for (int j = 0; j < A[0].length; j++) {
                int min = Integer.MAX_VALUE;
                for (int k = Math.max(0, j - 1); k <= Math.min(A[0].length - 1, j + 1); k++) {
                    min = Math.min(min, dp[k]);
                }
                dp2[j] = min + A[i][j];
            }
            dp = dp2;
        }
        int ret = Integer.MAX_VALUE;
        for (int i = 0; i < dp.length; i++) {
            ret = Math.min(ret, dp[i]);
        }

        return ret;
    }
}
