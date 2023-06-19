public class NumberOfIslands_200 {
    class Solution {
        /**
         * Time complexity O(n * m)
         * Space complexity O(1)
         * https://leetcode.com/problems/number-of-islands/
         */
        public int numIslands(char[][] grid) {
            int n = grid.length;
            int m = grid[0].length;
            int result = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (grid[i][j] == '1') {
                        findComponent(grid, i, j, n, m);
                        result++;
                    }
                }
            }
            return result;
        }

        public void findComponent(char[][] grid, int x, int y, int n, int m) {
            if (grid[x][y] == '0') return;
            grid[x][y] = '0';
            if (x + 1 < n) findComponent(grid, x + 1, y, n, m);
            if (x - 1 >= 0) findComponent(grid, x - 1, y, n, m);
            if (y + 1 < m) findComponent(grid, x, y + 1, n, m);
            if (y - 1 >= 0) findComponent(grid, x, y - 1, n, m);
        }
    }
}
