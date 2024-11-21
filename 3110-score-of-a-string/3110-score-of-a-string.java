import java.util.*;

class Solution {
    public int scoreOfString(String s) {
        int answer = 0;

        char[] str = s.toCharArray();
        for (int i = 0; i < str.length - 1; i++) {
            answer += Math.abs(str[i] - str[i + 1]);
        }
        return answer;
    }
}