import java.util.*;

class Solution {
    public String decodeString(String s) {
     Stack<Integer> repeatCount = new Stack<>();
     Stack<StringBuilder> encoded = new Stack<>();
     StringBuilder sb = new StringBuilder();

     int digit = 0;
     for (char c : s.toCharArray()) {
        if (Character.isDigit(c)) {
            // char -> int 변환
            digit = digit * 10 + (c - '0');
        }
        else if (c == '[') {
            repeatCount.push(digit);
            digit = 0;
            encoded.push(sb);
            sb = new StringBuilder();
        }
        else if (c == ']') {
            int repeat = repeatCount.pop();
            StringBuilder word = sb;
            sb = encoded.pop();
            while (repeat > 0) {
                sb.append(word);
                repeat--;
            }
        }
        else {
            sb.append(c);
        }
     }
     return sb.toString();
    }
}