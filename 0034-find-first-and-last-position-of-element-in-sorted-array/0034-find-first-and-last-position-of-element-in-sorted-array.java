class Solution {
    /**
    내림차순 정렬, target value의 시작, 끝 위치를 반환하라.
    타겟 위치가 발견되지 않는다면, -1, -1 배열을 반환
    log n 복잡도를 보장해야한다.
     */
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        int left = binarySearch(nums, target);
        int right = left;

        if (nums.length <= left || left < 0 || nums[left] != target) {
            return new int[]{-1, -1};
        }
        while(right < nums.length && nums[right] == target) {
            right++;
        }
        return new int[]{left, right - 1};

    }
    public int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return start;
    }
}