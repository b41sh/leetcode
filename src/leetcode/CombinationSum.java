package leetcode.combinationSum;

// Source : https://leetcode.com/problems/combination-sum/
// https://leetcode.com/problems/combination-sum-ii/
// Author : Shen Bai
// Date   : 2018-05-19

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

/**
 * Given a set of candidate numbers (candidates) (without duplicates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.
 * The same repeated number may be chosen from candidates unlimited number of times.
 * Note:
 * All numbers (including target) will be positive integers.
 * The solution set must not contain duplicate combinations.
 * Example 1:
 * Input: candidates = [2,3,6,7], target = 7,
 * A solution set is:
 * [
 *  [7],
 *  [2,2,3]
 * ]
 * Example 2:
 * Input: candidates = [2,3,5], target = 8,
 * A solution set is:
 * [
 *  [2,2,2,2],
 *  [2,3,3],
 *  [3,5]
 * ]

 * Combination Sum II
 * Each number in candidates may only be used once in the combination.
 */
public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> tmp = new ArrayList<Integer>();
        if (candidates == null || candidates.length == 0) {
            return list;
        }

        Arrays.sort(candidates);
        dfs(candidates, target, 0, list, tmp);
        return list;
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> tmp = new ArrayList<Integer>();
        if (candidates == null || candidates.length == 0) {
            return list;
        }

        Arrays.sort(candidates);
        dfs2(candidates, target, 0, list, tmp);
        return list;
    }

    /**
     * DFS
     */
    private int dfs(int[] candidates, int target, int start, List<List<Integer>> list, List<Integer> tmp) {
        if (target == 0) {
            list.add(new ArrayList<Integer>(tmp));
            return 0;
        } else if (target < 0) {
            return -1;
        }

        for (int i = start; i < candidates.length; i++) {
            int candidate = candidates[i];

            tmp.add(new Integer(candidate));
            int ret = dfs(candidates, target - candidate, i, list, tmp);
            tmp.remove(tmp.size() - 1);
            if (ret == -1) {
                break;
            }
        }

        return 0;
    }


    /**
     * DFS
     * check is contains
     */
    private int dfs2(int[] candidates, int target, int start, List<List<Integer>> list, List<Integer> tmp) {
        if (target == 0) {
            if (!list.contains(tmp)) {
                list.add(new ArrayList<Integer>(tmp));
            }
            return 0;
        } else if (target < 0) {
            return -1;
        }

        for (int i = start; i < candidates.length; i++) {
            int candidate = candidates[i];

            tmp.add(new Integer(candidate));
            int ret = dfs2(candidates, target - candidate, i + 1, list, tmp);
            tmp.remove(tmp.size() - 1);
            if (ret == -1) {
                break;
            }
        }

        return 0;
    }

}