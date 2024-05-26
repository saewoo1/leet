import java.util.*;

class Solution {
    public int minPathSum(int[][]grid) {
        int m = grid.length;
		int n = grid[0].length;

		PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a[2]));
		boolean[][] visited = new boolean[m][n];
		// x, y, 경로 합에 대한 초기 세팅
		queue.offer(new int[]{0, 0, grid[0][0]});
		visited[0][0] = true;

		// down / right
		int[][] dirs = {{1, 0}, {0, 1}};

		while (!queue.isEmpty()) {
			// x, y, 경로 합
			int[] current = queue.poll();

			if (current[0] == (m - 1) && current[1] == (n - 1)) {
				return current[2];
			}
			for (int[] dir : dirs) {
				int nx = current[0] + dir[0];
				int ny = current[1] + dir[1];

				if (nx >= 0 && nx < m && ny >= 0 && ny < n && !visited[nx][ny]) {
					visited[nx][ny] = true;
					queue.offer(new int[]{nx, ny, grid[nx][ny] + current[2]});
				}
			}
		}
		return -1;
    }
}