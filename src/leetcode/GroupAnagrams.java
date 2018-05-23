package leetcode.groupAnagrams;

// Source : https://leetcode.com/problems/group-anagrams/
// Author : Shen Bai
// Date   : 2018-05-23

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**
 * Given an array of strings, group anagrams together.
 * Example:
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * Output:
 * [
 *  ["ate","eat","tea"],
 *  ["nat","tan"],
 *  ["bat"]
 * ]
 * Note:
 * All inputs will be in lowercase.
 * The order of your output does not matter.
 */

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ret = new ArrayList<List<String>>();
        Map<Integer, List<String>> map = new HashMap<Integer, List<String>>();

        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            int[] key = new int[26];
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                int k = (int) c - 97;
                key[k]++;
            }
            Integer hash = new Integer(Arrays.hashCode(key));
            List<String> list = map.get(hash);
            if (list == null) {
                list = new ArrayList<String>();
                list.add(str);
                map.put(hash, list);
            } else {
                list.add(str);
            }
        }

        ret = new ArrayList(map.values());
        return ret;
    }
}