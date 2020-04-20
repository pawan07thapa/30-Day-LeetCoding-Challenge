/*
 * @lc app=leetcode id=64 lang=java
 *
 * [64] Minimum Path Sum
 */

// @lc code=start
class Solution {
    public int minPathSum(int[][] grid) {
        int rlen=grid.length;
        int clen = grid[0].length;
        // int minPath=0;
        for( int i=rlen-1 ;i>=0 ;i--){
            for(int j = clen-1 ;j>=0 ;j--){
                if(i==rlen-1 && j==clen-1){
                   continue;
                }else if(i == rlen-1){
                    grid[i][j]+=grid[i][j+1];
                }else if(j==clen-1){
                    grid[i][j]+= grid[i+1][j];
                }else{
                    grid[i][j]+=Math.min(grid[i+1][j], grid[i][j+1]);
                }
            }
        }
        return grid[0][0];
    }
}
// @lc code=end

