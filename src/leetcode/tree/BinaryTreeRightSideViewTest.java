package leetcode.tree.binaryTreeRightSideView;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;
import leetcode.TreeNode;

/**
 * Test for 199. Binary Tree Right Side View
 */
public class BinaryTreeRightSideViewTest {

    @Test
    public void test() {

        System.out.println("BinaryTreeRightSideViewTest");

        BinaryTreeRightSideView solution = new BinaryTreeRightSideView();

        /**
         *
         *  *    1            <---
         *  *  /   \
         *  * 2     3         <---
         *  *  \     \
         *  *   5     4       <---
         */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(4);

        List<Integer> list = solution.rightSideView(root);
        System.out.println(list);

        List<Integer> list2 = solution.rightSideView2(root);
        System.out.println(list2);

        List<Integer> list3 = solution.rightSideView3(root);
        System.out.println(list3);
    }
}
