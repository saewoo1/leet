import java.util.*;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String start = "";
        if (strs.length == 1) {
            return strs[0];
        }

        for (int i = 1; i <= strs[0].length(); i++) {
            String prefix = strs[0].substring(0, i);
            if (!isContains(prefix, strs)) {
                if (i == 1) {
                    prefix = "";
                }
                break;
            }
            else {
                start = prefix;
            }
        }
        return start;
    }

    public boolean isContains(String prefix, String[] remains) {
        boolean answer = true;
        for (String remain : remains) {
            if (!remain.startsWith(prefix)) {
                return false;
            }
        }
        return answer;
    }
}