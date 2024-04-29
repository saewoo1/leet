import java.util.*;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int len = triangle.size();
        int[][]res = new int[len + 1][len + 1];

        for (int i = len - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                res[i][j] = Math.min(res[i + 1][j], res[i + 1][j + 1]) + triangle.get(i).get(j);
            }
        }
        return res[0][0];
    }
}