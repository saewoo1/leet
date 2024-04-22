class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] changes = new int[1001];
		for (int[] trip : trips) {
			int passNum = trip[0];
			int start = trip[1];
			int end = trip[2];

			changes[start] += passNum;
			changes[end] -= passNum;
		}
		int currentNumber = 0;
		for (int change : changes) {
			currentNumber += change;
			if (currentNumber > capacity) {
				return false;
			}
		}
		return true;
    }
}