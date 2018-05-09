package leetcode.swapNodesInPairs;

// Source : https://leetcode.com/problems/swap-nodes-in-pairs/
// Author : Shen Bai
// Date   : 2018-05-09

/**
 * Given a linked list, swap every two adjacent nodes and return its head.
 * Example:
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 * Note:
 * Your algorithm should use only constant extra space.
 * You may not modify the values in the list's nodes, only nodes itself may be changed.
 */
import leetcode.ListNode;

public class SwapNodesInPairs {

    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        ListNode curNode = preHead;
        ListNode nNode = null;
        ListNode nnNode = null;
        ListNode nnnNode = null;

        while (curNode != null) {
            nNode = curNode.next;
            if (nNode == null) {
                break;
            }
            nnNode = nNode.next;
            if (nnNode == null) {
                break;
            }
            nnnNode = nnNode.next;
            curNode.next = nnNode;
            nnNode.next = nNode;
            nNode.next = nnnNode;
            curNode = nNode;
        }

        return preHead.next;
    }
}