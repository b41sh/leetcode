package leetcode.contest.contest124;

// Source : https://leetcode.com/contest/weekly-contest-124
// Author : Shen Bai
// Date   : 2019-02-17
// Rank   : 1718 / 4174

import leetcode.TreeNode;
import java.util.*;

/**
 * Weekly Contest 124
 * 
 */
public class Contest124 {

    private Map<Integer, Integer> mapH = new HashMap<Integer, Integer>();
    private Map<Integer, Integer> mapP = new HashMap<Integer, Integer>();
    
    public boolean isCousins(TreeNode root, int x, int y) {
        this.mapH = new HashMap<Integer, Integer>();
        this.mapP = new HashMap<Integer, Integer>();
        dfs(root, x, y, -1);
        if (mapH.get(x) == mapH.get(y) && mapP.get(x) != mapP.get(y)) {
            return true;
        }
        return false;
    }
    
    private void dfs(TreeNode node, int x, int y, int h) {
        if (mapH.size() == 2) {
            return;
        }
        h++;
        if (node.left != null) {
            if (node.left.val == x) {
                mapH.put(x, h);
                mapP.put(x, node.val);
            }
            if (node.left.val == y) {
                mapH.put(y, h);
                mapP.put(y, node.val);
            }
            dfs(node.left, x, y, h);
        }
        if (node.right != null) {
            if (node.right.val == x) {
                mapH.put(x, h);
                mapP.put(x, node.val);
            }
            if (node.right.val == y) {
                mapH.put(y, h);
                mapP.put(y, node.val);
            }
            dfs(node.right, x, y, h);
        }
    }


    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<Integer> queue = new LinkedList<Integer>();
        Set<Integer> set = new HashSet<Integer>();       
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int pos = i * n + j;
                if (grid[i][j] == 1) {
                    set.add(pos);
                } else if (grid[i][j] == 2) {
                    queue.offer(pos);
                }
            }
        }
        int cnt = 0;
        while (queue.size() > 0) {
            int size = queue.size();
            boolean hasNew = false;
            while (size > 0) {
                int pos = queue.poll();
                int x = pos / n;
                int y = pos % n;
                int pos1 = (x - 1) * n + y;
                int pos2 = (x + 1) * n + y;
                int pos3 = x * n + y - 1;
                int pos4 = x * n + y + 1;
                
                if (x > 0 && set.contains(pos1)) {
                    set.remove(pos1);
                    queue.offer(pos1);
                    hasNew = true;
                }
                if (x < m - 1 && set.contains(pos2)) {
                    set.remove(pos2);
                    queue.offer(pos2);
                    hasNew = true;
                }
                if (y > 0 && set.contains(pos3)) {
                    set.remove(pos3);
                    queue.offer(pos3);
                    hasNew = true;
                }
                if (y < n - 1 && set.contains(pos4)) {
                    set.remove(pos4);
                    queue.offer(pos4);
                    hasNew = true;
                }
                size--;
            }
            if (hasNew == true) {
                cnt++;
            }
        }
        if (set.size() > 0) {
            return -1;
        }
        return cnt;
    }

    public int minKBitFlips(int[] A, int K) {
        int i = 0;
        int cnt = 0;
        for (; i <= A.length - K; i++) {
            if (A[i] == 0) {
                for (int j = i; j < i + K; j++) {
                    A[j] = 1 - A[j];
                }
                cnt++;
            }
        }
        for (; i < A.length; i++) {
            if (A[i] == 0) {
                return -1;
            }
        }
        return cnt;
    }

}
