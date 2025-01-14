import java.util.*;

/**
양수 nums, target이 주어진다. subarray 최소 길이를 반환하라.
더해서 target을 만들어내는 일련의 수들
 */
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // 예외사항 처리, 1개만 있다면 target과 동일한지 반환.
        if (nums.length == 1) {
            if (target != nums[0]) {
                return 0;
            }
            return 1;
        }

        int left = 0; int right = 0;
        int len = Integer.MAX_VALUE;
        int sum = 0;
        for (right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= target) {
                len = Math.min(len, right - left + 1);
                sum -= nums[left++];
            }
        }

        return len == Integer.MAX_VALUE ? 0 : len;
    }
}