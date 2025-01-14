import java.util.*;

/**
.은 공간, +은 벽. 가장 빠른 출구를 찾아라
출구는 n-1 or m-1
 */
class Solution {
    static int[] dirR = {1, -1, 0, 0};
    static int[] dirC = {0, 0, 1, -1};
    boolean[][] visited;
    boolean[][] graph;
    int n;
    int m;

    public int nearestExit(char[][] maze, int[] entrance) {
        n = maze.length;
        m = maze[0].length;

        visited = new boolean[n + 2][m + 2];
        graph = new boolean[n + 2][m + 2];

        //그래프 그리기
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (maze[i - 1][j- 1] == '+') {
                    graph[i][j] = false;
                }
                if (maze[i - 1][j - 1] == '.') {
                    graph[i][j] = true;
                }
            }
        }
        int answer = Math.max(-1, bfs(entrance[0] + 1, entrance[1] + 1, 0));
        return answer;
    }

    public int bfs(int startY, int startX, int start) {

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startY, startX, start});
        visited[startY][startX] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int y = current[0];
            int x = current[1];
            int distance = current[2];

            if (distance != 0) {
                if (y == 1 || y == n || x == m || x == 1) {
                    return distance;
                }
            }
            for (int i = 0; i < 4; i++) {

                int newY = dirR[i] + y;
                int newX = dirC[i] + x;
                if (newY > 0 && newX > 0 && !visited[newY][newX] && graph[newY][newX] == true) {
                    queue.add(new int[]{newY, newX, distance + 1});
                    visited[newY][newX] = true;
                }
            }
        }
        return -1;
    }
}