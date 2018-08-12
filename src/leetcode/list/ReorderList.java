package leetcode.list.reorderList;

// Source : https://leetcode.com/problems/reorder-list
// Author : Shen Bai
// Date   : 2018-08-12

import leetcode.ListNode;

/**
 * Given a singly linked list L: L0→L1→…→Ln-1→Ln,
 * reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…
 *
 * You may not modify the values in the list's nodes, only nodes itself may be changed.
 *
 * Example 1:
 *
 * Given 1->2->3->4, reorder it to 1->4->2->3.
 * Example 2:
 *
 * Given 1->2->3->4->5, reorder it to 1->5->2->4->3.
 */
public class ReorderList {

    public void reorderList(ListNode head) {

        if (head == null || head.next == null) {
            return;
        }
        ListNode dummyBackHead = new ListNode(0);
        ListNode next = new ListNode(0);

        ListNode fastHead = head;
        ListNode slowHead = head;
        while (fastHead != null) {
            if (fastHead.next == null || fastHead.next.next == null) {
                break;
            }
            slowHead = slowHead.next;
            fastHead = fastHead.next.next;
        }
        ListNode backHead = slowHead.next;
        slowHead.next = null;
        while (backHead != null) {
            next = backHead.next;
            backHead.next = dummyBackHead.next;
            dummyBackHead.next = backHead;
            backHead = next;
        }
        ListNode current = head;
        ListNode backNext = null;
        backHead = dummyBackHead.next;
        while (current != null && backHead != null) {
            next = current.next;
            backNext = backHead.next;
            current.next = backHead;
            current.next.next = next;
            current = next;
            backHead = backNext;
        }
    }
}
