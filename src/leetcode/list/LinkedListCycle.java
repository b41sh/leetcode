package leetcode.list.linkedListCycle;

// Source : https://leetcode.com/problems/linked-list-cycle
// Source : https://leetcode.com/problems/linked-list-cycle-ii
// Author : Shen Bai
// Date   : 2018-08-12

import leetcode.ListNode;

/**
 * Given a linked list, determine if it has a cycle in it.
 *
 * Follow up:
 * Can you solve it without using extra space?
 *
 *
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 *
 * Note: Do not modify the linked list.
 *
 * Follow up:
 * Can you solve it without using extra space?
 */
public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {

        ListNode fastHead = head;
        ListNode slowHead = head;
        while (fastHead != null && fastHead.next != null) {
            slowHead = slowHead.next;
            fastHead = fastHead.next.next;
            if (slowHead.equals(fastHead)) {
                return true;
            }
        }
        return false;
    }

    public ListNode detectCycle(ListNode head) {

        ListNode fastHead = head;
        ListNode slowHead = head;
        boolean isCycle = false;
        while (fastHead != null && fastHead.next != null) {
            slowHead = slowHead.next;
            fastHead = fastHead.next.next;
            if (slowHead.equals(fastHead)) {
                isCycle = true;
                break;
            }
        }
        if (!isCycle) {
            return null;
        }

        fastHead = head;
        while (fastHead != null) {
            if (slowHead.equals(fastHead)) {
                break;
            }
            fastHead = fastHead.next;
            slowHead = slowHead.next;
        }

        return slowHead;
    }
}
