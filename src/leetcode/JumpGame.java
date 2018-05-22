package leetcode.jumpGame;

// Source : https://leetcode.com/problems/jump-game/
// Source : https://leetcode.com/problems/jump-game-ii/
// Author : Shen Bai
// Date   : 2018-05-22

/**
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 * Each element in the array represents your maximum jump length at that position.
 * Determine if you are able to reach the last index.
 * Example 1:
 * Input: [2,3,1,1,4]
 * Output: true
 * Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
 * Example 2:
 * Input: [3,2,1,0,4]
 * Output: false
 * Explanation: You will always arrive at index 3 no matter what. Its maximum
 *            jump length is 0, which makes it impossible to reach the last index.
 *
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 * Each element in the array represents your maximum jump length at that position.
 * Your goal is to reach the last index in the minimum number of jumps.
 * Example:
 * Input: [2,3,1,1,4]
 * Output: 2
 * Explanation: The minimum number of jumps to reach the last index is 2.
 *   Jump 1 step from index 0 to 1, then 3 steps to the last index.
 * Note:
 * You can assume that you can always reach the last index.
 */

public class JumpGame {

    // 272 ms
    public boolean canJump(int[] nums) {

        boolean[] jump = new boolean[nums.length];
        boolean canJump = false;
        int l = nums.length - 1;
        int num = 0;
        int end = 0;
        jump[l] = true;
        for (int i = nums.length - 2; i >= 0; i--) {
            num = nums[i];
            canJump = false;
            end = Math.min(l, num + i);
            while (end > i) {
                if (jump[end]) {
                    canJump = true;
                    break;
                }
                end--;
            }
            jump[i] = canJump;
        }

        return jump[0];
    }

    // 9ms
    // greedy
    public boolean canJump2(int[] nums) {

        int maxIndex = 0;
        int l = nums.length - 1;
        for (int i = 0; i <= l; i++) {
            if (maxIndex >= l || i > maxIndex) {
                break;
            }
            if (i + nums[i] > maxIndex) {
                maxIndex = i + nums[i];
            }
        }

        return maxIndex >= l ? true : false;
    }

    // timeout
    public int canJumpII(int[] nums) {
        int num = 0;
        int end = 0;
        int min = -1;
        int l = nums.length - 1;
        int[] jump = new int[nums.length];
        for (int i = nums.length - 2; i >= 0; i--) {
            num = nums[i];
            end = Math.min(l, num + i);
            min = -1;
            while (end > i) {
                if (min == -1) {
                    if (end == l || jump[end] > 0) {
                        min = jump[end];
                    }
                } else {
                    if (jump[end] > 0 && jump[end] < min) {
                        min = jump[end];
                    }
                }
                end--;
            }
            jump[i] = min + 1;
        }

        return jump[0];
    }

    // greedy
    public int canJumpII2(int[] nums) {

        int n = nums.length;
        int curMax = 0;
        int jumps = 0;
        int i = 0;
        while (curMax < n - 1) {
            int lastMax = curMax;
            for (; i <= lastMax; i++) {
                curMax = Math.max(curMax, i + nums[i]);
            }
            jumps++;
            if (lastMax == curMax) {
                return -1;
            }
        }
        return jumps;
    }
}