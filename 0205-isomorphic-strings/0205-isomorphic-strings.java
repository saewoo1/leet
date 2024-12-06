import java.util.*;

/**
String s, t가 주어진다. isomorphic인지 판별하라.
만일 s 내의 요소가 t로 대체될 수 있다면 isomorphic이다.
요소의 count 수가 맞는지 판별?
*/
class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] sCounter = new int[256];
        int[] tCounter = new int[256];
        for (int i = 0; i < s.length(); i++) {
            if (sCounter[s.charAt(i)] != tCounter[t.charAt(i)]) {
                return false;
            }
            sCounter[s.charAt(i)] = i + 1;
            tCounter[t.charAt(i)] = i + 1;
        }
        return true;
    }
}