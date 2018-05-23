package leetcode.rotateImage;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 48. Rotate Image
 */
public class RotateImageTest {

    @Test
    public void test() {

        System.out.println("RotateImageTest");

        RotateImage solution = new RotateImage();

        int[][] matrix0 = new int[][] {
                            {5,  1,   9, 11},
                            {2,  4,   8, 10},
                            {13, 3,  6, 7},
                            {15, 14, 12, 16}};

        int[][] matrix = new int[][] {
                            {1,  2,  3, 4, 5},
                            {16, 17, 18, 19, 6},
                            {15, 24, 25, 20, 7},
                            {14, 23, 22, 21, 8},
                            {13, 12, 11, 10, 9}};


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }

        solution.rotate(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}