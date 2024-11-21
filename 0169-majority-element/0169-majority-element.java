import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            counter.put(nums[i], counter.getOrDefault(nums[i], 0) + 1);
        }

        int target = nums.length / 2;
        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            if (entry.getValue() > target){
                return entry.getKey();
            }
        }
        return 0;
    }
}