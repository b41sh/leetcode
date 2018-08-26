package leetcode.contest.contest99;

// Source : https://leetcode.com/contest/weekly-contest-99
// Author : Shen Bai
// Date   : 2018-08-26

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import leetcode.TreeNode;

/**
 * Weekly Contest 1
 *
 */
public class Contest1 {

    public List<Integer> lexicalOrder(int n) {

        return _lexicalOrder(1, 10, n);
    }

    private List<Integer> _lexicalOrder(int start, int end, int n) {

        List<Integer> list = new ArrayList<Integer>();
        for (int i = start; i < end; i++) {
            if (i > n) {
                break;
            }
            list.add(i);
            List<Integer> subList = _lexicalOrder(i * 10, (i + 1) * 10, n);
            for (int j = 0; j < subList.size(); j++) {
                list.add(subList.get(j));
            }
        }

        return list;
    }

    public int firstUniqChar(String s) {
        List<Character> list = new ArrayList<Character>();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            Character c = new Character(s.charAt(i));
            if (map.containsKey(c)) {
                list.remove(c);
            } else {
                map.put(c, i);
                list.add(c);
            }
        }
        if (list.size() > 0) {
            return map.get(list.get(0));
        } else {
            return -1;
        }
    }

    public int lengthLongestPath(String input) {

        Map<Integer, String> path = new HashMap<Integer, String>();
        int len = 0;
        int maxLen = 0;
        int depth = 0;

        String[] dirs = input.split("\\n");
        for (int i = 0; i < dirs.length; i++) {
            String dir = dirs[i];
            String[] tmps = dir.split("\\t");
            depth = tmps.length - 1;
            dir = tmps[tmps.length - 1];
            path.put(depth, dir);
            if (dir.contains(".")) {
                len = 0;
                for (int k = 0; k <= depth; k++) {
                    len += path.get(k).length();
                    if (k < depth) {
                        len++;
                    }
                }
                maxLen = Math.max(len, maxLen);
            }
        }
        return maxLen;
    }
}
