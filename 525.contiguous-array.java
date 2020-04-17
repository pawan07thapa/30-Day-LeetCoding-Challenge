/*
 * @lc app=leetcode id=525 lang=java
 *
 * [525] Contiguous Array
 */

// @lc code=start
class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                nums[i] = -1;
        }
        // keep older numbers
        int cm = 0, max = 0;
        hm.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            cm += nums[i];
            if (hm.containsKey(cm)) {
                max = Math.max(max, i - hm.get(cm));
            } else {
                hm.put(cm, i);
            }
        }
        return max;
    }
}
// @lc code=end
