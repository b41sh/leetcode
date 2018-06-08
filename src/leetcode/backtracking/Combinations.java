package leetcode.backtracking.combinations;

// Source : https://leetcode.com/problems/combinations/
// Author : Shen Bai
// Date   : 2018-06-08

import java.util.ArrayList;
import java.util.List;

/**
 * Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
 * Example:
 * Input: n = 4, k = 2
 * Output:
 * [
 *  [2,4],
 *  [3,4],
 *  [2,3],
 *  [1,2],
 *  [1,3],
 *  [1,4],
 * ]
 */

public class Combinations {

    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if (n == 0 || k == 0) {
            return list;
        }

        int start = 1;
        List<Integer> item = new ArrayList<Integer>();

        _combine(list, item, start, n, k);

        return list;
    }

    private void _combine(List<List<Integer>> list, List<Integer> item, int start, int n, int k) {

        for (int i = start; i <= n; i++) {
            List<Integer> newItem = new ArrayList<Integer>(item);
            newItem.add(new Integer(i));
            if (newItem.size() == k) {
                list.add(newItem);
            } else {
                _combine(list, newItem, i + 1, n, k);
            }
        }
    }

    // too slow timeout
    public List<List<Integer>> combine1(int n, int k) {

        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if (n == 0 || k == 0) {
            return list;
        }
        if (k == 1) {
            for (int i = 1; i <= n; i++) {
                List<Integer> item = new ArrayList<Integer>();
                item.add(new Integer(i));
                list.add(item);
            }
            return list;
        }

        List<List<Integer>> subList = combine(n, k - 1);
        for (List<Integer> subItem : subList) {
            for (int i = 1; i <= n; i++) {
                List<Integer> newItem = new ArrayList<Integer>(subItem);
                Integer num = new Integer(i);
                if (newItem.contains(num)) {
                    continue;
                }
                if (newItem.get(newItem.size() - 1) > num) {
                    continue;
                }
                newItem.add(num);
                if (!list.contains(newItem)) {
                    list.add(newItem);
                }
            }
        }
        return list;
    }
}
