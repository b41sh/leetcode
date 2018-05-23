package leetcode.spiralMatrix;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

/**
 * Test for 54. Spiral Matrix
 * Test for 59. Spiral Matrix II
 */
public class SpiralMatrixTest {
    @Test
    public void test() {

        System.out.println("SpiralMatrixTest");

        SpiralMatrix solution = new SpiralMatrix();

/**
        int[][] matrix = new int[][] {
                            {1,  2,  3, 4, 5},
                            {16, 17, 18, 19, 6},
                            {15, 24, 25, 20, 7},
                            {14, 23, 22, 21, 8},
                            {13, 12, 11, 10, 9}};
*/

        int[][] matrix = new int[][] {
                            {1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 10, 11, 12}};


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }

        List<Integer> ret = solution.spiralOrder(matrix);
        System.out.println(ret);

        int n = 3;
        int[][] retMatrix = solution.generateMatrix(n);

        for (int i = 0; i < retMatrix.length; i++) {
            for (int j = 0; j < retMatrix[i].length; j++) {
                System.out.print(retMatrix[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
}