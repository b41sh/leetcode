package leetcode.list.removeDuplicatesFromSortedList;

// Source : https://leetcode.com/problems/remove-duplicates-from-sorted-list/
// Source : https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
// Author : Shen Bai
// Date   : 2018-06-12

import leetcode.ListNode;

/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * Example 1:
 * Input: 1->1->2
 * Output: 1->2
 * Example 2:
 * Input: 1->1->2->3->3
 * Output: 1->2->3
 *
 * II
 * Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.
 * Example 1:
 * Input: 1->2->3->3->4->4->5
 * Output: 1->2->5
 * Example 2:
 * Input: 1->1->1->2->3
 * Output: 2->3
 */
public class RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = head;
        ListNode cur = head.next;
        pre.next = null;

        while (cur != null) {
            if (pre.val != cur.val) {
                pre.next = cur;
                pre = cur;
                cur = cur.next;
                pre.next = null;
            } else {
                cur = cur.next;
            }
        }

        return head;
    }

    public ListNode deleteDuplicatesII(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = null;
        ListNode newCur = null;
        ListNode pre = head;
        ListNode cur = head.next;
        boolean isFirst = true;

        while (cur != null) {
            if (pre.val != cur.val) {
                if (isFirst) {
                    if (newHead == null) {
                        newHead = pre;
                        newCur = pre;
                        newCur.next = null;
                    } else {
                        newCur.next = pre;
                        newCur = newCur.next;
                        newCur.next = null;
                    }
                }
                pre = cur;
                cur = cur.next;
                isFirst = true;
            } else {
                cur = cur.next;
                isFirst = false;
            }
        }
        if (isFirst) {
            if (newHead == null) {
                newHead = pre;
                newHead.next = null;
            } else {
                newCur.next = pre;
                pre.next = null;
            }
        }

        return newHead;
    }
}