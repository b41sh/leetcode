package leetcode.list.intersectionOfTwoLinkedLists;

// Source : https://leetcode.com/problems/intersection-of-two-linked-lists
// Author : Shen Bai
// Date   : 2018-09-06

import leetcode.ListNode;

/**
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 *
 *
 * For example, the following two linked lists:
 *
 * A:          a1 → a2
 *                    ↘
 *                      c1 → c2 → c3
 *                    ↗
 * B:     b1 → b2 → b3
 * begin to intersect at node c1.
 *
 *
 * Notes:
 *
 * If the two linked lists have no intersection at all, return null.
 * The linked lists must retain their original structure after the function returns.
 * You may assume there are no cycles anywhere in the entire linked structure.
 * Your code should preferably run in O(n) time and use only O(1) memory.
 * Credits:
 * Special thanks to @stellari for adding this problem and creating all test cases.
 */
public class IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        int lenA = 0;
        int lenB = 0;
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        while (nodeA != null) {
            nodeA = nodeA.next;
            lenA++;
        }
        while (nodeB != null) {
            nodeB = nodeB.next;
            lenB++;
        }
        nodeA = headA;
        nodeB = headB;
        int diff = 0;
        if (lenA > lenB) {
            diff = lenA - lenB;
            while (diff > 0) {
                nodeA = nodeA.next;
                diff--;
            }
        } else if (lenB > lenA) {
            diff = lenB - lenA;
            while (diff > 0) {
                nodeB = nodeB.next;
                diff--;
            }
        }
        while (nodeA != null && nodeB != null) {
            if (nodeA.val == nodeB.val) {
                return nodeA;
            }
            nodeA = nodeA.next;
            nodeB = nodeB.next;
        }
        return null;
    }
}
