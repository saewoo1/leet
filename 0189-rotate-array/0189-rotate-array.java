import java.util.*;

class Solution {
    public void rotate(int[] nums, int k) {
        int length = nums.length;


        // timeLimit
        // while (k > 0) {
        //     int last = nums[length - 1];
        //     for (int i = length - 1; i > 0; i--) {
        //         nums[i] = nums[i - 1];
        //     }
        //     nums[0] = last;
        //     k--;
        // }
        
        // 복사본을 만들고, nums에 회전한 부분만 덮어 씌우는 방식?
        if (length < 2) {
            return ;
        }
        k = k %length;
        int[] copy = Arrays.copyOf(nums, length);
        int[] copyLastElements = Arrays.copyOfRange(copy, copy.length - k, length);
        int idx = 0;
        for (int i = length - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }
        for (int i = 0; i < k; i++) {
            nums[i] = copyLastElements[i];
        }
    }
}