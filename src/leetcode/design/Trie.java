package leetcode.design.trie;

// Source : https://leetcode.com/problems/implement-trie-prefix-tree/
// Author : Shen Bai
// Date   : 2018-11-01

/**
 * Implement a trie with insert, search, and startsWith methods.
 *
 * Example:
 *
 * Trie trie = new Trie();
 *
 * trie.insert("apple");
 * trie.search("apple");   // returns true
 * trie.search("app");     // returns false
 * trie.startsWith("app"); // returns true
 * trie.insert("app");
 * trie.search("app");     // returns true
 * Note:
 *
 * You may assume that all inputs are consist of lowercase letters a-z.
 * All inputs are guaranteed to be non-empty strings.
 *
 */
public class Trie {

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
    public Trie() {
        this.node = new Node(' ');
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
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
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        Node currNode = this.node;
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (currNode.next[letter - 'a'] == null) {
                return false;
            }
            currNode = currNode.next[letter - 'a'];
        }
        if (currNode.isEnd) {
            return true;
        }
        return false;
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        Node currNode = this.node;
        for (int i = 0; i < prefix.length(); i++) {
            char letter = prefix.charAt(i);
            if (currNode.next[letter - 'a'] == null) {
                return false;
            }
            currNode = currNode.next[letter - 'a'];
        }
        return true;
    }
}

