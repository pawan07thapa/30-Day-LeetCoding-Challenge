/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        if (A == null)
            return 0;
        if (A.size() == 1)
            return A.get(0);

        int max_till_now = A.get(0);
        int max_so_far = A.get(0);
        for (int i = 1; i < A.size(); i++) {
            max_till_now = Math.max(max_till_now + A.get(i), A.get(i));
            max_so_far = Math.max(max_so_far, max_till_now);
        }
        return max_so_far;
    }
}
// @lc code=end

