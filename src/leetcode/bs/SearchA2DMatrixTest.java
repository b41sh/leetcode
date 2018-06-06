package leetcode.bs.searchA2DMatrix;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 74. Search a 2D Matrix
 */
public class SearchA2DMatrixTest {
    @Test
    public void test() {

        System.out.println("SearchA2DMatrixTest");

        SearchA2DMatrix solution = new SearchA2DMatrix();

        int[][] matrix = new int[][] {
                            {1,   3,  5,  7},
                            {10, 11, 16, 20},
                            {23, 30, 34, 50}};
        int target = 3;
        boolean ret = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }

        ret = solution.searchMatrix(matrix, target);
        System.out.println("target=" + target + " ret=" + ret);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.println("===================");

        int[][] matrix1 = new int[][] {
                            {1,   3,  5,  7},
                            {10, 11, 16, 20},
                            {23, 30, 34, 50}};
        target = 13;
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.print("\n");
        }

        ret = solution.searchMatrix(matrix1, target);
        System.out.println("target=" + target + " ret=" + ret);

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
}
