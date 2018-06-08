package leetcode.backtracking.wordSearch;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 79. Word Search
 */
public class WordSearchTest {
    @Test
    public void test() {

        System.out.println("WordSearchTest");

        WordSearch solution = new WordSearch();

        char[][] board = new char[][]{
                    {'A','B','C','E'},
                    {'S','F','C','S'},
                    {'A','D','E','E'}};

        String word = "";
        boolean ret = false;

        word = "ABCCED";
        ret = solution.exist(board, word);
        System.out.println("word=" + word + " ret=" + ret);

        board = new char[][]{
                    {'A','B','C','E'},
                    {'S','F','C','S'},
                    {'A','D','E','E'}};

        word = "SEE";
        ret = solution.exist(board, word);
        System.out.println("word=" + word + " ret=" + ret);

        board = new char[][]{
                    {'A','B','C','E'},
                    {'S','F','C','S'},
                    {'A','D','E','E'}};

        word = "ABCB";
        ret = solution.exist(board, word);
        System.out.println("word=" + word + " ret=" + ret);

    }
}
