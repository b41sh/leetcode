package leetcode.contest.contest125;

// Source : https://leetcode.com/contest/weekly-contest-125
// Author : Shen Bai
// Date   : 2019-02-24

import java.util.*;
import leetcode.TreeNode;

/**
 * Weekly Contest 125
 * 
 */
public class Contest125 {

    public int findJudge(int N, int[][] trust) {
        int[] c1 = new int[N + 1];
        int[] c2 = new int[N + 1];
        for (int i = 0; i < trust.length; i++) {
            c1[trust[i][0]]++;
            c2[trust[i][1]]++;
        }
        for (int i = 1; i <= N; i++) {
            if (c2[i] == N - 1 && c1[i] == 0) {
                return i;
            }
        }
        return -1;
    }


    public int numRookCaptures(char[][] board) {
        int cnt = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != 'R') {
                    continue;
                }
                for (int k = i + 1; k < board.length; k++) {
                    if (board[k][j] == 'B') {
                        break;
                    } else if (board[k][j] == 'p') {
                        cnt++;
                        break;
                    }
                }
                for (int k = i - 1; k >= 0; k--) {
                    if (board[k][j] == 'B') {
                        break;
                    } else if (board[k][j] == 'p') {
                        cnt++;
                        break;
                    }
                }
                for (int k = j + 1; k < board[0].length; k++) {
                    if (board[i][k] == 'B') {
                        break;
                    } else if (board[i][k] == 'p') {
                        cnt++;
                        break;
                    }
                }
                for (int k = j - 1; k >= 0; k--) {
                    if (board[i][k] == 'B') {
                        break;
                    } else if (board[i][k] == 'p') {
                        cnt++;
                        break;
                    }
                }
                break;
            }
        }
        return cnt;
    }

    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        if (root == null || val > root.val) {
            TreeNode node = new TreeNode(val);
            node.left = root;
            return node;
        }
        root.right = insertIntoMaxTree(root.right, val);        
        return root;
    }

    public int[] gridIllumination(int N, int[][] lamps, int[][] queries) {
        Map<Integer, Integer> m1 = new HashMap<Integer, Integer>();
        Map<Integer, Integer> m2 = new HashMap<Integer, Integer>();
        Map<Integer, Integer> m3 = new HashMap<Integer, Integer>();
        Map<Integer, Integer> m4 = new HashMap<Integer, Integer>();
        Set<Long> set = new HashSet<Long>();
        for (int i = 0; i < lamps.length; i++) {
            int x = lamps[i][0];
            int y = lamps[i][1];
            m1.put(x, m1.getOrDefault(x, 0) + 1);
            m2.put(y, m2.getOrDefault(y, 0) + 1);
            m3.put(x - y, m3.getOrDefault(x - y, 0) + 1);
            m4.put(x + y, m4.getOrDefault(x + y, 0) + 1);
            set.add((long) x + 1 << 32 | + y);
        }
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int x = queries[i][0];
            int y = queries[i][1];
            if (m1.containsKey(x) || m2.containsKey(y) ||
                m3.containsKey(x - y) || m4.containsKey(x + y)) {
                ans[i] = 1;
            } else {
                ans[i] = 0;
            }
            for (int j = x - 1; j <= x + 1; j++) { 
                for (int k = y - 1; k <= y + 1; k++) { 
                    if (j < 0 || j >= N || k < 0 || k >= N) {
                        continue;
                    }
                    if (set.contains((long) j + 1 << 32 | + k)) {
                        set.remove((long) j + 1 << 32 | + k);
                        m1.put(j, m1.get(j) - 1);
                        m2.put(k, m2.get(k) - 1);
                        m3.put(j - k, m3.get(j - k) - 1);
                        m4.put(j + k, m4.get(j + k) - 1);
                        if (m1.get(j) == 0) {
                            m1.remove(j);
                        }
                        if (m2.get(k) == 0) {
                            m2.remove(k);
                        }
                        if (m3.get(j - k) == 0) {
                            m3.remove(j - k);
                        }
                        if (m4.get(j + k) == 0) {
                            m4.remove(j + k);
                        }
                    }
                }
            }
        }
        return ans;
    }
}
