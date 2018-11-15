package leetcode.array.kthLargestElementInAnArray;

// Source : https://leetcode.com/problems/kth-largest-element-in-an-array/
// Author : Shen Bai
// Date   : 2018-11-15

import java.util.Arrays;

/**
 * Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.
 *
 * Example 1:
 *
 * Input: [3,2,1,5,6,4] and k = 2
 * Output: 5
 * Example 2:
 *
 * Input: [3,2,3,1,2,4,5,5,6] and k = 4
 * Output: 4
 * Note:
 * You may assume k is always valid, 1 ≤ k ≤ array's length.
 */
public class KthLargestElementInAnArray {

    public int findKthLargest(int[] nums, int k) {
        int[] heap = new int[k];
        Arrays.fill(heap, Integer.MIN_VALUE);
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (n < heap[k - 1]) {
                continue;
            }
            for (int j = 0; j < k; j++) {
                if (heap[j] == Integer.MIN_VALUE) {
                    heap[j] = n;
                    break;
                } else if (heap[j] < n) {
                    int tmp = heap[j];
                    heap[j] = n;
                    j++;
                    while (j < k) {
                        int tmp2 = heap[j];
                        heap[j] = tmp;
                        tmp = tmp2;
                        if (tmp == Integer.MIN_VALUE) {
                            break;
                        }
                        j++;
                    }
                    break;
                }
            }
        }
        return heap[k - 1];
    }
}
