import java.util.*;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
       List<List<Integer>> graph = new ArrayList<>();
       int[] visited = new int[numCourses];

       for (int i = 0; i < numCourses; i++) {
        graph.add(new ArrayList<>());
       }

       for (int[] prerequisite : prerequisites) {
        graph.get(prerequisite[1]).add(prerequisite[0]);
       }
       for (int i = 0; i < numCourses; i++) {
        if (isCycle(graph, i, visited)) {
            return false;
        }
       }
       return true;
    }

    private boolean isCycle(List<List<Integer>> graph, int current, int[] visited) {
        if (visited[current] == 1) {
            return true;
        }
        if (visited[current] == 2) {
            return false;
        }
        visited[current] = 1;
        for (int next : graph.get(current)) {
            if (isCycle(graph, next, visited)) {
                return true;
            }
        }
        visited[current] = 2;
        return false;
    }
}