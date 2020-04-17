/*
 * @lc app=leetcode id=200 lang=java
 *
 * [200] Number of Islands
 */

// @lc code=start
class Solution {
    public int numIslands(char[][] grid) {
        int island = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != '2' && grid[i][j] != '0') {
                    travelRecusively(i, j, grid);
                    island++;
                }

            }
        }
        return island;
    }

    private void travelRecusively(int cr, int cc, char[][] grid) {
        if (cr >= grid.length || cr < 0 || cc < 0 || cc >= grid[0].length)
            return;

        if (grid[cr][cc] == '0' || grid[cr][cc] == '2')
            return;

        grid[cr][cc] = '2';
        travelRecusively(cr + 1, cc, grid);
        travelRecusively(cr, cc + 1, grid);
        travelRecusively(cr - 1, cc, grid);
        travelRecusively(cr, cc - 1, grid);
       

        return;
    }
}
// @lc code=end
