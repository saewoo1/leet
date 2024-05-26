class Solution {
    private int minSum = Integer.MAX_VALUE; // 최소 합을 저장할 변수
    private int[][] grid;
    private int m, n;

    public int minPathSum(int[][] grid) {
        this.grid = grid;
        m = grid.length;
        n = grid[0].length;
        dfs(0, 0, 0); // 시작 위치와 초기 합으로 DFS 시작
        return minSum;
    }
    
    private void dfs(int i, int j, int sum) {
        // 현재 위치가 그리드를 벗어나면 종료
        if (i >= m || j >= n) return;
        
        // 현재 위치까지의 합을 갱신
        sum += grid[i][j];
        
        // 목적지에 도달했을 때, 최소 합을 갱신
        if (i == m-1 && j == n-1) {
            minSum = Math.min(minSum, sum);
            return;
        }
        
        // 오른쪽으로 이동
        dfs(i, j+1, sum);
        // 아래로 이동
        dfs(i+1, j, sum);
    }
}