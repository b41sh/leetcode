package leetcode.textJustification;

// Source : https://leetcode.com/problems/text-justification/
// Author : Shen Bai
// Date   : 2018-06-01

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of words and a width maxWidth, format the text such that each line has exactly maxWidth characters and is fully (left and right) justified.
 * You should pack your words in a greedy approach; that is, pack as many words as you can in each line. Pad extra spaces ' ' when necessary so that each line has exactly maxWidth characters.
 * Extra spaces between words should be distributed as evenly as possible. If the number of spaces on a line do not divide evenly between words, the empty slots on the left will be assigned more spaces than the slots on the right.
 * For the last line of text, it should be left justified and no extra space is inserted between words.
 * Note:
 * A word is defined as a character sequence consisting of non-space characters only.
 * Each word's length is guaranteed to be greater than 0 and not exceed maxWidth.
 * The input array words contains at least one word.
 */

public class TextJustification {

    public List<String> fullJustify(String[] words, int maxWidth) {

        List<List<String>> groups = new ArrayList<List<String>>();
        int curGroupLen = 0;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (curGroupLen == 0 || curGroupLen + word.length() > maxWidth) {
                List<String> group = new ArrayList<String>();
                group.add(word);
                curGroupLen = word.length() + 1;
                groups.add(group);
            } else {
                int index = groups.size() - 1;
                List<String> group = groups.get(index);
                group.add(word);
                curGroupLen += word.length() + 1;
            }
        }

        List<String> ret = new ArrayList<String>();
        int groupSize = groups.size();
        for (List<String> group : groups) {
            StringBuilder sb = new StringBuilder();
            int gap = group.size() - 1;
            if (groupSize == 1) {
                int len = 0;
                int size = group.size();
                for (String w : group) {
                    sb.append(w);
                    len += w.length();
                    if (size == 1) {
                        break;
                    }
                    sb.append(" ");
                    len++;
                    size--;
                }
                int spaceCount = maxWidth - len;
                for (int i = 0; i < spaceCount; i++) {
                    sb.append(" ");
                }
            } else if (gap == 0) {
                sb.append(group.get(0));
                int spaceCount = maxWidth - group.get(0).length();
                for (int i = 0; i < spaceCount; i++) {
                    sb.append(" ");
                }
            } else {
                int wordLength = 0;
                for (String w : group) {
                    wordLength += w.length();
                }
                int spaceLength = maxWidth - wordLength;
                int a = spaceLength / gap;
                int b = spaceLength % gap;
                int size = group.size();
                for (String w : group) {
                    sb.append(w);
                    if (size == 1) {
                        break;
                    }
                    int n = a;
                    if (b > 0) {
                        n = a + 1; 
                    }
                    for (int i = 0; i < n; i++) {
                        sb.append(" ");
                    }
                    size--;
                    b--;
                }
            }
            ret.add(sb.toString());
            groupSize--;
        }

        return ret;
    }
}