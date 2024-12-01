import java.util.*;

class Solution {
    public int strStr(String haystack, String needle) {
        if (!haystack.contains(needle)) {
            return -1;
        }

        for (int i = 0; i < haystack.length(); i++) {
            if (i + needle.length() <= haystack.length()){
                String substring = haystack.substring(i, i + needle.length());
                System.out.println(substring);
                if (substring.equals(needle)) {
                    return i;
                }
            }
        }
        return 0;
    }
}