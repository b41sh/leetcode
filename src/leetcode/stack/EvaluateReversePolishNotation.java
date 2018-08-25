package leetcode.stack.evaluateReversePolishNotation;

// Source : https://leetcode.com/problems/reverse-words-in-a-string/
// Author : Shen Bai
// Date   : 2018-08-25

import java.util.Arrays;
import java.util.Stack;

/**
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 *
 * Valid operators are +, -, *, /. Each operand may be an integer or another expression.
 *
 * Note:
 *
 * Division between two integers should truncate toward zero.
 * The given RPN expression is always valid. That means the expression would always evaluate to a result and there won't be any divide by zero operation.
 * Example 1:
 *
 * Input: ["2", "1", "+", "3", "*"]
 * Output: 9
 * Explanation: ((2 + 1) * 3) = 9
 * Example 2:
 *
 * Input: ["4", "13", "5", "/", "+"]
 * Output: 6
 * Explanation: (4 + (13 / 5)) = 6
 * Example 3:
 *
 * Input: ["10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"]
 * Output: 22
 * Explanation:
 *   ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
 * = ((10 * (6 / (12 * -11))) + 17) + 5
 * = ((10 * (6 / -132)) + 17) + 5
 * = ((10 * 0) + 17) + 5
 * = (0 + 17) + 5
 * = 17 + 5
 * = 22
 */

public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        int len = tokens.length;
        if (len == 0) {
            return 0;
        }

        Integer num1 = 0;
        Integer num2 = 0;
        Integer num = 0;
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < len; i++) {
            String token = tokens[i];
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                num1 = stack.pop();
                num2 = stack.pop();
                if (token.equals("+")) {
                    num = num2 + num1;
                } else if (token.equals("-")) {
                    num = num2 - num1;
                } else if (token.equals("*")) {
                    num = num2 * num1;
                } else if (token.equals("/")) {
                    num = num2 / num1;
                }
            } else {
                num = Integer.valueOf(token);
            }
            stack.push(num);
        }
        num = stack.pop();
        return num;
    }
}
