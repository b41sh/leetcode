package leetcode.rotateList;

// Source : https://leetcode.com/problems/rotate-list/
// Author : Shen Bai
// Date   : 2018-05-26

import leetcode.ListNode;

/**
 * Given a linked list, rotate the list to the right by k places, where k is non-negative.
 * Example 1:
 * Input: 1->2->3->4->5->NULL, k = 2
 * Output: 4->5->1->2->3->NULL
 * Explanation:
 * rotate 1 steps to the right: 5->1->2->3->4->NULL
 * rotate 2 steps to the right: 4->5->1->2->3->NULL
 * Example 2:
 * Input: 0->1->2->NULL, k = 4
 * Output: 2->0->1->NULL
 * Explanation:
 * rotate 1 steps to the right: 2->0->1->NULL
 * rotate 2 steps to the right: 1->2->0->NULL
 * rotate 3 steps to the right: 0->1->2->NULL
 * rotate 4 steps to the right: 2->0->1->NULL
 */
public class RotateList {

    public ListNode rotateRight(ListNode head, int k) {

        if (k == 0 || head == null) {
            return head;
        }
        ListNode cur = head;
        ListNode beg = head;
        ListNode end = null;
        int i = 0;
        while (cur != null) {
            if (i == k) {
                end = cur;
            }
            if (i > k) {
                beg = beg.next;
                end = end.next;
            }
            i++;
            if (cur.next == null) {
                // overflow begin from head
                if (end == null) {
                    cur = head;
                    k %= i;
                    if (k == 0) {
                        return head;
                    }
                    i = 0;
                    continue;
                } else {
                    break;
                }
            }
            cur = cur.next;
        }

        ListNode newHead = beg.next;
        end.next = head;
        beg.next = null;

        return newHead;
    }
}