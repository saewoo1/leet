import java.util.*;

class Solution {
    public int[] decrypt(int[] code, int k) {
        if (k == 0) {
            return new int[code.length];
        }
        int[] answer = new int[code.length];
        int n = code.length;
        if (k > 0) {
            for (int i = 0; i < answer.length; i++) {
                int number = 0;
                for (int j = 0; j < k; j++) {
                    number += code[(i + j + 1) % code.length];
                }
                answer[i] = number;
            }
        }
        if (k < 0) {
            for (int i = 0; i < answer.length; i++) {
                int number = 0;
                for (int j = 0; j < Math.abs(k); j++) {
                    number += code[(i - j + n -1) % n];
                }
                answer[i] = number;
            }
        }
        return answer;
    }
}