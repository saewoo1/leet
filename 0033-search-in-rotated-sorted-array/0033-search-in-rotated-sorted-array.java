class Solution {
    public int search(int[] nums, int target) {
        // 정렬이 되어있다 -> Binary Search,
		// rotation 정렬이 된 상태가 어느정도 유지되고 있음.
		int start = 0;
		int end = nums.length - 1;
		while (start <= end) {
			System.out.println("start = " + start + " end = " + end);
			int mid = (start + end) / 2;
			System.out.println("mid = " + mid);
			System.out.println("elem = " + nums[mid]);
			if (nums[mid] == target) {
				return mid;
			}
			// 좌측이 정렬된 경우라면
			if (nums[start] <= nums[mid]) {
				// target이 좌측에 있나?
				if (nums[start] <= target && target <= nums[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (nums[end] >= target && target >= nums[mid]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}
		}
		return -1;
    }
}