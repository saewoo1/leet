import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        Set<String> usedValues = new HashSet<>();
        String[] strs = s.split(" ");

        if (pattern.length() != strs.length) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String str = strs[i];

            if (map.containsKey(c)) {
                if (!map.get(c).equals(str)) {
                    return false;
                }
            }
            else {
                if (usedValues.contains(str)) {
                    return false;
                }
            }
            map.put(c, str);
            usedValues.add(str);
        }
        return true;
    }
}