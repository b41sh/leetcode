package leetcode.tp.sortColors;

// Source : https://leetcode.com/problems/sort-colors/
// Author : Shen Bai
// Date   : 2018-06-07

/**
 * Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 * Note: You are not suppose to use the library's sort function for this problem.
 * Example:
 * Input: [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 * Follow up:
 * A rather straight forward solution is a two-pass algorithm using counting sort.
 * First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array with total number of 0's, then 1's and followed by 2's.
 * Could you come up with a one-pass algorithm using only constant space?
 */

public class SortColors {

    //two-pointers
    public void sortColors(int[] nums) {

        int length = nums.length;
        if (length <= 1) {
            return;
        }

        int blueIndex = length - 1;
        int redCount = 0;
        int whiteCount = 0;
        int blueCount = 0;
        int color = -1;
        int backColor = -1;

        int i = 0;
        int j = length - 1;
        while (i <= j) {
            color = nums[i];
            backColor = nums[j];
            if (i == j) {
                if (color == 0) {
                    nums[redCount] = 0;
                    redCount++;
                } else if (color == 1) {
                    whiteCount++;
                } else if (color == 2) {
                    nums[blueIndex] = 2;
                    blueIndex--;
                    blueCount++;
                }
                break;
            }
            if (color == 0 && backColor == 0) {
                nums[j] = nums[i + 1];
                nums[redCount] = 0;
                nums[redCount + 1] = 0;
                i += 2;
                redCount += 2;
            } else if (color == 2 && backColor == 2) {
                nums[i] = nums[j - 1];
                nums[blueIndex] = 2;
                nums[blueIndex - 1] = 2;
                j -= 2;
                blueCount += 2;
                blueIndex -= 2;
            } else {
                if (color == 0 || backColor == 0) {
                    nums[redCount] = 0;
                    redCount++;
                }
                if (color == 1 && backColor == 1) {
                    whiteCount += 2;
                } else if (color == 1 || backColor == 1) {
                    whiteCount++;
                }
                if (color == 2 || backColor == 2) {
                    nums[blueIndex] = 2;
                    blueCount++;
                    blueIndex--;
                }
                i++;
                j--;
            }
        }

        for (int l = redCount; l <= blueIndex; l++) {
            nums[l] = 1;
        }
        return;
    }
}
