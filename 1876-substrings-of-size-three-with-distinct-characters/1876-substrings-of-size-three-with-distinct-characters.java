import java.util.*;

/**
len 3으로 잡아서 substring, 반복되는 문자들이 없다면 count++;
 */
class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;

        for (int i = 0; i <= s.length() - 3; i++) {
            String sub = s.substring(i, i + 3);
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < sub.length(); j++) {
                set.add(sub.charAt(j));
            }
            if (set.size() == 3) {
                count++;
            }
        }
        return count;
    }
}