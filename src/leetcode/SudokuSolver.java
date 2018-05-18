package leetcode.sudokuSolver;

// Source : https://leetcode.com/problems/sudoku-solver/
// Author : Shen Bai
// Date   : 2018-05-17

import java.util.ArrayList;
import java.util.List;

/**
 * Write a program to solve a Sudoku puzzle by filling the empty cells.
 * A sudoku solution must satisfy all of the following rules:
 * Each of the digits 1-9 must occur exactly once in each row.
 * Each of the digits 1-9 must occur exactly once in each column.
 * Each of the the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
 * Empty cells are indicated by the character '.'.
 * Note:
 * The given board contain only digits 1-9 and the character '.'.
 * You may assume that the given Sudoku puzzle will have a single unique solution.
 * The given board size is always 9x9.
 */
public class SudokuSolver {

    /**
     * DFS
     */
    public void solveSudoku(char[][] board) {

        List<Node> nodes = new ArrayList<Node>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '.') {
                    Node node = new Node(i, j);
                    nodes.add(node);
                }
            }
        }
        boolean ret = fill(nodes, board, 0);
        return;
    }

    private boolean fill(List<Node> nodes, char[][] board, int index) {

        if (index == nodes.size()) {
            return true;
        }

        Node node = nodes.get(index);
        int i = node.getI();
        int j = node.getJ();

        System.out.println("index=" + index);

        char c = '1';
        while (c <= '9') {
            board[i][j] = c;
            if (validSudoku(board, i, j)) {
                if (fill(nodes, board, index + 1)) {
                    return true;
                }
            }
            c++;
        }
        board[i][j] = '.';
        return false;
    }

    private boolean validSudoku(char[][] board, int i, int j) {
        int[] validX = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] validY = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] validZ = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int m = 0; m < 9; m++) {
            if (board[i][m] != '.') {
                int x = board[i][m] - 48;
                if (validX[x] == 1) {
                    return false;
                } else {
                    validX[x] = 1;
                }
            }
            if (board[m][j] != '.') {
                int y = board[m][j] - 48;
                if (validY[y] == 1) {
                    return false;
                } else {
                    validY[y] = 1;
                }
            }
            int subI = (i / 3) * 3 + m / 3;
            int subJ = (j / 3) * 3 + m % 3;
            if (board[subI][subJ] != '.') {
                int z = board[subI][subJ] - 48;
                if (validZ[z] == 1) {
                    return false;
                } else {
                    validZ[z] = 1;
                }
            }
        }
        return true;
    }

    private class Node {
        private int i;
        private int j;

        Node(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int getI() {
            return this.i;
        }
        public int getJ() {
            return this.j;
        }
    }

}