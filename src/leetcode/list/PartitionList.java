package leetcode.list.partitionList;

// Source : https://leetcode.com/problems/partition-list/
// Author : Shen Bai
// Date   : 2018-06-15

import leetcode.ListNode;

/**
 * Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
 * You should preserve the original relative order of the nodes in each of the two partitions.
 * Example:
 * Input: head = 1->4->3->2->5->2, x = 3
 * Output: 1->2->2->4->3->5
 */
public class PartitionList {

    public ListNode partition(ListNode head, int x) {

        if (head == null || head.next == null) {
            return head;
        }
        ListNode lessHead = null;
        ListNode lessTail = null;
        ListNode moreHead = null;
        ListNode moreTail = null;
        ListNode cur = head;
        ListNode next = null;

        while (cur != null) {
            next = cur.next;
            if (cur.val < x) {
                if (lessHead == null) {
                    lessHead = cur;
                    lessTail = cur;
                } else {
                    lessTail.next = cur;
                    lessTail = cur;
                }
                lessTail.next = moreHead;
            } else {
                if (moreHead == null) {
                    moreHead = cur;
                    moreTail = cur;
                } else {
                    moreTail.next = cur;
                    moreTail = cur;
                }
                moreTail.next = null;
            }
            cur = next;
        }
        if (lessHead == null) {
            lessHead = moreHead;
        } else if (moreHead != null && lessTail.next == null) {
            lessTail.next = moreHead;
        }
        return lessHead;
    }
}