import java.util.*;

class Solution {
    public int longestIdealString(String s, int k) {
		Map<Character, Integer> characterLengthMap = new HashMap<>();
		for (char c : s.toCharArray()) {
			int currentMaxLen = 1;

			for (Entry<Character, Integer> entry : characterLengthMap.entrySet()) {
				if (Math.abs(entry.getKey() - c) <= k) {
					currentMaxLen = Math.max(currentMaxLen, entry.getValue() + 1);
				}
			}
			characterLengthMap.put(c, currentMaxLen);
		}
		int maxLen = 1;
		for (Entry<Character, Integer> entry : characterLengthMap.entrySet()) {
			maxLen = Math.max(entry.getValue(), maxLen);
		}
		return maxLen;
    }
}