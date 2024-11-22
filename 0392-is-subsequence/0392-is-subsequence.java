import java.util.*;

class Solution {

    /**
    s의 모든 요소를 '순차적으로' t가 포함하고 있다면 subsequence로 판별하여 true를 반환하라
     */
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }
        int j = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(j)) {
                j++;
            }
            if (j == s.length()) {
                return true;
            }
        }
        return j == s.length() ? true : false;
    }
}