class Solution {
    /**
    내림차순 정렬, target value의 시작, 끝 위치를 반환하라.
    타겟 위치가 발견되지 않는다면, -1, -1 배열을 반환
    log n 복잡도를 보장해야한다.
     */
    public int[] searchRange(int[] nums, int target) {
        int start = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                start = i;
                break;
            }
        }
        int end = -1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                end = i;
                break;
            }
        }
        return new int[]{start, end};
    }
}