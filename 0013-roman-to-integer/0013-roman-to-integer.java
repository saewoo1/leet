import java.util.*;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> dictionary = new HashMap<>();
        dictionary.put('I', 1);
        dictionary.put('V', 5);
        dictionary.put('X', 10);
        dictionary.put('L', 50);
        dictionary.put('C', 100);
        dictionary.put('D', 500);
        dictionary.put('M', 1000);

        char[] chars = s.toCharArray();
        int answer = 0;
        for (int i = 0; i < chars.length; i++) {
            // current가 next보다 작아
            if (i + 1 < chars.length && dictionary.get(chars[i]) < dictionary.get(chars[i + 1])) {
                answer -= dictionary.get(chars[i]);
            }
            else {
                answer += dictionary.get(chars[i]);
            }
        }

        return answer;
    }
}