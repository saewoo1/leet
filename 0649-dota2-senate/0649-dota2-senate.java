import java.util.*;

class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> radi = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();

        for (int i = 0; i < senate.length(); i++) {
            if (senate.charAt(i) == 'R') {
                radi.offer(i);
            }
            if (senate.charAt(i) == 'D') {
                dire.offer(i);
            }
        }

        while (!radi.isEmpty() && !dire.isEmpty()) {
            int r = radi.poll();
            int d = dire.poll();

            if (r < d) {
                radi.offer(r + senate.length());
            }
            else {
                dire.offer(d + senate.length());
            }
        }
        return radi.isEmpty() ? "Dire" : "Radiant";
    }
}