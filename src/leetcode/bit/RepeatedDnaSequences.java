package leetcode.bit.repeatedDnaSequences;

// Source : https://leetcode.com/problems/repeated-dna-sequences/
// Author : Shen Bai
// Date   : 2018-10-31

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.BitSet;

/**
 * All DNA is composed of a series of nucleotides abbreviated as A, C, G, and T, for example: "ACGAATTCCG". When studying DNA, it is sometimes useful to identify repeated sequences within the DNA.
 *
 * Write a function to find all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule.
 *
 * Example:
 *
 * Input: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
 *
 * Output: ["AAAAACCCCC", "CCCCCAAAAA"]
 */

public class RepeatedDnaSequences {

    public List<String> findRepeatedDnaSequences(String s) {

        Set<String> allSet = new HashSet<String>();
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < s.length() - 9; i++) {
            String sub = s.substring(i, i + 10);
            if (allSet.contains(sub)) {
                set.add(sub);
            } else {
                allSet.add(sub);
            }
        }
        return new ArrayList(set);
    }

    // bit
    public List<String> findRepeatedDnaSequences2(String s) {

        List<String> list = new ArrayList<String>();
        if (s == null || s.length() < 10) {
            return list;
        }
        int[] map = new int[26];
        map['A' - 'A'] = 0;
        map['C' - 'A'] = 1;
        map['G' - 'A'] = 2;
        map['T' - 'A'] = 3;
        int hash = 0;
        for (int i = 0; i < 10; i++) {
            hash = (hash << 2) | map[s.charAt(i) - 'A'];
        }
        int mask = 0xFFFFF;
        BitSet seen = new BitSet(20);
        BitSet add = new BitSet(20);
        seen.set(hash);
        for (int i = 10; i < s.length(); i++) {
            hash = ((hash << 2) | map[s.charAt(i) - 'A']) & mask;
            if (!add.get(hash)) {
                if (seen.get(hash)) {
                    add.set(hash);
                    list.add(s.substring(i - 9, i + 1));
                } else {
                    seen.set(hash);
                }
            }
        }

        return list;
    }
}
