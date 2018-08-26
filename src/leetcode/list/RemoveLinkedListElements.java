package leetcode.list.removeLinkedListElements;

// Source : https://leetcode.com/problems/remove-linked-list-elements
// Author : Shen Bai
// Date   : 2018-08-26

import leetcode.ListNode;

/**
 * Remove all elements from a linked list of integers that have value val.
 *
 * Example:
 *
 * Input:  1->2->6->3->4->5->6, val = 6
 * Output: 1->2->3->4->5
 */
public class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {

        if (head == null) {
            return head;
        }
        ListNode dummpyHead = new ListNode(0);
        dummpyHead.next = head;
        ListNode prev = dummpyHead;

        while (head != null) {
            if (head.val == val) {
                prev.next = head.next;
            } else {
                prev = head;
            }
            head = head.next;
        }

        return dummpyHead.next;
    }
}
