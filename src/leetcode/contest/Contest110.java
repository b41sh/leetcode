package leetcode.contest.contest110;

// Source : https://leetcode.com/contest/weekly-contest-110
// Author : Shen Bai
// Date   : 2018-11-12

import leetcode.TreeNode;
import java.util.*;

/**
 * Weekly Contest 110
 *
 */
public class Contest110 {

    public String[] reorderLogFiles(String[] logs) {

        int len = logs.length;
        int k = len - 1;
        Map<String, String> map = new HashMap<String, String>();
        List<String> list = new ArrayList<String>();
        String[] newLogs = new String[len];
        for (int i = len - 1; i >= 0; i--) {
            String log = logs[i];
            String[] parts = log.split(" ");
            if (parts[1].charAt(0) >= '0' && parts[1].charAt(0) <= '9') {
                newLogs[k] = log;
                k--;
            } else {
                StringBuilder sb = new StringBuilder();
                for (int j = 1; j < parts.length; j++) {
                    sb.append(parts[j]);
                    sb.append(" ");
                }
                String key = sb.toString();
                list.add(key);
                map.put(key, log);
            }
        }
        Collections.sort(list);
        int i = 0;
        for (String key : list) {
            newLogs[i] = map.get(key);
            i++;
        }

        return newLogs;
    }

    public int rangeSumBST(TreeNode root, int L, int R) {

        int sum = 0;
        sum += _rangeSumBST(root.left, L, R, Integer.MIN_VALUE, root.val);
        sum += _rangeSumBST(root.right, L, R, root.val, Integer.MAX_VALUE);
        if (root.val >= L && root.val <= R) {
            sum += root.val;
        }

        return sum;
    }

    private int _rangeSumBST(TreeNode root, int L, int R, int min, int max) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        if (root.val >= L && root.val <= R) {
            sum += root.val;
        }
        if (root.val > L && root.val > min) {
            sum += _rangeSumBST(root.left, L, R, min, root.val);
        }
        if (root.val < R && root.val < max) {
            sum += _rangeSumBST(root.right, L, R, root.val, max);
        }

        return sum;
    }

    public int minAreaRect(int[][] points) {

        if (points.length < 4) {
            return 0;
        }
        Set<Long> set = new HashSet<Long>();
        for (int i = 0; i < points.length; i++) {
            long key = (long) points[i][0] << 32 | points[i][1];
            set.add(key);
        }
        int minArea = Integer.MAX_VALUE;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                int area = Math.abs((points[i][0] - points[j][0]) * (points[i][1] - points[j][1]));
                if (area == 0) {
                    continue;
                }
                long key1 = (long) points[i][0] << 32 | points[j][1];
                if (!set.contains(key1)) {
                    continue;
                }
                long key2 = (long) points[j][0] << 32 | points[i][1];
                if (!set.contains(key2)) {
                    continue;
                }
                minArea = Math.min(area, minArea);
            }
        }
        if (minArea == Integer.MAX_VALUE) {
            return 0;
        }
        return minArea;
    }

    // timeout
    public int distinctSubseqII(String S) {

        Set<String> set = new HashSet<String>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            Set<String> newSet = new HashSet<String>();
            for (String s : set) {
                StringBuilder sb = new StringBuilder();
                sb.append(s);
                sb.append(c);
                newSet.add(s);
                newSet.add(sb.toString());
            }
            newSet.add(Character.toString(c));
            set = newSet;
        }

        return set.size();
    }
}
