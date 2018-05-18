package leetcode.validSudoku;

// Source : https://leetcode.com/problems/valid-sudoku/
// Author : Shen Bai
// Date   : 2018-05-17

/**
 * Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 * The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
 */
public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            int[] validX = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            int[] validY = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            int[] validZ = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    int l = j * 3 + k;
                    // check each row
                    if (board[i][l] != '.') {
                        int x = board[i][l] - 48;
                        if (validX[x] == 1) {
                            return false;
                        } else {
                            validX[x] = 1;
                        }
                    }
                    // check each column
                    if (board[l][i] != '.') {
                        int y = board[l][i] - 48;
                        if (validY[y] == 1) {
                            return false;
                        } else {
                            validY[y] = 1;
                        }
                    }
                    int m = (i / 3) * 3 + j;
                    int n = (i % 3) * 3 + k;
                    // check each 3x3 sub box
                    if (board[m][n] != '.') {
                        int z = board[m][n] - 48;
                        if (validZ[z] == 1) {
                            return false;
                        } else {
                            validZ[z] = 1;
                        }
                    }

                }
            }
        }
        return true;
    }

}