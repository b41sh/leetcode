package leetcode.nQueens;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

/**
 * Test for 51. N-Queens
 * Test for 51. N-Queens II
 */
public class NQueensTest {

    @Test
    public void test() {

        System.out.println("NQueensTest");

        NQueens solution = new NQueens();

        int n = 5;
        List<List<String>> ret = solution.solveNQueens(n);
        System.out.println(ret);

        for (List<String> items : ret) {
            for (String item : items) {
                System.out.println(item);
            }
            System.out.println("-------");
        }

        int total = solution.totalNQueens(n);
        System.out.println(total);

    }
}


