package leetcode.design.wordDictionary;

// Source : https://leetcode.com/problems/add-and-search-word-data-structure-design/
// Author : Shen Bai
// Date   : 2018-11-01

/**
 * Design a data structure that supports the following two operations:
 *
 * void addWord(word)
 * bool search(word)
 * search(word) can search a literal word or a regular expression string containing only letters a-z or .. A . means it can represent any one letter.
 *
 * Example:
 *
 * addWord("bad")
 * addWord("dad")
 * addWord("mad")
 * search("pad") -> false
 * search("bad") -> true
 * search(".ad") -> true
 * search("b..") -> true
 * Note:
 * You may assume that all words are consist of lowercase letters a-z.
 */
public class WordDictionary {

    private class Node {
        public char letter;
        public boolean isEnd;
        public Node[] next;

        public Node(char letter) {
            this.letter = letter;
            this.isEnd = false;
            this.next = new Node[26];
        }
    }

    private Node node;

    /**
     * Initialize your data structure here.
     */
    public WordDictionary() {
        this.node = new Node(' ');
    }

    /**
     * Adds a word into the data structure.
     */
    public void addWord(String word) {
        Node currNode = this.node;
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (currNode.next[letter - 'a'] == null) {
                Node nextNode = new Node(letter);
                currNode.next[letter - 'a'] = nextNode;
            }
            currNode = currNode.next[letter - 'a'];
            if (i == word.length() - 1) {
                currNode.isEnd = true;
            }
        }
    }

    /**
     * Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter.
     */
    public boolean search(String word) {
        return subSearch(this.node, word);
    }

    private boolean subSearch(Node currNode, String word) {
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (letter == '.') {
                for (int j = 0; j < 26; j++) {
                    if (currNode.next[j] == null) {
                        continue;
                    }
                    Node nextNode = currNode.next[j];
                    if (i == word.length() - 1) {
                        if (nextNode.isEnd) {
                            return true;
                        }
                    } else {
                        boolean ret = subSearch(nextNode, word.substring(i + 1));
                        if (ret) {
                            return true;
                        }
                    }
                }
                return false;
            } else if (currNode.next[letter - 'a'] == null) {
                return false;
            }
            currNode = currNode.next[letter - 'a'];
        }
        if (currNode.isEnd) {
            return true;
        }
        return false;
    }
}
