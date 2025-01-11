import java.util.*;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // 이미 갖고 있는 애라면
            if (counter.containsKey(nums[i])) {
                if (Math.abs(i - counter.get(nums[i])) <= k) {
                    return true;
                }
            }
            counter.put(nums[i], i);
        }
        return false;
    }
}