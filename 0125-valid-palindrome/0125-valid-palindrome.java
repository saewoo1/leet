import java.util.*;

/**
문장을 소문자로, 공백 없이, 알파벳만 남기셈
 */
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");

        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}