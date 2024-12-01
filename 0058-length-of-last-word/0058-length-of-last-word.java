import java.util.*;

class Solution {
    public int lengthOfLastWord(String s) {
        String[] splitWords = s.split(" ");
        int i = splitWords.length - 1;
        for (; i >= 0; i--) {
            if (!splitWords[i].isEmpty()) {
                break;
            }
        }
        return splitWords[i].length();
    }
}