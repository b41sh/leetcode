package leetcode.mergeTwoSortedLists;

// Source : https://leetcode.com/problems/merge-two-sorted-lists/
// Author : Shen Bai
// Date   : 2018-05-08

/**
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 */
import java.util.Map;
import java.util.HashMap;

import leetcode.ListNode;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        int val = 0;
        ListNode l = null;
        ListNode c = null;
        ListNode n = null;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                val = l2.val;
                l2 = l2.next;
            } else if (l2 == null) {
                val = l1.val;
                l1 = l1.next;
            } else if (l1.val < l2.val) {
                val = l1.val;
                l1 = l1.next;
            } else {
                val = l2.val;
                l2 = l2.next;
            }

            n = new ListNode(val);
            if (l == null) {
                l = n;
                c = n;
            } else {
                c.next = n;
                c = n;
            }
        }

        return l;
    }
}