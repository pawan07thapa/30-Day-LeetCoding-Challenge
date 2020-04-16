/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE,profit =0, maxP=0;
        for(int i=0;i<prices.length;i++){
            if(min > prices[i] ) {
                min=prices[i];
            }
            else{
                profit=prices[i]-min;
                if(profit > maxP){
                    maxP =profit;
                }
            }
        }
        return maxP;
    }
}
// @lc code=end

