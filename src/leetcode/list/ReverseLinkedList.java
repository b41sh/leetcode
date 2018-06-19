package leetcode.list.reverseLinkedList;

// Source : https://leetcode.com/problems/reverse-linked-list-ii/
// Author : Shen Bai
// Date   : 2018-06-19

import leetcode.ListNode;

/**
 * Reverse a linked list from position m to n. Do it in one-pass.
 * Note: 1 ≤ m ≤ n ≤ length of list.
 * Example:
 * Input: 1->2->3->4->5->NULL, m = 2, n = 4
 * Output: 1->4->3->2->5->NULL
 */
public class ReverseLinkedList {

    public ListNode reverseBetween(ListNode head, int m, int n) {

        if (head == null || head.next == null || m == n) {
            return head;
        }
        ListNode dummyHead = new ListNode(0);
        ListNode cur = head;
        ListNode next = null;
        ListNode reverseHead = new ListNode(0);
        ListNode reverseTail = null;

        int i = 1;
        while (head != null) {
            next = head.next;
            if (i < m || i > n) {
                if (i == 1) {
                    dummyHead.next = head;
                    cur = head;
                } else {
                    cur.next = head;
                    cur = cur.next;
                }
                cur.next = null;
            } else if (i == m) {
                reverseHead.next = head;
                reverseTail = head;
                reverseTail.next = null;
            } else if (i == n) {
                head.next = reverseHead.next;
                reverseHead.next = head;
                if (dummyHead.next == null) {
                    dummyHead = reverseHead;
                } else {
                    cur.next = reverseHead.next;
                }
                cur = reverseTail;
            } else {
                head.next = reverseHead.next;
                reverseHead.next = head;
            } 

            head = next;
            i++;
        }

        return dummyHead.next;
    }
}