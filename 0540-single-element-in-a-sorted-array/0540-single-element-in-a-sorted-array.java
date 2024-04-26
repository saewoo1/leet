import java.util.*;

class Solution {
    public int singleNonDuplicate(int[] nums) {
		// Map<Integer, Integer> map = new HashMap<>();
		// for (int num : nums) {
		// 	map.put(num, map.getOrDefault(num, 0) + 1);
		// }
		// for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
		// 	if (entry.getValue() == 1) {
		// 		return entry.getKey();
		// 	}
		// }
		// return nums[nums.length - 1];
        		int max = 0;
		for (int num : nums) {
			max = Math.max(num, max);
		}
		int[] counter = new int[max + 1];
		for (int num : nums) {
			counter[num]++;
		}
		for (int i = 0; i < counter.length; i++) {
			if (counter[i] == 1) {
				return i;
			}
		}
		return nums[nums.length - 1];
    }
}