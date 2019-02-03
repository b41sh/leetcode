package leetcode.contest.contest122;

// Source : https://leetcode.com/contest/weekly-contest-122
// Author : Shen Bai
// Date   : 2019-02-03
// Rank   : 853 / 3482

import java.util.*;
import leetcode.Interval;
import leetcode.TreeNode;

/**
 * Weekly Contest 122
 * 
 */
public class Contest122 {

    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                sum += A[i];
            }
        }
        int[] ret = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int n = queries[i][0];
            int j = queries[i][1];
            if (A[j] % 2 == 0 && n % 2 == 0) {
                sum += n;
            } else if (A[j] % 2 == 0 && n % 2 != 0) {
                sum -= A[j];
            } else if (A[j] % 2 != 0 && n % 2 != 0) {
                sum += A[j] + n;
            }
            A[j] += n;
            ret[i] = sum;
        }
        return ret;
    }


    public int[] sumEvenAfterQueries2(int[] A, int[][] queries) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                sum += A[i];
            }
        }
        int[] ret = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int n = queries[i][0];
            int j = queries[i][1];
            if (A[j] % 2 == 0) {
                sum -= A[j];
            }
            A[j] += n;
            if (A[j] % 2 == 0) {
                sum += A[j];
            }
            ret[i] = sum;
        }
        return ret;
    }


    private List<String> list = new ArrayList<String>();

    public String smallestFromLeaf(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        traverse(root, sb);
        Collections.sort(list);
        return list.get(0);
    }

    private void traverse(TreeNode node, StringBuilder sb) {
        sb.insert(0, (char)(node.val + 'a'));
        if (node.left == null && node.right == null) {
            list.add(sb.toString());
        }
        if (node.left != null) {
            traverse(node.left, sb);
        }
        if (node.right != null) {
            traverse(node.right, sb);
        }

        sb.deleteCharAt(0);
    }


    public Interval[] intervalIntersection(Interval[] A, Interval[] B) {
        List<Interval> intervals = new ArrayList<Interval>();
        int i = 0;
        int j = 0;
        while (i < A.length && j < B.length) {
            if (A[i].end < B[j].start) {
                i++;
            } else if (B[j].end < A[i].start) {
                j++;
            } else {
                int start = Math.max(A[i].start, B[j].start);
                int end = Math.min(A[i].end, B[j].end);
                intervals.add(new Interval(start, end));
                if (A[i].end < B[j].end) {
                    i++;
                } else {
                    j++;
                }
            }
        }
        return intervals.toArray(new Interval[intervals.size()]);
    }


    public class Coords {
        int x;
        int y;
        int val;
        Coords(int x, int y, int val) {
            this.x = x;
            this.y = y;
            this.val = val;
        }
    }

    Map<Integer, List<Coords>> map = new HashMap<Integer, List<Coords>>();

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        traverse2(root, 0, 0);
        List<Integer> keys = new ArrayList(map.keySet());
        Collections.sort(keys);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for (int i = 0; i < keys.size(); i++) {
            List<Coords> clist = map.get(keys.get(i));
            List<Integer> sublist = new ArrayList<Integer>();
            for (int j = 0; j < clist.size(); j++) {
                sublist.add(clist.get(j).val);
            }
            list.add(sublist);
        }
        return list;
    }

    private void traverse2(TreeNode node, int x, int y) {
        Coords coords = new Coords(x, y, node.val);
        List<Coords> list = map.getOrDefault(x, new ArrayList<Coords>());
        int i = 0;
        while (i < list.size()) {
            if (list.get(i).y < y) {
                break;
            }
            if (list.get(i).y == y && list.get(i).val > node.val) {
                break;
            }
            i++;
        }
        list.add(i, coords);
        map.put(x, list);
        if (node.left != null) {
            traverse2(node.left, x - 1, y - 1);
        }
        if (node.right != null) {
            traverse2(node.right, x + 1, y - 1);
        }
    }
}