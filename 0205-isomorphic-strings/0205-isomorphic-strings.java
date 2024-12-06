import java.util.*;

/**
String s, t가 주어진다. isomorphic인지 판별하라.
만일 s 내의 요소가 t로 대체될 수 있다면 isomorphic이다.
요소의 count 수가 맞는지 판별?

counter의 범위를 몰?루 32 ~ 126 사이 -> 배열 불가능, map
*/
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if (!sMap.containsKey(sc)) {
                sMap.put(sc, i);
            }
            if (!tMap.containsKey(tc)) {
                tMap.put(tc, i);
            }
            if (!sMap.get(sc).equals(tMap.get(tc))) {
                return false;
            }
        }
        return true;
    }
}