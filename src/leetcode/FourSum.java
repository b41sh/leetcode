package leetcode.fourSum;

/**
 * Given an array nums of n integers and an integer target, are there elements a, b, c, and d in nums such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.
 * 
 * Note: The solution set must not contain duplicate triplets.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();
 
        if (nums == null || nums.length < 4) {
            return result;
        }
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j != i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int k = j + 1;
                int l = nums.length - 1;
                while (l > k) {
                    int sum = nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum == target) {
                        List<Integer> sumList = new ArrayList<Integer>();
                        sumList.add(new Integer(nums[i]));
                        sumList.add(new Integer(nums[j]));
                        sumList.add(new Integer(nums[k]));
                        sumList.add(new Integer(nums[l]));
                        result.add(sumList);
                        k++;
                        l--;
                        while (l > k && nums[k] == nums[k - 1]) {
                            k++;
                        }
                        while (l > k && nums[l] == nums[l + 1]) {
                            l--;
                        }
                    } else if (sum < target) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }

        return result;
    }
}
