package leetcode.list.copyListWithRandomPointer;

// Source : https://leetcode.com/problems/copy-list-with-random-pointer
// Author : Shen Bai
// Date   : 2018-09-06

import java.util.HashMap;
import java.util.Map;
import leetcode.RandomListNode;

/**
 * A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.
 *
 * Return a deep copy of the list.
 */
public class CopyListWithRandomPointer {

    public RandomListNode copyRandomList(RandomListNode head) {

        if (head == null) {
            return null;
        }
        Map<Integer, RandomListNode> map = new HashMap<Integer, RandomListNode>();
        RandomListNode dummyHead = new RandomListNode(0);
        RandomListNode pre = dummyHead;
        RandomListNode cur = null;
        RandomListNode random = null;
        while (head != null) {
            if (map.containsKey(head.label)) {
                cur = map.get(head.label);
            } else {
                cur = new RandomListNode(head.label);
                map.put(head.label, cur);
            }
            if (head.random != null) {
                if (map.containsKey(head.random.label)) {
                    random = map.get(head.random.label);
                } else {
                    random = new RandomListNode(head.random.label);
                    map.put(head.random.label, random);
                }
                cur.random = random;
            }

            pre.next = cur;
            pre = cur;
            head = head.next;
        }

        return dummyHead.next;
    }
}
