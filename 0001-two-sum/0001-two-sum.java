class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

		for (int i = 0; i < nums.length; i++) {
			int goal = target - nums[i];
			result = new int[2];
			for (int j = 0; j < nums.length; j++) {
				if (j == i) {
					continue;
				}
				if (nums[j] == goal) {
					int front = Math.min(i, j);
					int back = Math.max(i, j);
					result[0] = front;
					result[1] = back;
                    return result;
				}
			}
		}
		return result;
    }
}