import java.util.*;

class Solution {
    // 소문자 알파벳만 남겼을 경우, 앞뒤로 읽었을 때 동일하면 true를 반환하라.
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || Character.isDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        
        String palindrome = sb.toString();

        int start = 0;
        int end = palindrome.length() - 1;
        while (start <= end) {
            if (palindrome.charAt(start) != palindrome.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}