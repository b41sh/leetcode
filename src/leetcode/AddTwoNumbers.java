package leetcode.addTwoNumbers;

// Source : https://leetcode.com/problems/add-two-numbers/
// Author : Shen Bai
// Date   : 2018-05-01

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the   two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int val = 0;
        int car = 0;
        ListNode firstNode = null;
        ListNode curNode = null;
        ListNode preNode = null;
        while(l1 != null || l2 != null) {
            int val1 = 0;
            int val2 = 0;
            if (l1 != null) {
                val1 = l1.val;
            }
            if (l2 != null) {
                val2 = l2.val;
            }
            val = val1 + val2 + car;
            if (val >= 10) {
                val = val - 10;
                car = 1;
            } else {
                car = 0;
            }
            curNode = new ListNode(val);
            if (firstNode == null) {
                firstNode = curNode;
            }
            if (preNode != null) {
                preNode.next = curNode;
            }
            preNode = curNode;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (car == 1) {
            curNode = new ListNode(1);
            if (preNode != null) {
                preNode.next = curNode;
            }
            preNode = curNode;
        }

        return firstNode;
    }
}
