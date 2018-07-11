package leetcode.dp.triangle;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

/**
 * Test for 120. Triangle
 */
public class TriangleTest {
    @Test
    public void test() {

        System.out.println("TriangleTest");

        Triangle solution = new Triangle();

        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(2);
        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(3);
        l2.add(4);
        List<Integer> l3 = new ArrayList<Integer>();
        l3.add(6);
        l3.add(5);
        l3.add(7);
        List<Integer> l4 = new ArrayList<Integer>();
        l4.add(4);
        l4.add(1);
        l4.add(8);
        l4.add(3);
        triangle.add(l1);
        triangle.add(l2);
        triangle.add(l3);
        triangle.add(l4);

        int ret = 0;
        ret = solution.minimumTotal(triangle);
        System.out.println("ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(11));
    }
}
