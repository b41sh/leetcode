package leetcode.removeNthNodeFromEndOfList;

// Source : https://leetcode.com/problems/remove-nth-node-from-end-of-list/
// Author : Shen Bai
// Date   : 2018-05-09

/**
 * Given a linked list, remove the n-th node from the end of list and return its head.
 * Example:
 * Given linked list: 1->2->3->4->5, and n = 2.
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 * Note:
 * Given n will always be valid.
 */
import java.util.Map;
import java.util.HashMap;

import leetcode.ListNode;

public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode list = head;
        int l = 0;
        while (list != null) {
            l++;
            list = list.next;
        }
        if (l == n) {
            return head.next;
        }

        int i = 1;
        int p = l - n;
        list = head;
        while (list != null) {
            if (i == p) {
                list.next = list.next.next;
                break;
            }
            i++;
            list = list.next;
        }

        return head;
    }
}