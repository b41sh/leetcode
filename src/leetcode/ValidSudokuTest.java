package leetcode.validSudoku;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 36. Valid Sudoku
 */
public class ValidSudokuTest {
    @Test
    public void test() {

        System.out.println("ValidSudokuTest");

        ValidSudoku solution = new ValidSudoku();

        char[][] board = new char[][]{
                    {'5','3','.','.','7','.','.','.','.'},
                    {'6','.','.','1','9','5','.','.','.'},
                    {'.','9','8','.','.','.','.','6','.'},
                    {'8','.','.','.','6','.','.','.','3'},
                    {'4','.','.','8','.','3','.','.','1'},
                    {'7','.','.','.','2','.','.','.','6'},
                    {'.','6','.','.','.','.','2','8','.'},
                    {'.','.','.','4','1','9','.','.','5'},
                    {'.','.','.','.','8','.','.','7','9'}
                };

        boolean ret = false;
        ret = solution.isValidSudoku(board);
        System.out.println("ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(true));
    }
}
