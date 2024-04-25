class Solution {
    public int longestIdealString(String s, int k) {
		int[] dp = new int[26];
		for (char c : s.toCharArray()) {
			int maxLen = 0;

			for (int i = Math.max(0, c - 'a' - k); i <= Math.min(25, c - 'a' + k); i++) {
				maxLen = Math.max(maxLen, dp[i]);
			}
			dp[c - 'a'] = maxLen + 1;
		}
		int longest = 0;
		for (int length : dp) {
			longest = Math.max(longest, length);
		}
		return longest;
    }
}