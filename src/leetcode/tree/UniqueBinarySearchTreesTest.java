package leetcode.tree.uniqueBinarySearchTrees;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import leetcode.TreeNode;

/**
 * Test for 95. Unique Binary Search Trees II
 * Test for 96. Unique Binary Search Trees
 */
public class UniqueBinarySearchTreesTest {

    @Test
    public void test() {

        System.out.println("UniqueBinarySearchTreesTest");

        UniqueBinarySearchTrees solution = new UniqueBinarySearchTrees();

        int n = 5;
        int ret = 0;

        ret = solution.numTrees(n);
        System.out.println(ret);

        List<TreeNode> trees = new ArrayList<TreeNode>();
        trees = solution.generateTrees(n);

    }
}
