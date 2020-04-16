/*
 * @lc app=leetcode id=122 lang=java
 *
 * [122] Best Time to Buy and Sell Stock II
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int min=0,i=0;
        while(i < prices.length){
        //local minima
            while(i < prices.length-1  && prices[i] > prices[i+1])i++;
            min=prices[i++];

        //local maixima
            while(i< prices.length-1 && prices[i] < prices[i+1]) i++;
            profit+= i < prices.length ? prices[i] -min :0;
            
        }
        return profit;
 
    }
}
// @lc code=end

