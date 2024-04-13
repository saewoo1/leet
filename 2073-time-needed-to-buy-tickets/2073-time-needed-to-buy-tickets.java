import java.util.*;

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> line = new LinkedList<>();
		for (int i = 0; i < tickets.length; i++) {
			line.add(i);
		}

		int time = 0;
		while (tickets[k] != 0 && !line.isEmpty()) {
			int front = line.poll();
			time++;
			tickets[front]--;
			if (tickets[front] > 0) {
				line.add(front);
			}
		}
		return time;
    }
}