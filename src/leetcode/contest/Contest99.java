package leetcode.contest.contest99;

// Source : https://leetcode.com/contest/weekly-contest-99
// Author : Shen Bai
// Date   : 2018-08-26

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import leetcode.TreeNode;

/**
 * Weekly Contest 99
 *
 */
public class Contest99 {

    public int surfaceArea(int[][] grid) {

        if (grid == null || grid.length == 0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int[] x = new int[m];
        int[] y = new int[n];

        int area = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    area += 2;
                }
                if (x[i] < grid[i][j]) {
                    area += Math.abs(grid[i][j] - x[i]);
                }
                x[i] = grid[i][j];
                if (y[j] < grid[i][j]) {
                    area += Math.abs(grid[i][j] - y[j]);
                }
                y[j] = grid[i][j];
            }
        }

        Arrays.fill(x, 0);
        Arrays.fill(y, 0);
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (x[i] < grid[i][j]) {
                    area += Math.abs(grid[i][j] - x[i]);
                }
                x[i] = grid[i][j];
                if (y[j] < grid[i][j]) {
                    area += Math.abs(grid[i][j] - y[j]);
                }
                y[j] = grid[i][j];
            }
        }

        return area;
    }

    public int numSpecialEquivGroups(String[] A) {

        Map<String, String> map = new HashMap<String, String>();
        int num = 0;
        for (int i = 0; i < A.length; i++) {
            int len = A[i].length();
            char[] a = new char[len];
            char[] b = new char[len];
            int m = 0;
            int n = 0;
            for (int j = 0; j < len; j++) {
                if (j % 2 == 0) {
                    a[m] = A[i].charAt(j);
                    m++;
                } else {
                    b[n] = A[i].charAt(j);
                    n++;
                }
            }
            Arrays.sort(a);
            Arrays.sort(b);
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append(b);
            if (!map.containsKey(sb.toString())) {
                map.put(sb.toString(), sb.toString());
                num++;
            }
        }
        return num;

    }

    public List<TreeNode> allPossibleFBT(int N) {
        List<TreeNode> list = new ArrayList<TreeNode>();
        if (N == 1) {
            TreeNode node = new TreeNode(0);
            list.add(node);
            return list;
        } else if (N == 3) {
            TreeNode node = new TreeNode(0);
            node.left = new TreeNode(0);
            node.right = new TreeNode(0);
            list.add(node);
            return list;
        }

        int num = 1;
        int subNum = N - 1;
        while (num < subNum) {
            List<TreeNode> subList1 = allPossibleFBT(num);
            List<TreeNode> subList2 = allPossibleFBT(subNum - num);
            for (TreeNode subNode1 : subList1) {
                for (TreeNode subNode2 : subList2) {
                    TreeNode node = new TreeNode(0);
                    node.left = subNode1;
                    node.right = subNode2;
                    list.add(node);
                }
            }
            num += 2;
        }

        return list;
    }
}