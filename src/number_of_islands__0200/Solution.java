package number_of_islands__0200;

public class Solution {
    void bfs(char[][] grid, int i, int j) {
        grid[i][j] = '0';
        if (i + 1 < grid.length && grid[i + 1][j] != '0')
            bfs(grid, i + 1, j);
        if (j + 1 < grid[0].length && grid[i][j + 1] != '0')
            bfs(grid, i, j + 1);
        if (i > 0 && grid[i - 1][j] != '0')
            bfs(grid, i - 1, j);
        if (j > 0 && grid[i][j - 1] != '0')
            bfs(grid, i, j - 1);
    }

    public int numIslands(char[][] grid) {
        int c = 0;
        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[0].length; ++j) {
                if (grid[i][j] != '0') {
                    bfs(grid, i, j);
                    c++;
                }
            }
        }
        return c;
    }
}
