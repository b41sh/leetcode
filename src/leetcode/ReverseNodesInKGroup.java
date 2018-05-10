package leetcode.reverseNodesInKGroup;

// Source : https://leetcode.com/problems/reverse-nodes-in-k-group/
// Author : Shen Bai
// Date   : 2018-05-10

/**
 * Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
 * k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.
 * Example:
 * Given this linked list: 1->2->3->4->5
 * For k = 2, you should return: 2->1->4->3->5
 * For k = 3, you should return: 3->2->1->4->5
 * Note:
 * Only constant extra memory is allowed.
 * You may not alter the values in the list's nodes, only nodes itself may be changed.
 */
import leetcode.ListNode;

public class ReverseNodesInKGroup {

    public ListNode reverseKGroup(ListNode head, int k) {

        if (head == null || head.next == null || k <= 1) {
            return head;
        }
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        ListNode preNode = preHead;
        ListNode curNode = head;
        ListNode checkNode = head;
        ListNode firstNode = null;
        ListNode lastNode = null;
        ListNode nextNode = null;

        int i = 0;
        int circle = 0;
        boolean needReverse = true;
        while (preNode != null && preNode.next != null) {

            i = k;
            needReverse = true;
            checkNode = preNode.next;
            while (i > 0) {
                if (checkNode == null) {
                    needReverse = false;
                    break;
                }
                checkNode = checkNode.next;
                i--;
            }
            if (!needReverse) {
                break;
            }

            i = k;
            while (i > 0) {
                if (i == k) {
                    firstNode = curNode;
                    lastNode = curNode;
                    curNode = curNode.next;
                } else {
                    lastNode = preNode.next;
                    preNode.next = curNode;
                    nextNode = curNode.next;
                    curNode.next = lastNode;
                    firstNode.next = nextNode;
                    curNode = nextNode;
                }
                i--;
            }
            if (circle == 0) {
                preHead.next = preNode.next;
            }
            circle++;
            preNode = firstNode;
        }

        return preHead.next;
    }
}