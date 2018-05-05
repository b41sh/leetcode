package leetcode.letterCombinations;

// Source : https://leetcode.com/problems/letter-combinations-of-a-phone-number/
// Author : Shen Bai
// Date   : 2018-05-05

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
 * A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
 * Example:
 *
 * Input: "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * Note:
 * Although the above answer is in lexicographical order, your answer could be in any order you want.
 *
 */
public class LetterCombinations {

    public List<String> letterCombinations(String digits) {

        List<String> list = new ArrayList<String>();
        if (digits.length() == 0) {
            return list;
        }

        List<StringBuilder> sbs = new ArrayList<StringBuilder>();
        for (int i = 0; i < digits.length(); i++) {
            char c = digits.charAt(i);
            int count = 0;

            String[] ls = {"", "", "", ""};

            if (c == '2') {
                ls[0] = "a"; ls[1] = "b"; ls[2] = "c";
            } else if (c == '3') {
                ls[0] = "d"; ls[1] = "e"; ls[2] = "f";
            } else if (c == '4') {
                ls[0] = "g"; ls[1] = "h"; ls[2] = "i";
            } else if (c == '5') {
                ls[0] = "j"; ls[1] = "k"; ls[2] = "l";
            } else if (c == '6') {
                ls[0] = "m"; ls[1] = "n"; ls[2] = "o";
            } else if (c == '7') {
                ls[0] = "p"; ls[1] = "q"; ls[2] = "r"; ls[3] = "s";
            } else if (c == '8') {
                ls[0] = "t"; ls[1] = "u"; ls[2] = "v";
            } else if (c == '9') {
                ls[0] = "w"; ls[1] = "x"; ls[2] = "y"; ls[3] = "z";
            } else {
                continue;
            }

            if (i == 0) {
                StringBuilder sb0 = new StringBuilder(digits.length());
                StringBuilder sb1 = new StringBuilder(digits.length());
                StringBuilder sb2 = new StringBuilder(digits.length());
                sbs.add(sb0.append(ls[0]));
                sbs.add(sb1.append(ls[1]));
                sbs.add(sb2.append(ls[2]));
                if (c == '7' || c == '9') {
                    StringBuilder sb3 = new StringBuilder(digits.length());
                    sbs.add(sb3.append(ls[3]));
                }
                continue;
            }

            List<StringBuilder> newSbs = new ArrayList<StringBuilder>();

            // java.util.ConcurrentModificationException
            for (StringBuilder sb : sbs) {
                StringBuilder sb1 = new StringBuilder(sb.toString());
                StringBuilder sb2 = new StringBuilder(sb.toString());
                newSbs.add(sb1.append(ls[1]));
                newSbs.add(sb2.append(ls[2]));
                if (c == '7' || c == '9') {
                    StringBuilder sb3 = new StringBuilder(sb.toString());
                    newSbs.add(sb3.append(ls[3]));
                }
                sb.append(ls[0]);
            }
            sbs.addAll(newSbs);
        }

        for (StringBuilder sb : sbs) {
            list.add(sb.toString());
        }

        return list;
    }
}
