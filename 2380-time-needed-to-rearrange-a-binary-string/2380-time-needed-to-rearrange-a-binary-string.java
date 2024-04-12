class Solution {
    public int secondsToRemoveOccurrences(String s) {
        String target = "01";
        String change = "10";

        int time = 0;
        while (s.contains(target)) {
            s = s.replace(target, change);
            time++;
        }
        return time;
    }
}