package leetcode.list.copyListWithRandomPointer;

import org.junit.Assert;
import org.junit.Test;
import leetcode.RandomListNode;

/**
 * Test for 138. Copy List with Random Pointer
 */
public class CopyListWithRandomPointerTest {

    @Test
    public void test() {

        System.out.println("CopyListWithRandomPointerTest");
        CopyListWithRandomPointer solution = new CopyListWithRandomPointer();

        RandomListNode l1 = new RandomListNode(1);
        RandomListNode l2 = new RandomListNode(2);
        RandomListNode l3 = new RandomListNode(3);
        RandomListNode l4 = new RandomListNode(4);
        RandomListNode l5 = new RandomListNode(5);
        RandomListNode l6 = new RandomListNode(6);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;

        l1.random = l4;
        l2.random = l1;
        l3.random = l2;
        l4.random = l3;

        RandomListNode ret = solution.copyRandomList(l1);
        while (ret != null) {
            System.out.print("label=" + ret.label);
            if (ret.random != null) {
                System.out.print(" random label=" + ret.random.label);
            } else {
                System.out.print(" random label=null");
            }
            System.out.println("");

            ret = ret.next;
        }
    }
}