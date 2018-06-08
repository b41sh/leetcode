package leetcode.backtracking.wordSearch;

// Source : https://leetcode.com/problems/word-search/
// Author : Shen Bai
// Date   : 2018-06-08

import java.util.ArrayList;
import java.util.List;

/**
 * Given a 2D board and a word, find if the word exists in the grid.
 * The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.
 * Example:
 * 
 * board =
 * [
 *  ['A','B','C','E'],
 *  ['S','F','C','S'],
 *  ['A','D','E','E']
 * ]
 * Given word = "ABCCED", return true.
 * Given word = "SEE", return true.
 * Given word = "ABCB", return false.
 */

public class WordSearch {

    public boolean exist(char[][] board, String word) {
        if (word.length() == 0) {
            return true;
        }
        int l1 = board.length;
        int l2 = board[0].length;
        if (l1 == 0 || l2 == 0) {
            return false;
        }

        char tmp = ' ';
        int start = 0;
        boolean ret = true;
        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < l2; j++) {
                if (board[i][j] == word.charAt(start)) {
                    tmp = board[i][j];
                    board[i][j] = ' ';
                    ret = _exist(board, word, i, j, l1, l2, start + 1);
                    if (ret) {
                        return true;
                    }
                    board[i][j] = tmp;
                }
            }
        }

        return false;
    }

    private boolean _exist(char[][] board, String word, int x, int y, int l1, int l2, int start) {
        if (start == word.length()) {
            return true;
        }

        char tmp = ' ';
        boolean ret = false;
        char c = word.charAt(start);
        int[][] nextPos = new int[][] {
                            {x - 1, y},
                            {x + 1, y},
                            {x, y - 1},
                            {x, y + 1}};

        for (int i = 0; i <= 3; i++) {
            x = nextPos[i][0];
            y = nextPos[i][1];
            if (x < 0 || x >= l1 || y < 0 || y >= l2) {
                continue;
            }
            if (board[x][y] == c) {
                tmp = board[x][y];
                board[x][y] = ' ';
                ret = _exist(board, word, x, y, l1, l2, start + 1);
                if (ret) {
                    return true;
                }
                board[x][y] = tmp;
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
        }
        System.out.print("\n");

        return false;
    }
}