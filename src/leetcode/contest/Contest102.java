package leetcode.contest.contest102;

// Source : https://leetcode.com/contest/weekly-contest-102
// Author : Shen Bai
// Date   : 2018-09-21

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
 * Weekly Contest 102
 *
 */
public class Contest102 {

    public int totalFruit(int[] tree) {
        if (tree.length <= 2) {
            return tree.length;
        }
        int i = 1;
        while (i < tree.length) {
            if (tree[0] == tree[i]) {
                i++;
            } else {
                break;
            }
        }
        if (i == tree.length) {
            return i;
        }
        int f0 = tree[i];
        int f1 = tree[0];
        int f2 = tree[i];
        int p0 = i;
        int p1 = 0;
        int p2 = i;
        int distance = p2 - p1 + 1;
        int max = distance;
        for (int j = i + 1; j < tree.length; j++) {
            if (tree[j] != f1 && tree[j] != f2) {
                max = Math.max(distance, max);
                p1 = p0;
                p2 = j;
                f1 = f0;
                f2 = tree[j];
                p0 = p2;
                f0 = f2;
                distance = p2 - p1 + 1;
            } else {
                if (tree[j] != f0) {
                    p0 = j;
                    f0 = tree[j];
                }
                distance++;
            }
        }
        max = Math.max(distance, max);

        return max;
    }


    public int[] sortArrayByParity(int[] A) {
        int l = 0;
        int r = A.length - 1;
        while (l < r) {
            if (A[l] % 2 == 0) {
                l++;
            } else {
                int tmp = A[l];
                A[l] = A[r];
                A[r] = tmp;
                r--;
            }
        }

        return A;
    }
}
