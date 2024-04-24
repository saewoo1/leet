import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagram = new HashMap<>();
		for (int i = 0; i < strs.length; i++) {
			char[] str = strs[i].toCharArray();
			Arrays.sort(str);
			String key = Arrays.toString(str);


			List<String> value = anagram.getOrDefault(key, new ArrayList<>());
			value.add(strs[i]);
			anagram.put(key, value);
		}
		return new ArrayList<>(anagram.values());
    }
}