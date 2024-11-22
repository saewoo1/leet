class Solution {
    // 각 element는 점프할 수 있는 최대 횟수이다. 끝까지 점프할 수 있는지 판별하라.
    public boolean canJump(int[] nums) {
        int goal = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= goal) {
                goal = i;
            }
        }
        return goal == 0;
    }
}