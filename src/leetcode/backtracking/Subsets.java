package leetcode.backtracking.subsets;

// Source : https://leetcode.com/problems/subsets/
// Author : Shen Bai
// Date   : 2018-06-08

import java.util.ArrayList;
import java.util.List;

/**
 * Given a set of distinct integers, nums, return all possible subsets (the power set).
 * Note: The solution set must not contain duplicate subsets.
 * Example:
 * Input: nums = [1,2,3]
 * Output:
 * [
 *  [3],
 *  [1],
 *  [2],
 *  [1,2,3],
 *  [1,3],
 *  [2,3],
 *  [1,2],
 *  []
 * ]
 */

public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> item = new ArrayList<Integer>();
        list.add(item);
        if (nums.length == 0) {
            return list;
        }

        int start = 0;
        _combine(list, item, start, nums);

        return list;
    }

    private void _combine(List<List<Integer>> list, List<Integer> item, int start, int[] nums) {

        for (int i = start; i < nums.length; i++) {
            List<Integer> newItem = new ArrayList<Integer>(item);
            newItem.add(new Integer(nums[i]));
            list.add(newItem);
            _combine(list, newItem, i + 1, nums);
        }
    }
}
