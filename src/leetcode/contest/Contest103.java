package leetcode.contest.contest103;

// Source : https://leetcode.com/contest/weekly-contest-103
// Author : Shen Bai
// Date   : 2018-09-23

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
 * Weekly Contest 103
 *
 */
public class Contest103 {

    public int smallestRangeI(int[] A, int K) {
        if (A.length <= 1) {
            return 0;
        }
        int min = Math.min(A[0], A[1]);
        int max = Math.max(A[0], A[1]);
        for (int i = 2; i < A.length; i++) {
            min = Math.min(A[i], min);
            max = Math.max(A[i], max);
        }

        if (max - min <= 2 * K) {
            return 0;
        } else {
            return max - min - 2 * K;
        }
    }

    public int smallestRangeII(int[] A, int K) {

        if (A.length <= 1) {
            return 0;
        }
        Arrays.sort(A);
        int len = A.length;
        int ret = A[len - 1] - A[0];
        for (int i = 0; i < len - 1; i++) {
            ret = Math.min(ret, Math.max(A[len - 1], A[i] + 2 * K) - Math.min(A[i + 1], A[0] + 2 * K));
        }
        return ret;
    }
}
