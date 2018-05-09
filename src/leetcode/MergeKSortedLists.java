package leetcode.mergeKSortedLists;

// Source : https://leetcode.com/problems/merge-k-sorted-lists/
// Author : Shen Bai
// Date   : 2018-05-09

/**
 * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
 * Example:
 * Input:
 * [
 *  1->4->5,
 *  1->3->4,
 *  2->6
 * ]
 * Output: 1->1->2->3->4->4->5->6
 */

import leetcode.ListNode;

public class MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {
        int minPos = -1;
        int minVal = -1;
        ListNode minNode = null;
        ListNode retNode = null;
        ListNode curNode = null;
        while (true) {
            minPos = -1;
            minVal = -1;
            for (int i = 0; i < lists.length; i++) {
                ListNode node = lists[i];
                if (node != null) {
                    int val = node.val;
                    if (minPos == -1 || val < minVal) {
                        minVal = val;
                        minPos = i;
                    }
                }
            }
            if (minPos == -1) {
                break;
            }
            minNode = new ListNode(minVal);
            if (retNode == null) {
                retNode = minNode;
                curNode = minNode;
            } else {
                curNode.next = minNode;
                curNode = minNode;
            }
            lists[minPos] = lists[minPos].next;
        }

        return retNode;
    }
}