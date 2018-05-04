package leetcode.threeSum;

/**
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 * 
 * Note: The solution set must not contain duplicate triplets.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();
 
        if (nums == null || nums.length < 3) {
            return result;
        }
        Arrays.sort(nums);

        for (int i = 0; i <= nums.length - 2; i++) {
            while (i > 0 && i < nums.length && nums[i] == nums[i - 1]) {
                i++;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while (k > j) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    List<Integer> sumList = new ArrayList<Integer>();
                    sumList.add(new Integer(nums[i]));
                    sumList.add(new Integer(nums[j]));
                    sumList.add(new Integer(nums[k]));
                    result.add(sumList);
                    j++;
                    k--;
                    while (k > j && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    while (k > j && nums[k] == nums[k + 1]) {
                        k--;
                    }
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return result;
    }
}
