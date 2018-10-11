package leetcode.design.minStack;

// Source : https://leetcode.com/problems/min-stack/
// Author : Shen Bai
// Date   : 2018-10-11

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 * Example:
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> Returns -3.
 * minStack.pop();
 * minStack.top();      --> Returns 0.
 * minStack.getMin();   --> Returns -2.
 *
 */

public class MinStack {

    public class Node {
        public int val;
        public int minVal;
        public Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node head;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        this.head = null;
    }

    public void push(int x) {
        Node node = new Node(x);

        if (head == null) {
            node.minVal = x;
        } else {
            node.minVal = Math.min(head.minVal, x);
            node.next = head;
        }
        head = node;
    }

    public void pop() {
        if (head != null) {
            head = head.next;
        }
    }

    public int top() {
        if (head != null) {
            return head.val;
        }
        return 0;
    }

    public int getMin() {
        if (head != null) {
            return head.minVal;
        }
        return 0;
    }
}
