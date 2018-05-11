package leetcode.generateParentheses;

// Source : https://leetcode.com/problems/generate-parentheses/
// Author : Shen Bai
// Date   : 2018-05-11

/**
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 * For example, given n = 3, a solution set is:
 * [
 *  "((()))",
 *  "(()())",
 *  "(())()",
 *  "()(())",
 *  "()()()"
 * ]
 */

import java.util.List;
import java.util.ArrayList;

public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {

        return generate(n);
    }

    private List<String> generate(int n) {
        List<String> items = new ArrayList<String>();

        if (n == 1) {
            String item = "()";
            items.add(item);
            return items;
        }        

        List<String> subItems = generate(n - 1);
        subItems.forEach(subItem -> {
            String newItem = "(" + subItem + ")";
            items.add(newItem);
        });

        int i = 1;
        while (i < n) {
            List<String> leftItems = generate(i);
            List<String> rightItems = generate(n - i);

            leftItems.forEach(leftItem -> {
                rightItems.forEach(rightItem -> {
                    String newItem = leftItem + rightItem;
                    if (items.contains(newItem)) {
                        return;
                    }
                    items.add(newItem);
                });
            });
            i++;
        }

        return items;
    }
}
