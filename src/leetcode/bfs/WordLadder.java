package leetcode.bfs.wordLadder;

// Source : https://leetcode.com/problems/word-ladder
// Author : Shen Bai
// Date   : 2018-08-01

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given two words (beginWord and endWord), and a dictionary's word list, find the length of shortest transformation sequence from beginWord to endWord, such that:
 *
 * Only one letter can be changed at a time.
 * Each transformed word must exist in the word list. Note that beginWord is not a transformed word.
 * Note:
 *
 * Return 0 if there is no such transformation sequence.
 * All words have the same length.
 * All words contain only lowercase alphabetic characters.
 * You may assume no duplicates in the word list.
 * You may assume beginWord and endWord are non-empty and are not the same.
 * Example 1:
 *
 * Input:
 * beginWord = "hit",
 * endWord = "cog",
 * wordList = ["hot","dot","dog","lot","log","cog"]
 *
 * Output: 5
 *
 * Explanation: As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
 * return its length 5.
 * Example 2:
 *
 * Input:
 * beginWord = "hit"
 * endWord = "cog"
 * wordList = ["hot","dot","dog","lot","log"]
 *
 * Output: 0
 *
 * Explanation: The endWord "cog" is not in wordList, therefore no possible transformation.
 *
 */
public class WordLadder {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord)) {
            return 0;
        }
        Set<String> visited = new HashSet<String>();
        Set<String> words = new HashSet<String>(wordList);
        visited.add(beginWord);
        int distance = 1;
        while (!visited.contains(endWord)) {
            Set<String> curVisited = new HashSet<String>();

            for (String word : visited) {
                char[] chars = word.toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    char tmpChar = chars[i];
                    for (int j = 'a'; j <= 'z'; j++) {
                        chars[i] = (char)j;
                        String newWord = new String(chars);
                        if (words.contains(newWord)) {
                            curVisited.add(newWord);
                            words.remove(newWord);
                        }
                    }
                    chars[i] = tmpChar;
                }
            }
            if (curVisited.size() == 0) {
                return 0;
            }
            visited = curVisited;
            distance++;
        }

        return distance;
    }
}
