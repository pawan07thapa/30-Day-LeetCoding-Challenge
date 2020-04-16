/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int lzi = -1;
        for (int i = 0; i < nums.length; i++) {

            // if nums[ci] ! =0 && lzi>=0 -> swap elements
            if (nums[i] != 0 && lzi >= 0) {
                nums[lzi] = nums[i];
                nums[i] = 0;
                lzi += 1; // increment by only one
            }

            if (nums[i] == 0 && lzi == -1) {
                lzi = i;
            }
        }
    }
}
// @lc code=end
