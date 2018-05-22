package leetcode.permutations;

// Source : https://leetcode.com/problems/permutations/
// Source : https://leetcode.com/problems/permutations-ii/
// Author : Shen Bai
// Date   : 2018-05-22

import java.util.List;
import java.util.ArrayList;

/**
 * Given a collection of distinct integers, return all possible permutations.
 * Example:
 * Input: [1,2,3]
 * Output:
 * [
 *  [1,2,3],
 *  [1,3,2],
 *  [2,1,3],
 *  [2,3,1],
 *  [3,1,2],
 *  [3,2,1]
 * ]

 * Given a collection of numbers that might contain duplicates, return all possible unique permutations.
 * Example:
 * Input: [1,1,2]
 * Output:
 * [
 *  [1,1,2],
 *  [1,2,1],
 *  [2,1,1]
 * ]
 */

public class Permutations {

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if (nums.length == 0) {
            return list;
        }

        list = getPermute(nums, nums.length - 1);
        return list;
    }


    public List<List<Integer>> getPermute(int[] nums, int start) {

        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if (start == 0) {
            List<Integer> item = new ArrayList<Integer>();
            item.add(new Integer(nums[start]));
            list.add(item);
            return list;
        }

        List<List<Integer>> subList = getPermute(nums, start - 1);

        Integer num = new Integer(nums[start]);
        for (int i = 0; i <= start; i++) {
            for (List<Integer> subItem : subList) {
                List<Integer> newItem = new ArrayList<Integer>(subItem);
                newItem.add(i, num);
                list.add(newItem);
            }
        }

        return list;
    }


    public List<List<Integer>> permuteII(int[] nums) {

        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if (nums.length == 0) {
            return list;
        }

        list = getPermute2(nums, nums.length - 1);
        return list;
    }


    public List<List<Integer>> getPermute2(int[] nums, int start) {

        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if (start == 0) {
            List<Integer> item = new ArrayList<Integer>();
            item.add(new Integer(nums[start]));
            list.add(item);
            return list;
        }

        List<List<Integer>> subList = getPermute2(nums, start - 1);

        Integer num = new Integer(nums[start]);
        for (int i = 0; i <= start; i++) {
            for (List<Integer> subItem : subList) {
                List<Integer> newItem = new ArrayList<Integer>(subItem);
                newItem.add(i, num);
                if (!list.contains(newItem)) {
                    list.add(newItem);
                }
            }
        }

        return list;
    }
}

