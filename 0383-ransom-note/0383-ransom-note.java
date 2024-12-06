import java.util.*;

/**
랜덤노트와 매거진 String이 각각 주어진다.
만약 randomNote가 magazine의 요소들로 구성될 수 있다면 true를 반환하라.
 */

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ransomNotes = new int[26];
        int[] magazines = new int[26];

        for (char c : ransomNote.toCharArray()) {
            ransomNotes[c - 'a']++;
        }
        for (char c : magazine.toCharArray()) {
            magazines[c - 'a']++;
        }
        
        for (int i = 0; i < ransomNotes.length; i++) {
            if (ransomNotes[i] > magazines[i]) {
                return false;
            }
        }
        return true;
    }
}