package leetcode.array.setMatrixZeroes;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 73. Set Matrix Zeroes
 */
public class SetMatrixZeroesTest {
    @Test
    public void test() {

        System.out.println("SetMatrixZeroesTest");

        SetMatrixZeroes solution = new SetMatrixZeroes();

        int[][] matrix = new int[][] {
                            {1, 1, 1},
                            {1, 0, 1},
                            {1, 1, 1}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }

        solution.setZeroes(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.println("===================");

        int[][] matrix1 = new int[][] {
                            {0, 1, 2, 0},
                            {3, 4, 5, 2},
                            {1, 3, 1, 5}};

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.print("\n");
        }

        solution.setZeroes(matrix1);

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
}
