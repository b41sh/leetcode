package leetcode.sudokuSolver;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 37. Sudoku Solver
 */
public class SudokuSolverTest {
    @Test
    public void test() {

        System.out.println("SudokuSolverTest");

        SudokuSolver solution = new SudokuSolver();

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

        solution.solveSudoku(board);

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                //System.out.println("i=" + i + " j=" + j + " board=" + board[i][j]);
                System.out.print(board[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
