package leetcode.isPalindrome;

/**
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 */
public class IsPalindrome {

    /**
     * consider int max value
     */
    public boolean isPalindrome(int x) {
        
        //2147483647
        //1000000001
        if (x > Integer.MAX_VALUE || x < 0) {
            return false;
        }

        long tmp = (long)x;
        long plus = 1l;
        long backPlus = 10l;
        long n = 0l;
        while (tmp > 0) {
            tmp = tmp / 10;
            plus *= 10;
            n++;
        }

        boolean isP = true;
        long a = 0l;
        long b = 0l;
        long xl = (long)x;
        while (n >= 2) {
            a = (xl % plus) / (plus / 10);
            b = (xl % backPlus) / (backPlus / 10);

            if (a != b) {
                isP = false;
                break;
            }
            plus /= 10; 
            backPlus *= 10; 
            n -= 2;
        }

        return isP;
    }
}
