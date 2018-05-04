package leetcode.addTwoNumbers;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 02. Add Two Numbers
 */
public class AddTwoNumbersTest {

    @Test
    public void test() {

        System.out.println("AddTwoNumbersTest");

        AddTwoNumbers solution = new AddTwoNumbers();

        int[] l1 = new int[] {2, 4, 3};
        int[] l2 = new int[] {5, 6, 4};

        ListNode node1 = null;
        ListNode node2 = null;
        ListNode node3 = null;

        ListNode lastNode1 = null;
        for (int i1 = l1.length - 1; i1 >= 0; i1--) {
            int val = l1[i1];
            node1 = new ListNode(val);
            node1.next = lastNode1;
            lastNode1 = node1;
        }

        ListNode lastNode2 = null;
        for (int i2 = l2.length - 1; i2 >= 0; i2--) {
            int val = l2[i2];
            node2 = new ListNode(val);
            node2.next = lastNode2;
            lastNode2 = node2;
        }

        node3 = solution.addTwoNumbers(node1, node2);
        System.out.println(node3.val);

        Assert.assertTrue(new Integer(node3.val).equals(7));
    }
}
