package leetcode.romanToInt;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.
 *
 */
public class RomanToInt {

    /**
     * I => 1
     * V => 5
     * X => 10
     * L => 50
     * C => 100
     * D => 500
     * M => 1000
     */
    public int romanToInt(String s) {

        int n = 0;
        int l = s.length();
        char c = ' ';
        char pc = ' ';
        for (int i = 0; i < l; i++) {
            c = s.charAt(i);
            if (c == 'I') {
                n += 1;
            } else if (c == 'V') {
                n += 5;
                if (pc == 'I') {
                    n -= 2;
                }
            } else if (c == 'X') {
                n += 10;
                if (pc == 'I') {
                    n -= 2;
                }
            } else if (c == 'L') {
                n += 50;
                if (pc == 'X') {
                    n -= 20;
                }
            } else if (c == 'C') {
                n += 100;
                if (pc == 'X') {
                    n -= 20;
                }
            } else if (c == 'D') {
                n += 500;
                if (pc == 'C') {
                    n -= 200;
                }
            } else if (c == 'M') {
                n += 1000;
                if (pc == 'C') {
                    n -= 200;
                }
            }
            pc = c;
        }

        return n;
    }
}